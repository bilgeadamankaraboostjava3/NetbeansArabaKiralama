package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.AdresRepository;
import com.muhammet.arabakiralama.repository.entity.Adres;
import com.muhammet.arabakiralama.utility.MyFactoryService;

public class AdresService extends MyFactoryService<AdresRepository, Adres, Long>{
    public AdresService(){
        super(new AdresRepository());
    }    
}
