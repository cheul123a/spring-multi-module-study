package com.study.apicore.common;

import com.study.apicore.error.ErrorCode;

/**
 * Created by minkyukim
 * Created on 2025. 2. 3.
 * Description:
 **/

public record ErrorResponse(
    String errorCode,
    String errorMessage
) {

    public static ErrorResponse fromErrorCode(ErrorCode errorCode) {
        return new ErrorResponse(errorCode.getErrorCode(), errorCode.getErrorMessage());
    }
}
