package io.dxps.coveralls.javasample.domain.car;

import io.dxps.coveralls.javasample.domain.exceptions.EngineException;


public class Car {

    private final String id;
    private final String brand;
    private final String model;

    public final Engine engine;

    public Car(String id, String brand, String model, Engine engine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void turnEngineOn() throws EngineException {
        engine.turnOn();
    }

    public void enableDriveMode() throws EngineException {
        engine.enableDriveMode();
    }

    public void turnEngineOff() {
        engine.turnOff();
    }

    public boolean isTurnedOff() {
        return engine.isTurnedOff();
    }

    public void activateEngineMaintenance() {
        engine.activateMaintenance();
    }

    public void deactivateEngineMaintenance() {
        engine.deactivateMaintenance();
    }

    public boolean IsEngineInMaintenance() {
        return engine.isInMaintenance();
    }

}
