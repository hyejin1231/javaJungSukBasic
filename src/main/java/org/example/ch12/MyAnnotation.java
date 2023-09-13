package org.example.ch12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ch12. 애너테이션 타입 정의하기, 애너테이션의 요소
 * : 애너테이션을 직접 만들어 쓸 수 있다.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name() default "user";  // 기본값 지정 가능 (null 제외)
}
