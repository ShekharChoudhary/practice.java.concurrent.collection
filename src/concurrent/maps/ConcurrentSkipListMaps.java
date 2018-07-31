package concurrent.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

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
