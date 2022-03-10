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

### 2022.03.08 (구현 완료)
- PRG
  - Post/Redirect/Get
  - 웹 브라우저의 새로 고침은 마지막에 서버에 전송한 데이터를 다시 전송하기 때문에 상품 중복 등록 문제 발생
  - 새로 고침 문제를 해결하기 위해 상품 저장 후 뷰 템플릿으로 이동하는 것이 아니라, 상품 상세 화면으로 리다이렉트 호출
- RedirectAttributes
  - RedirectAttributes 매개변수를 핸들러에 추가하여 원하는 데이터만을 선택적으로 redirect시 전달할 수 있다

- button 태그의 onclick 속성에 타임리프 사용
  ```
  <button class="w-100 btn btn-primary btn-lg" onclick="location.href='editForm.html'" 
    th:onclick="|location.href='@{/{itemId}/edit(itemId=${item.id})}'|" type="button">상품 수정</button>
  ```
- action 경로 지정 안 하면 현재 url
  ```
  <form action="item.html" th:action method="post">
  ```

