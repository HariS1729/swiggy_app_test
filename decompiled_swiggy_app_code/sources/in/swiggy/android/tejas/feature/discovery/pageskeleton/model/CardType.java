package in.swiggy.android.tejas.feature.discovery.pageskeleton.model;

/* compiled from: SkeletonJsonResponse.kt */
public enum CardType {
    TYPE_BOTTOM_BAR("type.googleapis.com/swiggy.gandalf.widgets.v2.BottomBar"),
    TYPE_SEARCH_BAR("type.googleapis.com/swiggy.gandalf.widgets.v2.SearchBar");
    
    private final String type;

    private CardType(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
