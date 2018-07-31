/**.
 * This package contains a Singleton class
 */
package com.singleton;

/**
 * @author Akshaya B G
 */
public final class SingletonClass {
  /** the single instance of class. */
  private static final SingletonClass ONEINSTANCE = new  SingletonClass();
  /** private SingletonClass that avoids creation of more
   *  than one instance of this class.*/
  private SingletonClass() { }
  /**
  * @return oneInstance Return oneInstance that is created.
  */
  public static SingletonClass getOneInstance() {
     return ONEINSTANCE;
  }
}
