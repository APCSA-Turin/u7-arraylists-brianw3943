import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));
        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i).getName());
        }
        System.out.println();
        for (Cat cat : catList) {
            System.out.println(cat.getName());
        }
    }
}