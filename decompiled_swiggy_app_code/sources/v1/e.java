package v1;

/* compiled from: EditCommand.kt */
public final class e {
    /* access modifiers changed from: private */
    public static final boolean b(char c11, char c12) {
        return Character.isHighSurrogate(c11) && Character.isLowSurrogate(c12);
    }
}
