package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import bp0.k;
import f0.d;
import f0.e;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import lp0.a;
import lp0.l;
import lp0.p;

/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$applyObserver$1 extends Lambda implements p<Set<? extends Object>, b, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SnapshotStateObserver f6279a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.f6279a = snapshotStateObserver;
    }

    public final void a(Set<? extends Object> set, b bVar) {
        int i11;
        kotlin.jvm.internal.p.j(set, "applied");
        kotlin.jvm.internal.p.j(bVar, "<anonymous parameter 1>");
        e b11 = this.f6279a.f6271d;
        SnapshotStateObserver snapshotStateObserver = this.f6279a;
        synchronized (b11) {
            e b12 = snapshotStateObserver.f6271d;
            int m11 = b12.m();
            i11 = 0;
            if (m11 > 0) {
                Object[] l11 = b12.l();
                int i12 = 0;
                do {
                    SnapshotStateObserver.a aVar = (SnapshotStateObserver.a) l11[i11];
                    HashSet<Object> d11 = aVar.d();
                    d e11 = aVar.e();
                    for (Object a11 : set) {
                        int a12 = e11.f(a11);
                        if (a12 >= 0) {
                            for (Object add : e11.o(a12)) {
                                d11.add(add);
                                i12 = 1;
                            }
                        }
                    }
                    i11++;
                } while (i11 < m11);
                i11 = i12;
            }
            k kVar = k.f22762a;
        }
        if (i11 != 0) {
            l d12 = this.f6279a.f6268a;
            final SnapshotStateObserver snapshotStateObserver2 = this.f6279a;
            d12.invoke(new a<k>() {
                public final void invoke() {
                    snapshotStateObserver2.f();
                }
            });
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((Set) obj, (b) obj2);
        return k.f22762a;
    }
}
