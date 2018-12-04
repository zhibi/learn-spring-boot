package zhibi.study.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 大写校验器
 * @author Dream笔
 * @date 2018/12/4 13:28
 */
public class UpperValidator implements ConstraintValidator<Upper, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return value.equals(value.toUpperCase());
    }
}
