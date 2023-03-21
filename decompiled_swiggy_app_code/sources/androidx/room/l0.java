package androidx.room;

import java.util.ArrayList;
import java.util.List;
import t3.i;

/* compiled from: QueryInterceptorProgram */
final class l0 implements i {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f11586a = new ArrayList();

    l0() {
    }

    private void b(int i11, Object obj) {
        int i12 = i11 - 1;
        if (i12 >= this.f11586a.size()) {
            for (int size = this.f11586a.size(); size <= i12; size++) {
                this.f11586a.add((Object) null);
            }
        }
        this.f11586a.set(i12, obj);
    }

    public void K(int i11, String str) {
        b(i11, str);
    }

    public void R(int i11, long j) {
        b(i11, Long.valueOf(j));
    }

    public void S(int i11, byte[] bArr) {
        b(i11, bArr);
    }

    /* access modifiers changed from: package-private */
    public List<Object> a() {
        return this.f11586a;
    }

    public void b0(int i11) {
        b(i11, (Object) null);
    }

    public void close() {
    }

    public void o0(int i11, double d11) {
        b(i11, Double.valueOf(d11));
    }
}
