package io.dxps.coveralls.javasample.domain.exceptions;

public class EngineException extends Exception {

    private static final long serialVersionUID = 1L;

    public EngineException(String message) {
        super(message);
    }

    public EngineException(String message, Throwable cause) {
        super(message, cause);
    }

}
