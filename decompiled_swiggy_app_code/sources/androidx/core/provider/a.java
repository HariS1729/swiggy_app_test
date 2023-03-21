package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* compiled from: CallbackWithHandler */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f9318a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f9319b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* compiled from: CallbackWithHandler */
    class C0041a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f9320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f9321b;

        C0041a(g.c cVar, Typeface typeface) {
            this.f9320a = cVar;
            this.f9321b = typeface;
        }

        public void run() {
            this.f9320a.b(this.f9321b);
        }
    }

    /* compiled from: CallbackWithHandler */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f9323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9324b;

        b(g.c cVar, int i11) {
            this.f9323a = cVar;
            this.f9324b = i11;
        }

        public void run() {
            this.f9323a.a(this.f9324b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f9318a = cVar;
        this.f9319b = handler;
    }

    private void a(int i11) {
        this.f9319b.post(new b(this.f9318a, i11));
    }

    private void c(Typeface typeface) {
        this.f9319b.post(new C0041a(this.f9318a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f9348a);
        } else {
            a(eVar.f9349b);
        }
    }
}
