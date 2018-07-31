/**.
 * This package demonstrates bridge design pattern.
 */
package com.bridge;

/**
 * @author Akshaya_Bindugowri
 */
public class NssStudent extends Student {
    /** nss id.*/
     private String nssId;

     /**.
     * @param nssIdStu nss id.
     * @param name name of the student.
     * @param rollno roll no of the student.
     * @param dept department of the student.
     */
    NssStudent(final String nssIdStu, final String name, final String rollno,
                        final Department dept) {
        super(name, rollno, dept);
        this.nssId = nssIdStu;
    }

    /**
     * @return string to be printed with object is printed.
     */
    public String toString() {
        return "Name : " + super.getName()
        + " Roll no : " + super.getRollNo()
        + " nss Id : " + this.nssId
        + " Department : " + super.getDeptName();
    }
}
