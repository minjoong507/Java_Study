import java.util.Scanner;
import java.io.*;

public class Q_1759 {
	static int L, C;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		L = sc.nextInt();
		C = sc.nextInt();
		int[] code = new int[C];

		String a = br.readLine().strip();
		for (int i = 0; i < a.length(); i++) {
			char alpa = a.charAt(i);
			code[i] = (int) alpa;
			System.out.println(code[i]);

		}

	}
}
