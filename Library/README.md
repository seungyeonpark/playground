## Library
- 도서 대출 프로그램

### goals
- 역할과 구현의 분리
- component scan, filter 사용
- 직접 annotation 만들어보기
- lombok 사용해보기
- test code 작성

### settings
- Spring 프레임워크 사용
- SpringBoot로 환경 설정하였으나 사용은 X

[#issue1] component scan
- @Configuration이 붙은 설정 클래스 역시 컴포넌트 스캔의 대상
- 따라서 @Configuraion이 붙은 또 다른 설정 클래스가 존재한다면, 그 설정 정보도 함께 등록/실행된다
