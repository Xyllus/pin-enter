package com.pin.core.selector;

public class IntegerSelector implements ValueSelector<Integer> {

    private final int value;
    
    public IntegerSelector(int value) {
        this.value = value;
    }
    
    @Override
    public Integer getValue() {
        return this.value;
    }

}
