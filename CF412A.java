import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF412A {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		st = new StringTokenizer(in.readLine());

		int left = 0;
		int right = readInt() - 1;
		int position = readInt() - 1;
		char[] slogan = readString().toCharArray();

		// Move to closest edge and print
		int distanceLeft = position - left;
		int distanceRight = right - position;
		if (distanceLeft < distanceRight) {
			while (position-- > left) out.println("LEFT");
			while (position++ < right) {
				out.println("PRINT " + slogan[position]);
				if (position < right) out.println("RIGHT");
			}
		} else {
			while (position++ < right) out.println("RIGHT");
			while (position-- > left) {
				out.println("PRINT " + slogan[position]);
				if (position > left) out.println("LEFT");
			}
		}

		out.flush();
	}

	static int readInt() throws Exception {
		while (!st.hasMoreTokens()) nextLine();
		return Integer.parseInt(st.nextToken());
	}

	static String readString() throws Exception {
		while (!st.hasMoreTokens()) nextLine();
		return st.nextToken();
	}

	static void nextLine() throws Exception {
		st = new StringTokenizer(in.readLine());
	}
}