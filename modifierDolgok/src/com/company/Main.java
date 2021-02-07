package com.company;

import package1.AbstractClass;
import package1.InterfaceDolog;
import package1.PublicClass;
import package1.SubClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PublicClass pb = new PublicClass();
        pb.publicInt = 2;
       // pb.staticInt

        PublicClass.staticInt = 2;
        PublicClass.staticMethod();

      //  pb.privateInt = 2;
      //  pb.defaultInt = 2;
      //  pb.protectedInt = 4;

        PublicClass pb2 = new PublicClass();
        pb2.staticInt = 6;

        System.out.println(pb.staticInt);

        SubClass sub = new SubClass();

        sub.doSmth(); //sub
        sub.abstractMethod();
        sub.doSmthExtra();

        AbstractClass sub2 = new SubClass();
        sub2.doSmth(); //sub
        sub2.abstractMethod();

        AbstractClass.finalStaticMethod();

        InterfaceDolog inter = new SubClass();

        inter.interfaceMethod();

     //   sub2.doSmthExtra();

        List<String> list = new ArrayList<String>();

        Collection<String> coll = new ArrayList<String>();

    }
}
