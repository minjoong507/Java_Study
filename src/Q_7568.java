import java.util.Scanner;

public class Q_7568 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = sc.nextInt();
		int person[][] = new int[num][2]; 
		int rank[] = new int[num]; 

		for (int i = 0; i < num; i++) {
			rank[i] = 1; // 1������ �ʱ�ȭ
			person[i][0] = sc.nextInt(); // ����
			person[i][1] = sc.nextInt(); // Ű
		}
		sc.close();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j ++) {
				if (person[i][0] > person[j][0] && person[i][1] > person[j][1])
					rank[j] ++;
				// i ����� ���Կ� Ű�� j ������� ũ�ٸ� (= ��ġ�� ũ�ٸ�), ���� ��ġ ����� ������ �÷��ֱ�	
			}
		}
		
		for (int i = 0; i < rank.length; i++) {
			sb.append(rank[i] + " ");
		}
		System.out.println(sb);
		
	}
}