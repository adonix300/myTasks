import java.util.Arrays;

public class MinAndMax {
    static int[] array;

    public static void main(String[] args) {
        array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(0, 100);
        }

        printArray(array);
        giveMaxMinAvg(array);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int getRandom(int min, int max) {
        int x = (int) ((Math.random() * (max - min)) + min); // max не входит в диапазон
        return x;
    }

    public static void giveMaxMinAvg(int[] array) {
        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        int avg = 0;
        for (int i = 0; i < array2.length; i++) {
            avg = avg + array2[i];
        }
        avg = avg / array2.length;

        System.out.println("max = " + array2[array2.length - 1]);
        System.out.println("min = " + array2[0]);
        System.out.println("avg = " + avg);
    }
}
