package com.github.williamdlm.service;

import jakarta.jws.WebService;

@WebService
public interface Introduce {
    String sayName(String name);
}
