/**.
 * This package contains an iterator class
 */
package com.iterator;
import java.util.ArrayList;
/**
 * @author Akshaya_Bindugowri
 */
public interface Container {
    /**
     * @param studentlist list of students.
     * @return the Iterator
     */
     Iterator getIterator(ArrayList<Student> studentlist);
}
