class class1 {
    String name = "James";// instance var or class var or global var
    String Rollno = "22052322";
    int age = 41;

    void display() {
        System.out.println(name);
        System.out.println("My age is " + age);
    }

    int display2() {
        display();
        return 10;
    }

    public static void main(String args[]) {
        class1 obj; // object is created
        obj = new class1(); // memory is allocated

        // calling the method
        obj.display();

        System.out.println(obj.name);
        System.out.println("My Age is " + obj.age);
        // deallocation of memory happens automatically in java

    }
}
