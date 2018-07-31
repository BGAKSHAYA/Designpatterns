/**.
 * This package demonstrates chain of responsibility.
 */
package com.chainofresponsibility;
/**
 * @author Akshaya_Bindugowri
 */
public interface Chain {
  /** @param nextChain setting the next class in chain. */
  void setNextInChain(Chain nextChain);
 /**
  * @param newStu the student's whose info. has to be modified.
  * @param user username.
  * @param pass password.
  * @param newName new name to be set.
  */
  void changeName(Student newStu, String user, String pass, String newName);
}
