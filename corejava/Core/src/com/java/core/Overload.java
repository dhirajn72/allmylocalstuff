package com.java.core;

class Parent
{
static void m1()
{
System.out.println("static");
}
}

public class Overload extends Parent{

public static void main(String[] args) {
	Parent p = new Overload();
p.m1();

}

}