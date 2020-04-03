package lsystems;

public class A_AA extends LRule{
	
	private char match;
	private char[] body;
	
	public A_AA() {
		match = 'A';
		body = new char[]{'A' , 'A'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
