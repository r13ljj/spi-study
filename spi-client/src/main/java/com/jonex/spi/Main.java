package com.jonex.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by xubai on 2018/03/13 上午12:22.
 */
public class Main {

    public static void main(String[] args) {
        IOperation plusOperation = new PlusOperationImpl();
        IOperation divisionOperation = new DivisionOperationImpl();
        int a = 1990, b = 8;
        System.out.println("=====original plus operate:"+plusOperation.operate(a, b));
        System.out.println("=====original division operate:"+divisionOperation.operate(a, b));

        ServiceLoader<IOperation> serviceLoader = ServiceLoader.load(IOperation.class);
        Iterator<IOperation> iterator = serviceLoader.iterator();
        System.out.println("classPath:"+System.getProperty("java.class.path"));
        while(iterator.hasNext()){
            IOperation operation = iterator.next();
            System.out.println("=====spi operation:"+operation.getClass().getSimpleName()+" operate:"+operation.operate(a, b));
        }
        System.out.println("over!");
    }

}
