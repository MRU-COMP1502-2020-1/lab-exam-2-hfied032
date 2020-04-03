package lsystems;

public class A_X extends LRule{
	
	private char match;
	private char[] body;
	
	public A_X() {
		match = 'A';
		body = new char[]{};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
