package sekolah;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class data {
    static ArrayList<Guru> guru = new ArrayList<>();
    static ArrayList<Siswa> siswa = new ArrayList<>();
    
    public static void initGuru(){
        //buat direktori file
        String path = "data//";
        File pathAsFile = new File(path);
        if (!Files.exists(Paths.get(path))) {
            pathAsFile.mkdir();
        }
        
        //buat filenya
        File file = new File("data//guru.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            File a = new File("data//guru.txt");
            Scanner sc = new Scanner(a);
            while (sc.hasNextLine()) {
                pecahGuru(sc.nextLine());
            }  
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void pecahGuru(String data) {
        System.out.print(data.length());
        String[] p = data.split("-");
        guru.add(new Guru(p[0], p[1], p[2], p[3]));
    }
    
    public static void simpanGuru() {
        try {
            FileWriter data = new FileWriter("guru.txt");
            for (int i = 0; i < guru.size(); i++) {
                data.write(guru.get(i).getNIK() + "-" + guru.get(i).getNama() + "-" + guru.get(i).getJabatan() + "-" + guru.get(i).getAlamat());
                data.write(System.getProperty("line.separator"));
            }
            data.flush();
            data.close();
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
    
    public static void initSiswa(){
        //buat direktori file
        String path = "data//";
        File pathAsFile = new File(path);
        if (!Files.exists(Paths.get(path))) {
            pathAsFile.mkdir();
        }
        
        //buat filenya
        File file = new File("data//siswa.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            File a = new File("data//siswa.txt");
            Scanner sc = new Scanner(a);
            while (sc.hasNextLine()) {
                pecahSiswa(sc.nextLine());
            }  
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void pecahSiswa(String data) {
        System.out.print(data.length());
        String[] p = data.split("-");
        siswa.add(new Siswa(p[0], p[1], p[2], p[3]));
    }
    
    public static void simpanSiswa() {
        try {
            FileWriter data = new FileWriter("siswa.txt");
            for (int i = 0; i < siswa.size(); i++) {
                data.write(siswa.get(i).getNISN() + "-" + siswa.get(i).getNama() + "-" + siswa.get(i).getKeminatan() + "-" + siswa.get(i).getAlamat());
                data.write(System.getProperty("line.separator"));
            }
            data.flush();
            data.close();
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
}
