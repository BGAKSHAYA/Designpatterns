/**.
 * This package demonstrates bridge design pattern.
 */
package com.bridge;

/**
 * @author Akshaya_Bindugowri
 */
public class NccStudent extends Student {
    /** Ncc id.*/
     private String nccId;

     /**.
     * @param nccIdStu ncc id.
     * @param name name of the student.
     * @param rollno roll no of the student.
     * @param dept department of the student.
     */
    NccStudent(final String nccIdStu, final String name, final String rollno,
                        final Department dept) {
        super(name, rollno, dept);
        this.nccId = nccIdStu;
    }

    /**
     * @return string to be printed with object is printed.
     */
    public String toString() {
        return "Name : " + super.getName()
        + " Roll no : " + super.getRollNo()
        + " Ncc Id : " + this.nccId
        + " Department : " + super.getDeptName();
    }
}
