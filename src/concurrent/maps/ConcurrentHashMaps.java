package concurrent.maps;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/**
 * This example here shows that when we iterate over a concurrent HashMap using an iterator
 * and removes an element from it and if another thread add the same element to it concurrently
 * at the same time then we wont be able to get the exact picture and instead we will see that removal
 * has never happened.
 * According to java specification :-
 * Iterators and Enumerations return elements reflecting the state of the hash table at some point at or 
 * since the creation of the iterator/enumeration. 
 * so here in our example we removed the key 2 from our map using the remove() method of the 
 * iterator and asked the main thread to sleep for 10 seconds and at the same time another thread t
 * adds the key 2 to it. so the iterator prints key 2 in its output.
 * 
 * Output when run in single threaded environment :-
 * 
 * ********iteration by iterator*********
key : 1 value : one
key : 2 value : null
key : 3 value : three
key : 4 value : four
*********final iteration********
key : 1 value : one
key : 3 value : three
key : 4 value : four

Output when run in multithreaded environment :-

********iteration by iterator*********
key : 1 value : one
key : 2 value : two
key : 3 value : three
key : 4 value : four
*********final iteration********
key : 1 value : one
key : 2 value : two
key : 3 value : three
key : 4 value : four

 * @author choudshe
 *
 */
public class ConcurrentHashMaps {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		Iterator<Integer> itr = map.keySet().iterator();
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				map.put(2, "two");
			}
		});
		t.start();
		
		
		System.out.println("********iteration by iterator*********");
		while(itr.hasNext()) {
			int i = itr.next();
			if(i==2) {
			itr.remove();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			System.out.println("key : "+i+" value : "+map.get(i));
		}
		System.out.println("*********final iteration********");
		for (Integer x : map.keySet()) {
			System.out.println("key : "+x+" value : "+map.get(x));
		}
	}
}
