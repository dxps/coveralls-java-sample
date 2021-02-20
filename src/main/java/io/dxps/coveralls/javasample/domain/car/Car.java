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

    public void turnOnEngine() throws EngineException {
        if (!engine.isFunctional()) {
            throw new EngineException("Engine is not functional.");
        } else if (!engine.isWarmedUp()) {
            throw new EngineException("Engine is not warmed up yet.");
        }
        engine.turnOn();
    }

}
