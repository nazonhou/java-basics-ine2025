import model.IPhone;
import model.IneStudent;
import model.Phone;
import model.Student;

public class Main {
    public static void main(String[] args) throws UnderAverageException {
        IneStudent student = new IneStudent();
        student.setName("Cahetelle");
        student.setAverage(15.0);

        try {
            System.out.println(student.payScholarship(500.0, "FEDAPAY"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello World!");
    }
}