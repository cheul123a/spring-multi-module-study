package com.study.apicore.error;

import org.springframework.http.HttpStatus;

/**
 * Created by minkyukim
 * Created on 2025. 2. 3.
 * Description:
 **/

public interface ErrorCode {
    String getErrorCode();
    String getErrorMessage();
    HttpStatus getHttpStatus();
}
