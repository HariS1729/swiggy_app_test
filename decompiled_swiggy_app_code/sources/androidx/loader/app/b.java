package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.h;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.loader.app.a;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* compiled from: LoaderManagerImpl */
class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f10790c = false;

    /* renamed from: a  reason: collision with root package name */
    private final r f10791a;

    /* renamed from: b  reason: collision with root package name */
    private final c f10792b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends y<D> implements b.C0071b<D> {

        /* renamed from: l  reason: collision with root package name */
        private final int f10793l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f10794m;
        private final androidx.loader.content.b<D> n;

        /* renamed from: o  reason: collision with root package name */
        private r f10795o;

        /* renamed from: p  reason: collision with root package name */
        private C0069b<D> f10796p;
        private androidx.loader.content.b<D> q;

        a(int i11, Bundle bundle, androidx.loader.content.b<D> bVar, androidx.loader.content.b<D> bVar2) {
            this.f10793l = i11;
            this.f10794m = bundle;
            this.n = bVar;
            this.q = bVar2;
            bVar.q(i11, this);
        }

        public void a(androidx.loader.content.b<D> bVar, D d11) {
            if (b.f10790c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                q(d11);
                return;
            }
            if (b.f10790c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            n(d11);
        }

        /* access modifiers changed from: protected */
        public void l() {
            if (b.f10790c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.n.t();
        }

        /* access modifiers changed from: protected */
        public void m() {
            if (b.f10790c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.n.u();
        }

        public void o(z<? super D> zVar) {
            super.o(zVar);
            this.f10795o = null;
            this.f10796p = null;
        }

        public void q(D d11) {
            super.q(d11);
            androidx.loader.content.b<D> bVar = this.q;
            if (bVar != null) {
                bVar.r();
                this.q = null;
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> r(boolean z11) {
            if (b.f10790c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.n.b();
            this.n.a();
            C0069b<D> bVar = this.f10796p;
            if (bVar != null) {
                o(bVar);
                if (z11) {
                    bVar.d();
                }
            }
            this.n.v(this);
            if ((bVar == null || bVar.c()) && !z11) {
                return this.n;
            }
            this.n.r();
            return this.q;
        }

        public void s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10793l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10794m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            androidx.loader.content.b<D> bVar = this.n;
            bVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f10796p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10796p);
                C0069b<D> bVar2 = this.f10796p;
                bVar2.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(t().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> t() {
            return this.n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f10793l);
            sb2.append(" : ");
            androidx.core.util.b.a(this.n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public void u() {
            r rVar = this.f10795o;
            C0069b<D> bVar = this.f10796p;
            if (rVar != null && bVar != null) {
                super.o(bVar);
                j(rVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public androidx.loader.content.b<D> v(r rVar, a.C0068a<D> aVar) {
            C0069b<D> bVar = new C0069b<>(this.n, aVar);
            j(rVar, bVar);
            C0069b<D> bVar2 = this.f10796p;
            if (bVar2 != null) {
                o(bVar2);
            }
            this.f10795o = rVar;
            this.f10796p = bVar;
            return this.n;
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    static class C0069b<D> implements z<D> {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.loader.content.b<D> f10797a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C0068a<D> f10798b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f10799c = false;

        C0069b(androidx.loader.content.b<D> bVar, a.C0068a<D> aVar) {
            this.f10797a = bVar;
            this.f10798b = aVar;
        }

        public void a(D d11) {
            if (b.f10790c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f10797a + ": " + this.f10797a.d(d11));
            }
            this.f10798b.b(this.f10797a, d11);
            this.f10799c = true;
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10799c);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f10799c;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f10799c) {
                if (b.f10790c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f10797a);
                }
                this.f10798b.c(this.f10797a);
            }
        }

        public String toString() {
            return this.f10798b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl */
    static class c extends j0 {

        /* renamed from: f  reason: collision with root package name */
        private static final l0.b f10800f = new a();

        /* renamed from: d  reason: collision with root package name */
        private h<a> f10801d = new h<>();

        /* renamed from: e  reason: collision with root package name */
        private boolean f10802e = false;

        /* compiled from: LoaderManagerImpl */
        static class a implements l0.b {
            a() {
            }

            public <T extends j0> T a(Class<T> cls) {
                return new c();
            }

            public /* synthetic */ j0 b(Class cls, g3.a aVar) {
                return m0.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c m1(o0 o0Var) {
            return (c) new l0(o0Var, f10800f).a(c.class);
        }

        /* access modifiers changed from: protected */
        public void i1() {
            super.i1();
            int p11 = this.f10801d.p();
            for (int i11 = 0; i11 < p11; i11++) {
                this.f10801d.q(i11).r(true);
            }
            this.f10801d.e();
        }

        public void k1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10801d.p() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i11 = 0; i11 < this.f10801d.p(); i11++) {
                    a q = this.f10801d.q(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10801d.m(i11));
                    printWriter.print(": ");
                    printWriter.println(q.toString());
                    q.s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void l1() {
            this.f10802e = false;
        }

        /* access modifiers changed from: package-private */
        public <D> a<D> n1(int i11) {
            return this.f10801d.i(i11);
        }

        /* access modifiers changed from: package-private */
        public boolean o1() {
            return this.f10802e;
        }

        /* access modifiers changed from: package-private */
        public void p1() {
            int p11 = this.f10801d.p();
            for (int i11 = 0; i11 < p11; i11++) {
                this.f10801d.q(i11).u();
            }
        }

        /* access modifiers changed from: package-private */
        public void q1(int i11, a aVar) {
            this.f10801d.n(i11, aVar);
        }

        /* access modifiers changed from: package-private */
        public void r1() {
            this.f10802e = true;
        }
    }

    b(r rVar, o0 o0Var) {
        this.f10791a = rVar;
        this.f10792b = c.m1(o0Var);
    }

    /* JADX INFO: finally extract failed */
    private <D> androidx.loader.content.b<D> e(int i11, Bundle bundle, a.C0068a<D> aVar, androidx.loader.content.b<D> bVar) {
        try {
            this.f10792b.r1();
            androidx.loader.content.b<D> a11 = aVar.a(i11, bundle);
            if (a11 != null) {
                if (a11.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a11.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a11);
                    }
                }
                a aVar2 = new a(i11, bundle, a11, bVar);
                if (f10790c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f10792b.q1(i11, aVar2);
                this.f10792b.l1();
                return aVar2.v(this.f10791a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f10792b.l1();
            throw th2;
        }
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10792b.k1(str, fileDescriptor, printWriter, strArr);
    }

    public <D> androidx.loader.content.b<D> c(int i11, Bundle bundle, a.C0068a<D> aVar) {
        if (this.f10792b.o1()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a n12 = this.f10792b.n1(i11);
            if (f10790c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (n12 == null) {
                return e(i11, bundle, aVar, (androidx.loader.content.b) null);
            }
            if (f10790c) {
                Log.v("LoaderManager", "  Re-using existing loader " + n12);
            }
            return n12.v(this.f10791a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void d() {
        this.f10792b.p1();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f10791a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
