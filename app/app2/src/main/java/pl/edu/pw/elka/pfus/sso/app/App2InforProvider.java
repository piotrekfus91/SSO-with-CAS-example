package pl.edu.pw.elka.pfus.sso.app;

import org.springframework.stereotype.Component;
import pl.edu.pw.elka.pfus.sso.app.security.ApplicationInfoProvider;

@Component
public class App2InforProvider implements ApplicationInfoProvider {
    @Override
    public String getName() {
        return "Aplikacja nr 2";
    }
}
