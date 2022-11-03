/*
* Without this class the server would return 405 Unknown Method
after submitting login form
*/
package bar.gtfo.sospring.config.core;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}
