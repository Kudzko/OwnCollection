package by.epam.javawebtraining.kudzko.task02.classes.exceptions;

public class Task2CollectionException extends Exception {
    public Task2CollectionException() {
        super();
    }

    public Task2CollectionException(String message) {
        super(message);
    }

    public Task2CollectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public Task2CollectionException(Throwable cause) {
        super(cause);
    }

    protected Task2CollectionException(String message, Throwable cause, boolean
            enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
