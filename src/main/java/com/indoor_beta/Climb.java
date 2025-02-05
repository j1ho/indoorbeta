package com.indoor_beta;

import jakarta.persistence.*;

@Entity
public class Climb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String difficulty;
    private String betaVideoUrl;

    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gym gym;

    // Constructors, Getters, Setters
    public Climb() {}

    public Climb(String difficulty, String betaVideoUrl, Gym gym) {
        this.difficulty = difficulty;
        this.betaVideoUrl = betaVideoUrl;
        this.gym = gym;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getBetaVideoUrl() {
        return betaVideoUrl;
    }

    public void setBetaVideoUrl(String betaVideoUrl) {
        this.betaVideoUrl = betaVideoUrl;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}
