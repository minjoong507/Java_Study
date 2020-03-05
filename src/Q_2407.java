import java.util.Scanner;

class data {
	static long MAX = Long.MAX_VALUE / 2;
	long front;
	long back;

	public data() {
		this.front = 0;
		this.back = 0;
	}

	public data sum(data x, data y) {
		data re = new data();

		re.front = x.front + y.front;

		if (x.back + y.back > MAX) {
			re.back = x.back + y.back - MAX;
			re.front++;
		} else
			re.back = x.back + y.back;

		return re;
	}

}

public class Q_2407 {
	static long MAX = Long.MAX_VALUE / 2;
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
				else
					arr[i][j] = dt.sum(arr[i - 1][j - 1], arr[i - 1][j]);
			}
		}

		
		if (arr[A][B].front != 0)
			System.out.println(arr[A][B].front + "" + arr[A][B].back);
		else
			System.out.println(arr[A][B].back);

	}


}
