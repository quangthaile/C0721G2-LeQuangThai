package models;

public class Room extends Facility {
    String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String name, double areaUsed, double cost, int numberMaxPeople, String rentalType, String serviceFree) {
        super(name, areaUsed, cost, numberMaxPeople, rentalType);
        this.serviceFree = serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
    public String toString(){
        return "Name: "+this.name+", Area Used: "+this.areaUsed+", Cost: "+this.cost+", Number Max People: "+this.numberMaxPeople+", Rental Type: "+this.rentalType+", Service Free:"+this.serviceFree;
    }
}