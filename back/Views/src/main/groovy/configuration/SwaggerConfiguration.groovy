package configuration

import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.spi.DocumentationType
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean



@Configuration
class SwaggerConfiguration {
    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }
}