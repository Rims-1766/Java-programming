import java.util.Queue;
import java.util.ArrayDeque;
import java.util.*;
import java.util.Collections;


public class L6P1{
	public static void main(String...args){
		
		Queue<String> l = new ArrayDeque<>();
		l.add("Red");
		l.add("Blue");
		l.add("Yellow");
		l.add("Black");
		l.add("Pink");

		l.remove(4);
		
		List<String> list = new ArrayList<>();
		for(String s : l){
			list.add(s);
		}
		
		Iterator <String> s = l.iterator();
		while(s.hasNext()){
				System.out.println(s.next());
		}

		l.peek();
		System.out.println(l.peek());
		l.clear();
		
			System.out.println(l.isEmpty());
		
	}
}
