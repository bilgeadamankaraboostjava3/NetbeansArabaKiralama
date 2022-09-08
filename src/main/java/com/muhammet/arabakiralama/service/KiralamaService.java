package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.KiralamaRepository;
import com.muhammet.arabakiralama.repository.entity.Kiralama;
import com.muhammet.arabakiralama.utility.MyFactoryService;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama, Long>{
    public KiralamaService(){
        super(new KiralamaRepository());
    }
}
