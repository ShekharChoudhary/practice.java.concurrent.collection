package concurrent.sets;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSkipListSets {

	public static void main(String[] args) {
		CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
		set.add(1);
		set.add(1);
		set.add(null);
		set.add(null);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}
			
		
		
	}
}
