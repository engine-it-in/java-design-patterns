# Используемые компоненты

***
[К инструкции](Instruction.md)
***

## Основные компоненты, библиотеки, зависимости;
* [Lombok](#lombok)
* [Mockito](#mockito)
* [JUnit](#junit)
* [SL4J](#sl4j)

### Lombok
* [Lombok](https://github.com/engine-it-in/different-level-task/blob/main/common/lombok/README.md) ->
    * Что это?
        * Библиотека, которая генерирует типовой код;
        * Основана на использовании аннотаций, которые могут применяться к классам или методам;
        * Каждая аннотация генерирует какой-то код;
    * Как это используется?
        * Снижает количество типового кода за счет его генерации на стадии предкомпиляции;
    * Актуальность;
        * Востребованный, развивающийся инструмент, который обладает
          определенными [нюансами](https://habr.com/ru/companies/haulmont/articles/564682/) использования;
    * Ссылки на описание добавляемой в
      проект [зависимости](https://mvnrepository.com/artifact/org.projectlombok/lombok);
### Mockito
* [Mockito](https://github.com/engine-it-in/different-level-task/blob/main/common/ut/README.md) ->
    * Что это?
        * Библиотека используемая для создания объектов-заглушек;
    * Как это используется?
        * Заглушки используются для моделирования поведения объектов;
        * Заглушки бывают разных типов:
            * Mock - объект, которому полностью задается ожидаемое поведение;
            * MockBean - это объект, которому частично задается требуемое поведение;
            * Spy - это обертка над реальным бином, которая может
              отслеживать кол-во вызовов методов и задавать поведение
              отдельно взятым методам;
    * Актуальность:
        * Актуальный востребованный инструмент,
          который помогает моделировать и проверять состояние тестируемого объекта;
        * Mockito предоставляет широкий инструментарий по проверке разных
          типов [значений](https://www.baeldung.com/mockito-series);
    * Ссылки на описание добавляемой в
      проект [зависимости](https://mvnrepository.com/artifact/org.mockito/mockito-core);
### JUnit
* [JUNIT](https://github.com/engine-it-in/different-level-task/blob/main/common/ut/README.md) ->
    * Что это?
        * Библиотека-платформа для написания тестов;
        * Дает возможность тестировать все JVM технологии;
        * Как это используется?
            * Проверка состояния объекта, которое задается с помощью входных параметров;
            * Есть возможность совместного использования Mockito и JUnit;
        * Актуальность;
            * Самый актуальный и овстребованный инструмент для проведения Юнит тестов;
        * Ссылки на описание добавляемой в проект [зависимости](https://mvnrepository.com/artifact/junit/junit);
### SL4J
* [SL4J](https://github.com/engine-it-in/different-level-task/blob/main/first%20level/logging/README.md) ->
    * Что это?
        * Один из популярных фасадов
          над [используемыми библиотеками логирования](https://github.com/engine-it-in/different-level-task/blob/main/first%20level/logging/README.md);
    * Как это используется?
        * Запись логов в консоль, файл, базу данных;
    * Актуальность;
        * Актуальный, развивающийся инструмент, который предполагает
          легкую [настройку](https://stackoverflow.com/questions/14544991/how-to-configure-slf4j-simple);
    * Ссылки на описание добавляемой в проект [зависимости](https://mvnrepository.com/artifact/org.slf4j/slf4j-api); 