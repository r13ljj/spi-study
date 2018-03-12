package com.jonex.spi;

/**
 * Created by xubai on 2018/03/13 上午12:19.
 */
public class DivisionOperationImpl implements IOperation {

    @Override
    public int operate(int numberA, int numberB) {
        return numberA / numberB;
    }
}
