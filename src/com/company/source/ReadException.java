package com.company.source;

/**
 * Created by Давид on 17.12.2015.
 */
public class ReadException extends Exception {
    public ReadException() {
    }

    public ReadException(String message) {
        super(message);
    }

    public ReadException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadException(Throwable cause) {
        super(cause);
    }
}
