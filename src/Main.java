public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Jane Smith";
        student1.mean = 16.0;
        System.out.println(student1);

        Student student2 = new Student(14.75);
        System.out.println(student2);

        Student student3 = new Student("John Doe");
        System.out.println(student3);

        Student student4 = new Student("Aaron Smith", 9.0);
        System.out.println(student4);
    }
}