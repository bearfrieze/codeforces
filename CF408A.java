import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF408A {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		stk = new StringTokenizer(in.readLine());

		int cashes = readInt();

		int[] people = new int[cashes];
		for (int i = 0; i < cashes; i++) {
			people[i] = readInt();
		}

		int min = -1;
		for (int i = 0; i < cashes; i++) {
			int sum = 0;
			for (int j = 0; j < people[i]; j++) {
				sum += readInt() * 5;
			}
			sum += people[i] * 15;
			if (min == -1 || sum < min) min = sum;
		}

		out.println(min);
		out.flush();
	}

	static int readInt() throws Exception {
		while (!stk.hasMoreTokens()) nextLine();
			return Integer.parseInt(stk.nextToken());
	}

	static void nextLine() throws Exception {
		stk = new StringTokenizer(in.readLine());
	}
}