import java.io.*;

public class Q_1018 {
	public static void main (String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		int result = 0;
		int result1 = 0;

		char[] mark = {'B', 'W'};
		char[] mark2 = {'W', 'B'};
		
		
		for(int i=0; i<N; i++) {
			char[] line = br.readLine().toCharArray();
			char startmark1 = mark[i%2]; // 0,0 이 B 으로 시작
			char startmark2 = mark2[i%2]; // 0,0 이 W 으로 시작
			
			for(int j=0; j<M; j++) {
				if (startmark1 == line[j] && j % 2 == 0)
					continue;
				else if (startmark1 != line[j] && j % 2 == 1)
					continue;
				else
					result ++;
			}
			for(int j=0; j<M; j++) {
				if (startmark2 == line[j] && j % 2 == 0)
					continue;
				else if (startmark2 != line[j] && j % 2 == 1)
					continue;
				else
					result1 ++;
			}
		}
		System.out.println(result);

		System.out.println(result1);
		System.out.println(result < result1 ? result : result1);
		
		
		
		
		
		
		
	}
}
