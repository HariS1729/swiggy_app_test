package in.swiggy.android.tejas.feature.chatnotification.model;

/* compiled from: ChatNotificationRequestBody.kt */
public enum TYPE {
    TEXT("message/text"),
    SMART_CHOICE("message/pn-response");
    
    private final String type;

    private TYPE(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }
}
