package by.epamtc.task_1.task10.exception;

public class SectionException extends Exception {
    public SectionException (String message){
        super(message);
    }
    public SectionException() {
        super();
    }

    public SectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public SectionException(Throwable cause) {
        super(cause);
    }
}
