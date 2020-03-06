import java.util.Scanner;

class data {
	static long MAX = (long) 1e17;
	long front, back;
	

	public data() {
		this.front = 0;
		this.back = 0;
	}

	public data sum(data x, data y) {
		data re = new data();
		re.front = x.front + y.front;

		if (x.back + y.back < MAX) {
			re.back = x.back + y.back;
		} else {
			re.back = x.back + y.back - MAX;
			re.front++;
		}

		return re;
	}

}

public class Q_2407 {
	static data[][] arr = new data[101][101];
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		data dt = new data();
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		arr[1][0] = new data();
		arr[1][0].back = 1; 
		
		arr[1][1] = new data();
		arr[1][1].back = 1;

		for (int i = 2; i <= A; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					arr[i][j] = new data();
					arr[i][j].back = 1;
				}
				else {
					arr[i][j] = dt.sum(arr[i - 1][j], arr[i - 1][j-1]);
				}
			}
		}

		
		if (arr[A][B].front != 0)
			System.out.println(arr[A][B].front + "" + arr[A][B].back);
		else
			System.out.println(arr[A][B].back);

	}
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigInteger;
//import java.util.Scanner;
// 
//public class Q_2407 {
// 
//    static BigInteger[][] list;
// 
//    public static void main(String[] args) throws IOException {
// 
//        Scanner sc = new Scanner(System.in);
//        BigInteger big = new BigInteger("1");
//        
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        list = new BigInteger[1001][1001];
//        list[1][0] = list[1][1] = big;
//        
//        for(int i=2;i<=n;i++) {
//            for(int j=0;j<=i;j++) {
//                if(i == j || j == 0)
//                    list[i][j] = big;
//                else
//                    list[i][j] = list[i-1][j-1].add(list[i-1][j]);
//            }
//        }
//    
//        System.out.println(list[n][m]);
//    }
//}