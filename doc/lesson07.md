# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

## [Материалы занятия](https://drive.google.com/drive/u/0/folders/0B9Ye2auQ_NsFbXFnekNDSmJzS1k) (скачать все патчи можно через Download папки patch) 


## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW6

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFY0phQnBkZFByZ00">Реализация `MailSender`</a>
#### Apply 7_1_HW5_MailSender.patch
- <a href="https://yandex.ru/blog/company/66296">List-Unsubcribe</a>
- <a href="https://aws.amazon.com/ru/ses/">Amazon Simple Email Service</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFT3VocUpKSzZlRTg">Сохранение результатов отправки в DB</a>
#### Apply 7_2_HW6_mail_history.patch
> Добавляем таблицу `mail_hist` через миграцию: после патча просто запускаем `config_templates\sql\lb_apply.bat`
- <a href="http://stackoverflow.com/a/25322753/548473">Resolving Maven circular dependencies</a>
- <a href="http://maven.apache.org/guides/mini/guide-attached-tests.html">Guide to using attached tests</a>

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. <a href="https://drive.google.com/file/d/0B9Ye2auQ_NsFbkNoM01TSno1bzA">Импорт Проектов и Групп</a>
#### 7_3_HW6_ProjectGroupImporter.patch
#### 7_4_HW6_refactor_UserImporter.patch
- Замечание в видео по поводу split: <a href="https://habrahabr.ru/post/326242/">Performance это праздник</a>
<hr/>

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFY2pwemVtYU1WU2M">Стили WSDL. Кастомизация WSDL</a>
#### 7_5_customize_WSDL.patch
- <a href="https://ru.wikipedia.org/wiki/SOAP">SOAP</a>
- <a href="http://www.ibm.com/developerworks/webservices/library/ws-whichwsdl/">Стили WSDL</a>

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 5. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFeV90cGNSU1hqelk">Публикация кастомизированного WSDL. Автогенерация.</a> 
#### 7_6_publish_CustomizedWSDL.patch
- <a href="https://en.wikipedia.org/wiki/Apache_CXF">CXF</a>
   - <a href="https://youtrack.jetbrains.com/issue/IDEA-149473">IDEA bug of CXF integration</a>
   - <a href="http://stackoverflow.com/a/23012746/548473">accessExternalSchema property restriction</a>
   - <a href="http://cxf.apache.org/docs/servlet-transport.html#ServletTransport-UsingtheservlettransportwithoutSpring">Using the servlet transport without Spring</a>
- <a href="http://stackoverflow.com/a/16254037/548473">Metro = JAX-WS RI + WSIT</a> 
   - <a href="https://wsit.java.net/">Web Services Interoperability Technologies (WSIT)</a>

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 6. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFVDJVYmc4T25LQWs">Деплой в Tomcat</a>
#### 7_7_deploy_Tomcat.patch
- <a href="https://www.mkyong.com/tutorials/jax-ws-tutorials/">JAX-WS + Tomcat</a> 
- <a href="https://www.mkyong.com/webservices/jax-ws/deploy-jax-ws-web-services-on-tomcat/">Deploy JAX-WS web services on Tomcat</a>
- <a href="http://ics.upjs.sk/~novotnyr/blog/2068/deploying-jax-ws-services-on-java-7-and-tomcat-7">Deploying JAX-WS Services without web.xml</a>

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 7. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFSW9sbkFpSDZOWk0">Создание клиента почтового сервиса.</a>
#### 7_8_create_client.patch
- <a href="http://stackoverflow.com/questions/5158537/jaxws-how-to-change-the-endpoint-address">Dynamically Change a Web Service Endpoint URL</a>
- <a href="http://stackoverflow.com/a/10601916/548473">Fix thread safe JAX-WS client call</a>
----------------

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 8. TODO: Рефакторинг MailService. HW7
#### 7_9_refactoring.patch

## Домашнее задание
- Расшарить wsdl для всех модей в `\apps\masterjava\config\wsdl`   
- Реализовать в `MailService` два метода:
  - `sendBulkMail` для отправки через `MailSender.sendBulk`
  - `sendIndividualMails` для отправки через `MailServiceExecutor.sendIndividual`  
- Обновить `mailService.wsdl` и протестировать работу сервиса

### Optional
- Сделать в модуле `web` простой интерфейс для выбора пользователей из таблицы и отправки им почты