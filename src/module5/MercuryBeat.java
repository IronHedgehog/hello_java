package module5;

 class MercuryBeat extends Spaceport{
     @Override
     public int calculateTotalPrice(int passengerCount) {
         return passengerCount * 15;
     }
 }
