/** This package contains a iterator class.
 */
package com.iterator;

import java.util.ArrayList;

/**
 * @author Akshaya B G
 */
public final class Student implements Container {
  /** name of the student. */
  private String name;
  /** rollno of the student. */
  private String rollNo;
  /** lsit of students. */
  private ArrayList<Student> list;

  /**
 * @param nameStu name of the student
 * @param rollNoStu roll no. of the student
 */
  Student(final String nameStu, final String rollNoStu) {
      this.name = nameStu;
      this.rollNo = rollNoStu;
  }
 /**
  * @param stuList list.
  */
  Student(final ArrayList<Student> stuList) {
    this.list = stuList;
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

  /**.
   * returns the StudentIterator
   */

  @Override
  public Iterator getIterator(final ArrayList<Student> studentlist) {
      return new StudentIterator(this.list);
  }
 /**
  * @author Akshaya_Bindugowri
  */
  private class StudentIterator implements Iterator {
       /** list of students.*/
        private ArrayList<Student> studentList = new ArrayList<Student>();
        /** index of list.*/
        private int index = 0;
        /**
         * @param studentlists list of students.
         */
        StudentIterator(final ArrayList<Student> studentlists) {
            this.studentList = studentlists;
        }
        @Override
        /**
         * @return true if an obejct exists in the Collection
         */
        public boolean hasNext() {
             return this.index < studentList.size();
        }

        @Override
        /**
         * @return the next student object in the collection
         */
        public Student next() {
             return studentList.get(this.index++);
        }

  }

}
