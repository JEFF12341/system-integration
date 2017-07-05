package util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

public class AnnotationUtil {

	/**
	 * 获取对应的注解标签
	 * 
	 * @param jp
	 * @param type
	 * @return
	 */
	public static <T extends Annotation> T getLogAnnotation(JoinPoint jp, Class<T> type) {
		MethodSignature methodSignature = (MethodSignature) jp.getSignature();
		Method targetMethod = methodSignature.getMethod();

		return targetMethod.getAnnotation(type);
	}
	
}
