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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UserPrueba}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserPrueba
 * @generated
 */
public class UserPruebaWrapper
	extends BaseModelWrapper<UserPrueba>
	implements ModelWrapper<UserPrueba>, UserPrueba {

	public UserPruebaWrapper(UserPrueba userPrueba) {
		super(userPrueba);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("familyName", getFamilyName());
		attributes.put("birthDate", getBirthDate());
		attributes.put("email", getEmail());
		attributes.put("regDate", getRegDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String familyName = (String)attributes.get("familyName");

		if (familyName != null) {
			setFamilyName(familyName);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date regDate = (Date)attributes.get("regDate");

		if (regDate != null) {
			setRegDate(regDate);
		}
	}

	@Override
	public UserPrueba cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the birth date of this user prueba.
	 *
	 * @return the birth date of this user prueba
	 */
	@Override
	public Date getBirthDate() {
		return model.getBirthDate();
	}

	/**
	 * Returns the email of this user prueba.
	 *
	 * @return the email of this user prueba
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the family name of this user prueba.
	 *
	 * @return the family name of this user prueba
	 */
	@Override
	public String getFamilyName() {
		return model.getFamilyName();
	}

	/**
	 * Returns the name of this user prueba.
	 *
	 * @return the name of this user prueba
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this user prueba.
	 *
	 * @return the primary key of this user prueba
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reg date of this user prueba.
	 *
	 * @return the reg date of this user prueba
	 */
	@Override
	public Date getRegDate() {
		return model.getRegDate();
	}

	/**
	 * Returns the user ID of this user prueba.
	 *
	 * @return the user ID of this user prueba
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this user prueba.
	 *
	 * @return the user uuid of this user prueba
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this user prueba.
	 *
	 * @return the uuid of this user prueba
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birth date of this user prueba.
	 *
	 * @param birthDate the birth date of this user prueba
	 */
	@Override
	public void setBirthDate(Date birthDate) {
		model.setBirthDate(birthDate);
	}

	/**
	 * Sets the email of this user prueba.
	 *
	 * @param email the email of this user prueba
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the family name of this user prueba.
	 *
	 * @param familyName the family name of this user prueba
	 */
	@Override
	public void setFamilyName(String familyName) {
		model.setFamilyName(familyName);
	}

	/**
	 * Sets the name of this user prueba.
	 *
	 * @param name the name of this user prueba
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this user prueba.
	 *
	 * @param primaryKey the primary key of this user prueba
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reg date of this user prueba.
	 *
	 * @param regDate the reg date of this user prueba
	 */
	@Override
	public void setRegDate(Date regDate) {
		model.setRegDate(regDate);
	}

	/**
	 * Sets the user ID of this user prueba.
	 *
	 * @param userId the user ID of this user prueba
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this user prueba.
	 *
	 * @param userUuid the user uuid of this user prueba
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this user prueba.
	 *
	 * @param uuid the uuid of this user prueba
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected UserPruebaWrapper wrap(UserPrueba userPrueba) {
		return new UserPruebaWrapper(userPrueba);
	}

}