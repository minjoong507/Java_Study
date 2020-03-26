import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Q_1759 {
	static int L, C;
	static String[] code;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		L = sc.nextInt();
		C = sc.nextInt();
		
		code = br.readLine().split(" ");
		Arrays.sort(code);
		
		solve(0, "");

	}

    private static void solve(int index, String ret) {
        if (ret.length() == L) {
            if (isPossible(ret)) {
                System.out.println(ret);
            }
            return;
        }
        if (index >= C) return;

        solve(index + 1, ret + code[index]);
        solve(index + 1, ret);
    }
	
	public static boolean isPossible(String tmp) {
        int vowel = 0, consonant = 0;
        for (int i = 0; i < tmp.length(); i++) {
            if (isVowel(tmp.charAt(i))) vowel++;
            else consonant++;
        }

        return vowel >= 1 && consonant >= 2;
    }
	
	
	
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
