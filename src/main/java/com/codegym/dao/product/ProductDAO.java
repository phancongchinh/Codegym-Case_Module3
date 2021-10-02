package com.codegym.dao.product;

import com.codegym.dao.IDBConnection;
import com.codegym.model.Product;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {

    private static final Connection CONNECTION = IDBConnection.getConnection();
    public static final String SQL_INSERT = "INSERT INTO " +
            "product (name, description, price, brand, SKU, category_id, vendor_id, discount_id, created_at) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String SQL_UPDATE = "UPDATE product " +
            "SET name=?, " +
            "description=?, " +
            "price=?, " +
            "brand=?, " +
            "SKU=?, " +
            "category_id=?, " +
            "vendor_id=?, " +
            "discount_id=?, " +
            "last_modified_at=? " +
            "WHERE id = ?";
    public static final String SQL_DELETE = "DELETE FROM product WHERE id=?";
    public static final String SQL_FIND_BY_ID = "SELECT * FROM product WHERE id = ?";
    public static final String SQL_GET_ALL = "SELECT * FROM product";

    @Override
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = CONNECTION.prepareStatement(SQL_GET_ALL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = Double.parseDouble(resultSet.getString("price"));
                String brand = resultSet.getString("brand");
                String SKU = resultSet.getString("SKU");
                int categoryId = resultSet.getInt("category_id");
                int vendorId = resultSet.getInt("vendor_id");
                int discountId = resultSet.getInt("discount_id");
                LocalDate createAt = LocalDate.parse(resultSet.getString("created_at"));
                LocalDate lastModifiedAt = LocalDate.parse(resultSet.getString("created_at"));
                LocalDate deletedAt = LocalDate.parse(resultSet.getString("created_at"));
                Product product = new Product(id, name, description, price, brand, SKU, categoryId, vendorId, discountId, createAt, lastModifiedAt, deletedAt);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean save(Product product) {
        boolean isCreated = false;
        try {
            PreparedStatement statement = CONNECTION.prepareStatement(SQL_INSERT);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setString(4, product.getBrand());
            statement.setString(5, product.getSKU());
            statement.setInt(6, product.getCategoryId());
            statement.setInt(7, product.getVendorId());
            statement.setInt(8, product.getDiscountId());
            statement.setDate(9, Date.valueOf(LocalDate.now()));
            isCreated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isCreated;
    }

    @Override
    public boolean update(int id, Product product) {
        boolean isUpdated = false;
        try {
            PreparedStatement statement = CONNECTION.prepareStatement(SQL_UPDATE);
            statement.setString(1, product.getName());
            statement.setString(2, product.getDescription());
            statement.setDouble(3, product.getPrice());
            statement.setString(4, product.getBrand());
            statement.setString(5, product.getSKU());
            statement.setInt(6, product.getCategoryId());
            statement.setInt(7, product.getVendorId());
            statement.setInt(8, product.getDiscountId());
            statement.setDate(9, Date.valueOf(LocalDate.now()));
            statement.setInt(10, id);
            isUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isUpdated;
    }

    @Override
    public boolean delete(int id) {
        boolean isDeleted = false;
        PreparedStatement statement = null;
        try {
            statement = CONNECTION.prepareStatement(SQL_DELETE);
            statement.setInt(1, id);
            isDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDeleted;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            PreparedStatement statement = CONNECTION.prepareStatement(SQL_FIND_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = Double.parseDouble(resultSet.getString("price"));
                String brand = resultSet.getString("brand");
                String SKU = resultSet.getString("SKU");
                int categoryId = resultSet.getInt("category_id");
                int vendorId = resultSet.getInt("vendor_id");
                int discountId = resultSet.getInt("discount_id");
                LocalDate createAt = LocalDate.parse(resultSet.getString("created_at"));
                LocalDate lastModifiedAt = LocalDate.parse(resultSet.getString("created_at"));
                LocalDate deletedAt = LocalDate.parse(resultSet.getString("created_at"));
                product = new Product(id, name, description, price, brand, SKU, categoryId, vendorId, discountId, createAt, lastModifiedAt, deletedAt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
}
