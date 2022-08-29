package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;

public class Encoder {
    private  IEncoder iEncoder;

    public Encoder(@Qualifier("urlEnoder") IEncoder iEncoder){
       // this.iEncoder = new Base64Encoder();
        this.iEncoder =  iEncoder;
    }
    public String encode(String message){
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
