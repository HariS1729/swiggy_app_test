package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.c;
import d1.d;
import d1.f;
import e0.g;
import kotlin.jvm.internal.p;
import lp0.a;

/* compiled from: Clickable.android.kt */
public final class Clickable_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final long f2955a = ((long) ViewConfiguration.getTapTimeout());

    public static final long b() {
        return f2955a;
    }

    public static final boolean c(KeyEvent keyEvent) {
        p.j(keyEvent, "$this$isClick");
        if (c.e(d.b(keyEvent), c.f13981a.b())) {
            int b11 = f.b(d.a(keyEvent));
            if (b11 == 23 || b11 == 66 || b11 == 160) {
                return true;
            }
        }
        return false;
    }

    public static final a<Boolean> d(g gVar, int i11) {
        gVar.E(-1990508712);
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) gVar.z(AndroidCompositionLocals_androidKt.k()));
        gVar.P();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }

    /* access modifiers changed from: private */
    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
