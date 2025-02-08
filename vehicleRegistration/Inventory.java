import java.util.ArrayList;
import java.util.List;
class Inventory {
    private List<Vehicle> n_vehicles;
    public Inventory() {
        n_vehicles = new ArrayList<>();
    }

    public void add(Vehicle v_vehicle) {
        n_vehicles.add(v_vehicle); //Vehicle deki nesneyi alır n_vehicles e ekler araçları ekledim böyle
    }

    @Override
    public String toString() {
        StringBuilder resault = new StringBuilder();
        for (Vehicle v_vehicle : n_vehicles) { //nvehicles teki her bir nesneyi vvehicleye aktarır
            //araçların bilgisini alarak String oluşturdum
            resault.append("Model: ").append(v_vehicle.getModel());
            resault.append(", Options: ");

            if (v_vehicle.isAirbag()) { //eğer kullanılmışsa Airbag yazdırsın
                resault.append("Airbag ");
            }
            if (v_vehicle.isMusicSystem()) {
                resault.append("Music System ");
            }
            if (v_vehicle.isAbs()) {
                resault.append("ABS ");
            }
            if (v_vehicle.isSunroof()) {
                resault.append("Sunroof ");
            }
            resault.append(", Price: ").append(v_vehicle.Pricecalculate());

            resault.append("\n");
        }
        return resault.toString();
    }

}