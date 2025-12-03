package com.example.breadhub.database;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "sandwiches",
        foreignKeys = @ForeignKey(
                entity = SandwichType.class,
                parentColumns = "id",
                childColumns = "typeId",
                onDelete = ForeignKey.CASCADE
        )
)
public class Sandwich {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int typeId;
    public String name;
    public String description;

    public Sandwich(int typeId, String name, String description) {
        this.typeId = typeId;
        this.name = name;
        this.description = description;
    }
}
