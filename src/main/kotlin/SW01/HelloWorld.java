package SW01;

public class HelloWorld {

    private static final int a = 0;
    private static final int b = 1;

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] numbers = {a, b};

        for(int number : numbers) {
            System.out.println(number);
        }
    }

}
