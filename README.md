# freelec-springboot2-webservice

## 버전 정보
- Gradle: 7.4.1
- Spring-boot: 2.6.4
- Spring-dpendency-management: 1.0.11.RELEASE
- Java: 1.8

## Troubleshooting log
- 아래 에러 발생시 프로젝트 옵션의 `Build tools` 를 `gradle` -> `intellij`로 변경
```shell
Execution failed for task ':test'.
> No tests found for given includes: [com.jojoldu.book.springboot.web.HelloControllerTest.hello가_리턴된다](--tests filter)

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.


```