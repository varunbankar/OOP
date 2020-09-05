public class House {

    private static final int ELECTRICITY_CHARGES = 600;
    private int houseNumber;
    private static final int MAX_ROOMS = 5;
    private int noOfPeople;
    private int noOfRooms;
    private static final int PAINTING_RATE = 5;
    private Room[] rooms;
    private static final int TAX = 40;
    private static final int WATER_CHARGES = 300;

    public House(int num, int people) {
        this.houseNumber = num;
        this.noOfPeople = people;
        this.noOfRooms = 0;
        this.rooms = new Room[MAX_ROOMS];
    }

    public boolean addRoom(int l, int b, int h) {
        if (noOfRooms < MAX_ROOMS) {
            rooms[noOfRooms] = new Room(l, b, h);
            noOfRooms++;
            return true;
        }
        return false;
    }

    public boolean addRoom(int d) {
        return this.addRoom(d, d, d);
    }

    public int getCostofPaint() {
        int costOfPaint = 0;
        for (Room room : rooms) {
            if (room == null) {
                continue;
            }
            costOfPaint += (PAINTING_RATE * room.getLateralArea());
        }
        return costOfPaint;
    }

    public int getMaintenanceCost() {

        int maintenanceCost = 0;
        int totalRoomTax = 0;

        for (Room room : rooms) {
            if (room == null) {
                continue;
            }
            totalRoomTax += (TAX * room.getFloorArea());
        }

        int totalElectricityCharges = noOfPeople * ELECTRICITY_CHARGES;
        int totalWaterCharges = noOfPeople * WATER_CHARGES;

        maintenanceCost += (totalRoomTax + totalElectricityCharges + totalWaterCharges + this.getCostofPaint());

        if (houseNumber % 3 == 0 && maintenanceCost >= 100) {
            maintenanceCost -= 100;
        }

        return maintenanceCost;
    }

}
