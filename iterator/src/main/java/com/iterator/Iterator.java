/**.
 * This package contains an iterator class
 */
package com.iterator;

/**
 * @author Akshaya_Bindugowri
 */
public interface Iterator {
    /**
     * @return true if an object exists in the Collection
     */
    boolean hasNext();
    /**
     * @return return the next Object in the Collection.
     */
    Student next();
}
