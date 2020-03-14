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
 * Description: The persistent class for the access_role database table.
 * Name of Project:SST
 * Created on: FEB 18, 2020
 * Modified on: FEB 19, 2020 11:19:38 AM
 *
 * @author Tehmina ALi
 * Version:
 */
@Entity @org.hibernate.annotations.Entity(dynamicInsert = true)
@Table(name = "app_config_setting")
@NamedQuery(name = "AppConfigSetting.findAll", query = "SELECT a FROM AppConfigSetting a")
public class AppConfigSetting extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "app_config_setting_id")
	private int appConfigSettingId;

	@Column(name = "config_name")
	private String configName;

	@Column(name = "config_value")
	private String configValue;

	public int getAppConfigSettingId() {
		return appConfigSettingId;
	}

	public void setAppConfigSettingId(int appConfigSettingId) {
		this.appConfigSettingId = appConfigSettingId;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

}