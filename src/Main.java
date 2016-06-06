/**
 * Created by kate on 6/6/16.
 */
public class Main {

    public static void main(String[] args) {
        printSalary();
    }

    public static void printSalary() {
        final int KURS = 20;
        int[] salaryArray;
        salaryArray = new int[5];
        salaryArray[0] = 100;
        salaryArray[1] = 70;
        salaryArray[2] = 333;
        salaryArray[3] = 3;
        salaryArray[4] = 20;

        for (int i = 0; i < salaryArray.length; i++) {

            if (salaryArray[i] % KURS == 0)
                System.out.println("Salary " + i + ":" + salaryArray[i]);

        }

    }
}
