package in.swiggy.android.tejas.feature.gamification.model.consumable;

/* compiled from: GameStatus.kt */
public enum GameStatus {
    GAME_ENDED("gameEnded"),
    LIMIT_EXCEED("limitExceed"),
    PLAY_GAME("playGame");
    
    private final String gameStatus;

    private GameStatus(String str) {
        this.gameStatus = str;
    }

    public final String getGameStatus() {
        return this.gameStatus;
    }
}
