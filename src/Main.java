import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        char[] arrChar = new char[n];
        Fillrand(arr);
        Print(arr);
        Sort(arr);
        Print(arr);
        System.out.println("Сумма элементов массива = " + Sum(arr));
        System.out.println("Среднее арифметическое: " + Avg(arr));
        System.out.println("MAXIMUM = " + MaxValueIn(arr) + "; " + "MINIMUM = " + MinValueIn(arr));
        System.out.print("Введите шаг сдвига массива: ");
        int shift = scanner.nextInt();
        ShiftLeft(arr,shift);
        Print(arr);
        ShiftRight(arr,shift);
        Print(arr);
        Fillrand(arrChar);
        Print(arrChar);


    }

    static void Fillrand ( int[] arr){
        Random random = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }
    static void Fillrand ( double[] arr){
        Random random = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(100);
        }
    }
    static void Fillrand (char[] arr){
        Random random = new Random(0);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(random.nextInt(26) + 'A');
        }
    }

    static void Print (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    static void Print (double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    static void Print (char[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    static void Sort ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int buffer = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buffer;
                }
            }
        }
    }
    static int Sum (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static double Sum (double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    static double Avg (int[] arr) {
        double avg = (double) Sum(arr) / arr.length;
        return avg;
    }
    static int MinValueIn (int [] arr) {
        int minArrayElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minArrayElement > arr[i])
                minArrayElement = arr[i];
        }
        return minArrayElement;
    }
    static double MinValueIn (double [] arr) {
        double minArrayElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minArrayElement > arr[i])
                minArrayElement = arr[i];
        }
        return minArrayElement;
    }
    static int MaxValueIn (int [] arr) {
        int maxArrayElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxArrayElement < arr[i])
                maxArrayElement = arr[i];
        }
        return maxArrayElement;
        }
    static double MaxValueIn (double [] arr) {
        double maxArrayElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxArrayElement < arr[i])
                maxArrayElement = arr[i];
        }
        return maxArrayElement;
    }
        static int [] ShiftLeft (int [] arr, int shift) {
            for (int i = 0; i < shift; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++)
                    arr[j] = arr[j+1];
                    arr[arr.length - 1] = temp;
            }
            return arr;
        }
    static double [] ShiftLeft (double [] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            double temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j+1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
    static char [] ShiftLeft (char [] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            char temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++)
                arr[j] = arr[j+1];
            arr[arr.length - 1] = temp;
        }
        return arr;
    }
    static int [] ShiftRight (int [] arr, int shift) {
        for (int i = arr.length - 1; i > shift; i--) {
            int temp = arr[arr.length-1];
            for (int j = arr.length - 1; j > 0; j--)
                arr[j] = arr [j-1];
            arr[0] = temp;
        }
        return arr;
    }
    static double [] ShiftRight (double [] arr, int shift) {
        for (int i = arr.length - 1; i > shift; i--) {
            double temp = arr[arr.length-1];
            for (int j = arr.length - 1; j > 0; j--)
                arr[j] = arr [j-1];
            arr[0] = temp;
        }
        return arr;
    }
    static char [] ShiftRight (char [] arr, int shift) {
        for (int i = arr.length - 1; i > shift; i--) {
            char temp = arr[arr.length-1];
            for (int j = arr.length - 1; j > 0; j--)
                arr[j] = arr [j-1];
            arr[0] = temp;
        }
        return arr;
    }
}
