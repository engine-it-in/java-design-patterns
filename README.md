# Java-design-patterns

## Что такое шаблоны проектирования?

* Шаблоны проектирования - способ решения типовых проблем, 
возникающих в процессе объектно-ориентированной разработки. 
Есть несколько парадигм разработки, вернее их более 500; 

* Самые популярные и универсальные - процедурная парадигма, объектно-ориентированная парадигма,
функциональная парадигма. Объектно-ориентированная парадигма возникла, как
эволюционный этап развития подходов разработки. На сегодня она самая проработанная и авторитетная;

* Ее распространенность это привилегия и ответсвенность. 
Привилегия - объектно-ориентированный подход позволяет решать сложные задачи более эффективно, чем конкуренты. 
Ответсвенность - необходимо иметь механизмы, которые помогут
решить однотипные и понятные проблемы этого подхода, чтобы предоставлять инженерам возможность 
при разработке идти проверенным путем;

* Проблемы есть в каждой парадигме. Чем парадигма более сложная, тем более сложные 
проблемы она предоставляет своим потребителям. 
Объектно-ориентированная парадигма более сложная и комплексная, 
чем ее предщественники, поэтому шаблоны проектирования являются ответом на то, 
как следует решать проблемы, которые мешают создаваемым системам быть быстрыми, 
эффективными, простыми для развития, гибкими и масштабируемыми;

## Для чего нужны шаблоны проектирования?

* Шаблоны проектирования позволят решить Вам задачи, связанные с управлением
кодом, созданием и структуризацией информационных объектов, 
организацией элементов, разделением ответсвенности между компонентами, 
обеспечить расширяемость и гибкость;

## Описание типов шаблонов

* [Поведенческие шаблоны](src/main/java/org/nikitinia/patterns/behavior/README.md);
* [Структурные шаблоны](src/main/java/org/nikitinia/patterns/structure/README.md);
* [Порождающие шаблоны](src/main/java/org/nikitinia/patterns/creating/README.md);


## Про тестироваине
* Тестирование, так же как код - ответсвенность разработчика; 
* Эта ответсвенность несет много интересного;
* Эту ответсвенность мы будем рассматривать отдельно - [подробнее, про тестирование](src/test/java/org/nikitinia/README.md);

## Структура проекта

### О выбранной предметной области

* Сознательно для этого курса была выбрана единая предметная область,
  для которой мы создали все рассматриваемые шаблоны;
* Подробнее о предметной области написано [тут](/src/main/java/org/nikitinia/domain/README.md);
* Часть примеров надумана, но нам было важно, чтобы на основе примеров,
  у Вас сложилось единое понимание о том, что каждый шаблон может быть применен в конкретной ситуации;

### А что делать Вам?

* Мы рекомендуем на основе материалов и вместе с нами сделать пошагово все задания;
* После этого, переосмысляя информацию, выбрать близкую для себя тематику 
и сделать для нее все шаблоны проектирования;
* То есть 3 шагом переделать все наши примеры на те, которые будут понятны Вам;

* Будет полезно, при возникновении вопросов касательно того или иного шаблона 
посмотреть альтернативную литературу о том, в каком контексте и с помощью каких объектов 
может быть использован тот или иной шаблон;
 
* Ссылки на такой контент мы Вам предоставим;

## Список литературы/проектов для развития

| № | Описание источника                                                                                     | Ссылка                                                                                                               |
|---|--------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------|
| 0 | ***Книга*** -> "Шаблоны проектирования корпоративных приложений"                                       | [Ссылка](https://www.ozon.ru/product/shablony-korporativnyh-prilozheniy-fauler-martin-elektronnaya-kniga-935330339/) |
| 1 | ***Книга-портал*** -> Про шаблоны проектирования                                                       | [Ссылка](https://refactoring.guru)                                                                                   |
| 2 | ***Джавист*** -> Канал на youtube. Разбор и объяснение некоторых шаблонов проектирования               | [Ссылка](https://www.youtube.com/@javistt/videos)                                                                    |
| 3 | ***Alexey Pashchenko*** -> Канал на youtube. Разбор и объяснение некоторых шаблонов проектирования     | [Ссылка](https://www.youtube.com/@alexeypashchenko/videos)                                                           |
| 4 | ***Vladimir Vysokomornyi*** -> Канал на youtube. Разбор и объяснение некоторых шаблонов проектирования | [Ссылка](https://www.youtube.com/@programm4you)                                                                      |
| 5 | ***Vladimir Vysokomornyi*** -> Канал на youtube. Разбор и объяснение некоторых шаблонов проектирования | [Ссылка](https://www.youtube.com/@programm4you)                                                                      |

## Обратная связь
* Если: 
  * Нашли неточность;
  * Есть предложение;
  * Хотите оставить обратную связь;
* in86@inbox.ru - Будем рады письмам от Вас;