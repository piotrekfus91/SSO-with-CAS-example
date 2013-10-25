package pl.edu.pw.elka.pfus.sso.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("securedIndexController")
@RequestMapping("/secured")
public class SecuredIndexController extends AbstractController {
    @RequestMapping
    public ModelAndView securedIndex() {
        return getModelAndView("secured/index");
    }
}
