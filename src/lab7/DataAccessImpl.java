package lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAccessImpl<K, V> implements DataAccess<K, V> {
	private Map<K, V> dataMap = new HashMap<K, V>();

	@Override
	public V add(K key, V value) {
		return dataMap.put(key, value);
	}

	@Override
	public V update(K key, V value) {
		return dataMap.put(key, value);
	}

	@Override
	public V get(K key) {
		return dataMap.get(key);
	}

	@Override
	public V delete(K key) {
		return dataMap.remove(key);	
	}
	
	@Override
	public List<V> getAll() {
		return new ArrayList<>(dataMap.values());
	}
}
