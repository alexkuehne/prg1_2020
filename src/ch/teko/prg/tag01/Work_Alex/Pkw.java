package ch.teko.prg.tag01.Work_Alex;

public class Pkw {
    //Attribute
    private String marke;
    private String modell;
    private int ps;

    //Konstruktor(en)
    public Pkw(String marke, String modell, int ps) {
        this.marke = marke;
        this.modell = modell;
        this.ps = ps;
    }

    //Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
