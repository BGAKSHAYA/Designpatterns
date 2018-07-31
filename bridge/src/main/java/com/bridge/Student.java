/**.
 * This package demonstrates bridge design pattern.
 */
package com.bridge;

/**
 * @author Akshaya B G
 */
public abstract class Student {
  /** name of the student. */
  private String name;
  /** rollno of the student. */
  private String rollNo;
  /** department of the student.*/
  private Department dept;

/**
 * @param nameStu name of the student
 * @param rollNoStu roll no. of the student
 * @param departStu department of the student
 */
  Student(final String nameStu, final String rollNoStu,
          final Department departStu) {
      this.name = nameStu;
      this.rollNo = rollNoStu;
      this.dept = departStu;
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

  /**Method to get deptname.
   * @return deptname
   */
  public String getDeptName() {
    return this.dept.getDept();
  }

  /**.
   * string to be printed with object is printed
   */
  @Override
  public abstract String toString();




}
