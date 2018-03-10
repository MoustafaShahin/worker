package com.example.android.worker;

/**
 * Created by Moustafa on 3/9/2018.
 */

public class workman {
    String name;
    String city;
    String prof;


    public workman(String n,String c, String p){
        name = n;
        city = c;
        prof = p;
    }

    public String getName() {return name;}
    public String getCity() {return city;}
    public String getProf() {return prof;}
}
