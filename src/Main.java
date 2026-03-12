import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        while (true) {
            System.out.println("\n1.Add  2.View  3.Exit");
            int ch = sc.nextInt();

            if (ch == 1)
                sm.writeStudent();
            else if (ch == 2)
                sm.readStudents();
            else
                System.exit(0);
        }
    }
}