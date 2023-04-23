package practice.springbootoauth.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {

    private boolean isSecure;
    @Override
    public void init(HttpSecurity builder) throws Exception {
        super.init(builder);
        System.out.println("builder = " + builder);
    }

    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);
        if(isSecure) {
            System.out.println("https is required");
        }
    }

    public CustomSecurityConfigurer setFlag(boolean isSecure) {
        this.isSecure = isSecure;
        return this;
    }

    public CustomSecurityConfigurer setFlag2(boolean isSecure) {
        this.isSecure = isSecure;
        return this;
    }
}
