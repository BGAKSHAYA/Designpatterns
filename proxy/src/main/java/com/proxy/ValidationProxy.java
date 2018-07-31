/**.
 * This package contains a proxy class
 */
package com.proxy;

/**
 * @author Akshaya_Bindugowri
 */
public class ValidationProxy implements NameChange {
    /** NameChange object.*/
    private NameChange nameChangeObject;
    /** To check the user credentials. */
    private boolean isValidUser = false;
    /**
     * @param userNameAdmin username
     * @param passwordAdmin password
     * @param nameStu name of the student
     * @param rollStu roll no  of the student
     */
    ValidationProxy(final String userNameAdmin,
            final String passwordAdmin, final String nameStu,
            final String rollStu) {
        if (userNameAdmin.equals("admin") && passwordAdmin.equals("admin")) {
            isValidUser = true;
            nameChangeObject = new Student(nameStu, rollStu);
        }
    }


    @Override
    public final void nameChange(final String nameStu) {
       if (isValidUser) {
          System.out.println("Name changed");
          nameChangeObject.nameChange(nameStu);
       } else {
           System.out.println("Invalid user");
       }
    }
}
