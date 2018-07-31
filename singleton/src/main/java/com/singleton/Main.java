/**.
 * This package contains a Singleton class
 */
package com.singleton;
/**
 * @author Akshaya B G
 */
public final class Main {
  /** This private constructor overloads default constructor.
   * and won't be called
  */
  private Main() { }

  /**
   * @param args Command line argument
   */
  public static void main(final String[] args) {
      SingletonClass secondInstance = new SingletonClass();
      // compile time error is thrown because of
      //creation of another instance of singleton class
  }
}
