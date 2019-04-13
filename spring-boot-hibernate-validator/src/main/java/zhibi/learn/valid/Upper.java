package zhibi.learn.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author 执笔
 * @date 2018/12/4 13:26
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
// 最重要的一步  指定校验逻辑的类
@Constraint(validatedBy = UpperValidator.class)
public @interface Upper {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
