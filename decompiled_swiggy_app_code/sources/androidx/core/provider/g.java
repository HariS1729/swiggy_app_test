package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.e;
import java.util.concurrent.Executor;

/* compiled from: FontsContractCompat */
public class g {

    /* compiled from: FontsContractCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f9350a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f9351b;

        @Deprecated
        public a(int i11, b[] bVarArr) {
            this.f9350a = i11;
            this.f9351b = bVarArr;
        }

        static a a(int i11, b[] bVarArr) {
            return new a(i11, bVarArr);
        }

        public b[] b() {
            return this.f9351b;
        }

        public int c() {
            return this.f9350a;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f9352a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9353b;

        /* renamed from: c  reason: collision with root package name */
        private final int f9354c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f9355d;

        /* renamed from: e  reason: collision with root package name */
        private final int f9356e;

        @Deprecated
        public b(Uri uri, int i11, int i12, boolean z11, int i13) {
            this.f9352a = (Uri) androidx.core.util.g.g(uri);
            this.f9353b = i11;
            this.f9354c = i12;
            this.f9355d = z11;
            this.f9356e = i13;
        }

        static b a(Uri uri, int i11, int i12, boolean z11, int i13) {
            return new b(uri, i11, i12, z11, i13);
        }

        public int b() {
            return this.f9356e;
        }

        public int c() {
            return this.f9353b;
        }

        public Uri d() {
            return this.f9352a;
        }

        public int e() {
            return this.f9354c;
        }

        public boolean f() {
            return this.f9355d;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class c {
        public void a(int i11) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i11, boolean z11, int i12, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        if (z11) {
            return f.e(context, eVar, aVar, i11, i12);
        }
        return f.d(context, eVar, i11, (Executor) null, aVar);
    }
}
