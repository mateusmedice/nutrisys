package br.com.cavy.studios.nutrisys.controller.interceptor;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.cavy.studios.nutrisys.controller.LoggedUser;
import br.com.cavy.studios.nutrisys.controller.LoginController;

@Intercepts
public class AuthenticationInterceptor implements Interceptor {

	@Autowired
	private LoggedUser loggedUser;
	
	@Autowired
	private Result result;
	
	@Override
	public boolean accepts(ResourceMethod method) {
		
		boolean notLoginPage = !method.getMethod().getDeclaringClass().equals(LoginController.class);
		boolean notLoggedUser = !loggedUser.isLoggedIn();
		
		return notLoggedUser && notLoginPage;		
	}

	@Override
	public void intercept(InterceptorStack arg0, ResourceMethod arg1, Object arg2) throws InterceptionException {

		this.result.include("errors", Arrays.asList(new ValidationMessage("User not Logged in", "Login")));
		this.result.redirectTo(LoginController.class).login();
	}
	
}
