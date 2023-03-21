package co.hyperverge.crashguard.services;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.JobIntentService;
import bp0.f;
import bp0.g;
import c5.a;
import co.hyperverge.crashguard.data.models.CrashEvent;
import co.hyperverge.crashguard.data.repo.PrefsRepo;
import fp0.c;
import hq0.a;
import in.juspay.hyper.constants.LogCategory;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* compiled from: CrashIntentService.kt */
public final class CrashIntentService extends JobIntentService {
    public static final Companion Companion = new Companion((i) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final String f13145m = s.b(CrashIntentService.class).b();
    /* access modifiers changed from: private */
    public static boolean n;
    private final f j = b.b(new CrashIntentService$crashEventsRepo$2(this));
    private final f k = b.b(CrashIntentService$sentryApiInterface$2.f13158a);

    /* renamed from: l  reason: collision with root package name */
    private final f f13146l = b.b(new CrashIntentService$prefsRepo$2(this));

    /* compiled from: CrashIntentService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void a(Context context, CrashEvent crashEvent, boolean z11) {
            p.j(context, LogCategory.CONTEXT);
            p.j(crashEvent, "crashEvent");
            String m11 = CrashIntentService.f13145m;
            Log.i(m11, "addWork() called with: context = [" + context + "], crashEvent = [" + crashEvent + "], enqueue = [" + z11 + ']');
            Object unused = i.b((CoroutineContext) null, new CrashIntentService$Companion$addWork$1(a.Companion.a(context), crashEvent, z11, context, (c<? super CrashIntentService$Companion$addWork$1>) null), 1, (Object) null);
        }

        public final void b(Context context) {
            p.j(context, LogCategory.CONTEXT);
            Log.d(CrashIntentService.f13145m, "enqueuePending() called");
            if (!d5.a.u(context)) {
                Log.e(CrashIntentService.f13145m, "enqueuePending: not connected, aborting posting crash events");
            } else if (!CrashIntentService.n) {
                a a11 = a.Companion.a(context);
                Iterator<CrashEvent> d11 = a11.d();
                Log.i(CrashIntentService.f13145m, p.s("enqueuePending() events to be queued: ", Integer.valueOf(a11.e())));
                int i11 = 0;
                while (d11.hasNext()) {
                    CrashIntentService.n = true;
                    Intent intent = new Intent(context, CrashIntentService.class);
                    a.C0293a aVar = hq0.a.f23147b;
                    intent.putExtra("crash_event", aVar.c(kotlinx.serialization.a.serializer(aVar.a(), s.k(CrashEvent.class)), d11.next()));
                    JobIntentService.d(context, CrashIntentService.class, 2345, intent);
                    d11.remove();
                    i11++;
                }
                String m11 = CrashIntentService.f13145m;
                Log.d(m11, "enqueuePending: enqueued " + i11 + " events");
                CrashIntentService.n = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public final c5.a p() {
        return (c5.a) this.j.getValue();
    }

    /* access modifiers changed from: private */
    public final PrefsRepo q() {
        return (PrefsRepo) this.f13146l.getValue();
    }

    /* access modifiers changed from: private */
    public final b5.a r() {
        return (b5.a) this.k.getValue();
    }

    /* access modifiers changed from: protected */
    public void g(Intent intent) {
        Object obj;
        p.j(intent, "intent");
        try {
            Result.a aVar = Result.f25582b;
            a.C0293a aVar2 = hq0.a.f23147b;
            String stringExtra = intent.getStringExtra("crash_event");
            p.g(stringExtra);
            p.i(stringExtra, "intent.getStringExtra(ARG_CRASH_EVENT)!!");
            obj = Result.b((CrashEvent) aVar2.b(kotlinx.serialization.a.serializer(aVar2.a(), s.k(CrashEvent.class)), stringExtra));
        } catch (Throwable th2) {
            Result.a aVar3 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        Throwable d11 = Result.d(obj);
        if (d11 != null) {
            Log.e(f13145m, p.s("onHandleWork: crashEvent from intent : ", d11));
        }
        if (Result.d(obj) == null) {
            Object unused = i.b((CoroutineContext) null, new CrashIntentService$onHandleWork$1(this, (CrashEvent) obj, (c<? super CrashIntentService$onHandleWork$1>) null), 1, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(f13145m, "onDestroy() called");
    }
}
