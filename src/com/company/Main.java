package com.company;

import com.company.destination.FileDestination;
import com.company.destination.IDestination;
import com.company.destination.StringDestination;
import com.company.formatter.FormatException;
import com.company.formatter.Formatter;
import com.company.formatter.IFormatter;
import com.company.source.ISource;
import com.company.source.StringSource;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //инициализируем источник
        ISource source = new StringSource("hjghdfg {d;d;{f;}g}");
        //инициализируем приемник
        StringDestination destination = new StringDestination();
        // инициализируем класс форматирования
        IFormatter formatter = new Formatter();
        // вызываем метод форматирования с параметрами: файл-источник и файл-приемник
        try {
            formatter.format(source, destination);
        } catch (FormatException e) {
            e.printStackTrace();
        }
        //закрываем файл-источник
        source.close();
        String result = destination.getString();
        System.out.println(result);
        //закрываем файл-приемник
        destination.close();
    }
}
