package entity;

public class Villa extends House {
    public Villa(String name, int price, int numRoom, int livRoom) {
        super(name, price, numRoom, livRoom);//Constructor tanımlandı.
    }
    public static Villa[] villas = {
            new Villa("Villa1", 1200, 4, 1),
            new Villa("Villa2", 1400, 4, 2),
            new Villa("Villa3", 1600, 5, 1)
    };
}