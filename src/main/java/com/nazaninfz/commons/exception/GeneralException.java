package com.nazaninfz.commons.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class GeneralException extends RuntimeException {

    private final String serviceName;
    private final String serviceNumber;
    private final String details = "";
    private final String localeMessage = "";
    private Integer exceptionNumber = 0;
    private final HttpStatus statusCode;

    public GeneralException(
            String serviceName,
            String serviceNum,
            HttpStatus statusCode,
            String message
    ) {
        super(message);
        this.serviceName = serviceName;
        this.serviceNumber = serviceNum;
        this.statusCode = statusCode;
        this.exceptionNumber = 0;
    }

    public GeneralException(
            String serviceName,
            String serviceNum,
            HttpStatus statusCode,
            String message,
            Throwable e
    ) {
        super(message, e);
        this.serviceName = serviceName;
        this.serviceNumber = serviceNum;
        this.statusCode = statusCode;
        this.exceptionNumber = 0;
    }

    public GeneralException(
            String serviceName,
            String serviceNum,
            HttpStatus statusCode,
            String message,
            Integer exceptionNumber
    ) {
        super(message);
        this.serviceName = serviceName;
        this.serviceNumber = serviceNum;
        this.statusCode = statusCode;
        this.exceptionNumber = exceptionNumber;
    }

    public GeneralException(
            String serviceName,
            String serviceNum,
            HttpStatus statusCode,
            String message,
            Integer exceptionNumber,
            Throwable e
    ) {
        super(message, e);
        this.serviceName = serviceName;
        this.serviceNumber = serviceNum;
        this.statusCode = statusCode;
        this.exceptionNumber = exceptionNumber;
    }
}
