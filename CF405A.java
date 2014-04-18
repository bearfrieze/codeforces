import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;

public class CF405A {

	static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
  		stk = new StringTokenizer(in.readLine());
		
		int n = readInt();
		int[] columns = new int[n];
		for (int i = 0; i < n; i++) columns[i] = readInt();
		Arrays.sort(columns);
		for (int column : columns) out.print(column + " ");
		out.println();
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