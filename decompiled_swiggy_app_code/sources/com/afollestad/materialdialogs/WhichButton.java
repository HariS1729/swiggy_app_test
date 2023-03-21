package com.afollestad.materialdialogs;

import kotlin.jvm.internal.i;

/* compiled from: WhichButton.kt */
public enum WhichButton {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);
    
    public static final a Companion = null;
    private final int index;

    /* compiled from: WhichButton.kt */
    public static final class a {
        private a() {
        }

        public final WhichButton a(int i11) {
            if (i11 == 0) {
                return WhichButton.POSITIVE;
            }
            if (i11 == 1) {
                return WhichButton.NEGATIVE;
            }
            if (i11 == 2) {
                return WhichButton.NEUTRAL;
            }
            throw new IndexOutOfBoundsException(i11 + " is not an action button index.");
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    static {
        Companion = new a((i) null);
    }

    private WhichButton(int i11) {
        this.index = i11;
    }

    public final int getIndex() {
        return this.index;
    }
}
