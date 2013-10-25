package pl.edu.pw.elka.pfus.sso.app.security;

import org.springframework.stereotype.Component;

@Component
public class App1InfoProvider implements ApplicationInfoProvider {
    @Override
    public String getName() {
        return "Aplikacja nr 1";
    }
}
