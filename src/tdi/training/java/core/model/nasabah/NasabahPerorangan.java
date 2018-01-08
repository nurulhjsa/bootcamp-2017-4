package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;

public class NasabahPerorangan extends Nasabah{

    private String namaLengkap;
    private String alamatRumah;
    private String nomorTelp;
    private Tabungan tabungan;

    public String getNamaLengkap(){
        return this.namaLengkap;
    }

    public void setNamaLengkap(String nama){
        this.namaLengkap = nama;
    }

    public String getAlamatRumah(){
        return this.alamatRumah;
    }

    public void setAlamatRumah(String alamat){
        this.alamatRumah = alamat;
    }

    public String getNomorTelp(){
        return this.nomorTelp;
    }

    public void setNomorTelp(String tlp){
        this.nomorTelp = tlp;
    }

    public Tabungan getTabungan(){
        return this.tabungan;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

}