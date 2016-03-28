package io.adorable.utils

import org.springframework.http.HttpStatus

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestClientException;

public class MyResponseErrorHandler implements ResponseErrorHandler {
    private static final Logger log = LoggerFactory.getLogger(MyResponseErrorHandler.class);

    private MappingJackson2HttpMessageConverter messageConverter;

    public MyResponseErrorHandler(MappingJackson2HttpMessageConverter messageConverter) {
        this.messageConverter = messageConverter;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
//        CustomError error = (CustomError) messageConverter.read(CustomError.class, response);

//        log.error("Response error: {} {}", error.getResponseCode(), response.getStatusText());

//        throw new RestClientException(error.getResponseCode());
    }

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {

        HttpStatus.Series series = response.getStatusCode().series();
        return (HttpStatus.Series.CLIENT_ERROR.equals(series)
                || HttpStatus.Series.SERVER_ERROR.equals(series));

    }
}
