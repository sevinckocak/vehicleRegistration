public class TestInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Car car = new Car("Sivic", 50000);
        car.setAbs(true);
        car.setAirbag(true);
        inventory.add(car);

        car = new Car("Sivic", 50000);
        car.setAbs(true);
        car.setSunroof(true);
        inventory.add(car);

        car = new Car("Sity", 40000);
        car.setMusicSystem(true);
        car.setSunroof(true);
        inventory.add(car);

        Motorbike mBike = new Motorbike("Racer", 60000);
        mBike.setAbs(true);
        mBike.setSeatHeating(true);
        inventory.add(mBike);

        mBike = new Motorbike("Scooter", 20000);
        mBike.setSeatHeating(true);
        inventory.add(mBike);

        // Print the inventory
        System.out.println(inventory);
    }
}