/*
* Bootstrap application
*/

package bar.gtfo.sospring.config.core;

import bar.gtfo.sospring.config.AppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    // Specify configuration class
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    // Specify URL mappings
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
