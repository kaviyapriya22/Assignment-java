package org.ford.Assignment3;

public class Driver {

    public static void main(String[] args) {

//        Employee employee = new Employee("Kaviya","KK78",50000.0,"ET");
//        employee.displayDetails();
//
//        Manager manager = new Manager("Mahesh","mmsh",500000.0,"ET",17,"GTT");
//        manager.displayDetails();
//
//        SavingsAccount saving_acc = new SavingsAccount("SA01",5000.0,"kaviya",5);
//        saving_acc.calculateInterestRate();
//
//        CurrentAccount curr_acc = new CurrentAccount("CA01", 7000.0,"PRIYA",5000);
//        curr_acc.withdraw();
//
//        Electronics electronics = new Electronics("EID01","Light",300.0,5.0);
//        System.out.println(electronics.displayProductDetails());
//
//        Cloth cloth = new Cloth("CID05","Maxi",5000.0,"Cotton");
//        System.out.println(cloth.displayProductDetails());


//
//        Professor professor   = new Professor("Priya","pp44",35,"pp01");
//        Course course = new Course("Mathematics",professor);
//        Student student= new Student("Kaviya","kk22",21,"kk01");
//
//        student.addCourse(course);
//        student.displayDetails();
//
//        professor.displayCoursesTaught();
//
//        course.displayRegisteredStudents();

//        Vehicle v1 = new Bike(78566777,"Pulsor",100.0,50);
//        Vehicle v2= new Car(28937493,"Ford",500,5);
//        Vehicle v3= new Truck(237493,"Ashok Leyland",1000,100);
//
//        v1.calculateRentalRate();
//        v2.calculateRentalRate();
//        v3.calculateRentalRate();

//        InPatient p1 = new InPatient("Kk09","Kaviya",21,401,"22 jan 2025");
//        OutPatient p2 = new OutPatient("pp45","priya",34,"13 Dec 2024",5000.0);
//
//        p1.displayDetails();
//        p2.displayDetails();

//        PrintedBook b1 = new PrintedBook("Java","John","ISBN001",2000.0,350,"Hardcover");
//        Ebook b2 = new Ebook("Python","Jane","ISBN201",3000.0,2,"PDF");
//        AudioBook b3= new AudioBook("C++","Jacks","ISBN301",2000.0,10,"Morgan");
//
//        Library library = new Library();
//        library.addBook(b1);
//        library.addBook(b2);
//        library.addBook(b3);
//
//        library.displayBooks();

//        VegItem o1 = new VegItem("Paneer Butter Masala", 250, "Veg", 350, "Medium");
//        NonVegItem o2= new NonVegItem("Chicken Biryani", 300, "Non-Veg", 500, "Spicy");
//        VegItem o3 = new VegItem("Burrito", 250, "Veg", 300, "Medium");
//
//        Order order = new Order();
//        order.addItem(o1);
//        order.addItem(o2);
//        order.addItem(o3);
//
//        System.out.println(" -----Your cart items------");
//
//        order.displayCart();
//        order.calculateTotalPrice();

        Policy[] policies = new Policy[3];
        policies[0] = new LifeInsurance("L101", "Ravi", 500000, "Anita");
        policies[1] = new HealthInsurance("H202", "Meera", 300000, 0.5);

        for (Policy p : policies) {
            System.out.println(p.getpNumber() );
            p.calculatePremium();
            System.out.println("--------------------");


        }
    }
}
