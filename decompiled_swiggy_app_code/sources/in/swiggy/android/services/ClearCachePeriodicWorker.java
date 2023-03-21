package in.swiggy.android.services;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.e;
import d4.a;
import d4.n;
import in.juspay.hyper.constants.LogCategory;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import js.c;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import os.u;

/* compiled from: ClearCachePeriodicWorker.kt */
public final class ClearCachePeriodicWorker extends Worker {

    /* renamed from: i  reason: collision with root package name */
    public static final a f18593i = new a((i) null);
    public static final int j = 8;
    /* access modifiers changed from: private */
    public static final long k = 15;

    /* renamed from: g  reason: collision with root package name */
    private final jr.a f18594g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedPreferences f18595h;

    /* compiled from: ClearCachePeriodicWorker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final void a(n nVar) {
            p.j(nVar, "workManager");
            nVar.c("ClearCachePeriodicWorker");
        }

        public final long b() {
            return ClearCachePeriodicWorker.k;
        }

        public final boolean c(SharedPreferences sharedPreferences) {
            p.j(sharedPreferences, "sharedPreferences");
            Pair<Long, TimeUnit> d11 = d(sharedPreferences);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d11.c().longValue());
            sb2.append(d11.d());
            String sb3 = sb2.toString();
            String string = sharedPreferences.getString("clear_cache_periodic_worker_repeat_interval_current_data", "7DAYS");
            if (string == null) {
                string = "";
            }
            boolean z11 = !p.e(sb3, string);
            if (z11) {
                js.a.b(sharedPreferences, "clear_cache_periodic_worker_repeat_interval_current_data", sb3);
            }
            return z11;
        }

        public final Pair<Long, TimeUnit> d(SharedPreferences sharedPreferences) {
            p.j(sharedPreferences, "sharedPreferences");
            String string = sharedPreferences.getString("clear_cache_periodic_worker_repeat_interval", "7");
            String str = "";
            if (string == null) {
                string = str;
            }
            long w11 = c.w(string, Long.parseLong("7"));
            String string2 = sharedPreferences.getString("clear_cache_periodic_worker_repeat_interval_timeunit", "DAYS");
            if (string2 != null) {
                str = string2;
            }
            Locale locale = Locale.getDefault();
            p.i(locale, "getDefault()");
            String upperCase = str.toUpperCase(locale);
            p.i(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TimeUnit timeUnit = TimeUnit.HOURS;
            if (!p.e(upperCase, timeUnit.name())) {
                timeUnit = TimeUnit.MINUTES;
                if (!p.e(upperCase, timeUnit.name())) {
                    timeUnit = TimeUnit.DAYS;
                }
            }
            if (timeUnit == TimeUnit.MINUTES && w11 < b()) {
                w11 = b();
            }
            return new Pair<>(Long.valueOf(w11), timeUnit);
        }

        public final boolean e(SharedPreferences sharedPreferences) {
            p.j(sharedPreferences, "sharedPreferences");
            String string = sharedPreferences.getString("should_cancel_clear_cache_periodic_worker", "false");
            if (string == null) {
                string = "";
            }
            return c.p(string, false);
        }

        public final boolean f(SharedPreferences sharedPreferences) {
            p.j(sharedPreferences, "sharedPreferences");
            String string = sharedPreferences.getString("should_run_clear_cache_periodic_worker", "false");
            if (string == null) {
                string = "";
            }
            return c.p(string, false);
        }

        public final void g(n nVar, Pair<Long, ? extends TimeUnit> pair) {
            p.j(nVar, "workManager");
            p.j(pair, "repeatIntervalInfo");
            d4.a a11 = new a.C0116a().a();
            p.i(a11, "Builder().build()");
            e b11 = ((d.a) ((d.a) new d.a(ClearCachePeriodicWorker.class, pair.c().longValue(), (TimeUnit) pair.d()).e(a11)).a("ClearCachePeriodicWorker")).b();
            p.i(b11, "PeriodicWorkRequestBuild…\n                .build()");
            nVar.h("ClearCachePeriodicWorker", ExistingPeriodicWorkPolicy.KEEP, (d) b11);
        }

        public final void h(Context context, SharedPreferences sharedPreferences) {
            p.j(context, LogCategory.CONTEXT);
            p.j(sharedPreferences, "sharedPreferences");
            n k = n.k(context);
            p.i(k, "getInstance(context)");
            if (c(sharedPreferences) || e(sharedPreferences)) {
                a(k);
            }
            if (f(sharedPreferences)) {
                g(k, d(sharedPreferences));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearCachePeriodicWorker(Context context, WorkerParameters workerParameters, jr.a aVar, SharedPreferences sharedPreferences) {
        super(context, workerParameters);
        p.j(context, "arg0");
        p.j(workerParameters, "arg1");
        p.j(aVar, "newRelic");
        p.j(sharedPreferences, "sharedPreferences");
        this.f18594g = aVar;
        this.f18595h = sharedPreferences;
    }

    public ListenableWorker.a w() {
        int i11;
        HashMap hashMap = new HashMap();
        hashMap.put("cache_folder_name", "lottie_network_cache");
        try {
            File[] listFiles = new File(b().getCacheDir(), "lottie_network_cache").listFiles();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i12 = 0;
            long j11 = 0;
            if (listFiles != null) {
                for (File file : listFiles) {
                    j11 += file.length();
                    if (file.delete()) {
                        String name = file.getName();
                        p.i(name, "file.name");
                        linkedHashSet.add(name);
                    }
                }
            }
            if (listFiles == null) {
                i11 = 0;
            } else {
                i11 = listFiles.length;
            }
            hashMap.put("no_of_files_on_cache_folder_to_be_deleted", Integer.valueOf(i11));
            hashMap.put("size_of_folder_to_be_deleted", Long.valueOf(j11));
            au.i iVar = au.i.f53983a;
            Set<String> l11 = iVar.l(this.f18595h);
            if (l11 != null) {
                i12 = l11.size();
            }
            hashMap.put("no_of_files_on_spf_to_be_deleted", Integer.valueOf(i12));
            iVar.q(this.f18595h, linkedHashSet);
            y(hashMap);
            ListenableWorker.a c11 = ListenableWorker.a.c();
            p.i(c11, "{\n            val lottie…esult.success()\n        }");
            return c11;
        } catch (Throwable th2) {
            z(th2, hashMap);
            ListenableWorker.a a11 = ListenableWorker.a.a();
            p.i(a11, "{\n            logError(e…esult.failure()\n        }");
            return a11;
        }
    }

    public final void y(HashMap<String, Object> hashMap) {
        p.j(hashMap, "attrs");
        this.f18594g.a("clear_cache_metric_name", hashMap);
    }

    public final void z(Throwable th2, HashMap<String, Object> hashMap) {
        String message;
        p.j(hashMap, "attrs");
        u.b("ClearCachePeriodicWorker", th2 == null ? null : th2.getMessage());
        String str = "";
        if (!(th2 == null || (message = th2.getMessage()) == null)) {
            str = message;
        }
        hashMap.put("clear_cache_exception_error_message", str);
        this.f18594g.b("clear_cache_exception_metric_name", hashMap);
    }
}
