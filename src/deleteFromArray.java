public class deleteFromArray {

    public static void main(String[] args) {

        int number = getRandom(0, 10);
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(0, 10);
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print("Число, которое нужно исключить: " + number + ". Это число встречается: ");
        System.out.print(array.length - count);
        System.out.println(" раз(а).");

        int[] array2 = new int[count];

        for (int i = 0; i < array2.length; i++) {
            if (array[i] != number) {
                array2[i] = array[i];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
