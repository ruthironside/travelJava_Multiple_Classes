public enum PlaneType {

    BOEING747(100, 1000000),
    CONCORD(2, 1500000),
    JUMBO(200, 2000000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}

