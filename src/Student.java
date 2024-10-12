public class Student {
    double mean;
    String name;

    Student() {
    }

    Student(double mean) {
        this.mean = mean;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, double mean) {
        this.name = name;
        this.mean = mean;
    }

    boolean pass(double minRequired) {
        if (mean >= minRequired) {
            return true;
        } else {
            return false;
        }
    }

    boolean pass() {
        if (mean >= 10.0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student " + name + " has mean " + mean;
    }
}
