/**.
 * This package contains a proxy class
 */
package com.iterator;
import java.util.Scanner;
import java.util.ArrayList;
/**.
 * @author Akshaya_BG
 *
 */

public final class Main {
    /** This private constructor overloads default constructor.
     * and won't be called
    */
    private Main() { }
  /**
  * @param studentlist student list.
  */
   static void traverseList(final ArrayList<Student> studentlist) {
        Student s = new Student(studentlist);
        Iterator iterator = s.getIterator(studentlist);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
   }
   /**
    * @param args command line arguments
    */
   public static void main(final String[] args) {
      Scanner consoleScanner = new Scanner(System.in);
      ArrayList<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student("Akshaya", "1"));
      studentList.add(new Student("Hema", "2"));
      studentList.add(new Student("Swathi", "3"));
      studentList.add(new Student("Rithu", "4"));

      traverseList(studentList);
      consoleScanner.close();

   }

}
