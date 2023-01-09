package jan4;

import java.util.Scanner;

class CreateUsers {
    String username;
    int mobileNumber;
    int age;

    void createUser(CreateUsers user1) {
        System.out.println("Enter User Information");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Name");
        user1.username = sc1.next();
        System.out.println("Enter your Mobile number");
        user1.mobileNumber = sc1.nextInt();
        System.out.println("Enter Age");
        user1.age = sc1.nextInt();

    }

    void displayUserInfo(CreateUsers user1) {
        System.out.println("Name: " + user1.username);
        System.out.println("Mobile Number: " + user1.mobileNumber);
        System.out.println("Age: " + user1.age);

    }

}

class User {

    public static void main(String[] args) {

        CreateUsers user1 = new CreateUsers();
        user1.createUser(user1);
        user1.displayUserInfo(user1);

    }

}