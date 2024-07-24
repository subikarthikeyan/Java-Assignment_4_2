package com.election.management;

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
