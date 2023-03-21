package androidx.room;

import androidx.room.RoomDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import t3.k;

/* compiled from: QueryInterceptorStatement */
final class o0 implements k {

    /* renamed from: a  reason: collision with root package name */
    private final k f11606a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase.e f11607b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11608c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Object> f11609d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11610e;

    o0(k kVar, RoomDatabase.e eVar, String str, Executor executor) {
        this.f11606a = kVar;
        this.f11607b = eVar;
        this.f11608c = str;
        this.f11610e = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f11607b.a(this.f11608c, this.f11609d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f11607b.a(this.f11608c, this.f11609d);
    }

    private void j(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.f11609d.size()) {
            for (int size = this.f11609d.size(); size <= i12; size++) {
                this.f11609d.add((Object) null);
            }
        }
        this.f11609d.set(i12, obj);
    }

    public void K(int i11, String str) {
        j(i11, str);
        this.f11606a.K(i11, str);
    }

    public long P0() {
        this.f11610e.execute(new m0(this));
        return this.f11606a.P0();
    }

    public void R(int i11, long j) {
        j(i11, Long.valueOf(j));
        this.f11606a.R(i11, j);
    }

    public void S(int i11, byte[] bArr) {
        j(i11, bArr);
        this.f11606a.S(i11, bArr);
    }

    public void b0(int i11) {
        j(i11, this.f11609d.toArray());
        this.f11606a.b0(i11);
    }

    public void close() throws IOException {
        this.f11606a.close();
    }

    public int n() {
        this.f11610e.execute(new n0(this));
        return this.f11606a.n();
    }

    public void o0(int i11, double d11) {
        j(i11, Double.valueOf(d11));
        this.f11606a.o0(i11, d11);
    }
}
