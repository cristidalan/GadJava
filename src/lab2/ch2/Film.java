package lab2.ch2;

public class Film {
    private int anAparitie;
    private String name;
    private Actor[] actori;

    public Film(int anAparitie, String name, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.name = name;
        this.actori = actori;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}
