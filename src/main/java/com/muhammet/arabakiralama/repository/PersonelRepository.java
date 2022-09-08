package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Personel;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;

public class PersonelRepository  extends MyFactoryRepository<Personel, Long>{
    public PersonelRepository(){
        super(new Personel());
    }
}
