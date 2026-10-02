import java.util.Scanner;

class NumberProcessor {

    private double[] numbers;

    NumberProcessor(double[] numbers) {
        this.numbers = numbers;
    }

    double calculateAverage() {

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    int countAboveAverage() {

        double average = calculateAverage();
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > average) {
                count++;
            }
        }

        return count;
    }
}

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
        }

        NumberProcessor processor =
                new NumberProcessor(numbers);

        double average = processor.calculateAverage();

        int count = processor.countAboveAverage();

        System.out.println("Average = " + average);
        System.out.println(
            "Numbers above average = " + count
        );

        sc.close();
    }
}