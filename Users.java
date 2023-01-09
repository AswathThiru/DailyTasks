package jan4;

class CreateUser {
    String username;
    int mobileNumber;
    int age;

    void CreateUser(CreateUser user1) {

        user1.username = "Aswath";
        user1.mobileNumber = 1234567890;
        user1.age = 22;

    }

    void displayUserInfo(CreateUser user1) {
        System.out.println("Name: " + user1.username);
        System.out.println("Mobile Number: " + user1.mobileNumber);
        System.out.println("Age: " + user1.age);

    }

}

class Users {

    public static void main(String[] args) {

        CreateUser user1 = new CreateUser();
        user1.CreateUser(user1);
        user1.displayUserInfo(user1);

    }
}
