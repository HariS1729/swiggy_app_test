package d3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.graphics.l;
import androidx.core.provider.g;
import d3.a;
import java.nio.ByteBuffer;

/* compiled from: FontRequestEmojiCompatConfig */
public class e extends a.c {

    /* renamed from: i  reason: collision with root package name */
    private static final a f14084i = new a();

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class a {
        public Typeface a(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return g.a(context, (CancellationSignal) null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) throws PackageManager.NameNotFoundException {
            return g.b(context, (CancellationSignal) null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* compiled from: FontRequestEmojiCompatConfig */
    private static class b implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final Context f14085a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.provider.e f14086b;

        /* renamed from: c  reason: collision with root package name */
        private final a f14087c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f14088d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f14089e;

        /* renamed from: f  reason: collision with root package name */
        private HandlerThread f14090f;

        /* renamed from: g  reason: collision with root package name */
        a.g f14091g;

        /* renamed from: h  reason: collision with root package name */
        private ContentObserver f14092h;

        /* renamed from: i  reason: collision with root package name */
        private Runnable f14093i;

        /* compiled from: FontRequestEmojiCompatConfig */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.g f14094a;

            a(a.g gVar) {
                this.f14094a = gVar;
            }

            public void run() {
                b bVar = b.this;
                bVar.f14091g = this.f14094a;
                bVar.c();
            }
        }

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.g.h(context, "Context cannot be null");
            androidx.core.util.g.h(eVar, "FontRequest cannot be null");
            this.f14085a = context.getApplicationContext();
            this.f14086b = eVar;
            this.f14087c = aVar;
        }

        private void b() {
            this.f14091g = null;
            ContentObserver contentObserver = this.f14092h;
            if (contentObserver != null) {
                this.f14087c.c(this.f14085a, contentObserver);
                this.f14092h = null;
            }
            synchronized (this.f14088d) {
                this.f14089e.removeCallbacks(this.f14093i);
                HandlerThread handlerThread = this.f14090f;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.f14089e = null;
                this.f14090f = null;
            }
        }

        private g.b d() {
            try {
                g.a b11 = this.f14087c.b(this.f14085a, this.f14086b);
                if (b11.c() == 0) {
                    g.b[] b12 = b11.b();
                    if (b12 != null && b12.length != 0) {
                        return b12[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b11.c() + ")");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("provider not found", e11);
            }
        }

        public void a(a.g gVar) {
            androidx.core.util.g.h(gVar, "LoaderCallback cannot be null");
            synchronized (this.f14088d) {
                if (this.f14089e == null) {
                    HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                    this.f14090f = handlerThread;
                    handlerThread.start();
                    this.f14089e = new Handler(this.f14090f.getLooper());
                }
                this.f14089e.post(new a(gVar));
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f14091g != null) {
                try {
                    g.b d11 = d();
                    int b11 = d11.b();
                    if (b11 == 2) {
                        synchronized (this.f14088d) {
                        }
                    }
                    if (b11 == 0) {
                        Typeface a11 = this.f14087c.a(this.f14085a, d11);
                        ByteBuffer f11 = l.f(this.f14085a, (CancellationSignal) null, d11.d());
                        if (f11 != null) {
                            this.f14091g.b(g.b(a11, f11));
                            b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b11 + ")");
                } catch (Throwable th2) {
                    this.f14091g.a(th2);
                    b();
                }
            }
        }
    }

    public e(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f14084i));
    }
}
