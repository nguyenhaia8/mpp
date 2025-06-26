package lab03.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double calcProfits() {
        double profits = 0;
        for (Building building : buildings) {
            profits += building.calcProfit();
        }
        return profits;
    }
}
