package com.muhammet.arabakiralama.repository.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tblaraba")
@Entity
public class Araba {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)           
    private Long id;
    private String marka;
    private String model;
    private String plaka;
    private int km;

    /**
     *  @OneToMany(cascade = CascadeType.ALL)
     *  private List<Araba> arabalar;
     * 
     */
    @ManyToOne()
    private Personel personel;
    
    @ManyToMany(mappedBy = "arabalistesi",fetch = FetchType.LAZY)
    private List<Kiralama> kiralamalar;

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public List<Kiralama> getKiralamalar() {
        return kiralamalar;
    }

    public void setKiralamalar(List<Kiralama> kiralamalar) {
        this.kiralamalar = kiralamalar;
    }
    
    public Araba() {
    }

    public Araba(String marka, String model, String plaka, int km) {
        this.marka = marka;
        this.model = model;
        this.plaka = plaka;
        this.km = km;
    }

    public Araba(Long id, String marka, String model, String plaka, int km) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.plaka = plaka;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Araba{" + "id=" + id + ", marka=" + marka + ", model=" + model + ", plaka=" + plaka + ", km=" + km + ", personel=" + personel + ", kiralamalaradedi=" + kiralamalar.size()+ '}';
    }

    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    
}
