package pl.edu.pw.elka.pfus.sso.app.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.pw.elka.pfus.sso.app.security.ApplicationInfoProvider;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component("modelAndView")
@Scope("prototype")
public class AppAwareModelAndView extends ModelAndView {
    @Resource
    private ApplicationInfoProvider applicationInfoProvider;

    @PostConstruct
    private void init() {
        super.addObject("appName", applicationInfoProvider.getName());
    }
}
