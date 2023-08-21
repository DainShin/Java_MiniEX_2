public class Vehicle {

    // Instance variables
    public String color;
    protected byte doorNum;
    private boolean gasPower = true;

    // the default constructor
    public Vehicle() {}

    // 4 constructor with parameters
    public Vehicle(String color, byte doorNum) {
        this.color = color;
        this.doorNum = doorNum;
    }
    public Vehicle(String color, byte doorNum, boolean gasPower) {
        this.color = color;
        this.doorNum = doorNum;
        setGasPower(gasPower);
    }

    public Vehicle(byte doorNum, String color, boolean gasPower) {
        this.color = color;
        this.doorNum = doorNum;
        setGasPower(gasPower);
    }

    public Vehicle(boolean gasPower, byte doorNum, String color) {
        this.color = color;
        this.doorNum = doorNum;
        setGasPower(gasPower);
    }

    // setter and getter
    public boolean getGasPower() {
        return gasPower;
    }

    public void setGasPower(boolean gasPower) {
        this.gasPower = gasPower;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Color=%s, Door Number=%d, Gas-Powered=%s", color, doorNum, gasPower);
    }

    // method : if it has 2 doors and doesn't gas-powered, the method will return true
    public boolean isEcoFriendly() {
        if(this.doorNum == 2 && this.gasPower == false) {
            return true;
        }
        return false;

    }
}
