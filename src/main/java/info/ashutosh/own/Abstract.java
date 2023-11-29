package info.ashutosh.own;

public abstract class Abstract {

	private int i;

	public Abstract(int i) {
		super();
		System.out.println("Abstract.Abstract(int i)");
		this.i = i;
	}

	public Abstract() {
		System.out.println("Abstract.Abstract()");
		// TODO Auto-generated constructor stub
	}

	public abstract void name();

	public void name(int i) {

		return;

	}

}

class TEst extends Abstract {

	public TEst() {
		System.out.println("TEst.TEst()");
	}

	public static void main(String[] args) {
		TEst abstract1 = new TEst();
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

}
