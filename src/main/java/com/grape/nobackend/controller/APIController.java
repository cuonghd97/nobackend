package com.grape.nobackend.controller;

import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import remote.org.openapitools.client.api.PetApi;
import remote.org.openapitools.client.model.Pet;

import javax.validation.Valid;

public class APIController implements PetApi {
    @Override
    public ResponseEntity<Void> addPet(
            @Parameter(name = "body", description = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody Pet body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
