package module5;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount > 0 && bigRocketCount <= 100){
            this.bigRocketCount = bigRocketCount;
        }


    }

    public int getSmallRocketCount() {

        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount > 0 && smallRocketCount <= 100){
            this.smallRocketCount = smallRocketCount;
        }

    }
    public void launchBigRocket(){
        if (this.bigRocketCount > 0){
            setBigRocketCount(this.bigRocketCount - 1);
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket(){
        if (this.smallRocketCount > 0){
           setSmallRocketCount(this.smallRocketCount - 1);
            System.out.println("Launch small rocket");
        }
    }
    public int getTotalPower(){
        return getBigRocketCount() * 100 + getSmallRocketCount() * 50;
    }
}
