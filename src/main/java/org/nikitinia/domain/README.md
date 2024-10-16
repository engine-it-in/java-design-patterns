# Описание контекста и моделей применения шаблонов проектирования

****
[К описанию проекта](../../../../../../../README.md)
**** 
## Содержание
* [Домен](#домен);
* [Контекст](#контекст);
* [Модели](#модели);

## Домен
* В качестве предметной области, для которой мы разберем применение 
шаблонов проектирования выбран документоооборот; 
* Эта область всем понятна и доступна: 
  * С какими-то документами сталкивался каждый из нас; 
* Из чего документы состоят (атрибуты), как с ними работают (методы), 
как документы используются (интерфейсы) в той или иной ситуации интуитивно 
понятно каждому; 
* Такой контекст выбран сознательно, чтобы не погружать Вас в сложные 
хитросплетения какой-то предметной области. Цель этого курса - 
освоить шаблоны проектирования. С ними будет достаточно сложностей;

## Контекст
* Давайте представим себе, что мы вовлечены в работу с документами: 
  * Что именно? 
  * Какими документами? 
  * На все эти вопросы мы будем отвечать постепенно,
решая конкретную задачу;
* Что-то будет очевидно, что-то мы сформулируем так, чтобы
полно раскрыть конкретный шаблон проектирования;

## Модели
* Модели - это основные объекты, на которых построена работа в контексте:
  * То есть это сами документы;
* Основная модель, которую мы будем использовать - документ;
  * Все атрибуты, которые есть у документа, есть по умолчанию 
у каждого типа документа. Это главный объект;
* Документ сам по себе в документообороте не существует
  * Он является фундаментом для конкретного документа;

### Документ
* **Назначение** -> Объект общего назначения. Каждый документ перед тем, 
как предстать в конкретном виде и с конкретным назначением 
предстает в виде общего документа;
  * Модель документа сознательно содержит разные типы используемых данных, 
  чтобы мы имели возможность, реализуя разные шаблоны проектирования 
  выбирать под себя наиболее подходящие способы работы с тем или иным 
  типом данных;
* **Пояснения** -> Документ содержит дополнительные встроенные структуры, 
которые используются при объяснении работы отдельных шаблонов;
* [Ссылка](model/documents/Document.java)

### Счет
* **Назначение** -> Конкретный документ, 
который отражает фактически произведенную финансовую информацию;
* **Пояснения** -> Финансовый тип документа;
* [Ссылка](model/documents/Invoice.java)

### Счет-Фактура
* **Назначение** -> Конкретный документ, 
который содержит описание объектов и их стоимость. 
Это детализированная форма счета;
* **Пояснения** -> Финансовый тип документа;
* [Ссылка](model/documents/Bill.java)

### Договор
* **Назначение** -> Документ, который содержит 
обязанности и права сторон при заключении сделки друг с другом;
* **Пояснения** -> Финансовый тип документа;
* [Ссылка](model/documents/Agreement.java)

### Диплом
* **Назначение** -> Документ, который описывает модель дипломного проекта, 
который относится к образовательным документам;
* **Пояснения** -> Образовательный тип документа;
* [Ссылка](model/documents/Diploma.java)

### Научная работа
* **Назначение** -> Документ, который описывает научную работу. 
Логическое продолжение диплома;
* **Пояснения** -> Научный тип документа;
* [Ссылка](model/documents/ScientificWork.java)