package com.project.tutoquizzer.viewmodels;

import androidx.room.Entity;

@Entity(tableName = "ScoreAccumulationStorage")
public class ScoreAccumulationStorage {

    public ScoreAccumulationStorage(int Score, int Items, String DateAdded) {
        this.Score = Score;
        this.Items = Items;
        this.DateAdded = DateAdded;
    }

    private int Score;

    private int Items;

    private String DateAdded;

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public int getItems() {
        return Items;
    }

    public void setItems(int items) {
        Items = items;
    }

    public String getDateAdded() {
        return DateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.DateAdded = dateAdded;
    }
}