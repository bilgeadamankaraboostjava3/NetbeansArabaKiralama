package com.muhammet.arabakiralama.repository;


import com.muhammet.arabakiralama.repository.entity.Kullanici;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;

public class KullaniciRepository extends MyFactoryRepository<Kullanici, Long>{
    public KullaniciRepository(){
        super(new Kullanici());
    }
}
