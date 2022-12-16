public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly(); //penguins cannot fly. breaks liskov substitution principle stating that subclass should be able
        // to perform all action and contain all characteristics of super class. Bird class with fly method is inappropriate.
        //either need to create a different super class, include fly method elsewhere or generalize fly to method like move()
        //which can be overridden for specific actions

        System.out.println("");

        Duck duck = new Duck();
        duck.fly();

    }
}