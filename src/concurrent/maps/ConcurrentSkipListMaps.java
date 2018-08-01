package concurrent.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * It is a scalable concurrent ConcurrentNavigableMap implementation.The map is
 * sorted according to the natural ordering of its keys, or by a Comparator
 * provided at map creation time, depending on which constructor is used. This
 * class implements a concurrent variant of SkipLists. It provides log(n) time
 * complexity for the following operations :- containsKey, get, put and remove
 * Insertion, removal, update, and access operations safely execute concurrently
 * by multiple threads. The Iterator does not give a guarantee of showing the
 * consistent data. It is a fail-safe iterator and does not throw
 * ConcurrentModificationException. This class and its views and iterators
 * implement all of the optional methods of the Map and Iterator interfaces.
 * Like most other concurrent collections, this class does not permit the use of
 * null keys or values because some null return values cannot be reliably
 * distinguished from the absence of elements.
 * 
 * @author choudshe
 *
 */
public class ConcurrentSkipListMaps {

	public static void main(String[] args) {
		Map<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
		concurrentSkipListMap.put(1, "one");
		concurrentSkipListMap.put(3, "three");
		concurrentSkipListMap.put(2, "two");
		concurrentSkipListMap.put(4, "four");
		concurrentSkipListMap.put(6, "six");
		concurrentSkipListMap.put(5, "five");

	}
}
