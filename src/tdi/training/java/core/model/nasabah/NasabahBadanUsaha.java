package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;

public class NasabahBadanUsaha extends Nasabah{

    

    private String namaInstitusi;
    private String nomorNpwp;
    private String alamatKantor;
    private Tabungan tabungan;

    public String getNamaInstitusi(){
        return this.namaInstitusi;
    }

    public void setNamaIstitusi(String value){
        this.namaInstitusi = value;
    }

    public String getNomorNpwp(){
        return this.nomorNpwp;
    }

    public void setNomorNpwp(String npwp){
        this.nomorNpwp = npwp;
    }

    public String getAlamatKantor(){
        return this.alamatKantor;
    }

    public void setAlamatKantor(String alamat){
        this.alamatKantor = alamat;
    }

    public Tabungan getTabungan(){
        return this.tabungan;
    }

    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }

}