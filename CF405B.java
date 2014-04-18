import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;

public class CF405B {

	static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer stk;

	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
  		stk = new StringTokenizer(in.readLine());

  		nextLine();
  		String str = readString();

  		int standing = 0;
  		int n = 0;
  		boolean right = false;
  		boolean left = false;

  		for (int i = 0; i < str.length(); i++) {
  			char c = str.charAt(i);
  			if (c == '.') {
  				n++;
  			} else {
  				if (!left && !right) {
  					if (c != 'L') standing += n;
  				} else if (left) {
  					standing += n;
  				} else {
  					if (n % 2 == 1) standing++;
  				}
  				if (c == 'L') {
  					left = true;
  					right = false;
  				} else if(c == 'R') {
  					left = false;
  					right = true;
  				}
  				n = 0;
  			}
  		}

  		if (!right) standing += n;

  		out.println(standing);
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