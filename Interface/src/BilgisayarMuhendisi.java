public class BilgisayarMuhendisi extends BaseMuhendis implements IMuhendis{

    public BilgisayarMuhendisi() {
    }
    public BilgisayarMuhendisi(String isim,String soyisim,int tecrube,double maas,String[] diller) {
        setIsim(isim);
        setSoyisim(soyisim);
        setTecrube(tecrube);
        setMaas(maas);
        setDiller(diller);
    }

    @Override
    public void bilgileriYazdir() {
        System.out.println("İsim:"+getIsim());
        System.out.println("Soyisim:"+getSoyisim());
        System.out.println("Tecrube:"+getTecrube());
        System.out.println("Maas:"+getMaas());
        System.out.println("Askerlik Durumu:"+getAskerlikDurumu());
        System.out.println("Diller:");
        for (String dil: getDiller()){
            System.out.println(dil+",");
        }
    }

    @Override
    public void askerlikYapildiMi(boolean deger) {
        if (deger){
            setAskerlikDurumu("Askerlik Yapıldı");
        }else {
            setAskerlikDurumu("Askerlik Yapılmadı");

        }
    }


}
