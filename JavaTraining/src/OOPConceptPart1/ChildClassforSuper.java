package OOPConceptPart1;

public class ChildClassforSuper extends ParentClassforSuper {

	public ChildClassforSuper() {
		// super(26,27);
		super();

		System.out.println("child class constr");
	}

	public ChildClassforSuper(int i) {
		// super(26,27);
		super(i);

		System.out.println("child class constr with single param");
	}

	public ChildClassforSuper(int i, int j) {
		// super(26,27);
		super(i, j);

		System.out.println("child class constr with 2 params");
	}

	public static void main(String args[]) {

		ChildClassforSuper obj = new ChildClassforSuper();
		ChildClassforSuper obj1 = new ChildClassforSuper(25);
		ChildClassforSuper obj2 = new ChildClassforSuper(26, 27);

	}

}
