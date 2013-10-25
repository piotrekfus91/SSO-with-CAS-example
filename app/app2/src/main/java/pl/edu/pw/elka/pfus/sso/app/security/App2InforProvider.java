package pl.edu.pw.elka.pfus.sso.app.security;

import org.springframework.stereotype.Component;

@Component
public class App2InforProvider implements ApplicationInfoProvider {
    @Override
    public String getName() {
        return "Aplikacja nr 2";
    }
}
