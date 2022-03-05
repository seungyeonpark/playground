## Minimall
- 미니 쇼핑몰

### 2022.03.05
- @Repository
  - 해당 클래스를 Bean 객체로 생성해주는 애노테이션
  - 부모 어노테이션인 @Component를 붙여줘도 똑같이 스프링 컨테이너에 등록되지만 가시성이 떨어지기 때문에 @Repository, @Service등 사용
- @PathVariable
  - url에서 각 구분자에 들어오는 값 처리
- Hashmap 제네릭 타입으로 primitive type이 올 수 없다 [(참고)](https://stackoverflow.com/questions/1780385/java-hashmapstring-int-not-working)
- ItemRepository가 어차피 싱글톤 빈으로 등록되는데 static을 쓸 필요가 있을까?
