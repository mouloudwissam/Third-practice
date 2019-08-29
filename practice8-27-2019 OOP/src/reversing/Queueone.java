package reversing;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;

import javax.xml.transform.Source;

public class Queueone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> care = new LinkedList<String>();
		care.add("A");
		care.add("B");
		care.add("C");
		System.out.println(care);
		System.out.println(care.add("jamal"));
		System.out.println(care.poll());
		System.out.println(care.peek());
		System.out.println(care.size());
		System.out.println(care.contains("C"));
		System.out.println(care.getClass());
		System.out.println(care.remove());
		System.out.println(care.offer("B"));
		System.out.println(care.element());

	}
}
