public enum PlaneType {

    BOEING747(100, 1000),
    CONCORD(2, 1000),
    JUMBO(200, 2000);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}

