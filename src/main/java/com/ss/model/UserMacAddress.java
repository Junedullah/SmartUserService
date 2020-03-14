/**
 * SST - SMART SOFTWARE TECH.
 * Copyright @ 2020 SST.
 *
 * All rights reserved.
 *
 * THIS PRODUCT CONTAINS CONFIDENTIAL INFORMATION  OF SST.
 * USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE
 * PRIOR EXPRESS WRITTEN PERMISSION OF SST.
 */
package com.ss.model;

import javax.persistence.*;
import java.io.Serializable;

/**
* Description: The persistent class for the User mac Address database table.
 * Name of Project:SST
 * Created on: FEB 18, 2020
 * Modified on: FEB 19, 2020 11:19:38 AM
 *
 * @author Tehmina ALi
 * Version:
 */
@Entity @org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "user_mac_address")
@NamedQuery(name = "UserMacAddress.findAll", query = "SELECT ui FROM UserMacAddress ui")
public class UserMacAddress extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_mac_address_id")
	private int userMacAddressId;

	@Column(name = "mac_address")
	private String macAddress;
	
	@Column(name = "device_type")
	private String deviceType;
	
	
	@Column(name = "device_description")
	private String deviceDescription;

	@Column(name = "is_active")
	private Boolean isActive;

	// bi-directional many-to-one association to Company
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getUserMacAddressId() {
		return userMacAddressId;
	}

	public void setUserMacAddressId(int userMacAddressId) {
		this.userMacAddressId = userMacAddressId;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceDescription() {
		return deviceDescription;
	}

	public void setDeviceDescription(String deviceDescription) {
		this.deviceDescription = deviceDescription;
	}
	

	
	

}