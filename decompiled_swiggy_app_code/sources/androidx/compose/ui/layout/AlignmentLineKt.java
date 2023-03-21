package androidx.compose.ui.layout;

import i1.a;
import i1.h;
import kotlin.jvm.internal.p;

/* compiled from: AlignmentLine.kt */
public final class AlignmentLineKt {

    /* renamed from: a  reason: collision with root package name */
    private static final h f6715a = new h(AlignmentLineKt$FirstBaseline$1.f6717a);

    /* renamed from: b  reason: collision with root package name */
    private static final h f6716b = new h(AlignmentLineKt$LastBaseline$1.f6718a);

    public static final h a() {
        return f6715a;
    }

    public static final h b() {
        return f6716b;
    }

    public static final int c(a aVar, int i11, int i12) {
        p.j(aVar, "<this>");
        return aVar.a().invoke(Integer.valueOf(i11), Integer.valueOf(i12)).intValue();
    }
}
