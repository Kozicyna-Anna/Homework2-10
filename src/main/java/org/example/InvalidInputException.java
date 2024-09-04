package org.example;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {

public InvalidInputException(String message) {
    super(message);
}
public InvalidInputException(String message, Throwable cause) {

}
public InvalidInputException(Throwable cause) {
    super(cause);
}
public InvalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
}
}