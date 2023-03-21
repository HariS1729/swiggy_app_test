package d0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import u0.d0;
import u0.f0;

/* compiled from: RippleHostView.android.kt */
final class j extends RippleDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f13822e = new a((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static Method f13823f;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f13824g;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13825a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f13826b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f13827c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13828d;

    /* compiled from: RippleHostView.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* compiled from: RippleHostView.android.kt */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13829a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i11) {
            p.j(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i11);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(boolean z11) {
        super(ColorStateList.valueOf(-16777216), (Drawable) null, z11 ? new ColorDrawable(-1) : null);
        this.f13825a = z11;
    }

    private final long a(long j, float f11) {
        if (Build.VERSION.SDK_INT < 28) {
            f11 *= (float) 2;
        }
        return d0.l(j, l.h(f11, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public final void b(long j, float f11) {
        long a11 = a(j, f11);
        d0 d0Var = this.f13826b;
        if (!(d0Var == null ? false : d0.n(d0Var.v(), a11))) {
            this.f13826b = d0.h(a11);
            setColor(ColorStateList.valueOf(f0.j(a11)));
        }
    }

    public final void c(int i11) {
        Integer num = this.f13827c;
        if (num == null || num.intValue() != i11) {
            this.f13827c = Integer.valueOf(i11);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!f13824g) {
                        f13824g = true;
                        f13823f = RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE});
                    }
                    Method method = f13823f;
                    if (method != null) {
                        method.invoke(this, new Object[]{Integer.valueOf(i11)});
                    }
                } catch (Exception unused) {
                }
            } else {
                b.f13829a.a(this, i11);
            }
        }
    }

    public Rect getDirtyBounds() {
        if (!this.f13825a) {
            this.f13828d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        p.i(dirtyBounds, "super.getDirtyBounds()");
        this.f13828d = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f13828d;
    }
}
