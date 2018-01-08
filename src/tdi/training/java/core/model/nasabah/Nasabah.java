package tdi.training.java.core.model.nasabah;

import java.math.BigDecimal;

public class Nasabah{
    private String nomorIdentitas;
    private Boolean active;
    private BigDecimal saldo;

    public String getNomorIdentitas(){
        return this.nomorIdentitas;
    }

    public void setNomorIdentitas(String x){
        this.nomorIdentitas = x;
    }

    public Boolean isActive(){
        return this.active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
}