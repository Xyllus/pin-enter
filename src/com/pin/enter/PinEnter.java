package com.pin.enter;

import com.pin.core.printer.StdPrinter;
import com.pin.enter.selector.StringSelector;

public class PinEnter {

    public static void main(String[] args) {
        StringSelector intSelector = new StringSelector("abc");
        StdPrinter.print(intSelector);
    }

}
