import java.util.ArrayList;
import java.util.Scanner;

class Information {
    private int id;
    private String name;
    private double marks;

    public Information(int id, String name, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", marks=" + marks;
    }
}

class StudentOperations {
    static ArrayList<Information> List = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine(); 

        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); 

        List.add(new Information(id, name, marks));
        System.out.println("----Added successfully-----");
    }

    public static void deleteStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        for (Information std:List) {
            if (std.getId() == id) {
                List.remove(std);
                System.out.println("----Deleted successfully-----");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void viewStudent() {
        System.out.println("----Student List-----");
        if (List.isEmpty()) {
            System.out.println("-----No student found-----");
            return;
        }
        for (Information std : List) {
            System.out.println(std);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
       

        for (Information std : List) {
            if (std.getId() == id) {
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();

                System.out.print("Enter new Marks: ");
                double marks = sc.nextDouble();
                sc.nextLine(); 

                std.setName(name);
                std.setMarks(marks);
                System.out.println("----Updated successfully-----");
                return;
            }
        }
        System.out.println("Student with id " + id + " not found.");
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose ::\n 1. Add student \n 2. Delete student \n 3. View student \n 4. Update student \n 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    StudentOperations.addStudent();
                    break;
                case 2:
                    StudentOperations.deleteStudent();
                    break;
                case 3:
                    StudentOperations.viewStudent();
                    break;
                case 4:
                    StudentOperations.updateStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}