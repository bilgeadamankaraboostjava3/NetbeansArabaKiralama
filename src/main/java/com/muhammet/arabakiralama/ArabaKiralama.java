package com.muhammet.arabakiralama;

import com.muhammet.arabakiralama.repository.entity.Adres;
import com.muhammet.arabakiralama.repository.entity.Araba;
import com.muhammet.arabakiralama.repository.entity.Departman;
import com.muhammet.arabakiralama.repository.entity.Kiralama;
import com.muhammet.arabakiralama.repository.entity.Musteri;
import com.muhammet.arabakiralama.repository.entity.Personel;
import com.muhammet.arabakiralama.service.AdresService;
import com.muhammet.arabakiralama.service.ArabaService;
import com.muhammet.arabakiralama.service.DepartmanService;
import com.muhammet.arabakiralama.service.KiralamaService;
import com.muhammet.arabakiralama.service.MusteriService;
import com.muhammet.arabakiralama.service.PersonelService;
import java.util.Arrays;
import java.util.Date;


public class ArabaKiralama {

    public static void main(String[] args) {
        Araba araba = new Araba("Audi", "A8", "22 GFG 1414", 5);
        Araba araba2 = new Araba("Mercedes", "Mar", "11 SS 1414", 0);        
    
        Kiralama kiralama = new Kiralama(new Date(), new Date(), Arrays.asList(araba,araba2));
        Kiralama kiralama2 = new Kiralama(new Date(), new Date(), Arrays.asList(araba,araba2));
        Kiralama kiralama3 = new Kiralama(new Date(), new Date(), Arrays.asList(araba));
        Kiralama kiralama4 = new Kiralama(new Date(), new Date(), Arrays.asList(araba));
        Kiralama kiralama5 = new Kiralama(new Date(), new Date(), Arrays.asList(araba));
        Kiralama kiralama6 = new Kiralama(new Date(), new Date(), Arrays.asList(araba2));

        KiralamaService kiralamaService = new KiralamaService();
        kiralamaService.save(kiralama);
        kiralamaService.save(kiralama2);
        kiralamaService.save(kiralama3);
        kiralamaService.save(kiralama4);
        kiralamaService.save(kiralama5);
        kiralamaService.save(kiralama6);
        
        ArabaService arabaService = new ArabaService();
        arabaService.findAll().forEach(System.out::println);
        
        
      
    }
    public static void PersonelDepartmanAraba(){
         
        Araba araba = new Araba("Audi", "A8", "22 GFG 1414", 5);
        Araba araba2 = new Araba("Mercedes", "Mar", "11 SS 1414", 0);        
        Departman departman = new Departman("Satış");
       // ArabaService arabaService = new ArabaService();
       // arabaService.save(araba);
       // arabaService.save(araba2); 
        
        Personel personel = new Personel("Galerici", "YOK", 
                new Date(), "43234244", 
                Arrays.asList("0 555 666 5544","0 555 664 4445"), 
                Arrays.asList(araba,araba2),departman);
        
        Personel personel2 = new Personel("Kerim", "YOK", 
                new Date(), "43234244", 
                null, 
                null,departman);
              
        PersonelService service = new PersonelService();
        service.save(personel);
        service.save(personel2);
        
        DepartmanService departmanService = new DepartmanService();
        departmanService.findAll().forEach(System.out::println);
        // service.findAll().forEach(System.out::println);
        // arabaService.findAll().forEach(System.out::println);
    
    }
    public static void MusteriAdresIliskisi(){
     Adres adres = new Adres("Ev Adresi", "İzmir de bir yerlerde");
        Musteri musteri = new Musteri("Deniz", "KALIN", "0 333 666 5555", adres);
        
        
        
        MusteriService musteriService = new MusteriService();
        AdresService adresService = new AdresService();
        //adresService.save(adres);
        musteriService.save(musteri);
        
        musteriService.findAll().forEach(System.out::println);
        adresService.findAll().forEach(System.out::println);
        }
    
    public static void MusteriListesi(){
      /**
       * 
       */ 
      new MusteriService().findAll().forEach(System.out::println);
    
    }
    
    public static void MusteriEkle(){
     /**
        * Kayıt işlemini sevis katmamına yaptırıyoruz.
        * V.1
        */
        int sayi1 = 10;
        int sayi2 = 12;
        int toplam = sayi1+sayi2;
        toplam = 10+12;
        Musteri musteri = new Musteri("Muhammet", "HOCA", "0 555 666 9988");
        MusteriService musteriService = new MusteriService();
        musteriService.save(musteri);
        
        new MusteriService().save(new Musteri("Selim", "HAKTAN", "0 999 555 7744"));
    }
}
