package lsystems;

public class A_AA extends LRule {

	public A_AA() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] c = { 'A', 'A' };
		return c;
	}

}
