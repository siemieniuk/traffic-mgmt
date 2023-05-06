package com.siemieniuk.trafficmgmt.core.vehicle;

import com.siemieniuk.trafficmgmt.core.roadnetwork.Destination;

public final class Truck extends Vehicle {
    public Truck(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}