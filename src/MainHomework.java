public class MainHomework {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        try {
            int a = 11;
            System.out.println(numbers[a]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is not in Array");
        }

    }
}
