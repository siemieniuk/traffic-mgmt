package com.siemieniuk.trafficmgmt.vehicle;

import com.siemieniuk.trafficmgmt.roadnetwork.Destination;

public class Motorcycle extends Vehicle {
    public Motorcycle(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}
