/**.
 * This package demonstrates chain of responsibility.
 */
package com.bridge;

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

      NccStudent nccStudent = new NccStudent("ncc1", "Akshaya", "504",
                 (new ComputerScience()).department());
      System.out.println(nccStudent);

      NssStudent nssStudent = new NssStudent("nss3", "Hema", "520",
                (new ComputerScience()).department());
      System.out.println(nssStudent);

   }

}
