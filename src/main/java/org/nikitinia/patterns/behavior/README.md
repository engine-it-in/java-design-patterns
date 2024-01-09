# Поведенческие шаблоны

* [Команда](/src/main/java/org/nikitinia/patterns/behavior/command/README.md)
* [Итератор](/src/main/java/org/nikitinia/patterns/behavior/iterator/README.md)
* [Посредник](/src/main/java/org/nikitinia/patterns/behavior/mediator/README.md)
* [Снимок](/src/main/java/org/nikitinia/patterns/behavior/memento/README.md)
* [Наблюдатель](/src/main/java/org/nikitinia/patterns/behavior/observer/README.md)
* [Состояние](/src/main/java/org/nikitinia/patterns/behavior/state/README.md)
* [Стратегия](/src/main/java/org/nikitinia/patterns/behavior/strategy/README.md)
* [Цепочка обязанностей](/src/main/java/org/nikitinia/patterns/behavior/chainofresponsobility/README.md)
* [Шаблонный метод](/src/main/java/org/nikitinia/patterns/behavior/templatemethod/README.md)
* [Посетитель](/src/main/java/org/nikitinia/patterns/behavior/visitor/README.md)
* [...](...)

## Назначение

* Слова

## Решаемые задачи

* Слова

## Типология

* Слова

## Структура папок

## Папка -> action
* В этой папке располагаются компоненты, которые реализуют основные действия поведенческих шаблонов;
* В ней располагается логика взаимодействия структурных элементов шаблонов проектирования;
* Можно сказать, что тут находятся функции, предоставляемые для выполнения шаблона своего назначения;

## Папка -> actor
* В этой папке располагаются компоненты, которые представляют собой основных акторов, 
то есть структурных компонентов, задействованных в выполнении механики шаблонов проектирования;

## Папка -> logic
* В этой папке располагаются компоненты, которые выполняют условия поставленной задачи;
* Эти компоненты не относятся к работе шаблонов, они реализуют конкретное решение;
* Как правило это файл **Program** с точкой входа в программу в виде **main**, 
но если по логике шаблона требуется дополнительный логический компонент, то он так же будет располагаться в этой папке;

## Папка -> exception
*  Здесь располагаются исключения, созданные для выполнения рабочей логики шаблонов проектирования;

## Папка -> dictionary
*  Здесь располагаются справочники, требуемые по логике задачи, для каждого конкретного шаблона;

## Папка -> util
*  Здесь располагаются константы, генераторы данных, используемых при решении задач;0