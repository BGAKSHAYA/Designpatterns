/**.
 * This package demonstrates chain of responsibility.
 */
package com.chainofresponsibility;

/**
 * @author Akshaya B G
 */
public final class Student implements Chain {
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

  /**
   * @param nextChain next in the chain of responsibilty.
   */
  @Override
  public void setNextInChain(final Chain nextChain) {
  }

  /**
   * @param newStu the student's whose info. has to be modified.
   * @param user username obtained from user
   * @param pass password obtained from user
   * @param newName new name to be set.
   */
  @Override
  public void changeName(final Student newStu, final String user,
           final String pass, final String newName) {
         this.name = newName;
         System.out.printf("Name changed successfully");
  }

}
