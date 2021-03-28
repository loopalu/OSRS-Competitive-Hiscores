package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryService {

    @Autowired RestService restService;

    public User getUser(String userName) {
        String metaData = restService.getUserMetaData(userName);
        return new User(metaData, userName);
    }
}
