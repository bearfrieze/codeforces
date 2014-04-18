import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF401C {

	static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
  		stk = new StringTokenizer(in.readLine());
		
		int zeroes = readInt();
		int ones = readInt();

		// Fail fast
		if (zeroes - 1 > ones || ones - zeroes - 2 > zeroes) {
			System.out.println(-1);
			return;
		}

		boolean flag = (ones >= zeroes) ? true : false;
		while (zeroes > 0 || ones > 0) {
			if (ones >= zeroes && flag) {
				if (ones >= zeroes + 1 && ones > 1) {
					out.print("11");
					ones -= 2;
				} else {
					out.print("1");
					ones--;
				}
				flag = !flag;
			} else {
				out.print("0");
				zeroes--;
				flag = !flag;
			}
		}
		out.println();
		out.flush();
	}

	static int readInt() throws Exception {
        return Integer.parseInt(stk.nextToken());
    }
}