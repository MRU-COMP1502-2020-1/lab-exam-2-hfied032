package lsystems;

public class A_A extends LRule{
	
	private char match;
	private char[] body;
	
	public A_A() {
		match = 'A';
		body = new char[]{'A'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
