package com.java.training.day1.methods_and_encapsulation;

public final class ImmutableClass {

    private int value;
    private StringBuilder sb;

    public ImmutableClass(int value, StringBuilder sb) {
        this.value = value;
        this.sb = sb;
    }

    public int getValue() {
        return value;
    }

    public StringBuilder getSb() {
        return new StringBuilder(sb);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "value=" + value +
                ", sb=" + sb.toString() +
                '}';
    }
}
