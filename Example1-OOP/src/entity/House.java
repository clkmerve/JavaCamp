package entity;

public class House {
    private String name;
    private int price;
    private int numRoom;
    private int livRoom;

    public House() {
    }

    public House(String name, int price, int numRoom, int livRoom) {
        this.name = name;
        this.price = price;
        this.numRoom = numRoom;
        this.livRoom = livRoom;
    }

    public static entity.House[] houseArray = {
            new entity.House("Ev 1", 1000, 2, 1),
            new entity.House("Ev 2", 2000, 3, 1),
            new entity.House("Ev 3", 3000, 3, 2),

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public int getLivRoom() {
        return livRoom;
    }

    public void setLivRoom(int livRoom) {
        this.livRoom = livRoom;
    }
}
