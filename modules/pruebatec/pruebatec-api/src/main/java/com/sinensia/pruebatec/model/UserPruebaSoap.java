/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sinensia.pruebatec.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sinensia.pruebatec.service.http.UserPruebaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UserPruebaSoap implements Serializable {

	public static UserPruebaSoap toSoapModel(UserPrueba model) {
		UserPruebaSoap soapModel = new UserPruebaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUserId(model.getUserId());
		soapModel.setName(model.getName());
		soapModel.setFamilyName(model.getFamilyName());
		soapModel.setBirthDate(model.getBirthDate());
		soapModel.setEmail(model.getEmail());
		soapModel.setRegDate(model.getRegDate());

		return soapModel;
	}

	public static UserPruebaSoap[] toSoapModels(UserPrueba[] models) {
		UserPruebaSoap[] soapModels = new UserPruebaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UserPruebaSoap[][] toSoapModels(UserPrueba[][] models) {
		UserPruebaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UserPruebaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UserPruebaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UserPruebaSoap[] toSoapModels(List<UserPrueba> models) {
		List<UserPruebaSoap> soapModels = new ArrayList<UserPruebaSoap>(
			models.size());

		for (UserPrueba model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UserPruebaSoap[soapModels.size()]);
	}

	public UserPruebaSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getFamilyName() {
		return _familyName;
	}

	public void setFamilyName(String familyName) {
		_familyName = familyName;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getRegDate() {
		return _regDate;
	}

	public void setRegDate(Date regDate) {
		_regDate = regDate;
	}

	private String _uuid;
	private long _userId;
	private String _name;
	private String _familyName;
	private Date _birthDate;
	private String _email;
	private Date _regDate;

}