package dev.lpa;

public record Place(String name, Integer distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}
