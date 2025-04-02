package jpaProject.backend.global.error.exception;

import java.util.ArrayList;
import java.util.List;
import jpaProject.backend.global.error.ErrorCode;
import jpaProject.backend.global.error.ErrorResponse;
import jpaProject.backend.global.error.ErrorResponse.FieldError;
import lombok.Getter;


@Getter
public class BusinessException extends RuntimeException{

    private ErrorCode errorCode;
    private List<FieldError> errors = new ArrayList<>();

    public BusinessException(String message, ErrorCode errorCode){
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode, List<ErrorResponse.FieldError> errors){
        super(errorCode.getMessage());
        this.errors = errors;
        this.errorCode = errorCode;
    }
}
