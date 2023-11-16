package GenericPractice.TypeParameter.InterfaceDeclaration;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    // Constructor
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
