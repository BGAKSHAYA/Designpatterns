/**.
 * This package demonstrates bridge design pattern.
 */
package com.bridge;

/**
 * @author Akshaya_Bindugowri
 */
public class ComputerScience implements Department {
    /** Department Name.*/
    private String deptName;
    /**.
     * @return set the department name and return it;
     */
    @Override
    public final Department department() {
        this.deptName = "Computer Science";
        return this;
    }

    /**
     * @return the deptName.
     */
    @Override
    public final String getDept() {
        return this.deptName;
    }
}
