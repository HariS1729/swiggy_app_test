package y6;

import android.content.Context;
import android.util.DisplayMetrics;
import fp0.c;
import kotlin.jvm.internal.p;
import y6.c;

/* compiled from: DisplaySizeResolver.kt */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f18026a;

    public d(Context context) {
        this.f18026a = context;
    }

    public Object a(c<? super g> cVar) {
        DisplayMetrics displayMetrics = this.f18026a.getResources().getDisplayMetrics();
        c.a a11 = a.a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(a11, a11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && p.e(this.f18026a, ((d) obj).f18026a);
    }

    public int hashCode() {
        return this.f18026a.hashCode();
    }
}
