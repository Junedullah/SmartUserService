/**
 * BTI - BAAN for Technology And Trade IntL. 
 * Copyright @ 2017 BTI. 
 * 
 * All rights reserved.
 * 
 * THIS PRODUCT CONTAINS CONFIDENTIAL INFORMATION  OF BTI. 
 * USE, DISCLOSURE OR REPRODUCTION IS PROHIBITED WITHOUT THE 
 * PRIOR EXPRESS WRITTEN PERMISSION OF BTI.
 */ 

package com.ss.constant;
/**
 * The <code>SSTRoles</code> Contains the type of Application User Role.
 * Name of Project: SST
 * Created on: FEB 18, 2020
 * Modified on: -----
 * @author Tehmina Ali
 * Version: 
 */
public enum SMTRoles {

	USER(1), SUPERADMIN(2);

	private int index;

	/**
	 * @param index
	 */
	private SMTRoles(int index) {

		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}