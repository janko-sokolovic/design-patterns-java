package com.jasofalcon.designpatterns.builder;

public class House {

    // required
    private String roof;
    private String windows;

    // optional
    private String garage;
    private boolean isSmartHouse;
    private boolean hasPorch;

    private House(HouseBuilder houseBuilder) {
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.garage = houseBuilder.garage;
        this.isSmartHouse = houseBuilder.isSmartHouse;
        this.hasPorch = houseBuilder.hasPorch;
    }

    @Override
    public String toString() {
        return "roof: " + roof + ", windows: " + windows + ", garage: " + garage + ", smart?: " + isSmartHouse + ", has porch?: " + hasPorch;
    }

    public static class HouseBuilder {
        // required
        private String roof;
        private String windows;

        // optional
        private String garage;
        private boolean isSmartHouse;
        private boolean hasPorch;

        public HouseBuilder(String roof, String windows) {
            this.roof = roof;
            this.windows = windows;
        }

        public HouseBuilder setGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public HouseBuilder setIsSmartHouse(boolean isSmartHouse) {
            this.isSmartHouse = isSmartHouse;
            return this;
        }

        public HouseBuilder hasPorch(boolean hasPorch) {
            this.hasPorch = hasPorch;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
