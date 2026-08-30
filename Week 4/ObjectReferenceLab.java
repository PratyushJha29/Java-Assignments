
class ScoreBox {
    private int score;

    ScoreBox(int score) {
        if (score < 0)
            throw new IllegalArgumentException();

        this.score = score;
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        if (score >= 0)
            this.score = score;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {
        ScoreBox a = new ScoreBox(50);
        ScoreBox b = a;
        ScoreBox c = new ScoreBox(20);

        System.out.println(a == b);
        System.out.println(a == c);

        addBonus(b, 10);

        System.out.println(a.getScore());
        System.out.println(b.getScore());

        replaceLocally(a);

        System.out.println(a.getScore());

        ScoreBox d = createScoreBox(90);

        System.out.println(d.getScore());
        System.out.println(a == d);
    }
}

