package module5;

public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public  void printInfo() {
        System.out.println("Name is " + this.name + ", serial number is " + this.serialNumber);
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.trim().startsWith("SN") && serialNumber.trim().length() == 8) {
            this.serialNumber = serialNumber.trim();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty() && name.length() <= 100) {
            this.name = name.trim();
        }
    }

    // Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        // Name is Voyager, serial number is SN506788
      ship.printInfo();
    }
}