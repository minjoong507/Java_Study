
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
		// '' ���� ����ǥ�� ����
		char a2 = 97;
		System.out.println(a1);
		System.out.println(a2);
		
		// "" ū ����ǥ�� ���ڿ�
		String hi = "hello";
		System.out.println(hi);
		
		// int, long, double, float, boolean, char ���� �ڹٴ� primitive �ڷ��� �̶�� �θ���. �̷� primitive �ڷ����� new Ű����� ������ �� ����.
		// Ÿ�� �޶� ������ ���Դ� ������
		String he = new String("hello");
		if (hi==he) {
			System.out.println("�¾ƿ�");
		}
		else {
			System.out.println("Ʋ����");
		}
		System.out.println(hi.replaceAll(hi.substring(0,1), "hehe"));
		System.out.println(hi.substring(0,1));
		System.out.println(hi.indexOf("llo"));
		StringBuffer x1 = new StringBuffer();
		x1.append(hi);
		System.out.println(x1.insert(1, "what"));

	}
}
