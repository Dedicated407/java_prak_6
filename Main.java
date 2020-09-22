package ikbo.prak6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);

        Student student = new Student(scan.nextInt());
        student.filling();
        student.print();
    }
}
