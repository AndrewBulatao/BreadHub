package com.example.breadhub.database;

import androidx.room.*;
import java.util.List;

@Dao
public interface AppDao {

    // --- INSERTS ---
    @Insert
    void insertType(SandwichType type);

    @Insert
    void insertSandwich(Sandwich sandwich);

    // --- QUERIES ---

    // Should fetch every row from sandwich types table
    // TODO: If user wants to expand a new type of sandwiches
    @Query("SELECT * FROM sandwich_types")
    List<SandwichType> getAllTypes();


    // Fetch specific sandwich type
    @Query("SELECT * FROM sandwiches WHERE typeId = :typeId")
    List<Sandwich> getSandwichesForType(int typeId);

    // Every sandwich in the database
    @Query("SELECT * FROM sandwiches")
    List<Sandwich> getAllSandwiches();

    // --- DELETES ---
    // Delete one sandwich
    @Delete
    void deleteSandwich(Sandwich sandwich);
}
