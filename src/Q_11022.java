import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_11022 {
	public static void main(String args[]) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine());
		
		for (int i=0; i<A; i++) {
			String[] input = bf.readLine().split(" ");
			int a1 = Integer.parseInt(input[0]);
			int a2 = Integer.parseInt(input[1]);
			System.out.println("Case #"+(i+1)+": " + a1 + " + " + a2 + " = " + (a1 + a2));
		}
	}
}