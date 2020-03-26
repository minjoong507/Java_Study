import java.io.*;

public class Q_10819 {
	static int N;
	static int[] arr;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean[] visit;
	static int result = Integer.MIN_VALUE;

	public static void main(String args[]) throws Exception {
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		visit = new boolean[N];

		String[] tmp = br.readLine().split(" ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
			visit[i] = false;
		}
		solve(0,0, visit, 0);
		System.out.println(result);
	}

	public static void solve(int sum, int step, boolean[] visited, int op) {
		if (step == N) {
			result = Math.max(result, sum);
		}

		if (step > N)
			return;

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				if (op == 0) {
					solve(sum + arr[i], step+1, visited, 1);
					visited[i] = false;
					solve(sum, step+1, visited, 0);
				}
				else {
					solve(sum - arr[i], step+1, visited, 0);
					visited[i] = false;
					solve(sum, step+1, visited, 1);
				}
					
			}
		}

	}

}
