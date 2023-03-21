package androidx.constraintlayout.core.parser;

/* compiled from: CLArray */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c N(char[] cArr) {
        return new a(cArr);
    }

    /* access modifiers changed from: protected */
    public String q() {
        StringBuilder sb2 = new StringBuilder(g() + "[");
        boolean z11 = true;
        for (int i11 = 0; i11 < this.f8096f.size(); i11++) {
            if (!z11) {
                sb2.append(", ");
            } else {
                z11 = false;
            }
            sb2.append(this.f8096f.get(i11).q());
        }
        return sb2 + "]";
    }
}
