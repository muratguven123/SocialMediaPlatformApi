package Security;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class JwtTokenProvider {

    JwtUserDetails jwt;
    @Value("${app.jwtSecret}")
    private String APP_SECRET;

    @Value("${app.jwtExpirationInMs}")
    private long EXPIRES_IN;
}

