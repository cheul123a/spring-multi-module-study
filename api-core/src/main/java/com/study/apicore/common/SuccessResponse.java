package com.study.apicore.common;

/**
 * Created by minkyukim
 * Created on 2025. 2. 3.
 * Description: 성공 응답 기본 객체
 **/

public record SuccessResponse<T>(
        String resultCode,
        T data
) {
    public SuccessResponse {
        if(resultCode == null) resultCode = "0000";
    }

    public SuccessResponse() {
        this(null, null);
    }

    public static <T> SuccessResponse<T> from(T data) {
        return new SuccessResponse<>(null, data);
    }

}