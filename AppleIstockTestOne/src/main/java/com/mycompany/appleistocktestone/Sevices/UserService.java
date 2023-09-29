package com.mycompany.appleistocktestone.Sevices;

import com.mycompany.appleistocktestone.Database.DatabaseManager;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class UserService {

    private final MongoCollection<Document> usersCollection;
    private String userPosition; // Store the user's position

    public UserService(DatabaseManager dbManager) {
        this.usersCollection = dbManager.getUsersCollection();
    }

    public UserService() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean registerUser(String fullName, String username, String password, String position) {
        if (usersCollection.countDocuments(Filters.eq("username", username)) > 0) {
            return false; // Username already exists
        }

        Document userDocument = new Document("fullName", fullName)
                .append("username", username)
                .append("password", password)
                .append("position", position);

        usersCollection.insertOne(userDocument);

        return true; // Registration successful
    }

    public Document loginUser(String username, String password) {
        Document user = usersCollection.find(Filters.and(
                Filters.eq("username", username),
                Filters.eq("password", password)
        )).first();

        if (user != null) {
            // User found, update the userPosition
            userPosition = user.getString("position");
        }

        return user;
    }

    public boolean isUserManager() {
        return "Manager".equals(userPosition);
    }
}
