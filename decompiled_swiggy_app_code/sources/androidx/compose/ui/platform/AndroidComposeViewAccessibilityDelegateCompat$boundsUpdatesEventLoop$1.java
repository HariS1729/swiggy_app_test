package androidx.compose.ui.platform;

import fp0.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

@d(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1637, 1666}, m = "boundsUpdatesEventLoop")
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f7016a;

    /* renamed from: b  reason: collision with root package name */
    Object f7017b;

    /* renamed from: c  reason: collision with root package name */
    Object f7018c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f7019d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f7020e;

    /* renamed from: f  reason: collision with root package name */
    int f7021f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, c<? super AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> cVar) {
        super(cVar);
        this.f7020e = androidComposeViewAccessibilityDelegateCompat;
    }

    public final Object invokeSuspend(Object obj) {
        this.f7019d = obj;
        this.f7021f |= Integer.MIN_VALUE;
        return this.f7020e.x(this);
    }
}
