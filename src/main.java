import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String args[]) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack();		
		String[] Line = bf.readLine().trim().split("");
		int result = 0;
		
		for (int i = 0; i < Line.length; i++) {
			String node = Line[i];
		
			 if (node.equals(")")) {
				String temp = "0";
				while (!temp.equals("(")) {
					temp = stack.pop();
					result ++;
				}
				result --;			
				result = result * Integer.parseInt(stack.pop());
			 }
			else {
				stack.push(node);
				}
		}
		System.out.println(stack.size()+result);
	}
}