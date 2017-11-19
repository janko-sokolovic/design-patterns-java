package com.jasofalcon.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jewelry {

    private List<Gem> gemList;

    public Jewelry(){
        gemList = new ArrayList<>();

        addGems();
    }

    private void addGems() {
        GemFactory gemFactory = new GemFactory();

        gemList.add(gemFactory.createGem(GemType.RUBY));
        gemList.add(gemFactory.createGem(GemType.EMERALD));
        gemList.add(gemFactory.createGem(GemType.EMERALD));
        gemList.add(gemFactory.createGem(GemType.AMETYST));
        gemList.add(gemFactory.createGem(GemType.TOPAZ));
        gemList.add(gemFactory.createGem(GemType.EMERALD));
        gemList.add(gemFactory.createGem(GemType.TOPAZ));
        gemList.add(gemFactory.createGem(GemType.AMETYST));
        gemList.add(gemFactory.createGem(GemType.RUBY));
        gemList.add(gemFactory.createGem(GemType.TOPAZ));
    }

    public final List<Gem> getGemList() {
        return Collections.unmodifiableList(gemList);
    }

    public void enumerateGems(){
        gemList.forEach(Gem::glow);
    }
}
