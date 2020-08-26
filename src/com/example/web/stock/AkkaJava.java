package ThunderDustMiteWeb.src.com.example.web.stock;
//package com.example.web.stock;

import akka.actor.typed.ActorSystem;
import java.io.IOException;


public class AkkaJava {

    public static void main(String[] args) {
        ActorSystem.create(AkkaJavaActor.create(), "AKKA_Java");
    }

}
