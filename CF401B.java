import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.ArrayList;
import java.util.Collections;

public class CF401B {

	static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
  		stk = new StringTokenizer(in.readLine());

		int current = readInt();
		int numRounds = readInt();

		ArrayList<Integer> rounds = new ArrayList<>();
		// Adding boundaries
		rounds.add(0);
		rounds.add(current);

		if (numRounds != 0) {
			nextLine();
			for (int i = 0; i < numRounds; i++) {
				if (readInt() == 1) rounds.add(readInt());
				rounds.add(readInt());
			}
			Collections.sort(rounds);
		}

		int min = 0;
		int max = 0;

		for (int i = 0; i < rounds.size(); i++) {
			int round = rounds.get(i);
			if (i + 1 == rounds.size() || round + 1 == rounds.get(i + 1)) {
				continue;
			} else {
				int delta = rounds.get(i + 1) - rounds.get(i) - 1;
				min += delta / 2 + delta % 2;
				max += delta;
			}
		}

		System.out.println(min + " " + max);
	}

	static int readInt() throws Exception {
        while (!stk.hasMoreTokens()) nextLine();
        return Integer.parseInt(stk.nextToken());
    }

    static void nextLine() throws Exception {
    	stk = new StringTokenizer(in.readLine());
    }
}