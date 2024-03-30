import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V> {
    private final List<K> keys;
    private final List<V> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(K key, V value) {
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            int index = keys.indexOf(key);
            values.set(index, value);
        }
    }

    public V get(K key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            return values.get(index);
        }
        return null;
    }
}