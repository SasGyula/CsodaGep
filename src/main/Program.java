
package main;

import modell.CsodaGep;

public class Program {
     public static void main(String[] args) {
        CsodaGep gep = new CsodaGep();
        System.out.println("Totószámok: \n" + gep.kerTotoSzelveny());
        System.out.println("Dal: \n" + gep.kerDal());
        gep.ujDal("A szeretet él!");
        System.out.println("Dal: \n" + gep.kerDal());
    }
}
