class Student {
    String name;
    
    void displayName() {
        System.out.println("Student name: " + name);
    }
}

public class Seatwork6Q3 {
    public static void main(String[] args) {

        Student s1 = new Student(); //changing this to null prints out "Error"

        try {
            s1.name = "Jhanarry";
            s1.displayName(); 
            
        } catch (Exception Student) {
            System.out.println("Error");
        }
    }
}
