/**.
 * This package contains a Builder class Student
 */
package com.builder;

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

      Student student = new Student.StudentBuilder("Akshaya",
               "148w1a0504").build();
      Student nccStudent = new Student.StudentBuilder("Akshaya",
               "148w1a0504").setNccId("141").build();
      System.out.println(student);
      System.out.println(nccStudent);
  }
}
