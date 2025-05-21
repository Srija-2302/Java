package Day1;

interface NobitaActions {
    void watchTV();
    void playVideoGame();
}

class Nobita implements NobitaActions {
    public void watchTV() {
        System.out.println("Nobita is watching cartoons all day!");
    }

    public void playVideoGame() {
        System.out.println("Nobita is playing video games and avoiding homework.");
    }

    public void sleep() {
        System.out.println("Nobita falls asleep while doing homework.");
    }
}

interface GianActions {
    void singLoud();
    void scareOthers();
}

class Gian implements GianActions {
    public void singLoud() {
        System.out.println("Gian sings loudly and scares everyone!");
    }

    public void scareOthers() {
        System.out.println("Gian threatens Nobita for not attending practice.");
    }
}

interface DoraemonActions {
    void useGadget();
    void helpNobita();
}

class Doraemon implements DoraemonActions {
    public void useGadget() {
        System.out.println("Doraemon uses the 'Anywhere Door' gadget!");
    }

    public void helpNobita() {
        System.out.println("Doraemon helps Nobita complete his homework.");
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Nobita nobita = new Nobita();
        Gian gian = new Gian();
        Doraemon doraemon = new Doraemon();

        nobita.watchTV();
        nobita.playVideoGame();
        nobita.sleep();

        gian.singLoud();
        gian.scareOthers();

        doraemon.useGadget();
        doraemon.helpNobita();
    }
}