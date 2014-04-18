import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF415A {

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		st = new StringTokenizer(in.readLine());

		int n = readInt();
		int m = readInt();
		int[] answer = new int[n];
		while (m-- > 0) {
			int b = readInt();
			for (int i = b - 1; i < n; i++)
				if (answer[i] == 0) answer[i] = b;
		}
		
		for (int i = 0; i < answer.length; i++)
			out.printf("%d ", answer[i]);
		out.println();

		out.flush();
	}

	static int readInt() throws Exception {
		while (!st.hasMoreTokens()) nextLine();
		return Integer.parseInt(st.nextToken());
	}

	static void nextLine() throws Exception {
		st = new StringTokenizer(in.readLine());
	}
}