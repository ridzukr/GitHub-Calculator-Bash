public class Main {
    public static void main(String[] args) {
        System.out.println("Supper app!");

        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}

