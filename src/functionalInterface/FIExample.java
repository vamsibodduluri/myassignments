package functionalInterface;
@FunctionalInterface
interface Amazon{
    public void order();
}

/*class Customer implements Amazon{
    public void order(){
        System.out.println("Your order is booked");
    }

    () -> System.out.println("Your order is booked");
}*/
public class FIExample {
    public static void main(String[] args) {

        Amazon cust = () -> System.out.println("Your order is booked...");
        cust.order();

    }

}
