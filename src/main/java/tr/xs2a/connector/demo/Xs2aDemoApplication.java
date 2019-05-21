package tr.xs2a.connector.demo;

import de.adorsys.psd2.xs2a.config.EnableXs2aInterface;
import de.adorsys.psd2.xs2a.web.config.EnableXs2aSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableXs2aSwagger
@EnableXs2aInterface
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"de.adorsys.psd2.consent.repository"})
@EntityScan("de.adorsys.psd2.consent.domain")
@SpringBootApplication
public class Xs2aDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xs2aDemoApplication.class, args);
    }

}
