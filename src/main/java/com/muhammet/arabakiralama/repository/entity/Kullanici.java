package com.muhammet.arabakiralama.repository.entity;

import com.muhammet.arabakiralama.enums.Yetki;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(name = "Kullanici.findByAdAndSifre",
        query = "SELECT COUNT(*) FROM Kullanici k WHERE k.ad= :username AND k.sifre= :password") // JPQL, HQL
@Entity
@Table(name="tblkullanici")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    private Long id;
    @Column(nullable = false,unique = true)    
    private String ad;
    @Column(length = 64, nullable = false)
    private String sifre;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Basic(optional = false)
    private Yetki yetki;    

    public Kullanici() {
    }

    public Kullanici(String ad, String sifre) {
        this.ad = ad;
        this.sifre = sifre;
    }

    public Kullanici(String ad, String sifre, Yetki yetki) {
        this.ad = ad;
        this.sifre = sifre;
        this.yetki = yetki;
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

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public Yetki getYetki() {
        return yetki;
    }

    public void setYetki(Yetki yetki) {
        this.yetki = yetki;
    }
    
    
}
