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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.sinensia.pruebatec.model.UserPrueba;
import com.sinensia.pruebatec.model.UserPruebaModel;
import com.sinensia.pruebatec.model.UserPruebaSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the UserPrueba service. Represents a row in the &quot;ricoh_UserPrueba&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>UserPruebaModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserPruebaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserPruebaImpl
 * @generated
 */
@JSON(strict = true)
public class UserPruebaModelImpl
	extends BaseModelImpl<UserPrueba> implements UserPruebaModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user prueba model instance should use the <code>UserPrueba</code> interface instead.
	 */
	public static final String TABLE_NAME = "ricoh_UserPrueba";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"userId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"familyName", Types.VARCHAR},
		{"birthDate", Types.TIMESTAMP}, {"email", Types.VARCHAR},
		{"regDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("familyName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("birthDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("regDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table ricoh_UserPrueba (uuid_ VARCHAR(75) null,userId LONG not null primary key,name VARCHAR(75) null,familyName VARCHAR(75) null,birthDate DATE null,email VARCHAR(75) null,regDate DATE null)";

	public static final String TABLE_SQL_DROP = "drop table ricoh_UserPrueba";

	public static final String ORDER_BY_JPQL =
		" ORDER BY userPrueba.userId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY ricoh_UserPrueba.userId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long USERID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static UserPrueba toModel(UserPruebaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		UserPrueba model = new UserPruebaImpl();

		model.setUuid(soapModel.getUuid());
		model.setUserId(soapModel.getUserId());
		model.setName(soapModel.getName());
		model.setFamilyName(soapModel.getFamilyName());
		model.setBirthDate(soapModel.getBirthDate());
		model.setEmail(soapModel.getEmail());
		model.setRegDate(soapModel.getRegDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<UserPrueba> toModels(UserPruebaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<UserPrueba> models = new ArrayList<UserPrueba>(soapModels.length);

		for (UserPruebaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public UserPruebaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _userId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return UserPrueba.class;
	}

	@Override
	public String getModelClassName() {
		return UserPrueba.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<UserPrueba, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<UserPrueba, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserPrueba, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((UserPrueba)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<UserPrueba, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<UserPrueba, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(UserPrueba)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<UserPrueba, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<UserPrueba, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, UserPrueba>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			UserPrueba.class.getClassLoader(), UserPrueba.class,
			ModelWrapper.class);

		try {
			Constructor<UserPrueba> constructor =
				(Constructor<UserPrueba>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<UserPrueba, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<UserPrueba, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<UserPrueba, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<UserPrueba, Object>>();
		Map<String, BiConsumer<UserPrueba, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<UserPrueba, ?>>();

		attributeGetterFunctions.put("uuid", UserPrueba::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<UserPrueba, String>)UserPrueba::setUuid);
		attributeGetterFunctions.put("userId", UserPrueba::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<UserPrueba, Long>)UserPrueba::setUserId);
		attributeGetterFunctions.put("name", UserPrueba::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<UserPrueba, String>)UserPrueba::setName);
		attributeGetterFunctions.put("familyName", UserPrueba::getFamilyName);
		attributeSetterBiConsumers.put(
			"familyName",
			(BiConsumer<UserPrueba, String>)UserPrueba::setFamilyName);
		attributeGetterFunctions.put("birthDate", UserPrueba::getBirthDate);
		attributeSetterBiConsumers.put(
			"birthDate",
			(BiConsumer<UserPrueba, Date>)UserPrueba::setBirthDate);
		attributeGetterFunctions.put("email", UserPrueba::getEmail);
		attributeSetterBiConsumers.put(
			"email", (BiConsumer<UserPrueba, String>)UserPrueba::setEmail);
		attributeGetterFunctions.put("regDate", UserPrueba::getRegDate);
		attributeSetterBiConsumers.put(
			"regDate", (BiConsumer<UserPrueba, Date>)UserPrueba::setRegDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public String getFamilyName() {
		if (_familyName == null) {
			return "";
		}
		else {
			return _familyName;
		}
	}

	@Override
	public void setFamilyName(String familyName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_familyName = familyName;
	}

	@JSON
	@Override
	public Date getBirthDate() {
		return _birthDate;
	}

	@Override
	public void setBirthDate(Date birthDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_birthDate = birthDate;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public Date getRegDate() {
		return _regDate;
	}

	@Override
	public void setRegDate(Date regDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_regDate = regDate;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, UserPrueba.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public UserPrueba toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, UserPrueba>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		UserPruebaImpl userPruebaImpl = new UserPruebaImpl();

		userPruebaImpl.setUuid(getUuid());
		userPruebaImpl.setUserId(getUserId());
		userPruebaImpl.setName(getName());
		userPruebaImpl.setFamilyName(getFamilyName());
		userPruebaImpl.setBirthDate(getBirthDate());
		userPruebaImpl.setEmail(getEmail());
		userPruebaImpl.setRegDate(getRegDate());

		userPruebaImpl.resetOriginalValues();

		return userPruebaImpl;
	}

	@Override
	public UserPrueba cloneWithOriginalValues() {
		UserPruebaImpl userPruebaImpl = new UserPruebaImpl();

		userPruebaImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		userPruebaImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		userPruebaImpl.setName(this.<String>getColumnOriginalValue("name"));
		userPruebaImpl.setFamilyName(
			this.<String>getColumnOriginalValue("familyName"));
		userPruebaImpl.setBirthDate(
			this.<Date>getColumnOriginalValue("birthDate"));
		userPruebaImpl.setEmail(this.<String>getColumnOriginalValue("email"));
		userPruebaImpl.setRegDate(this.<Date>getColumnOriginalValue("regDate"));

		return userPruebaImpl;
	}

	@Override
	public int compareTo(UserPrueba userPrueba) {
		long primaryKey = userPrueba.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserPrueba)) {
			return false;
		}

		UserPrueba userPrueba = (UserPrueba)object;

		long primaryKey = userPrueba.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<UserPrueba> toCacheModel() {
		UserPruebaCacheModel userPruebaCacheModel = new UserPruebaCacheModel();

		userPruebaCacheModel.uuid = getUuid();

		String uuid = userPruebaCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			userPruebaCacheModel.uuid = null;
		}

		userPruebaCacheModel.userId = getUserId();

		userPruebaCacheModel.name = getName();

		String name = userPruebaCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			userPruebaCacheModel.name = null;
		}

		userPruebaCacheModel.familyName = getFamilyName();

		String familyName = userPruebaCacheModel.familyName;

		if ((familyName != null) && (familyName.length() == 0)) {
			userPruebaCacheModel.familyName = null;
		}

		Date birthDate = getBirthDate();

		if (birthDate != null) {
			userPruebaCacheModel.birthDate = birthDate.getTime();
		}
		else {
			userPruebaCacheModel.birthDate = Long.MIN_VALUE;
		}

		userPruebaCacheModel.email = getEmail();

		String email = userPruebaCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			userPruebaCacheModel.email = null;
		}

		Date regDate = getRegDate();

		if (regDate != null) {
			userPruebaCacheModel.regDate = regDate.getTime();
		}
		else {
			userPruebaCacheModel.regDate = Long.MIN_VALUE;
		}

		return userPruebaCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<UserPrueba, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<UserPrueba, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserPrueba, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((UserPrueba)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<UserPrueba, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<UserPrueba, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<UserPrueba, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((UserPrueba)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, UserPrueba>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _userId;
	private String _name;
	private String _familyName;
	private Date _birthDate;
	private String _email;
	private Date _regDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<UserPrueba, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((UserPrueba)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("familyName", _familyName);
		_columnOriginalValues.put("birthDate", _birthDate);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("regDate", _regDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("userId", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("familyName", 8L);

		columnBitmasks.put("birthDate", 16L);

		columnBitmasks.put("email", 32L);

		columnBitmasks.put("regDate", 64L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private UserPrueba _escapedModel;

}