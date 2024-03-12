import java.util.Scanner;

public class FinishedPractice {
    public static void main(String[] args) {
        @SuppressWarnings("resource") // vs code doesn't like scanner, this line isn't normally needed
        Scanner scanner = new Scanner(System.in);

        System.out.println("* Random Number Generator ! *");
        System.out.println(" * * * * * * * * * * * * * *");

        int size;
        int end;

        System.out.println("# of results requested:");
        size = scanner.nextInt();

        System.out.println("# to go up to:");
        end = scanner.nextInt();

        int[] nums = rng(size, end);

        printArr(nums);
    }

    private static int[] rng(int size, int end) {
        int[] results = new int[size];

        for (int i = 0; i < size; i++) {
            results[i] = (int) (Math.random() * end);
        }

        return results;
    }

    private static void printArr(int[] arr) {
        for (int element : arr) {
            System.out.print(element + ", ");
        }
    }

}
