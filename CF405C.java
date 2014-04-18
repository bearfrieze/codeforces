import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;

public class CF405C {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer stk;

	static int s;
	static int[][] m;
	static int u = -1;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		stk = new StringTokenizer(in.readLine());

		s = readInt();
		m = new int[s][s];

		// Load matrix
		for (int i = 0; i < s; i++)
			for (int j = 0; j < s; j++)
				m[i][j] = readInt();

		int ops = readInt();

		for (int i = 0; i < ops; i++) {
			int operation = readInt();
			if (operation == 1) {
				flipRow(readInt() - 1);
				u = -1;
			} else if (operation == 2) {
				flipColumn(readInt() - 1);
				u = -1;
			} else {
				if (u == -1) u = unusual();
				out.print(u);
			}
		}

		out.println();
		out.flush();
	}

	static int unusual() {
		int sum = 0;
		for (int i = 0; i < s; i++)
			sum += unusual(i);
		return sum % 2;
	}

	static int unusual(int v) {
		int sum = 0;
		for (int i = 0; i < s; i++)
			sum += m[v][i] * m[i][v];
		return sum % 2;
	}

	static void flipRow(int row) {
		for (int i = 0; i < s; i++)
			m[row][i] = 1 - m[row][i];
	}

	static void flipColumn(int column) {
		for (int i = 0; i < s; i++)
			m[i][column] = 1 - m[i][column];
	}

	static void printMatrix() {
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				out.print(m[i][j] + " ");
			}
			out.println();
		}
	}

	static int readInt() throws Exception {
			while (!stk.hasMoreTokens()) nextLine();
			return Integer.parseInt(stk.nextToken());
	}

	static void nextLine() throws Exception {
		stk = new StringTokenizer(in.readLine());
	}
}