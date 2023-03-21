package w;

import androidx.compose.foundation.gestures.Orientation;
import i1.a;
import i1.u;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: LazyListMeasureResult.kt */
public final class m implements l, u {

    /* renamed from: a  reason: collision with root package name */
    private final s f17366a;

    /* renamed from: b  reason: collision with root package name */
    private final int f17367b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17368c;

    /* renamed from: d  reason: collision with root package name */
    private final float f17369d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f17370e;

    /* renamed from: f  reason: collision with root package name */
    private final int f17371f;

    /* renamed from: g  reason: collision with root package name */
    private final int f17372g;

    /* renamed from: h  reason: collision with root package name */
    private final int f17373h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f17374i;
    private final Orientation j;
    private final int k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ u f17375l;

    public m(s sVar, int i11, boolean z11, float f11, u uVar, List<? extends i> list, int i12, int i13, int i14, boolean z12, Orientation orientation, int i15) {
        p.j(uVar, "measureResult");
        p.j(list, "visibleItemsInfo");
        p.j(orientation, "orientation");
        this.f17366a = sVar;
        this.f17367b = i11;
        this.f17368c = z11;
        this.f17369d = f11;
        this.f17370e = list;
        this.f17371f = i12;
        this.f17372g = i13;
        this.f17373h = i14;
        this.f17374i = z12;
        this.j = orientation;
        this.k = i15;
        this.f17375l = uVar;
    }

    public Map<a, Integer> a() {
        return this.f17375l.a();
    }

    public int b() {
        return this.f17373h;
    }

    public List<i> c() {
        return this.f17370e;
    }

    public void d() {
        this.f17375l.d();
    }

    public final boolean e() {
        return this.f17368c;
    }

    public final float f() {
        return this.f17369d;
    }

    public final s g() {
        return this.f17366a;
    }

    public int getHeight() {
        return this.f17375l.getHeight();
    }

    public int getWidth() {
        return this.f17375l.getWidth();
    }

    public final int h() {
        return this.f17367b;
    }
}
