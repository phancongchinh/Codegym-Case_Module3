package com.codegym.dao.product;

import com.codegym.dao.IDBConnection;
import com.codegym.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {

    private static final Connection CONNECTION = IDBConnection.getConnection();

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = CONNECTION.prepareStatement("SELECT * FROM product");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                int categoryId = resultSet.getInt("category_id");
                String brand = resultSet.getString("brand");
                int vendorId = resultSet.getInt("vendor_id");
                String SKU = resultSet.getString("SKU");
                double price = Double.parseDouble(resultSet.getString("price"));
                int discountId = resultSet.getInt("discount_id");
                LocalDate manufacturingDate = LocalDate.parse(resultSet.getString("manufacturing_date"));
                long expirationTime = resultSet.getLong("expiration_time");
                LocalDate createdAt = LocalDate.parse(resultSet.getString("created_at"));
                LocalDate lastModifiedAt = LocalDate.parse(resultSet.getString("last_modified_at"));
                LocalDate deletedAt = LocalDate.parse(resultSet.getString("deleted_at"));

                Product product = new Product(id, name, description, categoryId, brand, vendorId, SKU, price, discountId, manufacturingDate, expirationTime, createdAt, lastModifiedAt, deletedAt);

                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean update(int id, Product product) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
