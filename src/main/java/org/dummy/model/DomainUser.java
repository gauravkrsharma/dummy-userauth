package org.dummy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@Entity
@Table(name="USER")
@JsonAutoDetect
public class DomainUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	Integer userId;
	
	@Column(name="NAME")
	String userName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public DomainUser(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}


	public DomainUser() {
		super();
	}

	@Override
	public String toString() {
		return "DomainUser [userId=" + userId + ", userName=" + userName + "]";
	}
	
	

}
