package com.muhammet.arabakiralama.utility;

public class Queries {

    public static final String ADRES_FIND_BYUSERID = "select * from tbladres left join tblusers on tblusers.id=tbladres.user_id";
    
}
