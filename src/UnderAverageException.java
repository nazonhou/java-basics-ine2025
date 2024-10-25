import model.Student;

public class UnderAverageException extends Exception {
    Student student;

    public UnderAverageException(Student student) {
        super(student.getName() + " can not win a prize because he has a " + student.getAverage() + " average");
        this.student = student;
    }
}
