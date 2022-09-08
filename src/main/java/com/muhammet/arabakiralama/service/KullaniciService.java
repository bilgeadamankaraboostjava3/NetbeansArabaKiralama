package com.muhammet.arabakiralama.service;

import com.muhammet.arabakiralama.repository.KullaniciRepository;
import com.muhammet.arabakiralama.repository.entity.Kullanici;
import com.muhammet.arabakiralama.utility.MyFactoryService;
import com.muhammet.arabakiralama.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class KullaniciService  extends MyFactoryService<KullaniciRepository, Kullanici, Long>{
    public KullaniciService(){
        super(new KullaniciRepository());
    }
    
    public boolean isLogin(String username, String password){
        /**
         * kullanıcı adı şifreyi girdim
         * böyle bir kullanıcı yok ise isEmpty -> true döner
         * islogin için bunun false dönmesi gerekli bu nedenle !(değil) i ekliyoruz.
         */
        return !findByEntity(new Kullanici(username, password)).isEmpty();       
    }
    
    public boolean isLogin2(String username, String password){
        EntityManager entityManager = HibernateUtility.getFACTORY().createEntityManager();
        TypedQuery<Long> typedQuery =
                entityManager.createNamedQuery("Kullanici.findByAdAndSifre", Long.class);
        typedQuery.setParameter("username", username);
        typedQuery.setParameter("password", password);
        Long result =  typedQuery.getSingleResult();
        return result>0;        
    }
     public boolean isLogin3(String username, String password){
        EntityManager entityManager = HibernateUtility.getFACTORY().createEntityManager();
        
         Query query =      entityManager
                        .createNativeQuery("select count(*) from tblkullanici where ad='"+username+"' and sifre='"+password+"'");
         query.getSingleResult();
        return false;       
    }
}
