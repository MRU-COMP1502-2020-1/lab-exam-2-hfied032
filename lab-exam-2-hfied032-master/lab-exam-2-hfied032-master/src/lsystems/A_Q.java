package lsystems;

public class A_Q extends LRule{
	
	private char match;
	private char[] body;
	
	public A_Q() {
		match = 'A';
		body = new char[]{'Q'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
