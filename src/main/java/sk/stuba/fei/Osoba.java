package sk.stuba.fei;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Osoba implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String meno;
    private Date narodena;
    private Float vaha ;


    public Osoba(String meno, Date narodena, Float vaha) {
        this.meno = meno;
        this.narodena = narodena;
        this.vaha = vaha;
    }

    public Osoba() {

    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public Date getNarodena() {
        return narodena;
    }

    public void setNarodena(Date narodena) {
        this.narodena = narodena;
    }

    public Float getVaha() {
        return vaha;
    }

    public void setVaha(Float vaha) {
        this.vaha = vaha;
    }



}
