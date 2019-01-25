package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private String bun;
    private SauceType sauceType;
    private int burgers;
    private List<BigMacIngaredient> ingaredients;

    public static class BigMacBuilder {
        private String bun;
        private SauceType sauceType;
        private int burgers;
        private List<BigMacIngaredient> ingaredients = new ArrayList<>();

        public BigMacBuilder bun(String bunType) {
            this.bun = bunType;
            return this;
        }

        public BigMacBuilder sauce(SauceType sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public  BigMacBuilder burgers(int burgersQuantity) {
            this.burgers = burgersQuantity;
            return this;
        }

        public BigMacBuilder ingaredient(BigMacIngaredient ingaredientToAdd) {
            this.ingaredients.add(ingaredientToAdd);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun,sauceType,burgers,ingaredients);
        }

    }

    private BigMac(String bun, SauceType sauceType, int burgers, List<BigMacIngaredient> ingaredients) {
        this.bun = bun;
        this.sauceType = sauceType;
        this.burgers = burgers;
        this.ingaredients = ingaredients;
    }

    public String getBun() {
        return bun;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<BigMacIngaredient> getIngaredients() {
        return ingaredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", sauceType=" + sauceType +
                ", burgers=" + burgers +
                ", ingaredients=" + ingaredients +
                '}';
    }
}