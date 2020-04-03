package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	char line[];
	Set<LRule> rules;
	List<LRule> rulesList = new ArrayList<>();
	List<Character> list = new ArrayList<>();

	public LLine(char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}

	public void process() throws LSystemSymbolException, LSystemLengthException {

		rulesList.addAll(rules);

		for (int j = 0; j < line.length; j++) {
			for (int i = 0; i < rulesList.size(); i++) {
				if (line[j] == rulesList.get(i).getMatch()) {

					for (int k = 0; k < rulesList.get(i).getBody().length; k++) {

						char[] c = rulesList.get(i).getBody();

						if (c[k] != 'Q') {
							list.add(c[k]);
						} else {
							throw new LSystemSymbolException(c[k]);
						}

					}
				}

			}
		}

		if (list.size() == 0) {
			throw new LSystemLengthException();
		}

		line = listToArray(list);
		list.clear();
		rulesList.clear();

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
