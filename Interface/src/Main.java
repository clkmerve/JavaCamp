public class Main {
    public static void main(String[] args) {
        BilgisayarMuhendisi bilgisayarMuhendisi = new
                BilgisayarMuhendisi("Ahmet","ççç",1,30000,new String[]{"C#","Java"});

        MakineMuhendisi makineMuhendisi = new
                MakineMuhendisi("veli","eee",2,30000,new String[]{"C","C++"});
        muhendisBilgileriYazdir(bilgisayarMuhendisi);
        System.out.println("***************************");
        muhendisBilgileriYazdir(makineMuhendisi);

    }
    public static void muhendisBilgileriYazdir(IMuhendis muhendis)
    {
        muhendis.askerlikYapildiMi(true);
        muhendis.bilgileriYazdir();
    }
//    public static void muhendisBilgileriYazdir(MakineMuhendisi makineMuhendisi)
//    {
//        makineMuhendisi.askerlikYapildiMi(false);
//        makineMuhendisi.bilgileriYazdir();
//    }
}
