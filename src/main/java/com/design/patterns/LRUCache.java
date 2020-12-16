package com.design.patterns;

import java.util.HashMap;

public class LRUCache {

    class Entry {
        int value;
        int key;
        Entry left;
        Entry right;
    }

    private HashMap<Integer, Entry> hashMap;
    private Entry start, end;
    private int LRU_SIZE = 4;

    public LRUCache() {
        hashMap = new HashMap<Integer, Entry>();
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache();

        lruCache.putEntry(1, 4);
        lruCache.putEntry(2, 10);
        lruCache.putEntry(3, 14);
        lruCache.putEntry(2, 8);
        lruCache.putEntry(1, 19);
        lruCache.putEntry(8, 19);
        lruCache.putEntry(6, 19);
        lruCache.putEntry(7, 19);
       // lruCache.putEntry(6, 30);
        System.out.println(lruCache.hashMap.size());

        System.out.println(lruCache.getEntry(2));
        System.out.println(lruCache.getEntry(1));
        System.out.println(lruCache.getEntry(2));
    }

    private void putEntry(int key, int value) {
        if (hashMap.containsKey(key)) {
            Entry entry = hashMap.get(key);
            entry.value = value;
            removeEntry(entry);
            addToTop(entry);

        } else {
            // New entry is adding to cache
            Entry node = new Entry();
            node.left = null;
            node.right = null;
            node.value = value;
            node.key = key;
            if (hashMap.size() > LRU_SIZE) {
                hashMap.remove(end.key);
                removeEntry(end);
                addToTop(node);
            } else {
                addToTop(node);
            }
            hashMap.put(key, node);
        }
    }

    private int getEntry(int key) {
        if (hashMap.containsKey(key)) {
            Entry node = hashMap.get(key);
            removeEntry(node);
            addToTop(node);
            return node.value;
        }
        return -1;
    }

    private void addToTop(Entry node) {
        node.left = null;
        node.right = start;

        if (start != null) {
            start.left = node;
        }
        start = node;

        if (end == null)
            end = start ;
    }


    private void removeEntry(Entry node) {
        if (node.left != null) {
            node.left.right = node.right;
        } else {
            start = node.right;
        }
        if (node.right != null) {
            node.right.left = node.left;

        } else {
            end = node.left;
        }

    }


}
