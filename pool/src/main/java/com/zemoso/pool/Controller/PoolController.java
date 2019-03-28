package com.zemoso.pool.Controller;

import com.zemoso.pool.Repository.RequestRepository;
import com.zemoso.pool.domain.Request;
import com.zemoso.pool.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class PoolController {

    @Autowired
    private RequestService requestService;

    @Autowired
    private RequestRepository requestRepository;

    @RequestMapping(method= RequestMethod.POST, value = "/api/request")
    public ResponseEntity<?> createRequest(@RequestBody Request request) {
            requestService.saveRequest(request);

            HttpHeaders responseHeaders = new HttpHeaders();
            URI newPollUri = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(request.getGroupId())
                    .toUri();
            responseHeaders.setLocation(newPollUri);
            return new ResponseEntity<>(null, responseHeaders, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/request/all")
    public ResponseEntity<Iterable<Request>> getAllRequests() {
        Iterable<Request> allPolls = requestRepository.findAll();
        return new ResponseEntity<>(requestRepository.findAll(), HttpStatus.OK);
    }
}
