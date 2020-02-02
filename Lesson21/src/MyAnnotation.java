
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
	String params() default "";
}
