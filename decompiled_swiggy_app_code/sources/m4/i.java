package m4;

import androidx.work.WorkInfo;
import androidx.work.impl.utils.futures.b;
import java.util.List;
import l4.p;

/* compiled from: StatusRunnable */
public abstract class i<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f15652a = b.t();

    /* compiled from: StatusRunnable */
    class a extends i<List<WorkInfo>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e4.i f15653b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15654c;

        a(e4.i iVar, String str) {
            this.f15653b = iVar;
            this.f15654c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public List<WorkInfo> c() {
            return p.t.apply(this.f15653b.w().N().u(this.f15654c));
        }
    }

    public static i<List<WorkInfo>> a(e4.i iVar, String str) {
        return new a(iVar, str);
    }

    public com.google.common.util.concurrent.b<T> b() {
        return this.f15652a;
    }

    /* access modifiers changed from: package-private */
    public abstract T c();

    public void run() {
        try {
            this.f15652a.p(c());
        } catch (Throwable th2) {
            this.f15652a.q(th2);
        }
    }
}
