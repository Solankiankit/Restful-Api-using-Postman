package org.solanki.ankit.webmessengr.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String firstNme;
	private String lastName;
	private Date created;
	
	public Profile(){
		
	}
	
	public Profile(long id,String firstName,String lastName){
		this.id = id;
		this.firstNme = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstNme() {
		return firstNme;
	}

	public void setFirstNme(String firstNme) {
		this.firstNme = firstNme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
