/**.
 * This package demonstrates chain of responsibility.
 */
package com.chainofresponsibility;
import java.util.Scanner;

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
     * @param args command line arguments
     */
   public static void main(final String[] args) {
      Scanner consoleScanner = new Scanner(System.in);
      System.out.println("Enter username");
      String username = consoleScanner.nextLine();
      System.out.println("Enter password");
      String password = consoleScanner.nextLine();
      System.out.println("Enter student name");
      String name = consoleScanner.nextLine();
      System.out.println("Enter student rollno");
      String roll  = consoleScanner.nextLine();
      Student newStudent = new Student(name, roll);
      System.out.println("enter the new name of the student");
      String newName = consoleScanner.nextLine();

      Chain adminChainObject = new Admin();
      Chain studentChainObject = new Student(name, roll);
      adminChainObject.setNextInChain(studentChainObject);
      adminChainObject.changeName(newStudent, username, password, newName);
      consoleScanner.close();
   }

}
