package entity;

public class Summerhouse extends House {
    public Summerhouse(String name, int price, int numRoom, int livRoom) {
        super(name, price, numRoom, livRoom);

    }
    public static Summerhouse[] summerhouses = {
            new Summerhouse("Yazlık1", 1000, 3, 2),
            new Summerhouse("Yazlık2", 2000, 4, 2),
            new Summerhouse("Yazlık3", 3000, 4, 2)

    };
}
