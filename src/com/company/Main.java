package com.company;

public class Main {



    public static void main(String[] args) {
        Computer c=new Computer();
        Computer c1= new Computer();
        Phone ph=new Phone();
        Phone ph1=new Phone();
        Mobile m=new Mobile();
        Mobile m1=new Mobile();
	    Computer [] computers={c,c1,m};
        Phone [] phones={ph,ph1,m1.make()};
        for (Computer temp:computers
             ) {temp.process();

        }
        System.out.println();
        for (Phone temp:phones
             ) {temp.process();

        }
    }


}
