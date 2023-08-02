package kroely.karinbackend.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
public class APIExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ExceptionHandler.class})
    public ResponseEntity<Object> handleAPIRequestException(ExceptionHandler e) {

        if (e.getStatus() != null) {
            APIException exception = new APIException(
                    e.getMessage(),
                    e.status,
                    ZonedDateTime.now(ZoneId.of("Z"))
            );
            return new ResponseEntity<>(exception, e.status);
        } else {
            APIException exception = new APIException(
                    e.getMessage(),
                    HttpStatus.BAD_REQUEST,
                    ZonedDateTime.now(ZoneId.of("Z"))
            );
            return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

        }
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Map<String, List<String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }
}