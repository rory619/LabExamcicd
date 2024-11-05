package ie.atu.labexamination;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;
@ControllerAdvice
@RestControllerAdvice
public class ExeptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponceEntity<List<ErrorDetails>>handleValidationExceptions(MethodArgumentNotValidException ex){
        List<ErrorDetails> error = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach(error ->{
            String fieldName = ((FieldError)error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.add(new ErrorDetails(fieldName, errorMessage));
        });
        return new ResponceEntity<>(errors,HTTPStatus.BAD_REQUEST);
    }
}
