package io.github.conditioner.lithium.util;

import java.util.HashMap;

public class HashMapUtil {

    public static <K, V> HashMap<K, V> combine(HashMap<K, V> m, HashMap<K, V> i) {
        HashMap<K, V> hashMap = new HashMap<>(m);

        hashMap.putAll(i);
        return hashMap;
    }
}
