

public class RandomElementWithWeight {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] weight = {2, 4, 6, 1, 3, 5};

        RandomElementWithWeight r = new RandomElementWithWeight();
        r.getRandomElement(array, weight);

    }

    public void getRandomElement(int[] array, int[] weight) {
        int count = 0;

        for (int i = 0; i < weight.length; i++) {
            count = count + weight[i];
        }

        int[] array2 = new int[count];

        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < weight[i]; j++) {
                array2[count2++] = array[i];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        int random = (int) (Math.random() * (array2.length - 1));

        int count3 = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[random] == array2[i]) {
                count3++;
            }
        }

        int procent = count3 * 100 / count;

        System.out.println("Выпавшее число: " + array2[random] + ". Шанс выпадения: " + procent + "%");
    }


}


