package arrays;

import java.util.Scanner;

class Player {
    private int id;
    private String name;
    private int iccRank;
    private int matchesPlayed;
    private int runsScored;

    public Player(int id, String name, int iccRank, int matchesPlayed, int runsScored) {
        this.id = id;
        this.name = name;
        this.iccRank = iccRank;
        this.matchesPlayed = matchesPlayed;
        this.runsScored = runsScored;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIccRank() {
        return iccRank;
    }

    public void setIccRank(int iccRank) {
        this.iccRank = iccRank;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}

class Solution_PlayerRuns {

    public static double findAverageOfRuns(Player[] players, int target) {
        int count = 0;
        double totalRuns = 0;

        for (Player player : players) {
            if (player.getMatchesPlayed() >= target) {
                totalRuns += player.getRunsScored();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return totalRuns / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int iccRank = scanner.nextInt();
            int matchesPlayed = scanner.nextInt();
            int runsScored = scanner.nextInt();
            players[i] = new Player(id, name, iccRank, matchesPlayed, runsScored);
        }

        int target = scanner.nextInt();

        double averageRun = Solution_PlayerRuns.findAverageOfRuns(players, target);

        if (averageRun >= 80 && averageRun <= 100) {
            System.out.println("Grade A");
        } else if (averageRun >= 50 && averageRun < 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        scanner.close();
    }
}
