package com.example.breadhub.database;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "sandwich_types")
public class SandwichType {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    public String name;

    public SandwichType(@NonNull String name) {
        this.name = name;
    }
}
