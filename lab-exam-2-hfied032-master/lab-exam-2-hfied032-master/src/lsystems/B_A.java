package lsystems;

public class B_A extends LRule{
	
	private char match;
	private char[] body;
	
	public B_A() {
		match = 'B';
		body = new char[]{'A'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}

