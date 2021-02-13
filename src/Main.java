public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0");

        } catch (Exception e1) {

        } finally {
            System.out.println("We are in finally block");
        }

        System.out.println("Hello!");
    }
}
