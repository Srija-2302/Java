package Day1;

interface Office {
    void name();
}

interface Employees extends Office {
    void CEO();
    void Manager();
}

class Srija implements Employees {
    public void name() {
        System.out.println("SSS Solutions");
    }

    public void CEO() {
        System.out.println("Sandeep");
    }

    public void Manager() {
        System.out.println("Suphala");
    }

    public void HR() {
        System.out.println("Shivani");
    }
}

class Demo26 implements Employees {
    public void name() {
        System.out.println("Sreddy Solutions");
    }

    public void CEO() {
        System.out.println("Ravi");
    }

    public void Manager() {
        System.out.println("Divya");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Srija s = new Srija();
        s.name();
        s.CEO();
        s.Manager();
        s.HR();

        Demo26 d = new Demo26();
        d.name();
        d.CEO();
        d.Manager();
    }
}