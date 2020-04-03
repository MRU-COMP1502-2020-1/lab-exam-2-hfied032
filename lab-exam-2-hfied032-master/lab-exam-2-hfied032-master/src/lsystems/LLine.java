package lsystems;

import java.util.*;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		Iterator<LRule> s =  rules.iterator();
		for (char c: line) {
			for (LRule l :rules) {
				int clock = 0;
				
				if ( l.getMatch() == line[clock]) {
					line = new char[]{l.getBody()[0] , l.getBody()[1]};
					
					line[0] = {l.getBody()[0] , l.getBody()[1]};
				}
				clock += 1;
				
				if (l.getMatch() == l.getBody()[0]) {
					
				}
			}
			
		}
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
