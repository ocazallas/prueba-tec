<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>


<h2>New User</h2>

<portlet:actionURL name="addUser" var="addUserActionURL" />
<portlet:resourceURL id="captcha" var="captchaResourceURL"/>

<liferay-ui:error
    exception="<%= CaptchaTextException.class %>"
    message="captcha-verification-failed" />

<aui:form action="${addUserActionURL}" name="userForm" method="POST">
	<aui:input name="name" label="Name">
		<aui:validator name="required"/>
	</aui:input>
	
	<aui:input name="familyName" label="Family Name">
		<aui:validator name="required"/>
	</aui:input>
	
	<aui:input name="birthDate" label="Birth Date" type="date">
		<aui:validator name="required"/>
	</aui:input>
	
	<aui:input name="email" label="Email" type="email">
		<aui:validator name="required"/>
		<aui:validator name="email"/>
	</aui:input>
	
	<liferay-captcha:captcha url="<%= captchaResourceURL %>"/>
	
	
	<aui:button type="submit" name="" value="Submit"></aui:button>



</aui:form>