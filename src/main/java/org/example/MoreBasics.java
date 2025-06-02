package org.example;

public class MoreBasics {
    final static class AbraKaDabra{
        final int fin = 2;
        final Integer a=34;
        int c;
        @Override
        protected void finalize() throws Throwable {
            System.out.println("object destroyed");
        }
    }
    public static void main(String[] args) {
        final Integer a;
        a=29;
        System.out.println(a);
        AbraKaDabra o1 = new AbraKaDabra();
        o1.c = 2;
        System.out.println(o1.c);
        o1.c=0;
        System.out.println(o1.c);
        System.out.println(o1.fin + o1.c);


        //garbage collector use
        for (int i=0; i<1000000000; i++){
            AbraKaDabra obj = new AbraKaDabra();
        }
    }
}
