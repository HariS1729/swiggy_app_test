package q7;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.jvm.internal.p;

/* compiled from: Views.kt */
public final class f {
    public static final <T> T a(ViewGroup viewGroup, int i11, ViewGroup viewGroup2) {
        p.k(viewGroup, "$this$inflate");
        return LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup2, false);
    }

    public static /* synthetic */ Object b(ViewGroup viewGroup, int i11, ViewGroup viewGroup2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            viewGroup2 = viewGroup;
        }
        return a(viewGroup, i11, viewGroup2);
    }

    public static final <T extends View> boolean c(T t) {
        p.k(t, "$this$isNotVisible");
        return !e(t);
    }

    public static final <T extends View> boolean d(T t) {
        p.k(t, "$this$isRtl");
        Resources resources = t.getResources();
        p.f(resources, "resources");
        Configuration configuration = resources.getConfiguration();
        p.f(configuration, "resources.configuration");
        return configuration.getLayoutDirection() == 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends android.view.View> boolean e(T r3) {
        /*
            java.lang.String r0 = "$this$isVisible"
            kotlin.jvm.internal.p.k(r3, r0)
            boolean r0 = r3 instanceof android.widget.Button
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0028
            android.widget.Button r3 = (android.widget.Button) r3
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x002f
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r0 = "this.text"
            kotlin.jvm.internal.p.f(r3, r0)
            java.lang.CharSequence r3 = kotlin.text.StringsKt__StringsKt.i1(r3)
            boolean r3 = kotlin.text.o.A(r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x002f
            goto L_0x002e
        L_0x0028:
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.f.e(android.view.View):boolean");
    }

    public static final void f(TextView textView) {
        p.k(textView, "$this$setGravityEndCompat");
        textView.setTextAlignment(6);
        textView.setGravity(8388629);
    }

    public static final void g(TextView textView) {
        p.k(textView, "$this$setGravityStartCompat");
        textView.setTextAlignment(5);
        textView.setGravity(8388627);
    }
}
