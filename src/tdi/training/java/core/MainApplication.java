package tdi.training.java.core;

import tdi.training.java.core.model.nasabah.NasabahPerorangan;

public class MainApplication{

    public static void main(String[] args){
        NasabahPerorangan yusuf = new NasabahPerorangan(
            "621234",
            "Muhamad Yusuf",
            "Jl. Ujung berung no 123",
            "08123423434"
        );
        yusuf.setNamaLengkap("Yusuf");
        System.out.println(yusuf.toString());
    }
}