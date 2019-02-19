package com.cg.allyworld.chatreceiver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.allyworld.chatreceiver.entity.ChatWebsite;

@Repository
public interface ReceiverRepository extends MongoRepository<ChatWebsite, Integer>{

}
