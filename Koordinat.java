/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166008_pbo.lat54;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas koordinat
public class Koordinat {
    //variabel
    protected int x;
    protected int y;
    //konstruktor
    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //metode get
    public int getX() {
        return x;
    }
    //metode set untuk mengubah nilai variabel x
    public void setX(int x) {
        this.x = x;
    }
    //metode get 
    public int getY() {
        return y;
    }
    //metode set untuk mengubah nilai vatiabel y
    public void setY(int y) {
        this.y = y;
    }
}
//kelas warnakoordinat turunan dari kelas koordinat
class WarnaKoordinat extends Koordinat {
    //variabel
    private String namaWarna;
    //konstruktor
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }
    //metode get
    public String getNamaWarna() {
        return namaWarna;
    }
    //metode set
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    //metode menjalankan program
    public static void main(String[] args) {
        WarnaKoordinat koordinat = new WarnaKoordinat(10, 4, "Jingga");
        //output menampilkan warna koordinat
        System.out.println("Warna Koordinat : " + koordinat.getNamaWarna());
        //output menampilkan sumbu koordinat
        System.out.println("Koordinat Sumbu x : " + koordinat.getX() + ", y : " + koordinat.getY());
    }
}
