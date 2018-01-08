package tdi.training.java.core.model.nasabah;

import tdi.training.java.core.model.aplikasi.Tabungan;
import java.math.BigDecimal;

public class NasabahPerorangan extends Nasabah{

   public NasabahPerorangan(
       String nomorIdentitas, String namaLengkap, String alamat, String nomorTelp){
        this.namaLengkap = namaLengkap;
        this.alamatRumah = alamat;
        this.nomorTelp = nomorTelp;
        super.setNomorIdentitas(nomorIdentitas);
        super.setActive(false);
        super.setSaldo(BigDecimal.ZERO);
        this.tabungan = new Tabungan(0.1d, new BigDecimal(0), new BigDecimal(0), "Tabungan Mapan");
    
    }

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

    @Override
    public String toString(){
        return 
            String.format(
                    "nasabah [noIdentitas: %s, status: %s, namaLengkap: %s, saldo tabungan: %s]", 
                    super.getNomorIdentitas(), super.isActive(), this.namaLengkap, this.getTabungan().getSaldo());
    }

}