package lsystems;

public class A_BC extends LRule{
	
	private char match;
	private char[] body;
	
	public A_BC() {
		match = 'A';
		body = new char[]{'B' , 'C'};
	}
	
	public char getMatch() {
		return match;
	}
	
	public char[] getBody() {
		return body;
	}
	
	
	
}
