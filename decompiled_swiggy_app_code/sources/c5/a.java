package c5;

import android.content.Context;
import android.util.Log;
import bp0.g;
import bp0.k;
import co.hyperverge.crashguard.data.models.CrashEvent;
import in.juspay.hyper.constants.LogCategory;
import ip.b;
import ip.c;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* compiled from: CrashEventsRepo.kt */
public final class a {
    public static final C0108a Companion = new C0108a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static a f12821c;

    /* renamed from: a  reason: collision with root package name */
    private b<CrashEvent> f12822a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12823b;

    /* renamed from: c5.a$a  reason: collision with other inner class name */
    /* compiled from: CrashEventsRepo.kt */
    public static final class C0108a {
        private C0108a() {
        }

        public /* synthetic */ C0108a(i iVar) {
            this();
        }

        public final a a(Context context) {
            Object obj;
            p.j(context, LogCategory.CONTEXT);
            a a11 = a.f12821c;
            if (a11 != null) {
                return a11;
            }
            try {
                Result.a aVar = Result.f25582b;
                a aVar2 = new a(new WeakReference(context), (i) null);
                a.f12821c = aVar2;
                obj = Result.b(aVar2);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.f25582b;
                obj = Result.b(g.a(th2));
            }
            g.b(obj);
            return (a) obj;
        }
    }

    private a(WeakReference<Context> weakReference) {
        this.f12823b = s.b(a.class).b();
        File f11 = f((Context) weakReference.get());
        p.g(f11);
        b<CrashEvent> b11 = b.b(new c.a(f11).a(), new z4.a());
        p.i(b11, "create(queueFile, CrashEventConverter())");
        this.f12822a = b11;
    }

    public /* synthetic */ a(WeakReference weakReference, i iVar) {
        this(weakReference);
    }

    private final File f(Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "crash_events");
        File file2 = new File(file, "crashes.txt");
        if (file.exists() || file.mkdirs()) {
            return file2;
        }
        String str = this.f12823b;
        Log.e(str, p.s("getOrCreateSyncFile: ", new IOException("Sync dir: " + file.getPath() + " could not be created")));
        return null;
    }

    public final void c(CrashEvent crashEvent) {
        Object obj;
        p.j(crashEvent, "event");
        String str = this.f12823b;
        Log.d(str, "addEvent() called with: event = [" + crashEvent.c() + ']');
        try {
            Result.a aVar = Result.f25582b;
            this.f12822a.a(crashEvent);
            obj = Result.b(k.f22762a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        Throwable d11 = Result.d(obj);
        if (d11 != null) {
            Log.e(this.f12823b, p.s("addEvent failed: ", d11));
        }
        if (Result.h(obj)) {
            k kVar = (k) obj;
            String str2 = this.f12823b;
            Log.i(str2, "addEvent: file now contains " + e() + " crash events");
        }
        Result.h(obj);
    }

    public final Iterator<CrashEvent> d() {
        return this.f12822a.iterator();
    }

    public final int e() {
        return this.f12822a.size();
    }
}
