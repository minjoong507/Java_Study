import java.io.*;
import java.util.*;

public class Q_14889 {
	static int[][] score;
	static boolean[] team;
	static int N;
	static int min = Integer.MAX_VALUE;

	public static int team_score() {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (team[i] && team[j])
					sum1 += score[i][j];

				if (!team[i] && !team[j])
					sum2 += score[i][j];
			}
		}
		return Math.abs(sum1 - sum2);
	}

	public static void maketeam(int start, int size) {
		if (size == N / 2) {
			min = Math.min(min, team_score());
			return;
		} 
		else {
			for (int i = start; i < N; i++) {
				if (team[i] != true) {
					team[i] = true;
					maketeam(start + 1, size + 1);
					team[i] = false;

				}

			}

		}

	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt((br.readLine()));

		score = new int[N][N];
		team = new boolean[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			System.out.println(st.countTokens());
			for (int j = 0; j < N; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		maketeam(0, 0);
		System.out.println(min);
	}

}
