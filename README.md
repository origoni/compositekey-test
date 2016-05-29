# compositekey-test

자바 ORM 표준 JPA 프로그래밍
- 예제 7.9 SpringData JPA 에서 사용하기
- 에러가 발생합니다 ㅠㅠ
- https://www.facebook.com/groups/hibernatekorea/permalink/1108032172553191/?comment_id=1108156052540803

```
김영한 확인해보니 우선 JPA에서는 동작하는데 스프링 데이터 JPA의 버그로 보입니다.
스프링 데이터 JPA의 save는 persist와 merge를 둘다 지원하는데요. 둘중 어떤 메서드를 호출해야 할지 판단하는 기준이 필요합니다. @GeneratedValue로 대리 키를 생성하는 방식이면 특별한 문제가 없습니다.(새로운 객체는 항상 null이므로) 그런데 키를 직접 입력해주는 방식일 때는 판단 기준이 모호해집니다.
이걸 확인하는 과정에서 복합키에 스프링 내부의 컨버터가 사용되면서 문제가 발생한 것 같습니다(버그로 생각됩니다.).
스프링 데이터 JPA에서 정상동작하려 org.springframework.data.domain.Persistable 인터페이스를 GrandChild엔티티에서 구현하시고, 이 인터페이스의 isNew()를 구현하시면 됩니다. 이렇게 하면 새로운 객체인지 판단을 isNew() 메서드로 확인해서 정상동작하게 됩니다. smile 이모티콘
```

## 실행
```
$ git clone https://github.com/origoni/compositekey-test.git
$ cd compositekey-test
$ mvn spring-boot:run
```

## 아직 문제..
- isNew() 를 어떻게 구현하지는 모름
- 참고 : http://stackoverflow.com/questions/26313044/preferred-way-to-implement-persistable-isnew-for-entity-with-predefined-id-in-sp
