package siemieniuk.trafficmgmt.vehicle;

import siemieniuk.trafficmgmt.roadnetwork.Destination;

public final class Car extends Vehicle {
    public Car(Destination target, double maxSpeed, double acceleration, double deceleration) {
        super(target, maxSpeed, acceleration, deceleration);
    }
}
