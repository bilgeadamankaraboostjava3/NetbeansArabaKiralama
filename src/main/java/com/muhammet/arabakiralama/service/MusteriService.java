package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.MusteriRepository;
import com.muhammet.arabakiralama.repository.entity.Musteri;
import com.muhammet.arabakiralama.utility.MyFactoryService;

public class MusteriService extends MyFactoryService<MusteriRepository, Musteri, Long>{
    public MusteriService(){
        super(new MusteriRepository());
    }
}
    
