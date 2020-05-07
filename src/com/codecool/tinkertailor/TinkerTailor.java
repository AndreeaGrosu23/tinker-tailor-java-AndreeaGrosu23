package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        List<Integer> outcome = new ArrayList<>();
        List<Integer> nElements = new ArrayList<>();

        for (int i=1; i<=n; i++)
            nElements.add(i);

        int startIndex = 0;

        while (nElements.size()>0) {
            startIndex = (startIndex+k-1)%nElements.size();
            outcome.add(nElements.get(startIndex));
            nElements.remove(startIndex);
        }

        return outcome;
    }
}