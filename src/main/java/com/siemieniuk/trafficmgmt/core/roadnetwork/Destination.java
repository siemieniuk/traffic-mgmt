package com.siemieniuk.trafficmgmt.core.roadnetwork;

import com.siemieniuk.trafficmgmt.core.graph.GraphNode;
import com.siemieniuk.trafficmgmt.core.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Destination extends GraphNode implements Runnable {
    private final int HOW_MANY_TO_SPAWN;
    private final List<Vehicle> spawned = new ArrayList<>();

    public Destination(int spawnLimit) {
        super();
        this.HOW_MANY_TO_SPAWN = spawnLimit;
    }

    @Override
    public void run() {
        try {
            while (true) {
                controlMyVehicles();
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void spawnVehicle() {

    }

    private void controlMyVehicles() {
        for (var vehicle : spawned) {
            // TODO: Implement
        }
    }
}
