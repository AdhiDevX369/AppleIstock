package com.mycompany.appleistocktestone.Sevices;

import com.mycompany.appleistocktestone.Database.DatabaseManager;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

public class ProductService {
    private final MongoCollection<Document> productsCollection;

    public ProductService(DatabaseManager dbManager) {
        this.productsCollection = dbManager.getProductsCollection();
    }

    public ProductService() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void createProduct(String productName, double productPrice, String productCategory, int productQty) {
        // Create a document to store product data
        Document productDocument = new Document("productName", productName)
                .append("productPrice", productPrice)
                .append("productCategory", productCategory)
                .append("productQty", productQty);

        // Insert the document into the collection
        productsCollection.insertOne(productDocument);
    }

    public Document readProduct(String productName) {
        // Query the Products collection in MongoDB to read a product by its name
        return productsCollection.find(Filters.eq("productName", productName)).first();
    }

    public void updateProduct(String productName, double newProductPrice, int newProductQty) {
        // Update the product's price and quantity
        productsCollection.updateOne(
                Filters.eq("productName", productName),
                Updates.combine(
                        Updates.set("productPrice", newProductPrice),
                        Updates.set("productQty", newProductQty)
                )
        );
    }

    public void deleteProduct(String productName) {
        // Delete a product by its name
        productsCollection.deleteOne(Filters.eq("productName", productName));
    }
}
