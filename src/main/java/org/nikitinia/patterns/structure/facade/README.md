# Фасад (Facade)
****
* [К описанию структурных шаблонов](../README.md)
****

## Тип
* Структурный шаблон;

## Назначение
* Предоставление простого интерфейса с нужными параметрами к 
сложной системе, классам, библиотекам;

## Суть
* Использование этого шаблона предполагает инкапсуляцию элементов 
и логики взаимодействия, нужных для Вас внешних зависимостей в отдельный компонент 
или набор связанных и прозрачно взаимодействующих компонент;
* Фасад должен предоставлять потребителю только то, что ему нужно, а остальное
скрывать;

## Контекст применения
* В контексте, когда требуется взаимодействовать со сложными, комплексными, 
многоуровневыми системами, состоящими из множества классов и требуется выполнять 
их настройку для взаимодействия;

## Применимость
* Нужно предоставить простой и урезанный функционал к сложной системе;
* Когда требуется разложить систему на слои;

## Какой функционал предоставляет
* Инкапсуляция запутанного взаимодействия в едином месте;

## Преимущества и недостатки при использовании
| Преимущества                         | Недостатки                                                                                                       |
|--------------------------------------|------------------------------------------------------------------------------------------------------------------|
| Изолирует клиентов от сложной логики | Потенциально фасад может превратиться в [божественный объект](https://ru.wikipedia.org/wiki/Божественный_объект) |

## Алгоритм реализации
* Выделите используемые методы для работы со сложной подсистемой в интерфейс;
* Создайте класс, реализующий интерфейс. Он должен переадресовывать вызовы
  к нужным объектам. Фасад отвечает за корректную инициализацию подсистем;
* Вся работа должна быть локализована в фасаде;
* Если ответсвенность фасада раздувается,
  то необходимо создать набор специализированных фасадов;

## Изображение
![Схема шаблона](facade.jpg)

# Формулировка задачи
* В этой задаче мы будем работать с новым типом объекта - Мобильный документ.
Это документ у которого в качестве атрибута определена мобильная операционная система, 
к которой он должен принадлежать. В задаче необходимо определить получателей мобильных документов.
Это пользователи с фамилией, именем, отчеством и типом используемым ими мобильных документов.
Так же в задаче следует определить маршрут - это список, который состоит из коэффициента 
(уникальное, произвольно определяемое значение в диапазоне от 1 до 10) и получателя мобильного документа.
В итоге все созданные мобильные документы должны быть разосланы получателям. Каждый пользователь получает 
все мобильные документа соответствующего его типу мобильной операционной системе. Отправка -
запись сообщения в лог с указанием номера мобильного документа, получатель мобильного документа и коэффициента отправки.
Используемые мобильные операционные системы - ANDROID, IOS, WINDOWS. 
При определении мобильного документа, его конкретный тип должен задаваться произвольно.