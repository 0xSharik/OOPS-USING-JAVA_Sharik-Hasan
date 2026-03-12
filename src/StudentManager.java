import java.io.*;
import java.util.*;

public class StudentManager {

    String fileName = "experiment .txt";

    public void writeStudent() {
        Scanner scan = new Scanner(System.in);

        try {
            FileWriter writing = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(writing);

            System.out.print(" ID : ");
            int id = scan.nextInt();
            scan.nextLine();



            System.out.print(" Name : ");
            String name = scan.nextLine();



            System.out.print(" Marks : ");
            double marks = scan.nextDouble();


            Student s = new Student(id, name, marks);

            bw.write(s.id + s.name +  s.marks);
            bw.newLine();
            bw.close();

            System.out.println("done");

        } catch (InputMismatchException e) {

            System.out.println("Wrong value");

        } catch (IOException e) {

            System.out.println("Fileissue");

        }
    }

    public void readStudents() {
        try {
            File file = new File(fileName);

            if (!file.exists()) {
                System.out.println("File not here");
                return;
            }

            BufferedReader bro = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bro.readLine()) != null) {
                System.out.println(line);
            }

            bro.close();

        } catch (IOException e) {
            System.out.println("File issue yr");
        }
    }
}