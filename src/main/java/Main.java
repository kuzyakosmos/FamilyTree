public class Main {
    public static void main(String[] args) {
        try {
            throwE();
            System.out.println("Done");
        } catch (RuntimeException e) {
            System.out.println("Catched");
        } finally {
            System.out.println("Finally");
        }
    }

    static void throwE() {
        throw new RuntimeException();
    }
}

