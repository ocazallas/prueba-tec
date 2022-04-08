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

package com.sinensia.pruebatec.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sinensia.pruebatec.exception.NoSuchUserPruebaException;
import com.sinensia.pruebatec.model.UserPrueba;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the user prueba service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserPruebaUtil
 * @generated
 */
@ProviderType
public interface UserPruebaPersistence extends BasePersistence<UserPrueba> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UserPruebaUtil} to access the user prueba persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the user pruebas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching user pruebas
	 */
	public java.util.List<UserPrueba> findByUuid(String uuid);

	/**
	 * Returns a range of all the user pruebas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @return the range of matching user pruebas
	 */
	public java.util.List<UserPrueba> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the user pruebas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching user pruebas
	 */
	public java.util.List<UserPrueba> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user pruebas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching user pruebas
	 */
	public java.util.List<UserPrueba> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first user prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user prueba
	 * @throws NoSuchUserPruebaException if a matching user prueba could not be found
	 */
	public UserPrueba findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
				orderByComparator)
		throws NoSuchUserPruebaException;

	/**
	 * Returns the first user prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching user prueba, or <code>null</code> if a matching user prueba could not be found
	 */
	public UserPrueba fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator);

	/**
	 * Returns the last user prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user prueba
	 * @throws NoSuchUserPruebaException if a matching user prueba could not be found
	 */
	public UserPrueba findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
				orderByComparator)
		throws NoSuchUserPruebaException;

	/**
	 * Returns the last user prueba in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching user prueba, or <code>null</code> if a matching user prueba could not be found
	 */
	public UserPrueba fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator);

	/**
	 * Returns the user pruebas before and after the current user prueba in the ordered set where uuid = &#63;.
	 *
	 * @param userId the primary key of the current user prueba
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next user prueba
	 * @throws NoSuchUserPruebaException if a user prueba with the primary key could not be found
	 */
	public UserPrueba[] findByUuid_PrevAndNext(
			long userId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
				orderByComparator)
		throws NoSuchUserPruebaException;

	/**
	 * Removes all the user pruebas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of user pruebas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching user pruebas
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the user prueba in the entity cache if it is enabled.
	 *
	 * @param userPrueba the user prueba
	 */
	public void cacheResult(UserPrueba userPrueba);

	/**
	 * Caches the user pruebas in the entity cache if it is enabled.
	 *
	 * @param userPruebas the user pruebas
	 */
	public void cacheResult(java.util.List<UserPrueba> userPruebas);

	/**
	 * Creates a new user prueba with the primary key. Does not add the user prueba to the database.
	 *
	 * @param userId the primary key for the new user prueba
	 * @return the new user prueba
	 */
	public UserPrueba create(long userId);

	/**
	 * Removes the user prueba with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user prueba
	 * @return the user prueba that was removed
	 * @throws NoSuchUserPruebaException if a user prueba with the primary key could not be found
	 */
	public UserPrueba remove(long userId) throws NoSuchUserPruebaException;

	public UserPrueba updateImpl(UserPrueba userPrueba);

	/**
	 * Returns the user prueba with the primary key or throws a <code>NoSuchUserPruebaException</code> if it could not be found.
	 *
	 * @param userId the primary key of the user prueba
	 * @return the user prueba
	 * @throws NoSuchUserPruebaException if a user prueba with the primary key could not be found
	 */
	public UserPrueba findByPrimaryKey(long userId)
		throws NoSuchUserPruebaException;

	/**
	 * Returns the user prueba with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user prueba
	 * @return the user prueba, or <code>null</code> if a user prueba with the primary key could not be found
	 */
	public UserPrueba fetchByPrimaryKey(long userId);

	/**
	 * Returns all the user pruebas.
	 *
	 * @return the user pruebas
	 */
	public java.util.List<UserPrueba> findAll();

	/**
	 * Returns a range of all the user pruebas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @return the range of user pruebas
	 */
	public java.util.List<UserPrueba> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the user pruebas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user pruebas
	 */
	public java.util.List<UserPrueba> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator);

	/**
	 * Returns an ordered range of all the user pruebas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of user pruebas
	 */
	public java.util.List<UserPrueba> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UserPrueba>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the user pruebas from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of user pruebas.
	 *
	 * @return the number of user pruebas
	 */
	public int countAll();

}