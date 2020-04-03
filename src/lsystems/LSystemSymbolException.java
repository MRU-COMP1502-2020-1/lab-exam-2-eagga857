package lsystems;

public class LSystemSymbolException extends Exception {
	private Character c;

	public LSystemSymbolException(Character c) {
		this.c = c;
	}

	public Character getSymbol() {
		// TODO Auto-generated method stub
		return c;
	}

}
