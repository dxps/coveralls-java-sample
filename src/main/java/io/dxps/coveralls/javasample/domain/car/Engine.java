package io.dxps.coveralls.javasample.domain.car;

import io.dxps.coveralls.javasample.domain.exceptions.EngineException;

import java.time.Instant;


public class Engine {

    private final String id;
    private final String name;
    private boolean functional;

    public static final int SECONDS_TO_WARM_UP = 5;

    EngineState state;

    private Instant turnOnTime;

    public Engine(String id, String name) {
        this.id = id;
        this.name = name;
        this.functional = true;
        this.state = EngineState.OFF;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    boolean isFunctional() {
        return functional;
    }

    void setFunctional(boolean functional) {
        this.functional = functional;
    }

    boolean isWarmedUp() {
        return Instant.now().minusSeconds(SECONDS_TO_WARM_UP).compareTo(turnOnTime) > 0;
    }

    void turnOn() {
        this.state = EngineState.ON;
        this.turnOnTime = Instant.now();
    }

    void turnOff() {
        this.state = EngineState.OFF;
    }

    public void enableDriveMode() throws EngineException {
        if (!isWarmedUp()) {
            throw new EngineException(EngineException.ENGINE_NOT_WARMED_UP);
        }
    }

    public boolean isTurnedOff() {
        return state == EngineState.OFF;
    }

}
