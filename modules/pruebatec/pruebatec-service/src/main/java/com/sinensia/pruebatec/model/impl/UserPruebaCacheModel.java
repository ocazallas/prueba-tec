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

package com.sinensia.pruebatec.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sinensia.pruebatec.model.UserPrueba;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UserPrueba in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UserPruebaCacheModel
	implements CacheModel<UserPrueba>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserPruebaCacheModel)) {
			return false;
		}

		UserPruebaCacheModel userPruebaCacheModel =
			(UserPruebaCacheModel)object;

		if (userId == userPruebaCacheModel.userId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, userId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", familyName=");
		sb.append(familyName);
		sb.append(", birthDate=");
		sb.append(birthDate);
		sb.append(", email=");
		sb.append(email);
		sb.append(", regDate=");
		sb.append(regDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UserPrueba toEntityModel() {
		UserPruebaImpl userPruebaImpl = new UserPruebaImpl();

		if (uuid == null) {
			userPruebaImpl.setUuid("");
		}
		else {
			userPruebaImpl.setUuid(uuid);
		}

		userPruebaImpl.setUserId(userId);

		if (name == null) {
			userPruebaImpl.setName("");
		}
		else {
			userPruebaImpl.setName(name);
		}

		if (familyName == null) {
			userPruebaImpl.setFamilyName("");
		}
		else {
			userPruebaImpl.setFamilyName(familyName);
		}

		if (birthDate == Long.MIN_VALUE) {
			userPruebaImpl.setBirthDate(null);
		}
		else {
			userPruebaImpl.setBirthDate(new Date(birthDate));
		}

		if (email == null) {
			userPruebaImpl.setEmail("");
		}
		else {
			userPruebaImpl.setEmail(email);
		}

		if (regDate == Long.MIN_VALUE) {
			userPruebaImpl.setRegDate(null);
		}
		else {
			userPruebaImpl.setRegDate(new Date(regDate));
		}

		userPruebaImpl.resetOriginalValues();

		return userPruebaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		userId = objectInput.readLong();
		name = objectInput.readUTF();
		familyName = objectInput.readUTF();
		birthDate = objectInput.readLong();
		email = objectInput.readUTF();
		regDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(userId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (familyName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(familyName);
		}

		objectOutput.writeLong(birthDate);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(regDate);
	}

	public String uuid;
	public long userId;
	public String name;
	public String familyName;
	public long birthDate;
	public String email;
	public long regDate;

}