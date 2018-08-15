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
		System.out.println("*****************");
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(1);
		list.add(null);
		list.add(null);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}
}
