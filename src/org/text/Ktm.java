package org.text;

public class Ktm extends Bike {
@Override
public void speed() {
System.out.println("150km");	
}
public static void main(String[] args) {
Ktm k = new Ktm();
k.cost();
k.speed();
}
}
