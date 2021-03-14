package kz.iitu.midtermProject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.iitu.midtermProject")
@PropertySource("application.properties")
public class ProjectConfig {
}
