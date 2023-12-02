package org.nikitinia.patterns.behavior.command.documentbuffer.logic;

import lombok.Getter;
import org.nikitinia.patterns.behavior.command.documentbuffer.action.Command;

import java.util.Stack;

/*
* Кроме копирования мы ведем журнал того, что мы копировали и вставляли
* Для записи истории лучше всего подходит структура стек -> История линейна и мы записываем новое поверх старого
* */
public class CommandHistory {

    /*Сюда будем записывать историю действий*/
    @Getter
    private Stack<Command> historyCommand = new Stack<>();

    /*Положим новую историческую запись*/
    public void push(Command command) {
        historyCommand.push(command);
    }

    /*Если потребуется, то возьмем последнюю положенную запись*/
    public Command pop() {
        return historyCommand.pop();
    }

    /*Проверим, есть ли что-то записанное в истории*/
    public boolean isEmpty() {
        return historyCommand.isEmpty();
    }

}
