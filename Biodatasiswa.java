
package Polimorfisme;


public class Biodatasiswa {

    public static void main(String[] args) {
        Biodata BIODATA = new Biodata();
        Siswa SISWA = new Siswa();
        Fakultas FAKULTAS = new Fakultas();
        Instansi INSTANSI = new Instansi();
        Kuliah KULIAH = new Kuliah();
        
        BIODATA.siswa();
        
        BIODATA = SISWA;
        BIODATA.siswa();
        
        BIODATA = FAKULTAS;
        BIODATA.siswa();
        
        BIODATA = INSTANSI;
        BIODATA.siswa();
        
        BIODATA = KULIAH;
        BIODATA.siswa();
        
        
        
    }
    
}
