import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 6, 4, 5, 1, 9, 10};
        boolean hasAllDifferentNumbers = true;//Если почитать можно пишем false,если нельзя true//


        while (!hasAllDifferentNumbers) {
            unsortedArray(sortedArray);

            for (int i = 0; i < sortedArray.length; i++) {
                System.out.print(sortedArray[i] + " ");
            }
            System.out.println("");

            hasAllDifferentNumbers = true;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] == sortedArray[i + 1]) {
                    hasAllDifferentNumbers = false;
                    break;
                }
            }
        }
    }

    public static void unsortedArray(int[] sortedArray) {
        int n = sortedArray.length;
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int randomIndex = random.nextInt(n);
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[randomIndex];
            sortedArray[randomIndex] = temp;
        }
    }
}