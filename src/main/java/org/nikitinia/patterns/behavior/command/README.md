# Команда (Command)
****
* [К описанию поведенческих шаблонов](../README.md)
****

## Тип
* Поведенческий шаблон;

## Назначение
* Задать параметры клиентов для обработки определенных запросов, 
передаваемых в качестве аргументов методов;
* Создание очереди из запросов и их контроль;
* Команда предлагает структуру, в которой отправитель и получатель 
не зависят друг от друга;

## Суть
* Каждая команда, отвечающая за свои действия, 
инкапсулируется в отдельный объект;
* Вызвать действия может только единственный метод в классе, 
который осуществляет управление действиями класса - это и есть 
команда;
* К интерфейсу, который формализует действия нужно привязать 
объекты команды;

## Контекст применения
* Обработка логики, вызываемой из разных частей функционирующего приложения, 
при этом функционирование определяется разным контекстом;

## Применимость
* Команда - звено между разными слоями логики системы; 

## Какой функционал предоставляет
* Инкапсуляция действия;
* Хранение конкретных действий в классах наследниках;
* Делегация клиенту ответсвенности запускать на выполнение команду;
* Команда сама маршрутизирует управление в классы наследники;

## Преимущества и недостатки при использовании
| Преимущества                                       | Недостатки                                                      |
|----------------------------------------------------|-----------------------------------------------------------------|
| Слабое зацепление, сильная связанность объектов    | Необходимость на каждую команду введения дополнительного класса |
| Возможность просто модифицировать поведение команд | Усложнение структуры системы                                    |

## Алгоритм реализации
* Понять совершаемые действия -> (Контекст);
* Выделить для них общие этапы -> Интерфейс 
или Абстрактный класс команды;
* Реализовать конкретные команды, переопределив этапы -> 
Конкретные классы, т.е наследники или переопределяющие интерфейс;
* В каждой конкретной команде должна быть ссылка на объект, 
которому команда делегирует действия -> Конструктор/сеттер;
* Инициаторы команд взаимодействую с ними через объект;

## Изображение
![Схема шаблона](command.jpg)

## Немного от автора о данном шаблоне
* Автор затратил много сил, чтобы разобраться в 
сути данного шаблона. Этот шаблон интуитивно не понятен/однозначен.
Чтобы научиться выделять поведение этого шаблона и к месту 
применять этот паттерн рекомендуется попытаться его воспроизвести 
несколько раз для разного контекста. 
Грань в применении команды размыта и может быть 
реализована разными объектами. Именно поэтому для этого шаблона 
составлено несколько вариантов применения;
* Разбирайтесь в них );

# Формулировка задачи
* [Первый вариант](documentbuffer/README.md)
* [Второй вариант](documentsender/README.md)