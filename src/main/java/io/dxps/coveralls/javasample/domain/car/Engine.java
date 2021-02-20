package io.dxps.coveralls.javasample.domain.car;

public class Engine {

    private final String id;
    private final String name;
    private boolean functional;
    private boolean warmedUp;

    public EngineState state;

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
        return warmedUp;
    }

    void setWarmedUp(boolean warmedUp) {
        this.warmedUp = warmedUp;
    }

    void turnOn() {
        this.state = EngineState.ON;
    }

}
