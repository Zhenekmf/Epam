
public class Main {

	
	public static void main(String[] args) {
		Pen pen=new Pen(20);
		Pencil penc=new Pencil(30);
		Ruler rul=new Ruler(10);
		Desktop desk=new Desktop();
		desk.multiAdd(pen,penc,rul);
		System.out.println(desk.getTotalPrice());

	}

}
