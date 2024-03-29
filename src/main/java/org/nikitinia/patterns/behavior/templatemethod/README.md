# Шаблонный метод (Template Method)
* [К описанию проекта](https://github.com/engine-it-in/java-design-patterns)
## Тип
* Поведенческий шаблон;
## Назначение
* Определяет алгоритм
* Делегирует ответственность за конкретные действия на ответсвенные за них классы;
## Суть
* Шаблон задает общую структуру поведения;
* Отдельные ответсвенности делегируются на конкретные классы;
## Контекст применения
* Используется в ситуации, когда нам надо централизовать основную логику
взаимодействия с централизованными ресурсами в нашей программе, 
при этом в конкретных реализующих классах могут быть отклонения от единообразия;
## Применимость
* В ситуация, когда классы наследники используют или переопределяют 
базовый функционал могут быть расширены, то есть наследники делают одно и тоже,
но с незначительными  отличиями;
## Какой функционал предоставляет
* Использование единого алгоритма с возможностью расширения отдельных шагов
 этого алгоритма в конкретных классах реализации функционала;
## Преимущества и недостатки при использовании
| Преимущества                                         | Недостатки                            |
|------------------------------------------------------|---------------------------------------|
| Выделяет переиспользуемые функции в общие компоненты | Жетское ограничение алгоритма         |
|                                                      | Сложная поддержка разрастаемой логики |        
## Алгоритм реализации
* Выделение общих, неизменных стаий алгоритма и стадий, которые могут быть 
подвержены изменениям;
* Создание абстрактного базового класа, в котором будет реализован финальный метод
вызова последовательности основных шагов алгоритма, которые могут быть представлены 
в виде методов;
* В базовый класс надо добавить методы для для всех шагов алгоритмов, реализуемых 
в конкретных классах;
* Создайтк конкретные классы, реаизующие логику алгоритмов;
# Формулировка задачи
* Программа должна обрабатывать документы разных типов - Договор, Счет фактура и Счет.
Документы должны быть созданы в следующем состоянии -> 
Договор - номер 1.0, статус "Черновик",
Счет фактура - номер 3.0, статус "Черновик",
Счет - номер 2.0, статус "Черновик",
Документы должны быть добавлены в один реестр. В реестре документы добавляются по номеру. 
В качестве подписи в каждом документе должен быт установлен его тип. 
После добавления в реестр, в консоль нужно распечатать номер документа, подпись документа и его статус.
Для договора номер и статус не изменяются, для счета номер увеличивается на 10, статус меняется на "Подписано",
для счет фактуры номер увеливается в 10, статус меняется на "На подписи";