package com.example.backgroundsapp;

public class Category {
     private String category; //for the category name
     private String categoryIVUrl;

     public Category(String category, String categoryIVUrl) {
          this.category = category;
          this.categoryIVUrl = categoryIVUrl;
     }

     public String getCategory() {
          return category;
     }

     public void setCategory(String category) {
          this.category = category;
     }

     public String getCategoryIVUrl() {
          return categoryIVUrl;
     }

     public void setCategoryIVUrl(String categoryIVUrl) {
          this.categoryIVUrl = categoryIVUrl;
     }
}
