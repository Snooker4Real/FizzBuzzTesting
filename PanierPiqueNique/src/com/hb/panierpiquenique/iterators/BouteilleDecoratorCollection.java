package com.hb.panierpiquenique.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hb.panierpiquenique.pojos.BouteilleDecorator;

public class BouteilleDecoratorCollection implements Iterator<BouteilleDecorator>, Iterable<BouteilleDecorator>{
    private List<BouteilleDecorator> bottles = new ArrayList<BouteilleDecorator>();
    private int offset = 0;

    @Override
    public Iterator<BouteilleDecorator> iterator() {
        return bottles.iterator();
    }

    @Override
    public boolean hasNext() {
        return offset < bottles.size();
    }

    @Override
    public BouteilleDecorator next() {
        return bottles.get(offset++);
    }

    public void add(BouteilleDecorator b) {
        bottles.add(b);
    }

    public int size() {
        return bottles.size();
    }

    public BouteilleDecorator get(int idx) {
        return bottles.get(idx);
    }

}
