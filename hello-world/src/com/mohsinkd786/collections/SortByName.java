package com.mohsinkd786.collections;

import java.util.Comparator;

public class SortByName implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o2.name.compareTo(o1.name);
    }
}


// Comparable - compareTo
// comparator - compare
