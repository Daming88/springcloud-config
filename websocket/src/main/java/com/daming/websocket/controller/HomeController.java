package com.daming.websocket.controller;

import com.daming.websocket.util.MyWebSocket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/broadcast")
    public void broadcast(){
        MyWebSocket.broadcast();
    }
}
