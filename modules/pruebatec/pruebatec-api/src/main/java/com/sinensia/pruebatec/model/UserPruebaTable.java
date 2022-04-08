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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;ricoh_UserPrueba&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see UserPrueba
 * @generated
 */
public class UserPruebaTable extends BaseTable<UserPruebaTable> {

	public static final UserPruebaTable INSTANCE = new UserPruebaTable();

	public final Column<UserPruebaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserPruebaTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<UserPruebaTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserPruebaTable, String> familyName = createColumn(
		"familyName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserPruebaTable, Date> birthDate = createColumn(
		"birthDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<UserPruebaTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<UserPruebaTable, Date> regDate = createColumn(
		"regDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private UserPruebaTable() {
		super("ricoh_UserPrueba", UserPruebaTable::new);
	}

}