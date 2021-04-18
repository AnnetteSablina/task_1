package by.epamtc.task_1.task2.exception;
import java.lang.Exception;

public class MonthException extends Exception {
    public MonthException(String message){
       super(message);
   }
    public MonthException() {
        super();
    }

    public MonthException(String message, Throwable cause) {
        super(message, cause);
    }

    public MonthException(Throwable cause) {
        super(cause);
    }

}
