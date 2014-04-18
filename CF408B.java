import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Set;
import java.util.HashMap;

public class CF408B {

	static BufferedReader in;
	static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		stk = new StringTokenizer(in.readLine());

		String sheets = readString();
		HashMap<Character, Integer> sheetMap = map(sheets);

		String garland = readString();
		HashMap<Character, Integer> garlandMap = map(garland);

		int sum = 0;
		Set<Character> colors = garlandMap.keySet();
		for (Character color : colors) {
			Integer sheetCount = sheetMap.get(color);
			Integer garlandCount = garlandMap.get(color);
			// System.out.println(color + " " + sheetCount + " " + garlandCount);
			if (sheetCount != null) {
				if (sheetCount > garlandCount)
					sum += garlandCount;
				else
					sum += sheetCount;
			} else {
				System.out.println(-1);
				return;
			}
		}

		System.out.println(sum);
	}

	static HashMap<Character, Integer> map(String string) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			Character letter = string.charAt(i);
			Integer count = map.get(letter);
			if (count != null)
				map.put(letter, count + 1);
			else
				map.put(letter, 1);
		}
		return map;
	}

	static String readString() throws Exception {
		while (!stk.hasMoreTokens()) nextLine();
			return stk.nextToken();
	}

	static void nextLine() throws Exception {
		stk = new StringTokenizer(in.readLine());
	}
}