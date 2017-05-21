# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

## [Материалы занятия](https://drive.google.com/drive/u/0/folders/0B9Ye2auQ_NsFd1FnME50bEt6RDA) 

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 0. [Авторизация в контейнере Tomcat](https://drive.google.com/file/d/0B9Ye2auQ_NsFcU1FU3FTQ25NNzA)
#### Apply 11_0_tomcat_auth.patch

- [Realm Configuration HOW-TO](http://tomcat.apache.org/tomcat-8.0-doc/realm-howto.html)
- [Setup your own Tomcat security realm](http://www.christianschenk.org/blog/setup-your-own-tomcat-security-realm/)

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW10
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. [Отправка вложений по JAX-RS](https://drive.google.com/open?id=0B9Ye2auQ_NsFT3VmNXR2djRqM1E)
#### Apply 11_1_HW10_jersey_attach.patch
### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. [Отправка почты с вложениями по JMS](https://drive.google.com/open?id=0B9Ye2auQ_NsFdEZhVll2UFdCY0U)

- [Недостатки ObjectMessage (или недостатки сериализации Java)]( http://jmesnil.net/weblog/2012/07/27/on-jms-objectmessage-and-its-pitfalls)

#### Apply 11_2_HW10_JMS_attach.patch
---------------------------------------
#### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png)  [Николай Алименков - Нужен ли нам JMS в мире современных Java-технологий?](http://bekeriya.com/watch?v=RVwXdCfzJZA)

## Рефакторинг. Эксепшены в Java 8 лямбда
#### Apply 11_3_HW10_JMS_attach_fix
> Отправку по JMS листа аттачей
- [Pair (tuple) in Java](http://stackoverflow.com/questions/521171/a-java-collection-of-value-pairs-tuples) 

#### Apply 11_4_refactoring.patch
- [Java 8 Lambda with exception](http://stackoverflow.com/questions/18198176/java-8-lambda-function-that-throws-exception)
- [What's Wrong in Java 8](https://dzone.com/articles/whats-wrong-java-8-part-iv)
- [Durian](https://github.com/diffplug/durian) ( [Дуриан](https://ru.wikipedia.org/wiki/Дуриан) )

## [Concurrent and distributed applications toolkit AKKA](http://akka.io/)
> #### Внимание! Перед накаткой патчеа создайте в `services` каталог `akka-remote` (`services/akka-remote`) иначе файлы придется руками сюда перетаскивать.

#### Apply 11_5_akka.patch

- [Docs](http://akka.io/docs/)
- [Remoting](http://doc.akka.io/docs/akka/current/scala/remoting.html)
   - [Remoting Sample](http://doc.akka.io/docs/akka/current/java/remoting.html#Remoting_Sample)
   - [Tutorials](http://akka.io/downloads/)
- [Видео: Akka и его использование в Яндексе](http://2014.jpoint.ru/talks/07/)

#### Apply 11_6_akka_typed.patch

   - [Typed Actors](http://doc.akka.io/docs/akka/current/java/typed-actors.html)
     - [Spring Asynchronous Methods](https://spring.io/guides/gs/async-method)
     - [Spring Async support](https://spring.io/blog/2012/05/07/spring-mvc-3-2-preview-introducing-servlet-3-async-support)
     - [Asynchronous with JAX-RS](http://allegro.tech/2014/10/async-rest.html)
   - [Serialization](http://doc.akka.io/docs/akka/current/scala/serialization.html)
   - [Currying vs Partial application](http://stackoverflow.com/a/23438430/548473)
   - [Scala dependency injection (di)](http://jonasboner.com/real-world-scala-dependency-injection-di)

#### Apply 11_7_akka_actor.patch
   - [Actors](http://doc.akka.io/docs/akka/current/java/actors.html)

## Асинхронные сервлеты 3.0
- [Tomcat 7 Async Processing](http://stackoverflow.com/questions/7287244/tomcat-7-async-processing)
- [Async in Servlet 3.0 vs NIO in Servlet 3.1](http://stackoverflow.com/questions/39802643/java-async-in-servlet-3-0-vs-nio-in-servlet-3-1)
- [AsyncContext.start() in Servlet 3.0](http://stackoverflow.com/questions/10073392/whats-the-purpose-of-asynccontext-start-in-servlet-3-0)

## Домашнее задание
-  Сделать асинхронное ожидание и вывод результатов отправки почты пользователю в сервлетах:
   - `AkkaTypedSendServlet` с выполнением в Tomcat `ThreadPoolExecutor` 
   - `AkkaActorSendServlet` с выполнением в собственном `ExecutorService`  

## Выбор языка программирования
- [Когда появится следующий большой язык программирования](https://habrahabr.ru/company/wrike/blog/323550)
- [Как я нашел лучший в мире язык программирования](https://habrahabr.ru/post/260149/)