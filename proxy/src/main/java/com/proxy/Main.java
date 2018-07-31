/**.
 * This package contains a proxy class
 */
package com.proxy;
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
      NameChange nameChangeObject = new ValidationProxy(username,
              password, name, roll);

      System.out.println("enter the new name of the student");
      nameChangeObject.nameChange(consoleScanner.next()); //namechange

      consoleScanner.close();
   }

}
