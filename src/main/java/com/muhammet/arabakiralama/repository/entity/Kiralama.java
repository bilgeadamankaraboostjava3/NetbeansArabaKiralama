
package com.muhammet.arabakiralama.repository.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.*;

@Table(name = "tblkiralama")
@Entity
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)           
    private Long id;
    /**
     * Tarih -> DATE
     * Saat -> TIME
     * TArih ve Saat (zaman damgası) -> TIMESTAMP
     */
    @Temporal(DATE)
    private Date kiralamatarihi;
    @Temporal(TIMESTAMP)
    private Date islemtarihi;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Araba> arabalistesi;
    
    public Kiralama() {
    }

    public Kiralama(Date kiralamatarihi, Date islemtarihi) {
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
    }

    public Kiralama(Long id, Date kiralamatarihi, Date islemtarihi) {
        this.id = id;
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
    }

    @Override
    public String toString() {
        return "Kiralama{" + "id=" + id + ", kiralamatarihi=" + kiralamatarihi + ", islemtarihi=" + islemtarihi + ", arabalistesi=" + arabalistesi + '}';
    }


    public Kiralama(Date kiralamatarihi, Date islemtarihi, List<Araba> arabalistesi) {
        this.kiralamatarihi = kiralamatarihi;
        this.islemtarihi = islemtarihi;
        this.arabalistesi = arabalistesi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getKiralamatarihi() {
        return kiralamatarihi;
    }

    public void setKiralamatarihi(Date kiralamatarihi) {
        this.kiralamatarihi = kiralamatarihi;
    }

    public Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public List<Araba> getArabalistesi() {
        return arabalistesi;
    }

    public void setArabalistesi(List<Araba> arabalistesi) {
        this.arabalistesi = arabalistesi;
    }
    
    
}
