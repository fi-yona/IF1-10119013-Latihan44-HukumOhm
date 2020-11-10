/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan44.hukumohm;

/**
 *
 * @author Fiona Avila
 */


public class OOBaterai {
    
    private float kuatArus = 3;
    private float hambatan = 12;
    
    public void Baterai(){
        System.out.println("=====HUKUM OHM=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.");
        System.out.println();
    }
    
    public void Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
    public static void main(String[] args) {
        OOBaterai oo = new OOBaterai();
        float kuatArus = oo.kuatArus;
        float hambatan = oo.hambatan;
        float tegangan = oo.hitungTegangan();
        oo.Baterai();
        System.out.println("Kuat arus\t: " + kuatArus + " ampere");
        System.out.println("Hambatan\t: " + hambatan + " ohm");
        System.out.println("Hasil tegangan\t: " + tegangan + " volt");
        System.out.println();
        System.out.println("by. Fiona Avila");
    }
    
}
