package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import fp0.c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineStart;
import wp0.j0;
import wp0.k1;

/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements o {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j0 f7219a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PausableMonotonicFrameClock f7220b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Recomposer f7221c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<s0> f7222d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ View f7223e;

    /* compiled from: WindowRecomposer.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7224a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
            iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            f7224a = iArr;
        }
    }

    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(j0 j0Var, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, Ref$ObjectRef<s0> ref$ObjectRef, View view) {
        this.f7219a = j0Var;
        this.f7220b = pausableMonotonicFrameClock;
        this.f7221c = recomposer;
        this.f7222d = ref$ObjectRef;
        this.f7223e = view;
    }

    public void b(r rVar, Lifecycle.Event event) {
        p.j(rVar, "lifecycleOwner");
        p.j(event, "event");
        int i11 = a.f7224a[event.ordinal()];
        if (i11 == 1) {
            k1 unused = j.d(this.f7219a, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.f7222d, this.f7221c, rVar, this, this.f7223e, (c<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1>) null), 1, (Object) null);
        } else if (i11 == 2) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock = this.f7220b;
            if (pausableMonotonicFrameClock != null) {
                pausableMonotonicFrameClock.d();
            }
        } else if (i11 == 3) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = this.f7220b;
            if (pausableMonotonicFrameClock2 != null) {
                pausableMonotonicFrameClock2.c();
            }
        } else if (i11 == 4) {
            this.f7221c.T();
        }
    }
}
