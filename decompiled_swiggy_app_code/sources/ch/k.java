package ch;

import com.google.android.exoplayer2.drm.h;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f13016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f13017b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f13018c;

    public /* synthetic */ k(h.a aVar, h hVar, Exception exc) {
        this.f13016a = aVar;
        this.f13017b = hVar;
        this.f13018c = exc;
    }

    public final void run() {
        this.f13016a.r(this.f13017b, this.f13018c);
    }
}
