import java.util.Date;
public class FlightReservation {
    public static void main(String[] args) {
        System.out.println("Online Flight Reservation Start from here...");
        System.out.println("---------------------------");

        OnlineReservation BookingPerson1 = new OnlineReservation("Michael Gurung","Delta Airlines", 7856,  "JFK" , "Miami", "02/23/2023",500 );
        OnlineReservation BookingPerson2 = new OnlineReservation("Nisha Gurung", "American Airlines", 7856, "JFk" , "Miami", "02/23/2023",500 );
        OnlineReservation BookingPerson3 = new OnlineReservation("Sndesh Lama","Emirates Airlines", 8786,  "LGA" , "Florida", "9/23/2023",5500 );
        OnlineReservation BookingPerson4 = new OnlineReservation("Lhachen Lama","Buddha Airlines", 7196,  "Newark" , "Nepal", "5/19/2025",1500 );


        BookingPerson1.printInfo();
        BookingPerson1.DiscountApplied(30);
        BookingPerson1.PaymentMethod("Credit");
        BookingPerson1.Booked();

        BookingPerson2.printInfo();
        BookingPerson2.DiscountApplied(40);
        BookingPerson2.PaymentMethod("Debit");
        BookingPerson2.Booked();

        BookingPerson3.printInfo();
        BookingPerson3.DiscountApplied(20);
        BookingPerson3.PaymentMethod("Debit");
        BookingPerson3.Booked();


        BookingPerson4.printInfo();
        BookingPerson4.DiscountApplied(00);
        BookingPerson4.PaymentMethod("Credit");
        BookingPerson4.Booked();


        BookingPerson1.printInfo();

        System.out.println("Online Flight Reservation ends here...");

       /* String str = new String("Michael");
        System.out.println("Your Name :" +str);
       String ChangedToUpperCase = str.toUpperCase();
        System.out.println("Your Changed Name :" +ChangedToUpperCase);  */



    }
}
class OnlineReservation{
    private String way;
    private String FlightName;
    private int FlightNo;
    private String PersonName;
    private String From;
    private String To;
    private String FlyDate;
    private  int ReturnDate;
    private double price;

OnlineReservation(String PersonName,String FlightName, int FlightNo, String From, String To, String FlyDate, double price ){
    this.FlightName = FlightName;
    this.FlightNo = FlightNo;
    this.PersonName = PersonName;
    this.From = From;
    this.To = To;
    this.FlyDate = FlyDate;
    this.price = price;
}
  /*  String waysOfFlight(String way){
        this.way = way;
        String one = null;
        String two = null;
        System.out.println("Choose your ways :" +way);
        if(way == one){
            System.out.println("Your choice of way :" +way);

        }
        else {
            System.out.println("Your choice of way :" + way);
        }
        return null;
    }  */

void printInfo(){
    System.out.println("Your Name:" +PersonName);
    System.out.println("Your Flight Name:" +FlightName);
    System.out.println("Your Flight Number:" +FlightNo);
    System.out.println("You are Departure from:" +From);
    System.out.println("You are Landing to:" +To);
    System.out.println("Your Departure Date:" +FlyDate);


    System.out.println("Your Initial price :" +price);
}
void DiscountApplied(double DiscountAmt){
    System.out.println("Online booking discount Amount :" + DiscountAmt);
    price = price - DiscountAmt;

    System.out.println("Your final price is :" +price);

}

String PaymentMethod(String Method){
    String Debit = null;
    String Credit = null;

    System.out.println("Now Select  your payment method :" +Method);

    if(Method==Debit){
       System.out.println("Your payment mathod is:"+Method);
      // return Method;
    }
    else {
        System.out.println("Your payment mathod is:" + Method);
     //   return Method;
    }
    System.out.println("Thanks!!!Your Payment is done.");
return null;
}

void Booked(){
    System.out.println("Thank you.." + " " +PersonName+ " " + "for booking a flight with" + " " +FlightName+ "!!!!! ");
    System.out.println("See You Sooooon....."+ " " +PersonName);
    System.out.println("----------------------------------");

}
}
