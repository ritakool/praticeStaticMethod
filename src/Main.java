public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(123, "Adam");
        Student s2 = new Student(124, "Eva");
        Student s3 = new Student(125, "God");

        s1.display();
        s2.display();
        s3.display();
    }
}