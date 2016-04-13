package cn.edu.kevinstar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Administrator
 * @category 自定义注解
 * 
 * 必须以@符号开头
 */
@Retention(RetentionPolicy.RUNTIME)//用于注释注释的注解会将注释保留在.class文件中，因为默认是不保留的
/*指示注释类型的注释要保留多久。
 * 如果注释类型声明中不存在 Retention 注释，
 * 则保留策略默认为 RetentionPolicy.CLASS。 

         只有元注释类型直接用于注释时，
   Target 元注释才有效。如果元注释类型用作另一种注释类型的成员，则无效。 

*/
public @interface TestAnnotation {
	//如何通过反射机制来使用注解"?"represent any class
	

}
