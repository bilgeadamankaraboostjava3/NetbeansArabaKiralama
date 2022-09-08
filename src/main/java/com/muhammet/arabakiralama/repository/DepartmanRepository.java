package com.muhammet.arabakiralama.repository;

import com.muhammet.arabakiralama.repository.entity.Departman;
import com.muhammet.arabakiralama.utility.MyFactoryRepository;

public class DepartmanRepository extends MyFactoryRepository<Departman, Long>{
    public DepartmanRepository(){
        super(new Departman());
    }    
}
