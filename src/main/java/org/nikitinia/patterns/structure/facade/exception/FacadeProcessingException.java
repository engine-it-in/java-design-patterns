package org.nikitinia.patterns.structure.facade.exception;

/**
 * Что -> Класс, реализующий часть обработки - Подготовку мобильных документов с
произвольно определяемым типом мобильной операционной системы;
 * Для чего -> Локализовать обработку подготовку мобильных документов в отдельном классе;
 * Реализация -> Класс с методом создания списка документов с произвольным типом мобильной операционной системы;
 * Ценность -> Локализация отдельной части бизнес логики, требуемой от обработки;
 */
public class FacadeProcessingException extends RuntimeException{
    public FacadeProcessingException() {
        super("Some Exception when processing facade");
    }
}
