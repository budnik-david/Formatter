package com.company.formatter;

/**
 * Created by Давид on 17.12.2015.
 */
public class FormatException extends Exception {
    public FormatException() {
    }

    public FormatException(String message) {
        super(message);
    }

    public FormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormatException(Throwable cause) {
        super(cause);
    }
}
