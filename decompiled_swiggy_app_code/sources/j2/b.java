package j2;

import androidx.constraintlayout.core.parser.c;

/* compiled from: CLString */
public class b extends c {
    public b(char[] cArr) {
        super(cArr);
    }

    public static c r(char[] cArr) {
        return new b(cArr);
    }

    /* access modifiers changed from: protected */
    public String q() {
        return "'" + c() + "'";
    }
}
