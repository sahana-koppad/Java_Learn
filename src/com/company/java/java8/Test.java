package com.company.java.java8;

interface interf{
    public void add(int a,int b);
}
class predicate{

}
/*class demo implements interf{
    public void add(int a,int b){
        System.out.println("Adding:"+ (a+b));
    }
}*/
public class Test {
    public static void main(String[] args) {
        interf i=(a,b)->System.out.println("adding: " +(a+b));
        i.add(10,20);
    }
}
