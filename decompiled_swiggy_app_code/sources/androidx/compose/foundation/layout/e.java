package androidx.compose.foundation.layout;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;
import p0.d;

/* compiled from: Intrinsic.kt */
public final class e {

    /* compiled from: Intrinsic.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3904a;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            iArr[IntrinsicSize.Min.ordinal()] = 1;
            iArr[IntrinsicSize.Max.ordinal()] = 2;
            f3904a = iArr;
        }
    }

    public static final d a(d dVar, IntrinsicSize intrinsicSize) {
        p.j(dVar, "<this>");
        p.j(intrinsicSize, "intrinsicSize");
        int i11 = a.f3904a[intrinsicSize.ordinal()];
        if (i11 == 1) {
            return dVar.N(i.f3907a);
        }
        if (i11 == 2) {
            return dVar.N(g.f3905a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d b(d dVar, IntrinsicSize intrinsicSize) {
        p.j(dVar, "<this>");
        p.j(intrinsicSize, "intrinsicSize");
        int i11 = a.f3904a[intrinsicSize.ordinal()];
        if (i11 == 1) {
            return dVar.N(j.f3908a);
        }
        if (i11 == 2) {
            return dVar.N(h.f3906a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
