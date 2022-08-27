package august.bao0828.annotation_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})//元注解：注解类型限定为方法\成员变量
@Retention(RetentionPolicy.RUNTIME)//一直活着，在运行阶段这个注解也不会消失
public @interface MyTest {

}
