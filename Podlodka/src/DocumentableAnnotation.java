import java.lang.annotation.*;

@Documented
@Target(value=ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)

public @interface DocumentableAnnotation {
	String test() default "just testing";

}
