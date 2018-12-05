package lab7;

public interface DataAccess<K, V> {
	public V add(K key, V value);
	public V update(K key, V value);
	public V get(K key);
	public V delete(K key);
}

