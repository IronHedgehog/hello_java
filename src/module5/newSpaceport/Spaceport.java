package module5.newSpaceport;

 class Spaceport {
     private final GasStation gasStation = new GasStation();
     private final  ServiceTower serviceTower = new ServiceTower();
     private final  CompressorStation compressorStation = new CompressorStation();
     private final  Radar radar = new Radar();
     private final  CommandPost commandPost = new CommandPost();
    public void launch(){
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
}

class GasStation {
    public void refuel(){
        System.out.println("Refuel done!");
    }
}

class ServiceTower {
    public void service(){
        System.out.println("Service done!");
    }
}

class CompressorStation {
    public void compress(){
        System.out.println("Compress done!");
    }
}

class Radar {
    public void scan(){
        System.out.println("Scan done!");
    }
}

class CommandPost {
    public void command(){
        System.out.println("Fire!");
    }
}