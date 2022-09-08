package com.muhammet.arabakiralama.repository.impl;

import com.muhammet.arabakiralama.enums.Yetki;
import com.muhammet.arabakiralama.repository.entity.Kullanici;
import com.muhammet.arabakiralama.service.KullaniciService;
import java.util.List;

public class KullaniciRepositoryImpl {

    /**
     * 1-Admin
     * 2-Personel oluşturalım
     */
    private KullaniciService kullaniciService;
    
    public KullaniciRepositoryImpl(){
        kullaniciService  = new KullaniciService();
    }
    public void DefaultKullaniciOlustur(){
        Kullanici admin = new Kullanici("Administrator", "Passw0rd", Yetki.ADMIN);
        Kullanici personel = new Kullanici("Personel1", "123456", Yetki.PERSONEL);
        
        //List<Kullanici> klist = new ArrayList<>();
        //klist.add(admin);
        //klist.add(personel);        
        kullaniciService.save(List.of(admin,personel));
    }
    
}
