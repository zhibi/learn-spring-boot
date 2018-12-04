package zhibi.study.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * 全局统一异常处理
 * 如果不加这个 BindingResult result
 * 就到这里处理
 *
 * @author Dream笔
 * @date 2018/12/4 14:01
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 对象校验异常处理
     * @param request
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public Object bindExceptionHandler(HttpServletRequest request, BindException e, HttpServletResponse response) {
        StringBuilder builder = new StringBuilder();
        List<ObjectError> allErrors = e.getAllErrors();
        allErrors.forEach(error -> builder.append(error.getDefaultMessage()));

        return builder.toString();
    }

    /**
     * 参数校验异常处理
     * @param request
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public Object constraintViolationExceptionHandler(HttpServletRequest request, ConstraintViolationException e, HttpServletResponse response) {
        StringBuilder builder = new StringBuilder();
        e.getConstraintViolations().forEach(item -> {
            builder.append(item.getMessage());
        });

        return builder.toString();
    }
}

