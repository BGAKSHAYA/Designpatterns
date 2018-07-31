/**.
 * This package contains a Builder class Student
 */
package com.builder;

/**
 * @author Akshaya B G
 */
public final class Student {
  /** name of the student. */
  private String name;
  /** rollno of the student. */
  private String rollNo;

  /** optional parameter nccid .Not everyone will be a part of NCC. */
  private String nccId;
  /**
   * @param builder StudentBuilder object
   */
  private Student(final StudentBuilder builder) {
      this.name = builder.name;
      this.rollNo = builder.rollNo;
      this.nccId = builder.nccId;
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
  /**Method to get nccid.
   * @return nccId
   */
  public String getNccId() {
    return nccId;
  }
/**
 * @return string to be printed with object is printed
 */
  public String toString() {
      return "Name :" + name
              + " Roll no : " + rollNo
              + " Ncc id :" + nccId;
  }
  /**
   * @author Akshaya B G
   */
  public static class StudentBuilder {
      /** name of the student. */
      private String name;
      /** rollno of the student. */
      private String rollNo;

      /** optional parameter nccid .Not everyone will be a part of NCC. */
      private String nccId;
      /**
       * @param nameStu name
       * @param rollNoStu roll no
       */
      public StudentBuilder(final String nameStu,
              final String rollNoStu) {
          this.name = nameStu;
          this.rollNo = rollNoStu;
      }
      /**
       * @param nccIdStu ncc id
       * @return the studentBuilder object
       */
      public StudentBuilder setNccId(final String nccIdStu) {
          this.nccId = nccIdStu;
          return this;
      }
      /**
       * @return Student object
       */
      public Student build() {
          return new Student(this);
      }
  }

}
