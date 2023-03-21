package androidx.compose.ui.platform;

import bp0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1 extends Lambda implements l<c1, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f7036a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.f7036a = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void a(c1 c1Var) {
        p.j(c1Var, "it");
        this.f7036a.i0(c1Var);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c1) obj);
        return k.f22762a;
    }
}
