package lsystems;

public class B_A extends LRule {

	public B_A() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public char getMatch() {
		// TODO Auto-generated method stub
		return 'B';
	}

	@Override
	public char[] getBody() {
		// TODO Auto-generated method stub
		char[] c = { 'A' };
		return c;
	}

}
