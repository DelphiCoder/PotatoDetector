package me.vigroid.potato.core.recycler;

/**
 * Created by vigroid on 10/14/17.
 * player entity
 */

public class PlayerBean {
    String playerId;
    String shipName;
    String playerName;
    String winRate;
    String battlePlayed;
    String avgDmg;
    String avgXp;
    String avgFrags;
    PlayerRating rating;
    long ratingNum;
    boolean isPrivate;

    public PlayerBean(String playerId, String shipName, String playerName,
                      String winRate, String battlePlayed, String avgDmg,
                      String avgXp, String avgFrags,  PlayerRating rating,
                      long ratingNum, boolean isPrivate) {
        this.playerId = playerId;
        this.shipName = shipName;
        this.playerName = playerName;
        this.winRate = winRate;
        this.battlePlayed = battlePlayed;
        this.avgDmg = avgDmg;
        this.avgXp = avgXp;
        this.avgFrags = avgFrags;
        this.rating = rating;
        this.ratingNum = ratingNum;
        this.isPrivate = isPrivate;
    }
}
