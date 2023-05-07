package com.siemieniuk.trafficmgmt.vehicle;

import com.siemieniuk.trafficmgmt.roadnetwork.Destination;

public final class Car extends Vehicle {
    public Car(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}
