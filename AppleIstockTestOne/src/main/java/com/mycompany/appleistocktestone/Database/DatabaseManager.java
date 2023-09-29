package com.mycompany.appleistocktestone.Database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DatabaseManager {

    private static final String CONNECTION_STRING = "mongodb+srv://dammikaekanayaka1980:ABandara2001@cluster0.sb1vot6.mongodb.net/?retryWrites=true&w=majority";
    private static final String DATABASE_NAME = "Istock";
    private static final String USERS_COLLECTION_NAME = "users";
    private static final String PRODUCTS_COLLECTION_NAME = "products"; // Add the products collection name

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> usersCollection;
    private MongoCollection<Document> productsCollection; // Add a reference to the products collection

    public DatabaseManager() {
        // Initialize the MongoDB connection and collections
        mongoClient = MongoClients.create(CONNECTION_STRING);
        database = mongoClient.getDatabase(DATABASE_NAME);
        usersCollection = database.getCollection(USERS_COLLECTION_NAME);
        productsCollection = database.getCollection(PRODUCTS_COLLECTION_NAME); // Initialize the products collection
    }

    public MongoCollection<Document> getUsersCollection() {
        return usersCollection;
    }

    public MongoCollection<Document> getProductsCollection() {
        return productsCollection;
    }
}

