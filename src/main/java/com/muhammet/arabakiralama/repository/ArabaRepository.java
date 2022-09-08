package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Araba;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;


public class ArabaRepository extends MyFactoryRepository<Araba, Long>{
    public ArabaRepository(){
        super(new Araba());
    }
}
