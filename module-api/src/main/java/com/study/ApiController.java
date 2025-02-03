package com.study;

import com.study.apicore.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minkyukim
 * Created on 2025. 2. 3.
 * Description:
 **/

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping("/test")
    public ResponseEntity<SuccessResponse<String>> testController() {
        apiService.test();
        return ResponseEntity.ok(SuccessResponse.from("test success"));
    }
}
