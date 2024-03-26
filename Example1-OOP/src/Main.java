import entity.House;
import entity.Summerhouse;
import entity.Villa;
import services.ServiceClass;

public class Main {
    public static void main(String[] args) {


        System.out.println("Toplam Fiyatlar");

        
        ServiceClass serviceClass = new ServiceClass();
        int totalPriceOfHouses = serviceClass.getTotalPriceOfHouses();
        int totalPriceOfVillas = ServiceClass.getTotalPriceOfVillas();
        int totalPriceOfSummer = ServiceClass.getTotalPriceOfSummerhouse();

        System.out.println("Evlerin toplam fiyatı: " + totalPriceOfHouses);
        System.out.println("Villaların toplam fiyatı: " + totalPriceOfVillas);
        System.out.println("Yazlıkların toplam fiyatı: " + totalPriceOfSummer);
        System.out.println();



        System.out.println("----Filtrelenmiş Evler----");
        entity.House[] filteredHouses = ServiceClass.filterHousesByRoomAndLivRoom(3, 2);
        for (entity.House house : filteredHouses) {
            System.out.println("Ev Adı: " + house.getName());
            System.out.println("Fiyatı: " + house.getPrice());
            System.out.println("Oda Sayısı: " + house.getNumRoom());
            System.out.println("Salon Sayısı: " + house.getLivRoom());
            System.out.println();
        }
        System.out.println("----Filtrelenmiş Villa----");
        Villa[] filteredVillas = ServiceClass.filterVillasByRoomAndLivRoom(4, 2);
        for (Villa villa : filteredVillas) {
            System.out.println("Villa Adı:" + villa.getName());
            System.out.println("Fiyatı:" + villa.getPrice());
            System.out.println("Oda Sayısı:" + villa.getNumRoom());
            System.out.println("Salon sayısı:" + villa.getLivRoom());
            System.out.println();
        }

        System.out.println("----Filtrelenmiş Yazlık----");
        Summerhouse[] filteredSummer = ServiceClass.filterSummerByRoomAndLivRoom(3, 2);
        for (Summerhouse summerhouse : filteredSummer) {
            System.out.println("Yazlık Adı:" + summerhouse.getName());
            System.out.println("Fiyatı:" + summerhouse.getPrice());
            System.out.println("Oda Sayısı:" + summerhouse.getNumRoom());
            System.out.println("Salon sayısı:" + summerhouse.getLivRoom());
            System.out.println();
        }


//        System.out.println("----Entity.House----");
//        for (Entity.House house : Entity.House.houseArray) {
//            System.out.println("Ev Adı: " + house.getName());
//            System.out.println("Fiyatı: " + house.getPrice());
//            System.out.println("Oda Sayısı: " + house.getNumRoom());
//            System.out.println("Salon Sayısı: " + house.getLivRoom());
//            System.out.println();
//        }
//        System.out.println("----Villa----");
//        for (Villa villa : Villa.villas) {
//            System.out.println("Ev adı:" + villa.getName());
//            System.out.println("Fiyatı:" + villa.getPrice());
//            System.out.println("Oda Sayısı:" + villa.getNumRoom());
//            System.out.println("Salon Sayısı:" + villa.getLivRoom());
//            System.out.println();
//        }
//        System.out.println("----Summer Entity.House----");
//        for (Summerhouse summerhouse : Summerhouse.summerhouses) {
//            System.out.println("Ev adı:" + summerhouse.getName());
//            System.out.println("Fiyatı:" + summerhouse.getPrice());
//            System.out.println("Oda Sayısı:" + summerhouse.getNumRoom());
//            System.out.println("Salon Sayısı:" + summerhouse.getLivRoom());
//            System.out.println();
//        }
    }
}