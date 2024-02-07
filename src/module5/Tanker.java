package module5;

public class Tanker {
    private  String serialNumber;

    protected String getFuelType(){
        return "A500";
    }
    public void refuel(int amount){
        System.out.println( "Add" + amount + "of" + getFuelType() +", tanker serial number is" +  serialNumber);
    }
}
