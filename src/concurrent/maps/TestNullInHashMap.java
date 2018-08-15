package concurrent.maps;

import java.util.HashMap;


/**
 * The main reason that nulls aren't allowed in ConcurrentMaps
(ConcurrentHashMaps, ConcurrentSkipListMaps) is that
ambiguities that may be just barely tolerable in non-concurrent
maps can't be accommodated. 
Actually if map.get(key) returns null, you can't detect whether the
key explicitly maps to null vs the key isn't mapped.
In a non-concurrent map, you can check this via map.contains(key),
but in a concurrent one, the map might have changed between calls. That means
before a thread fetches a key other thread would have deleted and we might get the output as null.
Hence it will be better to remove null totally from the ConcurrentHashMap.

 *
 */
public class TestNullInHashMap 
{

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<>();
		hm.put("a", null);
		System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		// Here we can check if the key is present or not
		System.out.println(hm.containsKey("a"));
		System.out.println(hm.containsKey("b"));
		
		//but this will not be possible in multithreaded environment because there can be a possibility that other thread
		//might have removed the key before a thread accesses it.
		
	}
}



