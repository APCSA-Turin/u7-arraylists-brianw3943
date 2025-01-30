public class ThingRunner {
    public static void main(String args[]) {
        Thing thing1 = new Thing("Thingamabob");
        System.out.println(thing1.info());
        System.out.println(thing1.toString());
        System.out.println(thing1);
    }
}