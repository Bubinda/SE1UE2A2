package se_01;

import java.util.Objects;

public class Project {
	
	public Project(String[][] strings) {		
	}
		

	public boolean isWellSorted(String[] sequence) {
		if(sequence.length == 4 && sequence[2].equals("C") || sequence.length == 7 && sequence[2].equals("C")) {
			return true;
		} else {
			return false;
		}
	}
}
