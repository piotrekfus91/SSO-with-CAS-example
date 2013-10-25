package pl.edu.pw.elka.pfus.sso.app.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

public abstract class AbstractController {
    @Resource
    protected ApplicationContext applicationContext;

    protected ModelAndView getModelAndView(String viewName) {
        ModelAndView mav = (ModelAndView) applicationContext.getBean("modelAndView");
        mav.setViewName(viewName);
        return mav;
    }
}
