package com.railway.user.reg.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.railway.user.reg.service.pojo.CommonTableFields;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "userDetails")
public class UserDetails extends CommonTableFields 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId", nullable = false)
	private String userId;

	@Column(name = "userName")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "preferredLanguage")
	private String preferredLanguage;
	
	@Column(name = "securityQuestion")
	private String securityQuestion;
	
	@Column(name = "securityAnswer")
	private String securityAnswer;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "middleName")
	private String middleName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "marritalStatus")
	private String marritalStatus;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "mobileNo")
	private String mobileNo;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "addressNo")
	private String addressNo;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "area")
	private String area;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "city")
	private String city;
}
