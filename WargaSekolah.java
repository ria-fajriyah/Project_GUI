package sekolah;

public class WargaSekolah {
    private String nama;
    private String alamat;
    
    public WargaSekolah(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}

class Guru extends WargaSekolah {
    private String nik;
    private String jabatan;
    
    public Guru(String nama, String nik, String jabatan, String alamat){
        super(nama, alamat);
        this.nik = nik;
        this.jabatan = jabatan;
    }
    
    public String getNIK(){
        return nik;
    }
    
    public void setNIK(String nik){
        this.nik = nik;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
}

class Siswa extends WargaSekolah {
    private String nisn;
    private String keminatan;
    
    public Siswa(String nama, String nisn, String keminatan, String alamat){
        super(nama, alamat);
        this.nisn = nisn;
        this.keminatan = keminatan;
    }
    
    public String getNISN(){
        return nisn;
    }
    
    public void setNISN(String nisn){
        this.nisn = nisn;
    }
    
    public String getKeminatan(){
        return keminatan;
    }
    
    public void setKeminatan(String keminatan){
        this.keminatan = keminatan;
    }
}
