package adpters;

import java.util.*;

public class ListMapAdpter<T> implements Map<String, T> {

    private List<T> list;

    public ListMapAdpter(List<T> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public T get(Object key) {
        int index = list.lastIndexOf(key);
        return list.get(index);
    }

    @Override
    public T put(String key, T value) {
        list.add(value);
        return value;
    }

    @Override
    public T remove(Object key) {
        int index = list.lastIndexOf(key);
        return list.remove(index);
    }

    @Override
    public void putAll(Map<? extends String, ? extends T> m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Set<String> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<T> values() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<Entry<String, T>> entrySet() {
        throw new UnsupportedOperationException();
    }
}
