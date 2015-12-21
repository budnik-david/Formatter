package com.company.destination;

/**
 * Created by Давид on 17.12.2015.
 */
public interface IDestination {
    void write(String string);
    void write(char symbol);
    void close();
}
