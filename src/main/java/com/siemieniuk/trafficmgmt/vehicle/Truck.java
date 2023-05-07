package com.siemieniuk.trafficmgmt.vehicle;

import com.siemieniuk.trafficmgmt.roadnetwork.Destination;

public final class Truck extends Vehicle {
    public Truck(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}