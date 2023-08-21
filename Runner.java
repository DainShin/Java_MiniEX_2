public class Runner {
    public static void main(String[] args) {

        // Vehicle Object
        Vehicle v = new Vehicle("white",(byte)2, true);
        System.out.println(v);
        System.out.println("Is Eco-friendly? " + v.isEcoFriendly());

        // Truck Object
        Truck t = new Truck(true, (byte)2, "red", 3, false);
        System.out.println(t);
        System.out.println("Is Eco-friendly? " + t.isEcoFriendly());

    }
}