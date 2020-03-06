import java.util.Scanner;

public class Q_14889 {
	static int[][] score;
	static boolean[][] team;
	
	
	public static int team_score(int[] arr, boolean[][] arr_team) {
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i<arr.length; i++) {
			for (int j =0; j<arr.length; j++) {
				if (arr_team[i][j])
					sum1 += score[i][j];
			
				else
					sum2 += score[i][j];
			}
		}
		return Math.abs(sum1 - sum2);
	}
	
	public static void maketeam(int[] arr, int k) {
		int team_num = k / 2;
		for(int i = 0; i<team_num; i++) {
			for(int j =0; j<arr.length; j++) {
				if (arr[j] != i)
					
				else
					continue;
			}
		}
		
		
		
		
	}
	
	
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		score = new int[N][N];
		team = new boolean[N][N];
		int[] team1 = new int[N/2];
		int[] team2 = new int[N/2];
		
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				score[i][j] = sc.nextInt();
				team[i][j] = true;
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
