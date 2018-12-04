package zhibi.study.config;

import org.hibernate.validator.HibernateValidator;
import org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator;
import org.hibernate.validator.resourceloading.PlatformResourceBundleLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author Dream笔
 * @date 2018/12/2 19:38
 */
@Configuration
public class ValidatorConfig {

    @Autowired
    private MessageSource messageSource;


    @Bean
    public Validator getValidator() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                //.failFast(true)

                /*
                一个配置文件的时候
                 */
                .messageInterpolator(new ResourceBundleMessageInterpolator(
                        new PlatformResourceBundleLocator("i18n/error")))

                /*
                多个配置文件的时候
                 */
                /* .messageInterpolator(new ResourceBundleMessageInterpolator(
                         new AggregateResourceBundleLocator(Arrays.asList("i18n/error","i18n/message"))))*/
                .buildValidatorFactory();
        return validatorFactory.getValidator();
    }

}
