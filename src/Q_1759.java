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

		char[] a = br.readLine().toCharArray();
		System.out.println(a.length);
		for(char tm: a)
			System.out.println(tm);
//		for (int i = 0; i < a.length; i++) {
//			code[i] = (int) a[i];
//			System.out.println(code[i]);
//
//		}

	}
}
