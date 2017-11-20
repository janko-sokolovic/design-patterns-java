package com.jasofalcon.designpatterns.structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

class GemFactory {
    private final Map<GemType, Gem> gems;

    GemFactory() {
        gems = new EnumMap<>(GemType.class);
    }

    Gem createGem(GemType gemType) {

        Gem gem = gems.get(gemType);

        if (null == gem) {
            switch (gemType) {

                case RUBY:
                    gem = new Ruby();
                    gems.put(gemType, gem);
                    break;
                case TOPAZ:
                    gem = new Topaz();
                    gems.put(gemType, gem);
                    break;
                case AMETYST:
                    gem = new Ametyst();
                    gems.put(gemType, gem);
                    break;
                case EMERALD:
                    gem = new Emerald();
                    gems.put(gemType, gem);
                    break;

                default:
                    break;

            }
        }

        return gem;
    }
}
