
package com.muhammet.arabakiralama.repository.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "tblmusteri")
@Entity
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)           
    private Long id;
    private String ad;
    private String soyad;
    private String telefon;

    /**
     * @OneToOne -> Bire bir ilişkileri kurmak için kullanırsınız.
     * Adres nesnesinin veritananında yürütülecek olan, save,update,delete işlemlerini
     * bu sınıfa devredebilirsiniz.
     * cascade = CascadeType.ALL
     * @JoinColumn -> iki tabloyu bir birine bağlayan, foreignkey in adını belirlemek için kullanılır.
     */
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "tbladresid")
    private Adres adres;
    
    public Musteri() {
    }

    public Musteri(String ad, String soyad, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    public Musteri(Long id, String ad, String soyad, String telefon) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
    }

    public Musteri(String ad, String soyad, String telefon, Adres adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Musteri{" + "id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + '}';
    }

  
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
    
}
