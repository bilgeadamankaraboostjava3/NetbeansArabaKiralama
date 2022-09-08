package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Musteri;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;


public class MusteriRepository extends MyFactoryRepository<Musteri, Long>{
    public MusteriRepository(){
        super(new Musteri());
    }
}
