package jm.seamtest.beans;

import javax.faces.event.ActionEvent;

import org.jboss.seam.annotations.Name;

@Name("testBean")
public class TestBean {
	
	private String firstName;
	private String lastName;
	private String result;
	
	public TestBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void hello(ActionEvent e) {
		result = "Hello " + firstName + " " + lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

}
