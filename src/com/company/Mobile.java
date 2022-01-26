package com.company;

public class Mobile extends Computer{
    @Override
    void process() {
        super.process();
        System.out.print(" and like mobile");
    }
    Phone make(){
        return new Phone(){
            @Override
            void process() {
                super.process();
                System.out.print(" and like mobile");
            }
        };
    }

}
//модификатор доступа тип возврата имя метода (параметры){ тело метода}
