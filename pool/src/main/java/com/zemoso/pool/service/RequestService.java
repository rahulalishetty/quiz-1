package com.zemoso.pool.service;

import com.zemoso.pool.Repository.RequestRepository;
import com.zemoso.pool.domain.Request;
import org.springframework.beans.factory.annotation.Autowired;

public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public void saveRequest(Request request){
        requestRepository.save(request);
    }
}
