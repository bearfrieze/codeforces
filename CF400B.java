import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.HashSet;

public class CF400B {

	static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer stk;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
  		stk = new StringTokenizer(in.readLine());

		int rows = readInt();
		nextLine();

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < rows; i++) {
			String row = readString();
			int dwarf = row.indexOf("G");
			int candy = row.indexOf("S");
			int distance = candy - dwarf;
			if (distance < 0) {
				out.println("-1");
				out.flush();
				return;
			} else {
				set.add(distance);
			}
		}

		out.println(set.size());
		out.flush();
	}

    static int readInt() throws Exception {
        while (!stk.hasMoreTokens()) nextLine();
        return Integer.parseInt(stk.nextToken());
    }

    static String readString() throws Exception {
        while (!stk.hasMoreTokens()) nextLine();
        return stk.nextToken();
    }

    static void nextLine() throws Exception {
    	stk = new StringTokenizer(in.readLine());
    }
}