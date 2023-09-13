package com.railway.user.reg.service.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper=false)

public class CommonTableFields 
{
	@Column(name = "createAt", updatable = false)
	private Date createdAt;

	@Column(name = "createdBy", updatable = false)
	private String createdBy;

	@Column(name = "updatedAt")
	private Date updatedAt;

	@Column(name = "updatedBy")
	private String updatedBy;

	@Column(name = "status")
	private String status;
}
