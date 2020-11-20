package com.minr;

public class Dosen extends Manusia{
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public void mengajarApa() {
        System.out.println("Saya " + super.getNama() + " umur " + super.getUmur() + " tahun "
                + "Sedang mengajar mata kuliah " + getMataKuliah());
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Intel");
    }
}
