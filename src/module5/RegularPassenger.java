package module5;

 class RegularPassenger extends Passenger {
     @Override
     public String getType() {
         return "Regular";
     }

     @Override
     public int getTicketPrice() {
         return 199;
     }
 }
