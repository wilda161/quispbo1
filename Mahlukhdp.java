package mahlukhidup;
class MahlukHidup{
    String nama;
}
class udang extends MahlukHidup{
}
class sapi extends MahlukHidup{  
}
class burung extends MahlukHidup{  
}
public class Mahlukhdp {
    public static void main(String[] args) {

    udang udang1 = new udang();
    udang1.nama="udang itu berenang";
    System.out.println("binatang " + udang1.nama);

    sapi sapi1 = new sapi();
    sapi1.nama="sapi itu berjalan";
    System.out.println("binatang " + sapi1.nama);

    burung burung1 = new burung();
    burung1.nama="burung itu terbang";
    System.out.println("binatang " + burung1.nama);
    }

}
