package com.company.formatter;

import com.company.destination.IDestination;
import com.company.source.ISource;
import com.company.source.ReadException;

/**
 * Created by Давид on 17.12.2015.
 */
public class Formatter implements IFormatter {
    @Override
    public void format(ISource source, IDestination destination) throws FormatException {
        while(source.hasNext()){
            try {
                char symbol = source.read();
                //TODO Make real implementation
                destination.write(symbol);
            } catch (ReadException e) {
                throw new FormatException(e);
            }
        }


        source.close();
    }
}
