package com.study.apicore.error.exception;

import com.study.apicore.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by minkyukim
 * Created on 2025. 2. 3.
 * Description: 
 **/

@Getter
@RequiredArgsConstructor
public class BusinessException extends RuntimeException {
    private final ErrorCode errorCode;

    @Override
    public String getMessage() {
      return errorCode.getErrorCode() + ": " +errorCode.getErrorMessage();
    }
}
