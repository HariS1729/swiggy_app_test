package n0;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: Snapshot.kt */
public abstract class e {

    /* compiled from: Snapshot.kt */
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.compose.runtime.snapshots.b f15733a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.snapshots.b bVar) {
            super((i) null);
            p.j(bVar, "snapshot");
            this.f15733a = bVar;
        }
    }

    /* compiled from: Snapshot.kt */
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15734a = new b();

        private b() {
            super((i) null);
        }
    }

    private e() {
    }

    public /* synthetic */ e(i iVar) {
        this();
    }
}
