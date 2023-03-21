package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key */
public abstract class d {

    /* renamed from: f  reason: collision with root package name */
    public static int f8455f = -1;

    /* renamed from: a  reason: collision with root package name */
    int f8456a;

    /* renamed from: b  reason: collision with root package name */
    int f8457b;

    /* renamed from: c  reason: collision with root package name */
    String f8458c = null;

    /* renamed from: d  reason: collision with root package name */
    protected int f8459d;

    /* renamed from: e  reason: collision with root package name */
    HashMap<String, ConstraintAttribute> f8460e;

    public d() {
        int i11 = f8455f;
        this.f8456a = i11;
        this.f8457b = i11;
    }

    public abstract void a(HashMap<String, o2.d> hashMap);

    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f8456a = dVar.f8456a;
        this.f8457b = dVar.f8457b;
        this.f8458c = dVar.f8458c;
        this.f8459d = dVar.f8459d;
        this.f8460e = dVar.f8460e;
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract void d(HashSet<String> hashSet);

    /* access modifiers changed from: package-private */
    public abstract void e(Context context, AttributeSet attributeSet);

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        String str2 = this.f8458c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void g(HashMap<String, Integer> hashMap) {
    }

    public d h(int i11) {
        this.f8457b = i11;
        return this;
    }
}
