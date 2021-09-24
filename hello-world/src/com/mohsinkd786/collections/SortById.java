package com.mohsinkd786.collections;

import java.util.Comparator;

public class SortById implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.userId - o2.userId;
    }
}
