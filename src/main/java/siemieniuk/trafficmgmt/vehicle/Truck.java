package siemieniuk.trafficmgmt.vehicle;

import siemieniuk.trafficmgmt.roadnetwork.Destination;

public final class Truck extends Vehicle {
    public Truck(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}