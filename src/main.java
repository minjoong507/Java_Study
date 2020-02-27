
public class main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int a = 5;
		int b = 7;
		System.out.println(a+b);
		boolean A = true;
		boolean B = true;
		if (A) {
			System.out.println(A);
		}
		else {
			int c = 3;
		}
		char a1 = 'a';
		// '' 작은 따옴표가 문자
		char a2 = 97;
		System.out.println(a1);
		System.out.println(a2);
		
		// "" 큰 따옴표가 문자열
		String hi = "hello";
		System.out.println(hi);
		
		// int, long, double, float, boolean, char 등을 자바는 primitive 자료형 이라고 부른다. 이런 primitive 자료형은 new 키워드로 생성할 수 없다.
		// 타입 달라도 변수명 같게는 못쓰네
		String he = new String("hello");
		if (hi==he) {
			System.out.println("맞아용");
		}
		else {
			System.out.println("틀려용");
		}
		System.out.println(hi.replaceAll(hi.substring(0,1), "hehe"));
		System.out.println(hi.substring(0,1));
		System.out.println(hi.indexOf("llo"));
		StringBuffer x1 = new StringBuffer();
		x1.append(hi);
		System.out.println(x1.insert(1, "what"));

	}
}
