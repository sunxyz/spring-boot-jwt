package com.sj.commons.log.domain;

import com.sj.commons.data.AbstractAuditorEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ErrorLog
 *
 * @author yangrd
 * @date 2019/06/19
 */
@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "log_err_log")
public class ErrorLog extends AbstractAuditorEntity {

    private Integer code;

    private String mes;

    private String type;

    private String url;

}
