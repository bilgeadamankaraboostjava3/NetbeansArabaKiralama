package com.muhammet.arabakiralama.repository.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "tbldepartman")
@Entity
public class Departman {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    private Long id;
    private String name;

    /**
     *  @ManyToOne(cascade = CascadeType.ALL)
     *  private Departman departman;
     */
    
    @OneToMany(mappedBy = "departman")
    private List<Personel> personeller;
    
    public Departman() {
    }

    public Departman(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Departman(String name, List<Personel> personeller) {
        this.name = name;
        this.personeller = personeller;
    }

    @Override
    public String toString() {
        return "Departman{" + "id=" + id + ", name=" + name + ", personeller=" + personeller + '}';
    }

    public List<Personel> getPersoneller() {
        return personeller;
    }

    public void setPersoneller(List<Personel> personeller) {
        this.personeller = personeller;
    }

    public Departman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
