package Day01;

public class DSA4 {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 90, 45};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average: " + average);
    }
}