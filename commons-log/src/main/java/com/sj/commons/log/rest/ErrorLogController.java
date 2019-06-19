package com.sj.commons.log.rest;

import com.sj.commons.log.domain.ErrorLog;
import com.sj.commons.log.domain.ErrorLogRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 *  ErrorLogController
 *
 * @author yangrd
 * @date 2019/06/19
 */
@AllArgsConstructor

@RestController
@RequestMapping("/log/error-log")
public class ErrorLogController {

    private ErrorLogRepository repository;

    @PostMapping
    public ErrorLog save(@RequestBody ErrorLog errorLog){
        return repository.save(errorLog);
    }

    @GetMapping
    public Page<ErrorLog> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
}
