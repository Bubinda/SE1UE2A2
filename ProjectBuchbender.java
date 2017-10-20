package se_01;

import java.util.Objects;

public class ProjectBuchbender {

	private final String[][] s1;

	public Project(String[][] s0) {
		this.s1 = s0;
	}

	public boolean isWellSorted(String[] s) {

		if (s.length == 4 && s[2].equals("C") || s.length == 7 && s[2].equals("C"))
			return true;
		else
			return false;
	}
}
