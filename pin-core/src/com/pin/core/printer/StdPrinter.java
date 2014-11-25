package com.pin.core.printer;

import com.pin.core.selector.ValueSelector;

public class StdPrinter {

    private StdPrinter() {}
    
    public static void print(ValueSelector<?> selector) {
        System.out.println(selector.getValue());
    }
}
