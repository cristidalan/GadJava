package lab2.ch2;

public class Studio {
    private String name;
    private Film[] filme;

    public Studio(String name, Film[] filme) {
        this.name = name;
        this.filme = filme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }
}
