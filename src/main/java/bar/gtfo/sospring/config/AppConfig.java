package bar.gtfo.sospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan("bar.gtfo")
@Import(SecurityConfig.class)
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);

        // Look for views in /WEB-INF/view
        viewResolver.setPrefix("/WEB-INF/view/");

        // Append .jsp to view names
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
