package ownhashMap_generic;

public class TestHashMapGeneric {
    public static void main(String[] args) {
        OwnHashMap_Generic<String,String> map = new OwnHashMap_Generic<>();
        map.put("NL", "Netherlands");
        map.put("DE", "Germany");
        map.put("UK", "United Kingdom");
        map.put("UK", "Ukraine");

        Entry v =map.get("NL");
        System.out.println(v.getValue());

        Entry v2 = map.get("DE");
        System.out.println(v2.getValue());
        Entry v3 = map.get("UK");
        System.out.println(v3.getValue());
        Entry v4 = map.get("UK");
        System.out.println(v4.getValue());
        map.put("FR", null);
        Entry v6 = map.get("FR");
        System.out.println(v6.getValue());


    }
}
