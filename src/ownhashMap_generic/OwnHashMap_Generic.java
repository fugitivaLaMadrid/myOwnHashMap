package ownhashMap_generic;

public class OwnHashMap_Generic <K, V>{

    public static final int SIZE = 16;
    private Entry table[] = new Entry[SIZE];

    public void put(K key, V value) {
      try {
          int indexHashcode = key.hashCode() % SIZE;
          Entry entry = table[indexHashcode];

          if (entry != null) {

              if (entry.key.equals(key)) {
                  entry.value = value;

              } else {

                  while (entry.next!= null) {
                      entry = entry.next;
                  }

                  Entry vEntryNext = new Entry(key, value);
                  entry.next = vEntryNext;
                }
          } else {
              Entry entry1 = new Entry(key, value);
              entry1.setValue(value);
              table[indexHashcode] = entry1;
          }
      }catch (NullPointerException e){
          System.out.println("NullPointerException");
      }

    }


    public Entry get(K key) {
        Entry entry = null;
        try {
            int indexHashcode = key.hashCode() % SIZE;
            entry = table[indexHashcode];
                        while (entry != null) {
                            if (entry.key.equals(key)) {
                    return entry;
                }
                entry = entry.next;
            }
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }

        return entry;
    }
}
