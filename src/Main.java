public class Main {
    public static void main(String[] args) {
        org.example.Withdraw person = new org.example.Withdraw();
        person.buy(2500,"Milo");
        person.remainingBalance();

       person.buy(1500, "Milo");
       person.remainingBalance();

        person.buy(300, "Milo");
        person.remainingBalance();

        person.buy(300, "Milo");
        person.remainingBalance();




    }
}