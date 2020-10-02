package ownhashMap_generic;

public class Entry<K, V>{
    final K key;
    V value;
    Entry next;

   public Entry(K Key, V value) {
        this.key = Key;
        this.value = value;
    }

    //getter and setter
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public String toString(){
        String str = "key:: "+this.key + "," +
                     " value:: " +  this.value + "," +
                     " next<K,V>:: " + this.next + ">";
        return str;
    }

}
