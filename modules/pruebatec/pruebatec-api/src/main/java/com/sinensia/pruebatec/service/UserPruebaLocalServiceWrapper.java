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

package com.sinensia.pruebatec.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserPruebaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserPruebaLocalService
 * @generated
 */
public class UserPruebaLocalServiceWrapper
	implements ServiceWrapper<UserPruebaLocalService>, UserPruebaLocalService {

	public UserPruebaLocalServiceWrapper(
		UserPruebaLocalService userPruebaLocalService) {

		_userPruebaLocalService = userPruebaLocalService;
	}

	/**
	 * Adds the user prueba to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserPruebaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userPrueba the user prueba
	 * @return the user prueba that was added
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba addUserPrueba(
		com.sinensia.pruebatec.model.UserPrueba userPrueba) {

		return _userPruebaLocalService.addUserPrueba(userPrueba);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userPruebaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new user prueba with the primary key. Does not add the user prueba to the database.
	 *
	 * @param userId the primary key for the new user prueba
	 * @return the new user prueba
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba createUserPrueba(
		long userId) {

		return _userPruebaLocalService.createUserPrueba(userId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userPruebaLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the user prueba with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserPruebaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userId the primary key of the user prueba
	 * @return the user prueba that was removed
	 * @throws PortalException if a user prueba with the primary key could not be found
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba deleteUserPrueba(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userPruebaLocalService.deleteUserPrueba(userId);
	}

	/**
	 * Deletes the user prueba from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserPruebaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userPrueba the user prueba
	 * @return the user prueba that was removed
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba deleteUserPrueba(
		com.sinensia.pruebatec.model.UserPrueba userPrueba) {

		return _userPruebaLocalService.deleteUserPrueba(userPrueba);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _userPruebaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _userPruebaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _userPruebaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userPruebaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.pruebatec.model.impl.UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _userPruebaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.pruebatec.model.impl.UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _userPruebaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _userPruebaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _userPruebaLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.sinensia.pruebatec.model.UserPrueba fetchUserPrueba(
		long userId) {

		return _userPruebaLocalService.fetchUserPrueba(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _userPruebaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _userPruebaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _userPruebaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userPruebaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the user prueba with the primary key.
	 *
	 * @param userId the primary key of the user prueba
	 * @return the user prueba
	 * @throws PortalException if a user prueba with the primary key could not be found
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba getUserPrueba(long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _userPruebaLocalService.getUserPrueba(userId);
	}

	/**
	 * Returns a range of all the user pruebas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.pruebatec.model.impl.UserPruebaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of user pruebas
	 * @param end the upper bound of the range of user pruebas (not inclusive)
	 * @return the range of user pruebas
	 */
	@Override
	public java.util.List<com.sinensia.pruebatec.model.UserPrueba>
		getUserPruebas(int start, int end) {

		return _userPruebaLocalService.getUserPruebas(start, end);
	}

	/**
	 * Returns the number of user pruebas.
	 *
	 * @return the number of user pruebas
	 */
	@Override
	public int getUserPruebasCount() {
		return _userPruebaLocalService.getUserPruebasCount();
	}

	/**
	 * Updates the user prueba in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect UserPruebaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param userPrueba the user prueba
	 * @return the user prueba that was updated
	 */
	@Override
	public com.sinensia.pruebatec.model.UserPrueba updateUserPrueba(
		com.sinensia.pruebatec.model.UserPrueba userPrueba) {

		return _userPruebaLocalService.updateUserPrueba(userPrueba);
	}

	@Override
	public UserPruebaLocalService getWrappedService() {
		return _userPruebaLocalService;
	}

	@Override
	public void setWrappedService(
		UserPruebaLocalService userPruebaLocalService) {

		_userPruebaLocalService = userPruebaLocalService;
	}

	private UserPruebaLocalService _userPruebaLocalService;

}