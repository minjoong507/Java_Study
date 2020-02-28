import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		String[] a2 = {"a1","a2"};
		char[] a3 = {'2','b','c'};
		for(int i = 0; i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		// ArrayIndexOutOfBoundsException 인덱스 넘어갈때생기는거
		
		// 배열과 리스트 차이? 배열은 선언한 크기 이상으로는 값을 담을 수 없음.
		
		ArrayList pi = new ArrayList();
		pi.add(3);
		pi.add("what");
		System.out.println(pi.contains(3));
		System.out.println(pi);
		for (int i = 0; i< pi.size(); i++) {
			System.out.println(pi.get(i).getClass());
		}
		animal fuck = new animal();
		fuck.setName("호로");
		System.out.println(fuck.name);
		
		main kk = new main();
		kk.printname("what");
		
	}
	public void printname(String name) {
		System.out.println(name);
	}
}

