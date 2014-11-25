package com.pin.enter.selector;

import com.pin.core.selector.ValueSelector;

public class StringSelector implements ValueSelector<String> {

    private final String value;
    
    public StringSelector(String value) {
        this.value = value;
    }
    
    @Override
    public String getValue() {
        return this.value;
    }

}
