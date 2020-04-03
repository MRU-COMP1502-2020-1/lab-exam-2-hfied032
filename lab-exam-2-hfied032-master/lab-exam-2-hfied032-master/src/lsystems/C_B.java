package lsystems;

public class C_B extends LRule{
	
	private char match;
	private char[] body;
	
	public C_B() {
		match = 'C';
		body = new char[]{'B'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
