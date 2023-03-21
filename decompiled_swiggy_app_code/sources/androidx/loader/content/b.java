package androidx.loader.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader */
public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    int f10824a;

    /* renamed from: b  reason: collision with root package name */
    C0071b<D> f10825b;

    /* renamed from: c  reason: collision with root package name */
    a<D> f10826c;

    /* renamed from: d  reason: collision with root package name */
    Context f10827d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10828e = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f10829f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f10830g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f10831h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f10832i = false;

    /* compiled from: Loader */
    public interface a<D> {
        void a(b<D> bVar);
    }

    /* renamed from: androidx.loader.content.b$b  reason: collision with other inner class name */
    /* compiled from: Loader */
    public interface C0071b<D> {
        void a(b<D> bVar, D d11);
    }

    public b(Context context) {
        this.f10827d = context.getApplicationContext();
    }

    public void a() {
        this.f10829f = true;
        j();
    }

    public boolean b() {
        return k();
    }

    public void c() {
        this.f10832i = false;
    }

    public String d(D d11) {
        StringBuilder sb2 = new StringBuilder(64);
        androidx.core.util.b.a(d11, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    public void e() {
        a<D> aVar = this.f10826c;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void f(D d11) {
        C0071b<D> bVar = this.f10825b;
        if (bVar != null) {
            bVar.a(this, d11);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f10824a);
        printWriter.print(" mListener=");
        printWriter.println(this.f10825b);
        if (this.f10828e || this.f10831h || this.f10832i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f10828e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f10831h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f10832i);
        }
        if (this.f10829f || this.f10830g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f10829f);
            printWriter.print(" mReset=");
            printWriter.println(this.f10830g);
        }
    }

    public void h() {
        m();
    }

    public boolean i() {
        return this.f10829f;
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        throw null;
    }

    public void l() {
        if (this.f10828e) {
            h();
        } else {
            this.f10831h = true;
        }
    }

    /* access modifiers changed from: protected */
    public void m() {
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: protected */
    public void o() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void p() {
    }

    public void q(int i11, C0071b<D> bVar) {
        if (this.f10825b == null) {
            this.f10825b = bVar;
            this.f10824a = i11;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void r() {
        n();
        this.f10830g = true;
        this.f10828e = false;
        this.f10829f = false;
        this.f10831h = false;
        this.f10832i = false;
    }

    public void s() {
        if (this.f10832i) {
            l();
        }
    }

    public final void t() {
        this.f10828e = true;
        this.f10830g = false;
        this.f10829f = false;
        o();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        androidx.core.util.b.a(this, sb2);
        sb2.append(" id=");
        sb2.append(this.f10824a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u() {
        this.f10828e = false;
        p();
    }

    public void v(C0071b<D> bVar) {
        C0071b<D> bVar2 = this.f10825b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f10825b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
