package androidx.compose.ui.platform;

import kotlin.jvm.internal.p;

/* compiled from: AccessibilityIterators.android.kt */
public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    protected String f7259a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f7260b = new int[2];

    /* access modifiers changed from: protected */
    public final int[] c(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = this.f7260b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    /* access modifiers changed from: protected */
    public final String d() {
        String str = this.f7259a;
        if (str != null) {
            return str;
        }
        p.B("text");
        return null;
    }

    public void e(String str) {
        p.j(str, "text");
        f(str);
    }

    /* access modifiers changed from: protected */
    public final void f(String str) {
        p.j(str, "<set-?>");
        this.f7259a = str;
    }
}
