import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		ArrayList<TestItem> list = new ArrayList<TestItem>();
		list.add(new TestItem("A", 100));
		list.add(new TestItem("A", 42));
		list.add(new TestItem("B", 80));
		list.add(new TestItem("C", 40));
		list.add(new TestItem("D", 55));
		list.add(new TestItem("E", 156));
		list.add(new TestItem("F", 120));
		// ArrayList<TestItem> backup=list;
		System.out.println("Name sort:");
		Collections.sort(list, new Comparator<TestItem>() {

			@Override
			public int compare(TestItem o1, TestItem o2) {
				return (o1.getName().compareTo(o2.getName()));

			}
		});
		PrintList(list);
		System.out.println("Price sort:");
		Collections.sort(list, new Comparator<TestItem>() {

			@Override
			public int compare(TestItem o1, TestItem o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
				
			}
		});
		PrintList(list);
		System.out.println("Combo sort:");
		Collections.sort(list, new Comparator<TestItem>() {

			@Override
			public int compare(TestItem o1, TestItem o2) {
				if (o1.getName().equals(o2.getName()))
				{
					return Double.compare(o1.getPrice(), o2.getPrice());
					
				}
				return (o1.getName().compareTo(o2.getName()));
			}
		});

		PrintList(list);
	}

	public static void PrintList(ArrayList<TestItem> list) {
		for (TestItem item : list) {
			System.out.println(item.getName() + ":" + item.getPrice());
		}

	}

}
