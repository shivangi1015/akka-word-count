package com.knoldus;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

class Caller {
    public static void main(String[] args) {
        final ActorSystem actorSystem = ActorSystem.create("Word-count");
        ActorRef actorRef = actorSystem.actorOf(Props.create(WordCountActor.class), "WordCountActor");
        actorRef.tell("calling", actorRef);
        
        actorSystem.terminate();
    }
}
