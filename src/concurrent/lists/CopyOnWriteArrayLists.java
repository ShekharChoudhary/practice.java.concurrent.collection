package concurrent.lists;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayLists {

	public static void main(String[] args) {
		System.out.println("*****************");
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//Here remove method throws java.lang.UnsupportedOperationException we cannot use it.
			itr.remove();
		}
	
	}
}
