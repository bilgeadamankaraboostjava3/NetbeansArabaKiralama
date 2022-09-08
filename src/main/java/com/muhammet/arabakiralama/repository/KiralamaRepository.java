package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Kiralama;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;


public class KiralamaRepository extends MyFactoryRepository<Kiralama, Long>{
    public KiralamaRepository(){        
        super(new Kiralama());
    }
}
