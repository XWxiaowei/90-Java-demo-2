package hello.service.impl;

import org.springframework.stereotype.Service;

import hello.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    public String getMessage() {
        return "Hello world!!~~";
    }


}
