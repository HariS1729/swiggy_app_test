package b0;

import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.g;
import d2.l;
import d2.m;
import d2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* compiled from: AndroidSelectionHandles.android.kt */
public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final HandleReferencePoint f12551a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12552b;

    /* compiled from: AndroidSelectionHandles.android.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12553a;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            f12553a = iArr;
        }
    }

    private b(HandleReferencePoint handleReferencePoint, long j) {
        this.f12551a = handleReferencePoint;
        this.f12552b = j;
    }

    public /* synthetic */ b(HandleReferencePoint handleReferencePoint, long j, i iVar) {
        this(handleReferencePoint, j);
    }

    public long a(n nVar, long j, LayoutDirection layoutDirection, long j11) {
        p.j(nVar, "anchorBounds");
        p.j(layoutDirection, "layoutDirection");
        int i11 = a.f12553a[this.f12551a.ordinal()];
        if (i11 == 1) {
            return m.a(nVar.b() + l.j(this.f12552b), nVar.c() + l.k(this.f12552b));
        }
        if (i11 == 2) {
            return m.a((nVar.b() + l.j(this.f12552b)) - d2.p.g(j11), nVar.c() + l.k(this.f12552b));
        }
        if (i11 == 3) {
            return m.a((nVar.b() + l.j(this.f12552b)) - (d2.p.g(j11) / 2), nVar.c() + l.k(this.f12552b));
        }
        throw new NoWhenBranchMatchedException();
    }
}
