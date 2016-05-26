# compositekey-test

자바 ORM 표준 JPA 프로그래밍
- 예제 7.9 SpringData JPA 에서 사용하기
- 에러가 발생합니다 ㅠㅠ

## 실행
```
$ git clone https://github.com/origoni/compositekey-test.git
$ cd compositekey-test
$ mvn spring-boot:run
```

## 테스트
- http://localhost:8080/test1 - 정상
- http://localhost:8080/test2 - 에러


### 에러로그
```
2016-05-26 19:03:28.579  WARN 42557 --- [nio-8080-exec-2] .w.s.m.s.DefaultHandlerExceptionResolver : Failed to convert request element: org.springframework.beans.ConversionNotSupportedException: Failed to convert property value of type [java.lang.String] to required type [com.millky.compositekey.domain.ChildId] for property 'child'; nested exception is java.lang.IllegalStateException: Cannot convert value of type [java.lang.String] to required type [com.millky.compositekey.domain.ChildId] for property 'child': no matching editors or conversion strategy found
```
