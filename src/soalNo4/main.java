package soalNo4;

public class main {
    public static void main(String[] args){
        LimasSegiEmpat LimasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas Alas: " 
                + LimasSegiEmpat1.luasAlas + ", luas selubung limas: " 
                + LimasSegiEmpat1.luasSelubung + ". \nLuasnya: " 
                + LimasSegiEmpat1.getLuas() + ", sedangkan volumenya: " 
                + LimasSegiEmpat1.getVolume() + "\n");
        
        LimasSegiEmpat LimasSegiEmpat2 = new LimasSegiEmpat();
        
        LimasSegiEmpat2.setLuasAlas(30);
        LimasSegiEmpat2.setLuasSelubung(40);
        LimasSegiEmpat2.setTinggi(50);
        
        System.out.println("Limas segi empat dengan luas Alas: " 
                + LimasSegiEmpat2.luasAlas + ", luas selubung limas: " 
                + LimasSegiEmpat2.luasSelubung + ". \nLuasnya: " 
                + LimasSegiEmpat2.getLuas() + ", sedangkan volumenya: " 
                + LimasSegiEmpat2.getVolume() + "\n");
        
        LimasSegiEmpat LimasSegiEmpat3 = new LimasSegiEmpat(25, 35, 45);
        System.out.println("Limas segi empat dengan luas Alas: " 
                + LimasSegiEmpat3.luasAlas + ", luas selubung limas: " 
                + LimasSegiEmpat3.luasSelubung + ". \nLuasnya: " 
                + LimasSegiEmpat3.getLuas() + ", sedangkan volumenya: " 
                + LimasSegiEmpat3.getVolume() + "\n");
        
    }
}
