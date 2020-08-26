package ThunderDustMiteWeb.src.com.example.web.stock;
//package com.example.web.stock;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;


public class AkkaJavaActor extends AbstractBehavior<AkkaJavaActor.sayHello> {

    public static class sayHello {
        public final String name;

        public sayHello(String name) {
            this.name = name;
        }
    }

}
