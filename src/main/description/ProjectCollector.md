# Сборщик проекта

***
[К инструкции](Instruction.md)
***

### Содержание

* [Что такое сборщик?](#что-такое-сборщик);
* [Какие есть?](#какие-есть-сборщики);
* [Gradle](#gradle);
* [Как работает?](#как-работает);
* [Основные компоненты](#основные-компоненты);

## Что такое сборщик?

* Сборка кода проекта - последовательность выполняемых над кодом команд,
  результатом которой является исполняемый файл или набор файлов;
* Подробнее про то, зачем нужна сборка, какая она бывает и от чего
  зависит можно почитать [на сайте JetBrains](https://www.jetbrains.com/ru-ru/teamcity/ci-cd-guide/automated-builds/);

## Какие есть сборщики

* В мире Java есть 3 сборщика, которые развивались эволюционно, на основе потребностей и запросов сообщества
  разработчиков:
    * [Ant](https://habr.com/ru/articles/323204/);
    * [Maven](https://habr.com/ru/articles/309222/);
    * [Gradle](https://habr.com/ru/companies/itq_group/articles/711712/);
* Подробнее про их [сравнение](https://www.baeldung.com/ant-maven-gradle);

## Как работает Gradle?

* Gradle использует [декларативный подход](https://ru.wikipedia.org/wiki/Декларативное_программирование);
    * В файлах gradle можно писать на разных языках и разными способами; 
    * Стандартный - Groovy DSL;
* Вся работа строится на двух абстракциях - **задача** и **плагин**;
    * Плагин:
      * Предоставляет и создает задачи; 
      * Реализует соглашения; 
      * Расширяет объекты;
    * Задачи - действия, которые необходимо выполнить;
* Настройка [gradle](https://docs.gradle.org/current/userguide/installation.html#installing_manually);

