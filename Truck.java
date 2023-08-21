public class Truck extends Vehicle {

    // Instance variables
    public int seats;
    protected boolean trunkSpace;

    // The default constructor
    public Truck() {}

    // 4 constructors that mirror the constructors of the Vehicle class
    public Truck(String color, byte doorNum) {
        super(color, doorNum);
    }

    public Truck(String color, byte doorNum, boolean gasPower) {
        super(color, doorNum, gasPower);
    }

    public Truck(byte doorNum, String color, boolean gasPower) {
        super(doorNum, color, gasPower);
    }

    public Truck(boolean gasPower, byte doorNum, String color) {
        super(gasPower, doorNum, color);
    }

    //  A constructor with 3 instance variables of Vehicle & seats instance variable of Truck
    public Truck(String color, byte doorNum, boolean gasPower, int seats) {
        super(color, doorNum, gasPower);
        this.seats = seats;
    }

    // A constructor with 3 instance variables of Vehicle & trunk space instance variable of Truck
    public Truck(byte doorNum, String color, boolean gasPower, boolean trunkSpace) {
        super(doorNum, color, gasPower);
        this.trunkSpace = trunkSpace;
    }

    // A constructor with 3 instance variables of Vehicle & both instance variables of Truck
    public Truck(boolean gasPower, byte doorNum, String color, int seats, boolean trunkSpace) {
        super(gasPower, doorNum, color);
        this.seats = seats;
        this.trunkSpace = trunkSpace;
    }

    // toString : Override toString method in Vehicle class
    @Override
    public String toString() {
        return super.toString() + String.format(", Seats=%d, Trunk=%s", seats, trunkSpace);
    }

    // ecoFriendly method : Override isEcoFriendly method in Vehicle class
    @Override
    public boolean isEcoFriendly() {
        if(this.doorNum == 2 && this.getGasPower() == false) {
            if(seats < 3 && trunkSpace == false)
            return true;
        }
        return false;
    }
}
