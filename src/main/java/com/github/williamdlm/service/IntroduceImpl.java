package com.github.williamdlm.service;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.github.williamdlm.service.Introduce")
public class IntroduceImpl implements Introduce {
    @Override
    public String sayName(String name) {
        return "My name is " + name;
    }
}
