package de.rahn.kotlin.java;

import de.rahn.kotlin.lang.TheKotlinClass;

public class TheJavaClass {

  private final String name;
  private final int value;

  public TheJavaClass(String name, int value) {
    this.name = name;
    this.value = value;

    System.out.println("Java: Konstruktor");
  }

  public void print() {
    System.out.println("Java: " + name + " = " + value);
  }

  public static void main(String[] args) {
    System.out.println("Java: Start");
    TheKotlinClass theKotlinClass = new TheKotlinClass("index", 4711);
    System.out.println("Java: Kotlin-Class = " + theKotlinClass);
    theKotlinClass.print();
    System.out.println("Java: Finish");
  }
}
