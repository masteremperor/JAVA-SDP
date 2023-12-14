public class VarargsExercise1 {

    public void displayList(int... input) {
        System.out.println("List of items: ");
        for (int item : input) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public int maxOfList(int... input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        int max = input[0];
        for (int item : input) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public void sortList(int... input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
    }

    public double averageList(int... input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        double sum = 0;
        for (int item : input) {
            sum += item;
        }
        return sum / input.length;
    }

    public static void main(String[] args) {
        VarargsExercise1 varargsExercise1 = new VarargsExercise1();

        varargsExercise1.displayList(1, 2, 3, 4, 5);
        System.out.println("Maximum value: " + varargsExercise1.maxOfList(5, 3, 7, 2));

        varargsExercise1.sortList(2, 5, 1, 4, 3);
        varargsExercise1.displayList(2, 5, 1, 4, 3);

        System.out.println("Average value: " + varargsExercise1.averageList(10, 20, 30));
    }
}