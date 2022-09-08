package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.ArabaRepository;
import com.muhammet.arabakiralama.repository.entity.Araba;
import com.muhammet.arabakiralama.utility.MyFactoryService;

public class ArabaService extends MyFactoryService<ArabaRepository, Araba, Long>{
    public ArabaService(){
        super(new ArabaRepository());
    }
}
