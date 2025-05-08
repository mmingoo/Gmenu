# 가천대 학교식당 메뉴 크롤링 서비스

## 프로젝트 소개
본 프로젝트는 학교 어플의 서비스 중단으로 인한 식단확인에 있어서의 불편함을 해소하고자,  가천대학교 홈페이지에 있는 식당 메뉴를 크롤링하여 웹 서비스로 제공하는 Spring Boot 애플리케이션입니다. 제3생활관, 교육대학원(아름관), 비전타워 1층의 주간 메뉴를 확인할 수 있습니다. MVC 아키텍처 패턴을 적용하여 구현되었습니다.

## 주요 기능
- 각 식당별 주간 메뉴 조회
- 오늘의 메뉴 확인
- 메뉴 정보 자동 크롤링 및 DB 저장

## 기술 스택
- **Backend**: Spring Boot, JPA
- **Frontend**: Thymeleaf, HTML/CSS
- **Database**: JPA (Entity)
- **Crawling**: JSoup
- **Architecture**: MVC 패턴

## 아키텍처
- **Model**: JPA Entity와 Repository를 통한 데이터 관리
- **View**: Thymeleaf 템플릿 엔진을 활용한 사용자 인터페이스
- **Controller**: Spring MVC Controller를 통한 요청 처리

## 프로젝트 구조

### 컨트롤러 (Controller)
- **HomeController**: 메인 페이지 및 각 식당별 메뉴 페이지 요청 처리
- **CrawlController**: 웹 크롤링 요청 처리

### 도메인 (Domain - Model)
- **ArmDateMenu**: 교육대학원(아름관) 메뉴 엔티티
- **DormitoryDateMenu**: 제3생활관 메뉴 엔티티
- **VisiontowerDateMenu**: 비전타워 메뉴 엔티티
- **CrawlData**: 크롤링 데이터 저장 엔티티

### 리포지토리 (Repository - Model)
- **ArmRepository**: 아름관 메뉴 데이터 접근
- **Dormitory3Repository**: 제3생활관 메뉴 데이터 접근
- **VisiontowerRepository**: 비전타워 메뉴 데이터 접근
- **CrawlRepository**: 크롤링 데이터 관리
- **Crawl**: 공통 크롤링 로직
- **FindWeekRepository**: 요일별 메뉴 조회

### 서비스 (Service - Model)
- **ArmService**: 아름관 메뉴 관련 비즈니스 로직
- **DormitoryService**: 제3생활관 메뉴 관련 비즈니스 로직
- **VisiontowerService**: 비전타워 메뉴 관련 비즈니스 로직
- **CrawlService**: 크롤링 관련 비즈니스 로직
- **FindWeekService**: 요일별 메뉴 조회 로직

### 뷰 (View)
- **home.html**: 메인 페이지 (오늘의 메뉴)
- **arm.html**: 아름관 주간 메뉴 페이지
- **dormitory.html**: 제3생활관 주간 메뉴 페이지
- **visiontower.html**: 비전타워 주간 메뉴 페이지

## 동작 방식
1. 학교 홈페이지에서 각 식당 메뉴 정보를 JSoup을 통해 크롤링
2. 크롤링한 데이터를 파싱하여 DB에 저장
3. 저장된 데이터를 기반으로 웹 페이지 제공
4. 사용자는 현재 날짜의 메뉴 또는 주간 메뉴를 확인 가능

## MVC 패턴 적용
- **Model**: Entity 클래스, Repository, Service 계층을 통해 데이터 처리 및 비즈니스 로직 구현
- **View**: Thymeleaf 템플릿을 사용하여 사용자 인터페이스 구현
- **Controller**: 클라이언트 요청을 받아 적절한 서비스 계층으로 전달하고 결과를 View로 반환
 ![image](https://github.com/user-attachments/assets/83022bd2-1f5d-404c-8c68-b7272a923fd9 | width=400)


## 크롤링 소스
- 제3생활관: https://www.gachon.ac.kr/kor/7350/subview.do
- 교육대학원(아름관): https://www.gachon.ac.kr/kor/7349/subview.do
- 비전타워 1층: https://www.gachon.ac.kr/kor/7347/subview.do

## 특징
- 날짜별 메뉴 데이터 자동 갱신
- 요일별 메뉴 조회 기능
- 모델-뷰-컨트롤러 분리를 통한 유지보수성 향상
