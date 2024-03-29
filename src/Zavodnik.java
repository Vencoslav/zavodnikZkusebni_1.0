import java.math.BigDecimal;
import java.time.LocalDate;

public class Zavodnik {
    private String jmeno;
    private Double vysledek;
    private Integer kategorie;
    private BigDecimal vyhra;
    private Boolean naDivokouKartu;
    private LocalDate datum;

    public Zavodnik(String jmeno,Integer kategorie) {
        this.jmeno = jmeno;
        this.kategorie = kategorie;
    }

    public Zavodnik(String jmeno, Double vysledek, Integer kategorie, BigDecimal vyhra, Boolean naDivokouKartu, LocalDate datum) {
        this.jmeno = jmeno;
        this.vysledek = vysledek != null ? vysledek : 0.0;
        this.kategorie = kategorie;
        this.vyhra = vyhra != null ? vyhra : BigDecimal.valueOf(0.0);
        this.naDivokouKartu = naDivokouKartu != null ? naDivokouKartu : true;
        this.datum = this.datum = datum != null ? datum : LocalDate.now();
    }

    public String getJmeno() {
        return jmeno;
    }

    public Double getVysledek() {
        return vysledek;
    }

    public Integer getKategorie() {
        return kategorie;
    }

    public BigDecimal getVyhra() {
        return vyhra;
    }

    public Boolean getNaDivokouKartu() {
        return naDivokouKartu;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setVysledek(Double vysledek) {
        this.vysledek = vysledek;
    }

    public void setKategorie(Integer kategorie) {
        this.kategorie = kategorie;
    }

    public void setVyhra(BigDecimal vyhra) {
        this.vyhra = vyhra;
    }

    public void setNaDivokouKartu(Boolean naDivokouKartu) {
        this.naDivokouKartu = naDivokouKartu;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
