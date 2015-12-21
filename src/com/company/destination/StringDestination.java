package com.company.destination;

/**
 * Created by Давид on 21.12.2015.
 */
public class StringDestination implements IDestination {

    private StringBuilder destination;

    public StringDestination() {
        destination = new StringBuilder();
    }

    @Override
    public void write(String string) {
        this.destination.append(string);
    }

    @Override
    public void write(char symbol){
        this.destination.append(symbol);
    }

    @Override
    public void close() {

    }

    public String getString() {
        return this.destination.toString();
    }
}
