package com.example.breadhub.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sandwich_types")
public class SandwichType {

    @PrimaryKey(autoGenerate = true)
    public int id;

    // sandwiches,subs/hoagies, bánh mì, panini, and burgers
    public String name;

    public SandwichType(String name) {
        this.name = name;
    }
}
