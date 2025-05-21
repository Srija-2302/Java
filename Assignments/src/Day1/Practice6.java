package Day1;

interface Batsman {
    void hitSix(String n);
}

interface Bowler {
    void bowlYorker(String n);
}

interface Fielder {
    void catchBall(String n);
}

class Player implements Batsman, Bowler, Fielder {
    public void hitSix(String n) {
        System.out.println(n + " hits a massive six over the boundary!");
    }

    public void bowlYorker(String n) {
        System.out.println(n + " bowls a perfect yorker!");
    }

    public void catchBall(String n) {
        System.out.println(n + " takes a stunning catch at the boundary!");
    }
}

interface Captain {
    void setField(String n);
}

class CaptainPlayer extends Player implements Captain {
    public void setField(String n) {
        System.out.println(n + " sets an aggressive fielding setup.");
    }

    public void motivateTeam(String n) {
        System.out.println(n + " motivates the team with an inspiring speech.");
    }
}

public class Practice6 {
    public static void main(String[] args) {
        CaptainPlayer virat = new CaptainPlayer();

        virat.hitSix("Virat");
        virat.bowlYorker("Virat");
        virat.catchBall("Virat");
        virat.setField("Virat");
        virat.motivateTeam("Virat");
    }
}
