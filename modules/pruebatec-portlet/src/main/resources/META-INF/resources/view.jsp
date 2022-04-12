<%@ include file="/init.jsp" %>

<%@ taglib uri="http://liferay.com/tld/captcha" prefix="liferay-captcha" %>
<%@ page import="com.liferay.portal.kernel.captcha.CaptchaTextException"%>



<c:set var="name"><liferay-ui:message key="user.name" /></c:set>
<c:set var="familyName"><liferay-ui:message key="user.family.name" /></c:set>
<c:set var="email"><liferay-ui:message key="user.email" /></c:set>
<c:set var="birthdate"><liferay-ui:message key="user.birthdate" /></c:set>


<portlet:actionURL name="addUser" var="addUserActionURL" />
<portlet:resourceURL id="captcha" var="captchaResourceURL"/>

<div class="container pt-3">
	<h2><liferay-ui:message key="user.list" /></h2>
	
	<table>
	  <tr>
	    <th>${name}</th>
	    <th>${familyName}</th>
	    <th>${birthdate}</th>
	    <th>${email}</th>
	  </tr>
	  
		  <c:forEach var='u' items='${users}'>
			  <tr>
			    <td>${u.name}</td>
			    <td>${u.familyName}</td>
			    <td>${u.birthDate}</td>
			    <td>${u.email}</td>
			  </tr>
		  </c:forEach>
	</table>
</div>
<div class="container pt-3">
	<h2><liferay-ui:message key="new.user" /></h2>
	
	<liferay-ui:error
	    exception="<%= CaptchaTextException.class %>"
	    message="captcha-verification-failed" />
	
	<aui:form action="${addUserActionURL}" name="userForm" method="POST">
		<aui:input name="name" label="${name}">
			<aui:validator name="required"/>
		</aui:input>
		
		<aui:input name="familyName" label="${familyName}">
			<aui:validator name="required"/>
		</aui:input>
		
		<aui:input name="birthDate" label="${birthdate}" type="date">
			<aui:validator name="required"/>
		</aui:input>
		
		<aui:input name="email" label="${email}" type="email">
			<aui:validator name="required"/>
			<aui:validator name="email"/>
		</aui:input>
		
		<liferay-captcha:captcha url="<%= captchaResourceURL %>"/>
		
		
		<aui:button type="submit" name="" value="Submit"></aui:button>
		
	
	</aui:form>

</div>




