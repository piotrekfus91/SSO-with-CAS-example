package pl.edu.pw.elka.pfus.sso.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("indexController")
@RequestMapping("/home")
public class IndexController extends AbstractController {
    @RequestMapping
    public ModelAndView indexAction() {
        return getModelAndView("index");
    }
}
