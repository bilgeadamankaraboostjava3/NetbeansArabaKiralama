package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Adres;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;

public class AdresRepository extends MyFactoryRepository<Adres, Long>{
    public AdresRepository(){
        super(new Adres());
    }
}
