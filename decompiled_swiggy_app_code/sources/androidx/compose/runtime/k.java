package androidx.compose.runtime;

import e0.a1;
import e0.z0;
import kotlin.jvm.internal.p;

/* compiled from: SnapshotMutationPolicy.kt */
final class k implements a1<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final k f6172a = new k();

    private k() {
    }

    public boolean a(Object obj, Object obj2) {
        return p.e(obj, obj2);
    }

    public /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return z0.a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
