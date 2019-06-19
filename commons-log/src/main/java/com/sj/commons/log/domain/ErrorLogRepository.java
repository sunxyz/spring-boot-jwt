package com.sj.commons.log.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ErrorLogRepository
 *
 * @author yangrd
 * @date 2019/06/19
 */
public interface ErrorLogRepository extends JpaRepository<ErrorLog,Long> {
}
