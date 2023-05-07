package siemieniuk.trafficmgmt.vehicle;

import siemieniuk.trafficmgmt.roadnetwork.Destination;

public abstract class Vehicle {
    private final double MAX_SPEED;
    private double currentSpeed;
    private final double ACCELERATION;
    private final double DECELERATION;
    private double tempAcceleration;
    private Destination target;

    public Vehicle(Destination target, double maxSpeed, double acceleration, double deceleration) {
        this.target = target;
        this.MAX_SPEED = maxSpeed;
        this.currentSpeed = 0;
        this.ACCELERATION = acceleration;
        this.DECELERATION = deceleration;
        this.tempAcceleration = 0;
    }

    public void drive() {
        tempAcceleration = 0;
    }

    public void accelerate() {
        tempAcceleration = ACCELERATION;
    }

    public void slowDown() {
        tempAcceleration = -DECELERATION;
    }
}
