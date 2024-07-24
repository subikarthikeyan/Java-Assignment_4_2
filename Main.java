package com.election.management;

public class Main {
    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(101, "Ara", 20);
            System.out.println("Voter created: " + voter1.getName());

            // This will throw InvalidAgeForVoterException
            Voter voter2 = new Voter(102, "Anu", 16);

        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
