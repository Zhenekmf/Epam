public class Main {

	public static void main(String[] args) {

		Pen pen1 = new Pen(Pen.color.BLACK, Pen.material.PLASTIC, Pen.type.GEL,
				"EPAM PEN");
		Pen pen2 = new Pen(Pen.color.BLACK, Pen.material.PLASTIC, Pen.type.GEL,
				"EPAM PEN");
		Pen pen3 = new Pen(Pen.color.BLUE, Pen.material.METAL, Pen.type.BALL,
				"Different one");
		System.out.println(pen1.equals(pen2));
		System.out.println(pen1.equals(pen3));
		System.out.println(pen1.hashCode()+"\n"+pen2.hashCode()+"\n"+pen3.hashCode());
		


	}

}
