package praktikum2.soal3;

public class Pegawai { // nama class bukan Employee tapi Pegawai, harus sama dengan file Pegawai.java
    public String nama;
    public String asal; // diganti string, bukan char
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setJabatan(String j) { // error disini karena tidak dijelaskan apa itu j di dalam kurung
        this.jabatan = j;
    }
}
