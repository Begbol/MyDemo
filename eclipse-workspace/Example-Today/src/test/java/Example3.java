import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Hi");
		ll.add("Selenium");
		ll.add("API");
		ll.add("Test");
		ll.add("JAVA");
		
		System.out.println("Content of LinkedList: " + ll);
		
		ll.addFirst("Hello");
		ll.addLast("SDET");

		
		System.out.println("Content of LinkedList: " + ll);
		
		System.out.println(ll.get(0));
		
		
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("****Using for loop****");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
	}

}
