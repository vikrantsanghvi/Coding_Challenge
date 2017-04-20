package Part2;
import java.util.*;

public class LRUCache<Key, Value> extends LinkedHashMap<Key, Value>
{
	private final static int size=10; // size of the cache
	public LRUCache(final int maxEntries) 
	{
		super(size+1, 1.0f, true);
	  }
	
	  protected boolean removeEldestEntry(final Map.Entry<Key, Value> oldest) 
	   {
	       return super.size() > size;
	   }
}
