package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader */
public abstract class a<D> extends b<D> {
    private final Executor j;
    volatile a<D>.defpackage.a k;

    /* renamed from: l  reason: collision with root package name */
    volatile a<D>.defpackage.a f10819l;

    /* renamed from: m  reason: collision with root package name */
    long f10820m;
    long n;

    /* renamed from: o  reason: collision with root package name */
    Handler f10821o;

    /* renamed from: androidx.loader.content.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncTaskLoader */
    final class C0070a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        private final CountDownLatch k = new CountDownLatch(1);

        /* renamed from: l  reason: collision with root package name */
        boolean f10822l;

        C0070a() {
        }

        /* access modifiers changed from: protected */
        public void h(D d11) {
            try {
                a.this.x(this, d11);
            } finally {
                this.k.countDown();
            }
        }

        /* access modifiers changed from: protected */
        public void i(D d11) {
            try {
                a.this.y(this, d11);
            } finally {
                this.k.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return a.this.C();
            } catch (OperationCanceledException e11) {
                if (f()) {
                    return null;
                }
                throw e11;
            }
        }

        public void run() {
            this.f10822l = false;
            a.this.z();
        }
    }

    public a(Context context) {
        this(context, ModernAsyncTask.f10805h);
    }

    public abstract D A();

    public void B(D d11) {
    }

    /* access modifiers changed from: protected */
    public D C() {
        return A();
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.f10822l);
        }
        if (this.f10819l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f10819l);
            printWriter.print(" waiting=");
            printWriter.println(this.f10819l.f10822l);
        }
        if (this.f10820m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            h.c(this.f10820m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            h.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        if (this.k == null) {
            return false;
        }
        if (!this.f10828e) {
            this.f10831h = true;
        }
        if (this.f10819l != null) {
            if (this.k.f10822l) {
                this.k.f10822l = false;
                this.f10821o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        } else if (this.k.f10822l) {
            this.k.f10822l = false;
            this.f10821o.removeCallbacks(this.k);
            this.k = null;
            return false;
        } else {
            boolean a11 = this.k.a(false);
            if (a11) {
                this.f10819l = this.k;
                w();
            }
            this.k = null;
            return a11;
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
        super.m();
        b();
        this.k = new C0070a();
        z();
    }

    public void w() {
    }

    /* access modifiers changed from: package-private */
    public void x(a<D>.defpackage.a aVar, D d11) {
        B(d11);
        if (this.f10819l == aVar) {
            s();
            this.n = SystemClock.uptimeMillis();
            this.f10819l = null;
            e();
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public void y(a<D>.defpackage.a aVar, D d11) {
        if (this.k != aVar) {
            x(aVar, d11);
        } else if (i()) {
            B(d11);
        } else {
            c();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            f(d11);
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f10819l == null && this.k != null) {
            if (this.k.f10822l) {
                this.k.f10822l = false;
                this.f10821o.removeCallbacks(this.k);
            }
            if (this.f10820m <= 0 || SystemClock.uptimeMillis() >= this.n + this.f10820m) {
                this.k.c(this.j, (Params[]) null);
                return;
            }
            this.k.f10822l = true;
            this.f10821o.postAtTime(this.k, this.n + this.f10820m);
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.n = -10000;
        this.j = executor;
    }
}
