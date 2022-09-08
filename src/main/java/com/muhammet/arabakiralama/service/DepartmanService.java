package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.DepartmanRepository;
import com.muhammet.arabakiralama.repository.entity.Departman;
import com.muhammet.arabakiralama.utility.MyFactoryService;


public class DepartmanService extends MyFactoryService<DepartmanRepository, Departman, Long>{
    public DepartmanService(){
        super(new DepartmanRepository());
    }
}
