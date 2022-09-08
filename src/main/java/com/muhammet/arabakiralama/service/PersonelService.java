package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.PersonelRepository;
import com.muhammet.arabakiralama.repository.entity.Personel;
import com.muhammet.arabakiralama.utility.MyFactoryService;

public class PersonelService  extends MyFactoryService<PersonelRepository, Personel, Long>{
    public PersonelService(){
        super(new PersonelRepository());
    }
}
