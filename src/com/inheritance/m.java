package com.inheritance;
class L{
    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }

    static{
        System.out.println("SIB1");
    }

    static {
        System.out.println("SIB2");
    }

    L(){
        System.out.println("constructor");
    }
    L(int i){
        System.out.println("L(int)");
    }
    L(int i, int j){
        System.out.println("L(int,int)");
    }

}
 class m extends L {
    m(){
        System.out.println("constructor of M");
    }

    public static void main(String[] args) {
        m m1 = new m();
    }
}
