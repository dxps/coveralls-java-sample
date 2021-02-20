package io.dxps.coveralls.javasample.domain.exceptions;


public class EngineException extends Exception {

    private static final long serialVersionUID = 1L;

    public static final String ENGINE_NOT_FUNCTIONAL = "Engine is not functional";
    public static final String ENGINE_NOT_WARMED_UP = "Engine is not warmed up";

    public EngineException(String message) {
        super(message);
    }

}
