package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMack {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMackBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMackBuilder bun (String bun) {
            this.bun = bun;
            return this;
        }
        public BigMackBuilder burgers (int burgers) {
            this.burgers = burgers;
            return this;
        }
        public BigMackBuilder sauce (String sauce) {
            this.sauce = sauce;
            return this;
        }
        public BigMackBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }
        public BigMack build() {
            return new BigMack(bun,burgers,sauce,ingredients);
        }
    }

    private BigMack(final String bun, final int burgers, final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMack{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
