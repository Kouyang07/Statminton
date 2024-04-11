package dev.kouyang07.Types;

public class Match {
    private String winner;
    private String loser;

    public Match(String winner, String loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLoser() {
        return loser;
    }

    public void setLoser(String loser) {
        this.loser = loser;
    }
}
