/**.
 * This package demonstrates chain of responsibility.
 */
package com.chainofresponsibility;

/**
 *
 * @author Akshaya_Bindu_Gowri
 *
 */
 public class Admin implements Chain {

   /** username of admin. */
   private static String usernameAdmin = "admin";
   /** password of admin. */
   private static String passwordAdmin = "java";
   /** chain object. */
   private Chain chain;

   /**
    * @param user , username obtained from user
    * @param pass , password obtained from user
    * @return the authorization result
    */
   static boolean checkCredentials(final String user, final String pass) {
       return usernameAdmin.equals(user) && passwordAdmin.equals(pass);
   }
   /**
    * @param nextChain next in the chain of responsibilty.
    */
   @Override
   public void setNextInChain(final Chain nextChain) {
        this.chain = nextChain;
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
       if (checkCredentials(user, pass)) {
           // The responsibility of changing the student name
           // is passed to class Student.
           this.chain.changeName(newStu, user, pass, newName);
       } else {
           System.out.printf("Invalid Credentials");
       }

   }
}
