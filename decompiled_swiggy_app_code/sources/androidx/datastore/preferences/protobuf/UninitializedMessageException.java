package androidx.datastore.preferences.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f9940a = null;

    public UninitializedMessageException(k0 k0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
