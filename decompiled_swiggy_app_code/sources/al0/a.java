package al0;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.util.Rational;
import in.swiggy.android.track.activities.TrackOrderActivity;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: PipManager.kt */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final C0254a f20071g = new C0254a((i) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f20072h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final TrackOrderActivity f20073a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20074b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20075c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20076d = true;

    /* renamed from: e  reason: collision with root package name */
    private Rect f20077e;

    /* renamed from: f  reason: collision with root package name */
    private final Rational f20078f = new Rational(3, 4);

    /* renamed from: al0.a$a  reason: collision with other inner class name */
    /* compiled from: PipManager.kt */
    public static final class C0254a {
        private C0254a() {
        }

        public /* synthetic */ C0254a(i iVar) {
            this();
        }
    }

    public a(TrackOrderActivity trackOrderActivity) {
        p.j(trackOrderActivity, "trackOrderActivity");
        this.f20073a = trackOrderActivity;
    }

    private final boolean d() {
        return this.f20074b && ol0.a.f22331a.c();
    }

    private final boolean e() {
        return this.f20076d && this.f20075c && d();
    }

    private final void h() {
        try {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                PictureInPictureParams.Builder aspectRatio = new PictureInPictureParams.Builder().setAspectRatio(this.f20078f);
                if (i11 >= 31) {
                    Rect rect = this.f20077e;
                    if (rect != null) {
                        aspectRatio.setSourceRectHint(rect);
                    }
                    aspectRatio.setSeamlessResizeEnabled(false);
                    aspectRatio.setAutoEnterEnabled(e());
                }
                this.f20073a.setPictureInPictureParams(aspectRatio.build());
            }
        } catch (Exception e11) {
            u.h("PipManager", e11);
        }
    }

    public final void a() {
        this.f20076d = false;
        h();
    }

    public final void b(Rect rect) {
        this.f20076d = true;
        if (rect != null) {
            this.f20077e = rect;
        }
        h();
    }

    public final void c() {
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (26 <= i11 && i11 < 31) {
            z11 = true;
        }
        if (z11 && e()) {
            try {
                this.f20073a.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(this.f20078f).build());
            } catch (Exception e11) {
                u.h("PipManager", e11);
            }
        }
    }

    public final void f(boolean z11) {
        this.f20074b = z11;
        h();
    }

    public final void g(boolean z11) {
        this.f20075c = z11;
        h();
    }
}
