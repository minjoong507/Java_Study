import java.util.StringTokenizer;
import java.io.*;

public class Q_10972 {
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		System.out.println(arr[0]);
		
		
		
		
	}
}
