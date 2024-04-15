package soalNo4;

public class LimasSegiEmpat {
    double luasAlas;
    double luasSelubung;
    double tinggi;
    
    LimasSegiEmpat(){
        luasAlas = 1;
        luasSelubung = 1;
        tinggi = 1;
    }
    
    LimasSegiEmpat(double luasAlas, double luasSelubung, double tinggi){
        this.luasAlas = luasAlas;
        this.luasSelubung = luasSelubung;
        this.tinggi = tinggi;
    }
    
    double getLuas(){
        return luasAlas + luasSelubung;
    }
    
    double getVolume(){
        double volume = (luasAlas * tinggi) / 3.0;
        return Double.parseDouble(String.format("%.2f", volume));
    }
    
    void setLuasAlas(double luasAlasBaru){
        luasAlas = luasAlasBaru;
    }
    
    void setLuasSelubung(double luasSelubungBaru){
        luasSelubung = luasSelubungBaru;
    }
    
    void setTinggi(double tinggiBaru){
        tinggi = tinggiBaru;
    }
}
