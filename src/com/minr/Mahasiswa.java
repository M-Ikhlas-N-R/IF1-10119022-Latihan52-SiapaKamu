package com.minr;

public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya " + super.getNama() + " umur " + super.getUmur() + " tahun "
                + "Sedang belajar di kelas " + getKelas());
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
