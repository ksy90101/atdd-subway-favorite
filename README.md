# 지하철 경로 조회 - API 테스트 / 문서 자동화
 
## 1단계 - 회원관리 기능

### 요구사항
- 회원 정보를 관리하는 기능 구현
- 자신의 정보만 수정 가능하도록 해야하며 로그인이 선행되어야 함
- 토큰의 유효성 검사와 본인 여부를 판단하는 로직 추가
- side case에 대한 예외처리
    - [x] 이메일 형식 검사
    - [x] 비밀번호와 비밀번호 확인 동일 값인지 검사
    - [x] 모든 값에 빈 값인지 검사
    - [x] 이메일 중복 검사
    - [ ] 로그인시 틀린 비빌번호 입력
- 인수 테스트와 단위 테스트 작성
- API 문서를 작성하고 문서화를 위한 테스트 작성
- 페이지 연동

### 기능목록
- 회원가입
- 로그인
- 로그인 후 회원정보 조회/수정/삭제

## 2단계 - 즐겨찾기 기능

### 요구 사항
- 즐겨찾기 기능을 추가(추가,삭제,조회)
- 자신의 정보만 수정 가능하도록 해야하며 로그인이 선행되어야 함
- 토큰의 유효성 검사와 본인 여부를 판단하는 로직 추가(interceptor, argument resolver)
- side case에 대한 예외처리 필수
- 인수 테스트와 단위 테스트 작성
- API 문서를 작성하고 문서화를 위한 테스트 작성
- 페이지 연동

### 기능 목록
1. 즐겨찾기 추가
2. 즐겨찾기 목록조회 / 제거

### 즐겨찾기 인수테스트

```gherkin
Feature: 경로 즐겨찾기 기능

  Scenario: 경로 즐겨찾기를 추가하고 조회하고 삭제한다.
    Given 지하철역이 여러 개 추가되어있다.
    And 지하철 노선이 여러 개 추가되어있다.
    And 지하철 노선에 지하철역이 여러 개 추가되어있다.
    And 사용자가 로그인이 되어 있다.
    
    When 즐겨찾기를 n개 추가 요청을 한다.
    And 즐겨찾기를 목록을 조회 요청을 한다.
    Then 즐겨찾기 목록을 응답받는다.
    Then 즐겨찾기 목록은 n개이다.

    When 즐겨찾기를 삭제 요청을 한다.
    And 즐겨찾기를 목록을 조회 요청을 한다.
    Then 즐겨찾기 목록을 응답받는다.
    Then 즐겨찾기 목록은 n-1개이다.
```
