package androidx.compose.runtime;

import e0.a1;
import e0.z0;

/* compiled from: SnapshotMutationPolicy.kt */
final class f implements a1<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f6139a = new f();

    private f() {
    }

    public boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return z0.a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
