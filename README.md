# Spring Scheduler Sample

Run this command :

`mvn clean spring-boot:run`

Take a look in console :

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-16 06:30:28.132  INFO 60704 --- [           main] c.h.s.SpringSchedulerExampleApplication  : Starting SpringSchedulerExampleApplication on Hendis-MacBook-Pro-2.local with PID 60704 (/Users/hendisantika/Documents/IdeaProjects/spring-scheduler-example/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/spring-scheduler-example)
2018-10-16 06:30:28.136  INFO 60704 --- [           main] c.h.s.SpringSchedulerExampleApplication  : No active profile set, falling back to default profiles: default
2018-10-16 06:30:28.295  INFO 60704 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@27ceec96: startup date [Tue Oct 16 06:30:28 WIB 2018]; root of context hierarchy
2018-10-16 06:30:29.303  INFO 60704 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-10-16 06:30:29.329  INFO 60704 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-10-16 06:30:29.330  INFO 60704 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.34
2018-10-16 06:30:29.340  INFO 60704 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/hendisantika/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-10-16 06:30:29.415  INFO 60704 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-10-16 06:30:29.415  INFO 60704 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1124 ms
2018-10-16 06:30:29.472  INFO 60704 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-10-16 06:30:29.477  INFO 60704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-10-16 06:30:29.477  INFO 60704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-10-16 06:30:29.477  INFO 60704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-10-16 06:30:29.477  INFO 60704 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-10-16 06:30:29.590  INFO 60704 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-16 06:30:29.751  INFO 60704 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@27ceec96: startup date [Tue Oct 16 06:30:28 WIB 2018]; root of context hierarchy
2018-10-16 06:30:29.832  INFO 60704 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-10-16 06:30:29.833  INFO 60704 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-10-16 06:30:29.858  INFO 60704 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-16 06:30:29.858  INFO 60704 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-16 06:30:29.992  INFO 60704 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-16 06:30:30.007  INFO 60704 --- [           main] s.a.ScheduledAnnotationBeanPostProcessor : No TaskScheduler/ScheduledExecutorService bean found for scheduled processing
2018-10-16 06:30:30.053  INFO 60704 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-10-16 06:30:30.058  INFO 60704 --- [           main] c.h.s.SpringSchedulerExampleApplication  : Started SpringSchedulerExampleApplication in 2.364 seconds (JVM running for 6.13)
2018-10-16 06:30:33.019  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:33 WIB 2018
2018-10-16 06:30:35.022  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:35 WIB 2018
2018-10-16 06:30:37.026  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:37 WIB 2018
2018-10-16 06:30:39.028  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:39 WIB 2018
2018-10-16 06:30:41.031  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:41 WIB 2018
2018-10-16 06:30:43.035  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:43 WIB 2018
2018-10-16 06:30:45.039  INFO 60704 --- [pool-1-thread-1] c.h.s.SpringSchedulerExampleApplication  : Running the @Scheduled task...Tue Oct 16 06:30:45 WIB 2018
```

Schedule task run every 2 seconds