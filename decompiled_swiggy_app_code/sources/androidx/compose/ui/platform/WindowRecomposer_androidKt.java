package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.R;
import androidx.core.os.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q0;
import bp0.k;
import e0.c0;
import fp0.c;
import fp0.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.r;
import lp0.l;
import p0.g;
import wp0.j0;
import wp0.k0;
import yp0.f;
import yp0.i;

/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposer_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Context, r<Float>> f7215a = new LinkedHashMap();

    /* compiled from: WindowRecomposer.android.kt */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f7216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Recomposer f7217b;

        a(View view, Recomposer recomposer) {
            this.f7216a = view;
            this.f7217b = recomposer;
        }

        public void onViewAttachedToWindow(View view) {
            p.j(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            p.j(view, "v");
            this.f7216a.removeOnAttachStateChangeListener(this);
            this.f7217b.T();
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    public static final class b extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f<k> f7218a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f<k> fVar, Handler handler) {
            super(handler);
            this.f7218a = fVar;
        }

        public void onChange(boolean z11, Uri uri) {
            this.f7218a.e(k.f22762a);
        }
    }

    public static final Recomposer b(View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CoroutineContext coroutineContext2;
        p.j(view, "<this>");
        p.j(coroutineContext, "coroutineContext");
        if (coroutineContext.get(d.f23046e0) == null || coroutineContext.get(c0.f14166b0) == null) {
            coroutineContext = AndroidUiDispatcher.f7075l.a().plus(coroutineContext);
        }
        c0 c0Var = (c0) coroutineContext.get(c0.f14166b0);
        if (c0Var != null) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(c0Var);
            pausableMonotonicFrameClock2.c();
            pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
        } else {
            pausableMonotonicFrameClock = null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t = (g) coroutineContext.get(g.f16039i0);
        if (t == null) {
            t = new s0();
            ref$ObjectRef.f25666a = t;
        }
        if (pausableMonotonicFrameClock != null) {
            coroutineContext2 = pausableMonotonicFrameClock;
        } else {
            coroutineContext2 = EmptyCoroutineContext.f25631a;
        }
        CoroutineContext plus = coroutineContext.plus(coroutineContext2).plus(t);
        Recomposer recomposer = new Recomposer(plus);
        j0 a11 = k0.a(plus);
        if (lifecycle == null) {
            androidx.lifecycle.r a12 = q0.a(view);
            lifecycle = a12 != null ? a12.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new a(view, recomposer));
            lifecycle.a(new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(a11, pausableMonotonicFrameClock, recomposer, ref$ObjectRef, view));
            return recomposer;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ Recomposer c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f25631a;
        }
        if ((i11 & 2) != 0) {
            lifecycle = null;
        }
        return b(view, coroutineContext, lifecycle);
    }

    public static final androidx.compose.runtime.a d(View view) {
        p.j(view, "<this>");
        androidx.compose.runtime.a f11 = f(view);
        if (f11 != null) {
            return f11;
        }
        ViewParent parent = view.getParent();
        while (f11 == null && (parent instanceof View)) {
            f11 = f((View) parent);
            parent = parent.getParent();
        }
        return f11;
    }

    /* access modifiers changed from: private */
    public static final r<Float> e(Context context) {
        r<Float> rVar;
        Map<Context, r<Float>> map = f7215a;
        synchronized (map) {
            r<Float> rVar2 = map.get(context);
            if (rVar2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                f b11 = i.b(-1, (BufferOverflow) null, (l) null, 6, (Object) null);
                rVar2 = kotlinx.coroutines.flow.f.J(kotlinx.coroutines.flow.f.x(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new b(b11, e.a(Looper.getMainLooper())), b11, context, (c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>) null)), k0.b(), p.a.b(kotlinx.coroutines.flow.p.f26172a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, rVar2);
            }
            rVar = rVar2;
        }
        return rVar;
    }

    public static final androidx.compose.runtime.a f(View view) {
        kotlin.jvm.internal.p.j(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.a) {
            return (androidx.compose.runtime.a) tag;
        }
        return null;
    }

    private static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    public static final Recomposer h(View view) {
        kotlin.jvm.internal.p.j(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g11 = g(view);
            androidx.compose.runtime.a f11 = f(g11);
            if (f11 == null) {
                return WindowRecomposerPolicy.f7208a.a(g11);
            }
            if (f11 instanceof Recomposer) {
                return (Recomposer) f11;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void i(View view, androidx.compose.runtime.a aVar) {
        kotlin.jvm.internal.p.j(view, "<this>");
        view.setTag(R.id.androidx_compose_ui_view_composition_context, aVar);
    }
}
