package Day1;

interface Subject {
    void studyMath();
}

class Student1 {
    void healthyHabit() {
        System.out.println("Students should sleep early and wake up early");
    }
}

class ScienceStudent extends Student1 implements Subject {
    public void studyMath() {
        System.out.println("Math improves logical thinking!");
    }

    public void studyBiology() {
        System.out.println("Biology helps understand human body.");
    }
}

class Hobby {
    void favoriteHobby() {
        System.out.println("Painting and reading are great hobbies.");
    }
}

class CreativeStudent extends Hobby {
    void showTalent() {
        System.out.println("Won a prize in school painting competition.");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        ScienceStudent s = new ScienceStudent();
        s.healthyHabit();
        s.studyMath();
        s.studyBiology();

        CreativeStudent c = new CreativeStudent();
        c.favoriteHobby();
        c.showTalent();
    }
}