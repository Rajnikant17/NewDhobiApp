package com.dhobi.backend.Repository;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//@Configuration
public class MongoConfiguration
{

        //extends AbstractMongoConfiguration {

  /*  @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient("localhost", 27017);
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.dhobi.backend";
    } */
}
