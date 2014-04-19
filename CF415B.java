import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF415B {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		st = new StringTokenizer(in.readLine());

		// This is my original answer, and i believe it's correct
		// Unfortunately didn't get accepted, maybe due to rounding errors

		// int n = readInt();
		// double a = (double)readInt();
		// double b = (double)readInt();
		// double divisor = b / a;
		// while (n-- > 0)
		// 	out.printf("%d ", (int)(readInt() % divisor));

		// This is my second answer, which got accepted

		long n = readLong();
		long a = readLong();
		long b = readLong();
		long x, hi, lo, mid, max;

		while (n-- > 0) {
			x = readLong();
			lo = 0;
			mid = 0;
			hi = x;
			max = x * a / b;
			while (hi > lo) {
				mid = (lo + hi) / 2;
				if (mid * a / b < max)
					lo = mid + 1;
				else
					hi = mid;
			}
			out.printf("%d ", x - hi);
		}

		out.println();
		out.flush();
	}

	static int readInt() throws Exception {
		while (!st.hasMoreTokens()) nextLine();
		return Integer.parseInt(st.nextToken());
	}

	static long readLong() throws Exception {
		while (!st.hasMoreTokens()) nextLine();
		return Long.parseLong(st.nextToken());
	}

	static void nextLine() throws Exception {
		st = new StringTokenizer(in.readLine());
	}
}