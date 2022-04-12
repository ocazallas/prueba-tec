package com.ricoh.pruebatec.portlet;

import com.liferay.adaptive.media.exception.AMRuntimeException.IOException;
import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.petra.mail.MailEngine;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.ricoh.pruebatec.constants.PruebatecPortletKeys;
import com.sinensia.pruebatec.model.UserPrueba;
import com.sinensia.pruebatec.service.UserPruebaLocalServiceUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Oscar Cazallas
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=PruebaTec",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Pruebatec", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + PruebatecPortletKeys.PRUEBATEC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class PruebatecPortlet extends MVCPortlet {

	Date date = new Date();

	@ProcessAction(name = "addUser")
	public void addUser(ActionRequest actionRequest, ActionResponse actionResponse) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String name = ParamUtil.getString(actionRequest, "name");
		String familyName = ParamUtil.getString(actionRequest, "familyName");
		Date birthDate = ParamUtil.getDate(actionRequest, "birthDate", df);
		String email = ParamUtil.getString(actionRequest, "email");

		UserPrueba userPrueba = UserPruebaLocalServiceUtil
				.createUserPrueba(CounterLocalServiceUtil.increment(UserPrueba.class.getName()));

		userPrueba.setName(name);
		userPrueba.setFamilyName(familyName);
		userPrueba.setBirthDate(birthDate);
		userPrueba.setEmail(email);
		userPrueba.setRegDate(date);

		try {
			CaptchaUtil.check(actionRequest);

			System.out.println("CAPTCHA verification successful.");
			System.out.println(name + familyName + email + birthDate + date);
			sendMail(email);
			// UserPruebaLocalServiceUtil.addUserPrueba(userPrueba);
		} catch (Exception exception) {
			if (exception instanceof CaptchaTextException) {
				SessionErrors.add(actionRequest, exception.getClass(), exception);
				System.out.println("CAPTCHA verification failed.");
			}
		}

	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws java.io.IOException, PortletException {

		List<UserPrueba> users = UserPruebaLocalServiceUtil.getUserPruebas(-1, -1);
		renderRequest.setAttribute("users", users);
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
		} catch (Exception exception) {
			System.out.println(exception.getMessage() + exception);
		}
	}

	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}

	private void sendMail(String mailAddress) throws Exception {
		InternetAddress from = new InternetAddress("oscar.cazallas@gmail.com", "oscar cazallas");
		InternetAddress to = new InternetAddress(mailAddress, "New User");
		MailMessage mailMessage = new MailMessage();
		mailMessage.setHTMLFormat(true);
		mailMessage.setBody("Registro realizado con éxito");
		mailMessage.setFrom(from);
		mailMessage.setSubject("Registro");
		mailMessage.setTo(to);
		MailEngine.send(mailMessage);
	}

	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;

}