public class Colony {

    private String colonyName;
    private static final int MAX_HOUSES = 10;
    private int noOfHouses;
    private House[] quarters;

    public Colony(String name) {
        this.colonyName = name;
        this.quarters = new House[MAX_HOUSES];
        this.noOfHouses = 0;
    }

    public String getColonyName() {
        return this.colonyName;
    }

    public boolean addHouse(House h) {
        if (noOfHouses < MAX_HOUSES) {
            quarters[noOfHouses] = h;
            noOfHouses++;
            return true;
        }
        return false;
    }

    public int getTotalMaintenanceCost() {
        int totalMaintenanceCost = 0;
        for (House house : quarters) {
            if (house == null) {
                continue;
            }
            totalMaintenanceCost += house.getMaintenanceCost();
        }
        return totalMaintenanceCost;
    }
}