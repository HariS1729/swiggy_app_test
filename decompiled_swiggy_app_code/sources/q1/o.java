package q1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: StaticLayoutFactory.kt */
final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16332a = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16333b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<StaticLayout> f16334c;

    /* compiled from: StaticLayoutFactory.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final Constructor<StaticLayout> b() {
            if (o.f16333b) {
                return o.f16334c;
            }
            o.f16333b = true;
            Class<StaticLayout> cls = StaticLayout.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                o.f16334c = cls.getConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, TextDirectionHeuristic.class, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
            } catch (NoSuchMethodException unused) {
                o.f16334c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return o.f16334c;
        }
    }

    public StaticLayout a(p pVar) {
        p.j(pVar, "params");
        Constructor a11 = f16332a.b();
        StaticLayout staticLayout = null;
        if (a11 != null) {
            try {
                staticLayout = (StaticLayout) a11.newInstance(new Object[]{pVar.p(), Integer.valueOf(pVar.o()), Integer.valueOf(pVar.e()), pVar.m(), Integer.valueOf(pVar.s()), pVar.a(), pVar.q(), Float.valueOf(pVar.k()), Float.valueOf(pVar.j()), Boolean.valueOf(pVar.g()), pVar.c(), Integer.valueOf(pVar.d()), Integer.valueOf(pVar.l())});
            } catch (IllegalAccessException unused) {
                f16334c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                f16334c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                f16334c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(pVar.p(), pVar.o(), pVar.e(), pVar.m(), pVar.s(), pVar.a(), pVar.k(), pVar.j(), pVar.g(), pVar.c(), pVar.d());
    }
}
