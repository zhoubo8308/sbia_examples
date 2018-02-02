package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication //1.Enable component scan and auto-configuration
public class ReadingListApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);//2.bootstrap the application
    }
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
      registry.addRedirectViewController("/", "/readingList");
    }
    
}
