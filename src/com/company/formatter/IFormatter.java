package com.company.formatter;

import com.company.destination.IDestination;
import com.company.formatter.FormatException;
import com.company.source.ISource;

/**
 * Created by Давид on 18.11.2015.
 */
public interface IFormatter {
    void format(ISource source, IDestination destination) throws FormatException;
}
