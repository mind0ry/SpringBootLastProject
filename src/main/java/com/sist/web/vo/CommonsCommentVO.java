package com.sist.web.vo;

import lombok.Data;
import java.util.*;

/*
 *   Spring Boot
 *   1. Spring 기반 => 애플리케이션을 빠르고 쉽게 개발을 위한 프레임워크
 *      = 설정 최소화
 *      = 빠른 실행 (내장 => 톰캣서버) = CI / CD
 *      = 독립적 실행
 *   ------------------------------------------
 *     SpringFramework       Spring-Boot
 *   ------------------------------------------
 *     XML / Java 설정		  자동 설정
 *     외부 tomcat사용          내장 Tomcat
 *     시작 : 복잡              속도가 빠르다
 *   ------------------------------------------
 *     src/main/java
 *         | => 자바 클래스
 *     src/main/resource
 *         | => image / css / js
 *     => ThymeLeaf 중심 : 보조 : JSP
 *     => 전자정부 프레임워크 : Spring 5 => SpringFramework 기반
 *     ---------------------------------------------------
 *     SpringFramework : XML + Annotation
 *     Spring - Boot : Annotation
 *     1. 구동 : Kotlin
 *        @SpringBootApplication => main
 *     2. 메모리 할당
 *        @Component / @Repository / @Service
 *        @Controller / @RestController
 *     3. DI : 객체 주입
 *        @Autowired => @RequiredArgsConstructor
 *                      => 생성자 만들고 => 생성자에서 주입
 *     4. 웹 구동
 *        @GetMapping / @PostMapping / @RequestMapping
 *        => 값을 받는 경우
 *           @RequestParam
 *           @ModelAttribute
 *           @RequestBody => JSON => 객체
 *           @PathVariable
 *            ------------ React
 *                         | MySQL / JPA / PathVariable
 *                         -----------------------------
 *                         JWT 인증
 *     5. MVC 구조 
 *        User ==== Controller ==== Service ==== Mapper ==== DB
 *                                               ------ Repository
 *     6. XML => yml : 들여쓰기
 *               ----------- Spring-Boot 설정 파일
 *               ----------- ci/cd script : deploy.yml
 *               Git Action / Docker / Docker-compose
 *               ------------------------------------
 *               Jenkins : 모니터링
 *     ----------------------------------------------------
 *     7. ORM
 *         = MyBatis
 *            => CRUD / 동적 쿼리
 *         = JPA
 *            => CRUD (SQL , 메소드 규칙)
 *     ----------------------------------------------------
 *     Security
 *       => Session / Cookie  
 *          : 인증 / 인가
 *                    : JWT
 *     WebSocket
 *       => SockJS / Stomp
 *       
 *     FileUpload / FiledownLoad
 *     -----------------------------------------------------
 *     Test : Junit = 단위 테스트
 *     -----------------------------------------------------
 *     기타 : Spring AI / Kafka / Task (Batch)
 *     -----------------------------------------------------
 *     Front-End
 *       = JQuery : Ajax
 *       = VueJS : Pinia
 *       ------------------------
 *       = React : tabStack-Query
 *       = NodeJS : TypeScript
 *       ------------------------ HTML / CSS / JavaScript
 *     
 *     Docker / Docker-Compose
 *     -----------------------
 *     애플리케이션과 실행 환경을 저장 => 필요하게 실행하는 플랫폼
 *     ----------------------- image로 만들어서 저장
 *                             ----------------- 컨테이너
 *     1. 명령어 
 *        docker image -a : 이미지 목록
 *        docker ps -a : 컨테이너 목록
 *        docker run : 실행
 *        docker stop / rm => 컨테이너 제어
 *        docker rmi : 이미지 삭제
 *     => Docker-Compose : 여러개의 컨테이너를 한번에 관리 도구
 *        명렁어 
 *          docker-compose up
 *          docker-compose down
 *     => 실시간 처리
 *        
 *        Git Action
 *        ----------
 *        확인 : JDK / 인증
 *        docker build
 *        docker push
 *        docker-compose pull / up
 *        -------------- PORT 충돌 / 권한 문제 => chmod
 *     => 파이프라인
 *        => Jenkins
 *        => MSA => 서버가 여러개 => 쿠버네티스 : AWS에서 유료
 *                               -------- 우분투에서 연습
 *                               -------- 각 서버마다 자동 IP 생성
 *     => 버전의 문제 : 스크립트가 변ㄱ녕될 수 있다
 *     => JDK => 21
 *     
 *     /list?fno=1
 *     /ltst/1
 *     
 *     @GetMapping("/list/{fno}")
 *     => `/list?${fno}`
 *     public String list(@PathVariable("fno") int fno)
 *     
 *     React / Vue / Jquery => 서버가 없는 경우에 처리가 어렵다
 *     -------------------- View (화면 UI)
 *  
 */

@Data
public class CommonsCommentVO {

	private int no,cno,type,group_id,group_step,group_tab,
				root,depth;
	private String id,name,msg,dbday,sex;
	private Date regdate;
}
