package jan9;

import java.util.Scanner;

public class ClassStudent {
    String name;
    int age;
    String place;
    String college;
    int n;
    static int count = 0;
    ClassStudent arrayStudent[];
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        ClassStudent obj = new ClassStudent();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        obj.name = sc.next();
        System.out.println("Enter age:");
        obj.age = sc.nextInt();
        System.out.println("Enter place:");
        obj.place = sc.next();
        System.out.println("Enter college:");
        obj.college = sc.next();
        arrayStudent[count] = obj;
        count++;

    }

    public void displayStudent() {
        System.out.println("enter the student number:");
        int index = sc.nextInt();
        ClassStudent arrayStudent1 = arrayStudent[index];
        System.out.println("Enter name:" + arrayStudent1.name);
        System.out.println("Enter age:" + arrayStudent1.age);
        System.out.println("Enter place:" + arrayStudent1.place);
        System.out.println("Enter college:" + arrayStudent1.college);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of student:");
        int n = sc.nextInt();
        ClassStudent obj1 = new ClassStudent();
        obj1.arrayStudent = new ClassStudent[n];
        boolean state = true;

        while (state) {
            System.out.println("enter case number:");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    obj1.addStudent();
                    break;
                case 2:
                    obj1.displayStudent();
                    break;
                case 3:
                    state = false;
                    break;

            }
        }
    }

}