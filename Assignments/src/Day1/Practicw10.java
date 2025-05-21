package Day1;

interface D{
    void studentName();
}

interface Course {
    void courseName();
}

interface Exam {
    void examDetails();
}


interface Education extends D, Course, Exam {
    void study();
}


class Colleges implements Education {
    public void studentName() {
        System.out.println("Student Name: Sandeep");
    }

    public void courseName() {
        System.out.println("Course: Computer Science");
    }

    public void examDetails() {
        System.out.println("Exam: Final semester exam scheduled in June");
    }

    public void study() {
        System.out.println("Study: Preparing hard for all subjects");
    }
}

// Main class to run the program
public class Practicw10 {
    public static void main(String[] args) {
        Colleges s = new Colleges();
        s.studentName();
        s.courseName();
        s.examDetails();
        s.study();
    }
}