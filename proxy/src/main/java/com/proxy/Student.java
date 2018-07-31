/**
 * This package contains a proxy class.
 */
package com.proxy;

/**
 * @author Akshaya B G
 */
public final class Student implements NameChange {
  /** name of the student. */
  private String name;
  /** rollno of the student. */
  private String rollNo;

/**
 * @param nameStu name of the student
 * @param rollNoStu roll no. of the student
 */
  Student(final String nameStu, final String rollNoStu) {
      this.name = nameStu;
      this.rollNo = rollNoStu;
  }

  /**Method to Name.
   * @return name
   */
  public String getName() {
    return name;
  }

  /**Method to get rollno.
   * @return rollNo
   */
  public String getRollNo() {
    return rollNo;
  }

/**
 * @return string to be printed with object is printed
 */
  public String toString() {
      return "Name :" + name
              + " Roll no : " + rollNo;

  }

  @Override
  public void nameChange(final String nameStu) {
      this.name = nameStu;
  }
}
