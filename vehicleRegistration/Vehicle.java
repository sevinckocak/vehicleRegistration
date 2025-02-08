import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String model;
    private double basePrice;
    private boolean airbag;
    private boolean musicSystem;
    private boolean abs;
    private boolean sunroof;
    private boolean seatHeating;

    public Vehicle(String model, double basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    public double Pricecalculate() {
        double allPrice = basePrice;

        if (airbag) { //eğer airbag true döndüyse etiket fiyatına eklesin
            allPrice += 3000;
        }
        if (musicSystem) {
            allPrice += 1000;
        }
        if (abs) {
            allPrice += 5000;
        }
        if (sunroof) {
            allPrice += 2000;
        }
        if (seatHeating){
            allPrice+=2000;
        }

        return allPrice;
    }

    // Getters and Setters

    public String getModel() {  //setter ve getterları kullandım
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean isSeatHeating() {
        return seatHeating;
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }
}

