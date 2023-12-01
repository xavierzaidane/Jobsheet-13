import java.util.Scanner;

public class weeklygrade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Get user input for the number of weeks
        System.out.print("Enter the number of weeks: ");
        int numberOfWeeks = input.nextInt();

        int[][] grades = new int[numberOfStudents][numberOfWeeks];

        input(grades);
        output(grades);
        int[] res = getMaxGrade(grades);

        System.out.println("Max grade " + res[0] + " located in week = " + res[1]);

        input.close();
    }

    static void input(int[][] data) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("grades[" + i + "][" + j + "] = ");
                data[i][j] = input.nextInt();
            }
        }
    }

    static void output(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("grades[" + i + "][" + j + "] = " + data[i][j]);
            }
        }
    }

    static int[] getMaxGrade(int[][] data) {
        int max = data[0][0];
        int week = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                    week = j;
                }
            }
        }
        int[] result = { max, week + 1 };
        return result;
    }
}
