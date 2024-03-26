package services;

import entity.House;
import entity.Summerhouse;
import entity.Villa;

import java.util.ArrayList;
import java.util.List;


public class ServiceClass {
    public  int getTotalPriceOfHouses() {//Evlerin toplam fiyatı
        int totalPrice = 0;

        // Entity.House sınıfından tanımlanan houseArray dizisine erişim
        for (House house : House.houseArray) {
            totalPrice += house.getPrice();
        }

        return totalPrice;
    }

    public static int getTotalPriceOfVillas() {//Villaların toplam fiyatı
        int totalPrice = 0;

        // Entity.House sınıfından tanımlanan houseArray dizisine erişim
        for (Villa villa : Villa.villas) {
            totalPrice += villa.getPrice();
        }

        return totalPrice;
    }

    public static int getTotalPriceOfSummerhouse() {//Yazlıkların toplam fiyatı
        int totalPrice = 0;

        for (Summerhouse summerhouse : Summerhouse.summerhouses) {
            totalPrice += summerhouse.getPrice();
        }
        return totalPrice;
    }

    public static House[] filterHousesByRoomAndLivRoom(int roomCount, int livRoomCount) {// Oda ve salon sayısına göre evleri filtrele
        List<House> filteredHouses = new ArrayList<>();

        for (House house : House.houseArray) {
            if (house.getNumRoom() == roomCount && house.getLivRoom() == livRoomCount) {
                filteredHouses.add(house);
            }
        }

        return filteredHouses.toArray(new House[0]);
    }

    public static Villa[] filterVillasByRoomAndLivRoom(int roomCount, int livRoomCount) {
        List<Villa> filteredVillas = new ArrayList<>();
        for (Villa villa : Villa.villas) {
            if (villa.getNumRoom() == roomCount && villa.getLivRoom() == livRoomCount) {
                filteredVillas.add(villa);
            }

        }
        return filteredVillas.toArray(new Villa[0]);
    }

    public static Summerhouse[] filterSummerByRoomAndLivRoom(int roomCount, int livRoomCount) {
        List<Summerhouse> filteredSummer = new ArrayList<>();
        for (Summerhouse summerhouse : Summerhouse.summerhouses) {
            if (summerhouse.getNumRoom() == roomCount && summerhouse.getLivRoom() == livRoomCount) {
                filteredSummer.add(summerhouse);
            }

        }
        return filteredSummer.toArray(new Summerhouse[0]);
    }
}