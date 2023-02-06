import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] sortedArray = {1,2,1,1};
        while (hasAllSameNumbers(sortedArray)) {
            System.out.println("Ты че дебил,нормальные цифры напиши.");
            return;
        }
        do {
            unsortedArray(sortedArray);

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] == sortedArray[i + 1]) {
                    continue;
                }
                System.out.print(sortedArray[i] + " ");
            }
            System.out.println(sortedArray[sortedArray.length - 1]);

        } while (hasRepeatedNumbers(sortedArray));
    }

    private static boolean hasAllSameNumbers(int[] sortedArray) {
        for (int i = 1; i < sortedArray.length; i++) {
            if (sortedArray[i] != sortedArray[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasRepeatedNumbers(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] == sortedArray[i + 1]) {
                return true;
            }
        }
        return false;
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