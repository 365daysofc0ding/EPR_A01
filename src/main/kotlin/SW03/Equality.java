package SW03;

public class Equality {

    public static void main(String[] args) {

        String name = "Test";
        String name2 = new String("Test"); // creates a new object
        String name3 = name2;

        // object reference comparison
        System.out.println(name == name2);
        System.out.println(name2 == name3);

        // content comparison
        System.out.println(name.equals(name2));
        System.out.println(name2.equals(name3));
    }

}
