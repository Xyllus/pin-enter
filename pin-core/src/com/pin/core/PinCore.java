package com.pin.core;

import com.pin.core.printer.StdPrinter;
import com.pin.core.selector.IntegerSelector;

public class PinCore {

    public static void main(String[] args) {
        IntegerSelector intSelector = new IntegerSelector(5);
        StdPrinter.print(intSelector);
    }

}
