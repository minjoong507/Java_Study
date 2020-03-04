import java.util.Scanner;

public class Q_10870 {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int[] arr = new int[A+1];
		arr[0] =0;
		arr[1] =1;
		
		if (A ==0)
			System.out.println(arr[0]);
		else if (A==1)
			System.out.println(arr[1]);
		else {
			for(int i=2;i<A+1;i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			
			System.out.println(arr[A]);
		}

		
		
	}
}
