package in.swiggy.android.tejas.feature.gamification.model.consumable;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.g0;
import os.u;

@Instrumented
/* compiled from: GameState.kt */
public final class GameState {
    public static final Companion Companion = new Companion((i) null);
    public static final String GAME_NOT_PLAYED = "notPlayed";
    public static final String GAME_PLAYED = "played";
    @SerializedName("gameId")
    private Long gameId;
    @SerializedName("gameName")
    private String gameName;
    @SerializedName("gameStatus")
    private GameStatus gameStatus;
    @SerializedName("gameUIAssets")
    private GameUIAssets gameUIAssets;
    @SerializedName("gameUrl")
    private String gameUrl;
    @SerializedName("interactionType")
    private String interactionType;
    @SerializedName("orderId")
    private String orderId;
    @SerializedName("redirect")
    private boolean redirect;

    /* compiled from: GameState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final void fromJson(String str) {
        try {
            Gson i11 = g0.i();
            Class cls = GameState.class;
            GameState gameState = (GameState) (!(i11 instanceof Gson) ? i11.fromJson(str, cls) : GsonInstrumentation.fromJson(i11, str, cls));
            this.gameStatus = gameState.gameStatus;
            this.interactionType = gameState.interactionType;
            this.gameName = gameState.gameName;
            this.gameId = gameState.gameId;
            this.orderId = gameState.orderId;
            this.redirect = gameState.redirect;
            this.gameUIAssets = gameState.gameUIAssets;
            this.gameUrl = gameState.gameUrl;
        } catch (Exception e11) {
            u.h("GameStateParsing", e11);
        }
    }

    public final Long getGameId() {
        return this.gameId;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public final GameStatus getGameStatus() {
        return this.gameStatus;
    }

    public final GameUIAssets getGameUIAssets() {
        return this.gameUIAssets;
    }

    public final String getGameUrl() {
        return this.gameUrl;
    }

    public final String getInteractionType() {
        return this.interactionType;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final boolean getRedirect() {
        return this.redirect;
    }

    public final void setGameId(Long l11) {
        this.gameId = l11;
    }

    public final void setGameName(String str) {
        this.gameName = str;
    }

    public final void setGameStatus(GameStatus gameStatus2) {
        this.gameStatus = gameStatus2;
    }

    public final void setGameUIAssets(GameUIAssets gameUIAssets2) {
        this.gameUIAssets = gameUIAssets2;
    }

    public final void setGameUrl(String str) {
        this.gameUrl = str;
    }

    public final void setInteractionType(String str) {
        this.interactionType = str;
    }

    public final void setOrderId(String str) {
        this.orderId = str;
    }

    public final void setRedirect(boolean z11) {
        this.redirect = z11;
    }

    public final String toJson() {
        Gson i11 = g0.i();
        String json = !(i11 instanceof Gson) ? i11.toJson((Object) this) : GsonInstrumentation.toJson(i11, (Object) this);
        p.i(json, "getGson().toJson(this)");
        return json;
    }

    public final GameStatus getGameStatus(String str) {
        p.j(str, "gameStatus");
        GameStatus gameStatus2 = GameStatus.PLAY_GAME;
        if (p.e(str, gameStatus2.getGameStatus())) {
            return gameStatus2;
        }
        GameStatus gameStatus3 = GameStatus.GAME_ENDED;
        if (p.e(str, gameStatus3.getGameStatus())) {
            return gameStatus3;
        }
        if (p.e(str, GAME_NOT_PLAYED)) {
            return gameStatus2;
        }
        if (p.e(str, GAME_PLAYED)) {
            return gameStatus3;
        }
        return GameStatus.LIMIT_EXCEED;
    }
}
