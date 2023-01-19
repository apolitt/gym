package gym;

public abstract class Membership {
 double number;
 int visitsLimit;


    public void declaration() {
        System.out.println("Declaration complete. The number is: "+number);
    }
    public void register() {
        System.out.println("Client has been registered. Your visits number is: "+visitsLimit);
    }
}
