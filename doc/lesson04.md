# Онлайн проекта  <a href="https://github.com/JavaWebinar/masterjava">Masterjava</a>.

## [Материалы занятия (скачать все патчи можно через Download папки patch)](https://drive.google.com/drive/u/0/folders/0B9Ye2auQ_NsFVDNRNHpGU2NmcEk) 

## ![hw](https://cloud.githubusercontent.com/assets/13649199/13672719/09593080-e6e7-11e5-81d1-5cb629c438ca.png) Разбор домашнего задания HW3

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 1. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFOFFNYzB6VGdma2c">Структура многомодульного проекта</a>
#### 4_1_HW3_pom_structure.patch
> Вместо включения всех модулей в главный аггрегатор, сделал еще 2 аггрегатных модуля 2го уровня: `web` и `services` 

### ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 2. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFMHNBcVZ3eHlqblk">Реализация модуля export: Thymeleaf и Upload</a>
#### 4_2_HW3_thymeleaf_upload.patch
#### 4_3_HW3_upload_servlet3.patch

- <a href="http://www.thymeleaf.org/">Thymeleaf</a>:  natural templates
   - <a href="http://www.thymeleaf.org/doc/articles/thymeleaf3migration.html">Thymeleaf 3 migration guide</a>
   - <a href="http://www.thymeleaf.org/doc/articles/layouts.html">th:include и th:replace</a>
   - <a href="http://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#conditional-expressions">Tutorial</a>
   - <a href="http://www.thymeleaf.org/doc/articles/standardurlsyntax.html">URL Syntax</a>
   - <a href="http://www.concretepage.com/thymeleaf/java-thymeleaf-example-getting-started-with-thymeleaf">Java Thymeleaf Example</a>

----------------
## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 3. [Maven. Поиск и разрешение конфликтов зависимостей](https://drive.google.com/file/d/0B9Ye2auQ_NsFbFFpWWFzRWE3ekU)
- Maven options: -pl export -am install, -h, -X
- <a href="https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html">Maven transitive dependencies</a>
- <a href="https://maven.apache.org/components/plugins/maven-project-info-reports-plugin/">Project Info Reports Plugin</a>
- <a href="http://stackoverflow.com/questions/28098566/maven-site-warning-the-repository-url-https-maven-repository-dev-java-net-no/40040093#40040093">Disable blacklisted repository warnings</a>
```
mvn dependency:tree
mvn project-info-reports:dependencies
```
#### 4_4_dependencies.patch

- <a href="https://habrahabr.ru/company/jugru/blog/191246/">Разрешение конфликтов в транзитивных зависимостях</a>
- <a href="https://ru.wikipedia.org/wiki/Dependency_hell">Dependency hell</a>
```
mvn project-info-reports:dependency-convergence
```
#### 4_5_fix_convergence.patch
#### 4_6_enforcer.patch
- <a href="http://maven.apache.org/enforcer/maven-enforcer-plugin/">Maven Enforcer Plugin</a>
```
mvn clean install
mvn -DincludeScope=runtime dependency:copy-dependencies
java -jar jar-hell.jar . 
```
- <a href="https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/javaway/jar-hell.zip">jar-hell.zip</a>
- <a href="http://jhades.github.io/">jHades</a>
```
mvn dependency:analyze
```
- <a href="https://maven.apache.org/plugins/maven-dependency-plugin/analyze-mojo.html">Analyze used and declared; used and undeclared; unused and declared</a>

## ![video](https://cloud.githubusercontent.com/assets/13649199/13672715/06dbc6ce-e6e7-11e5-81a9-04fbddb9e488.png) 4. <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFSTR0cTl4NjE1OEE">Подключаем логирование с общими настройкам</a>
#### 4_7_logging.patch
> - Добавил в корень проекта `config_templates` с копией конфигурации.
> - Перенес подключение `logback-test.xml` из `parent-web` в `parent` (он используется в JUnit тестах, которые могут быть в любом модуле)


- <a href="http://www.slf4j.org/legacy.html">Добавление зависимостей логирования</a>
- <a href="https://www.mkyong.com/logging/logback-xml-example">logback.xml Example</a>
- Справочник:
  - <a href="https://drive.google.com/open?id=0B9Ye2auQ_NsFaTdYUnpLNFFUeXM">Topjava: логирование.</a>
  - <a href="https://www.youtube.com/watch?v=j-i3NQiKbcc">Владимир Красильщик: Что надо знать о логировании прагматичному Java‑программисту</a>  
  - <a href="http://habrahabr.ru/post/113145/">Java Logging: история кошмара</a>
  - <a href="http://skipy.ru/useful/logging.html">Ведение лога приложения</a>
  - <a href="http://logging.apache.org/log4j/2.x/index.html">Log4j</a>, <a href="http://logback.qos.ch/">Logback</a>
