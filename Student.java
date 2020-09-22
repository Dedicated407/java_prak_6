package ikbo.prak6;
import java.util.Scanner;

public class Student {
    int size;
    Struct[] iDNumber;

    Student(int size){
        this.size = size;
        iDNumber = new Struct[size];
    }

    void filling(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++)
            iDNumber[i] = new Struct(scan.next(),scan.nextInt());
        insertionSort();
    }

    void insertionSort() {

        for (int i = 1; i < size; i++) {
            int j = i - 1;
            Struct value = iDNumber[i];
            while (j >= 0 && iDNumber[j].getPoints() > value.getPoints()) {
                iDNumber[j + 1] = iDNumber[j];
                j--;
            }
            iDNumber[j + 1] = value;
        }
    }

    void print() {
        System.out.println("Сортировка студентов по баллам: ");
        for (int i = 0; i < size; i++)
            System.out.println(iDNumber[i].getName() + " " + iDNumber[i].getPoints());
    }
}
