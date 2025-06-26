package lab03.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apartments;
    private double lotSize;
    private double maintenanceCost;

    public Building(double lotSize, double maintenanceCost) {
        this.lotSize = lotSize;
        this.maintenanceCost = maintenanceCost;
        this.apartments = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public double calcProfit() {
        double profit = 0;
        for (Apartment apartment : apartments) {
            profit += apartment.getRent();
        }
        return profit - this.maintenanceCost;
    }
}
