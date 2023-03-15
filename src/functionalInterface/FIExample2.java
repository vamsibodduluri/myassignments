package functionalInterface;

import javax.xml.transform.Source;

interface Cab{

    public String cabBooking(String Source, String Destination);
}

/*class ola implements Cab{
    @Override
    public void cabBooking(String Source, String Destination) {
        System.out.println("Cab is booked from "+ Source +" to "+Destination);
    }
}*/
public class FIExample2 {
    public static void main(String[] args) {
        Cab obj = (Source,Destination) -> {
            System.out.println("Cab is booked from " + Source + " to " + Destination);
            return ("Waiting.....!");
        };
        System.out.println(obj.cabBooking("Kansas","Tampa"));

    }
}
