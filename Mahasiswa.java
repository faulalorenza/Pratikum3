/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.db;

/**
 *
 * @author USER
 */
//disini adalah variabel mahasiswa
public class Mahasiswa {
    private String NoBP;
    private String Nama;
    private String TmpLahir;
    private String TglLahir;
    private String Alamat;
    private String Phone;
    private String AsalSekolah;
    
    //di sini get itu untuk mengambil nilai dari variabel class mahasiswa
    //set untuk mengatur untuk menampilkan nilai variabelnnya
    public Mahasiswa(){
        
    }
    public String getasalsekolah(){
        return AsalSekolah;
    }
    public void setasalsekolah (String asal_sekolah){
        this.AsalSekolah= asal_sekolah;
    }
    public String getphone(){
        return Phone;
    }
    public void setphone (String phone){ //void mengganti dari int 
        this.Phone = phone;
    }
    public String getalamat(){ //string tipe data berbentuk huruf 
        return Alamat;
    }
    public void setalamat (String alamat){
        this.Alamat = alamat;
    }
    public String gettgllahir(){
        return TglLahir;
    }
    public void settgllahir (String tgl_lahir){
        this.TglLahir = tgl_lahir;
    }
    public String gettmplahir(){
        return TmpLahir;
    }
    public void settmplahir (String tmp_lahir){
        this.TmpLahir = tmp_lahir;
    }
    public String getnama(){
        return Nama;
    }
    public void setnama (String nama){
        this.Nama = nama;
    }
    public String getnobp(){
        return NoBP;
    }
    public void setnobp (String no_bp){
        this.NoBP = no_bp;
    }
    
}
