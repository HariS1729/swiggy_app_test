package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import d2.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p0.a;
import p0.d;

/* compiled from: Size.kt */
public final class SizeKt {

    /* renamed from: a  reason: collision with root package name */
    private static final FillModifier f3810a = c(1.0f);

    /* renamed from: b  reason: collision with root package name */
    private static final FillModifier f3811b = a(1.0f);

    /* renamed from: c  reason: collision with root package name */
    private static final FillModifier f3812c = b(1.0f);

    /* renamed from: d  reason: collision with root package name */
    private static final WrapContentModifier f3813d;

    /* renamed from: e  reason: collision with root package name */
    private static final WrapContentModifier f3814e;

    /* renamed from: f  reason: collision with root package name */
    private static final WrapContentModifier f3815f;

    /* renamed from: g  reason: collision with root package name */
    private static final WrapContentModifier f3816g;

    /* renamed from: h  reason: collision with root package name */
    private static final WrapContentModifier f3817h;

    /* renamed from: i  reason: collision with root package name */
    private static final WrapContentModifier f3818i;

    static {
        a.C0160a aVar = a.f16019a;
        f3813d = f(aVar.g(), false);
        f3814e = f(aVar.k(), false);
        f3815f = d(aVar.i(), false);
        f3816g = d(aVar.l(), false);
        f3817h = e(aVar.e(), false);
        f3818i = e(aVar.o(), false);
    }

    public static final d A(d dVar, a.c cVar, boolean z11) {
        WrapContentModifier wrapContentModifier;
        p.j(dVar, "<this>");
        p.j(cVar, "align");
        a.C0160a aVar = a.f16019a;
        if (p.e(cVar, aVar.i()) && !z11) {
            wrapContentModifier = f3815f;
        } else if (!p.e(cVar, aVar.l()) || z11) {
            wrapContentModifier = d(cVar, z11);
        } else {
            wrapContentModifier = f3816g;
        }
        return dVar.N(wrapContentModifier);
    }

    public static /* synthetic */ d B(d dVar, a.c cVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = a.f16019a.i();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return A(dVar, cVar, z11);
    }

    public static final d C(d dVar, a aVar, boolean z11) {
        WrapContentModifier wrapContentModifier;
        p.j(dVar, "<this>");
        p.j(aVar, "align");
        a.C0160a aVar2 = a.f16019a;
        if (p.e(aVar, aVar2.e()) && !z11) {
            wrapContentModifier = f3817h;
        } else if (!p.e(aVar, aVar2.o()) || z11) {
            wrapContentModifier = e(aVar, z11);
        } else {
            wrapContentModifier = f3818i;
        }
        return dVar.N(wrapContentModifier);
    }

    public static /* synthetic */ d D(d dVar, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a.f16019a.e();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return C(dVar, aVar, z11);
    }

    public static final d E(d dVar, a.b bVar, boolean z11) {
        WrapContentModifier wrapContentModifier;
        p.j(dVar, "<this>");
        p.j(bVar, "align");
        a.C0160a aVar = a.f16019a;
        if (p.e(bVar, aVar.g()) && !z11) {
            wrapContentModifier = f3813d;
        } else if (!p.e(bVar, aVar.k()) || z11) {
            wrapContentModifier = f(bVar, z11);
        } else {
            wrapContentModifier = f3814e;
        }
        return dVar.N(wrapContentModifier);
    }

    public static /* synthetic */ d F(d dVar, a.b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = a.f16019a.g();
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return E(dVar, bVar, z11);
    }

    private static final FillModifier a(float f11) {
        return new FillModifier(Direction.Vertical, f11, new SizeKt$createFillHeightModifier$1(f11));
    }

    private static final FillModifier b(float f11) {
        return new FillModifier(Direction.Both, f11, new SizeKt$createFillSizeModifier$1(f11));
    }

    private static final FillModifier c(float f11) {
        return new FillModifier(Direction.Horizontal, f11, new SizeKt$createFillWidthModifier$1(f11));
    }

    private static final WrapContentModifier d(a.c cVar, boolean z11) {
        return new WrapContentModifier(Direction.Vertical, z11, new SizeKt$createWrapContentHeightModifier$1(cVar), cVar, new SizeKt$createWrapContentHeightModifier$2(cVar, z11));
    }

    private static final WrapContentModifier e(a aVar, boolean z11) {
        return new WrapContentModifier(Direction.Both, z11, new SizeKt$createWrapContentSizeModifier$1(aVar), aVar, new SizeKt$createWrapContentSizeModifier$2(aVar, z11));
    }

    private static final WrapContentModifier f(a.b bVar, boolean z11) {
        return new WrapContentModifier(Direction.Horizontal, z11, new SizeKt$createWrapContentWidthModifier$1(bVar), bVar, new SizeKt$createWrapContentWidthModifier$2(bVar, z11));
    }

    public static final d g(d dVar, float f11, float f12) {
        p.j(dVar, "$this$defaultMinSize");
        return dVar.N(new UnspecifiedConstraintsModifier(f11, f12, InspectableValueKt.c() ? new SizeKt$defaultMinSizeVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), (i) null));
    }

    public static /* synthetic */ d h(d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.f13997b.c();
        }
        if ((i11 & 2) != 0) {
            f12 = h.f13997b.c();
        }
        return g(dVar, f11, f12);
    }

    public static final d i(d dVar, float f11) {
        p.j(dVar, "<this>");
        return dVar.N((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f3811b : a(f11));
    }

    public static /* synthetic */ d j(d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return i(dVar, f11);
    }

    public static final d k(d dVar, float f11) {
        p.j(dVar, "<this>");
        return dVar.N((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f3812c : b(f11));
    }

    public static /* synthetic */ d l(d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return k(dVar, f11);
    }

    public static final d m(d dVar, float f11) {
        p.j(dVar, "<this>");
        return dVar.N((f11 > 1.0f ? 1 : (f11 == 1.0f ? 0 : -1)) == 0 ? f3810a : c(f11));
    }

    public static /* synthetic */ d n(d dVar, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return m(dVar, f11);
    }

    public static final d o(d dVar, float f11) {
        p.j(dVar, "$this$height");
        return dVar.N(new SizeModifier(0.0f, f11, 0.0f, f11, true, InspectableValueKt.c() ? new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f11) : InspectableValueKt.a(), 5, (i) null));
    }

    public static final d p(d dVar, float f11, float f12) {
        p.j(dVar, "$this$heightIn");
        return dVar.N(new SizeModifier(0.0f, f11, 0.0f, f12, true, InspectableValueKt.c() ? new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), 5, (i) null));
    }

    public static /* synthetic */ d q(d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.f13997b.c();
        }
        if ((i11 & 2) != 0) {
            f12 = h.f13997b.c();
        }
        return p(dVar, f11, f12);
    }

    public static final d r(d dVar, float f11) {
        p.j(dVar, "$this$requiredSize");
        return dVar.N(new SizeModifier(f11, f11, f11, f11, false, InspectableValueKt.c() ? new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f11) : InspectableValueKt.a(), (i) null));
    }

    public static final d s(d dVar, float f11, float f12) {
        p.j(dVar, "$this$requiredSize");
        return dVar.N(new SizeModifier(f11, f12, f11, f12, false, InspectableValueKt.c() ? new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), (i) null));
    }

    public static final d t(d dVar, float f11) {
        p.j(dVar, "$this$size");
        return dVar.N(new SizeModifier(f11, f11, f11, f11, true, InspectableValueKt.c() ? new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f11) : InspectableValueKt.a(), (i) null));
    }

    public static final d u(d dVar, float f11, float f12) {
        p.j(dVar, "$this$size");
        return dVar.N(new SizeModifier(f11, f12, f11, f12, true, InspectableValueKt.c() ? new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), (i) null));
    }

    public static final d v(d dVar, float f11, float f12, float f13, float f14) {
        p.j(dVar, "$this$sizeIn");
        return dVar.N(new SizeModifier(f11, f12, f13, f14, true, InspectableValueKt.c() ? new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f11, f12, f13, f14) : InspectableValueKt.a(), (i) null));
    }

    public static /* synthetic */ d w(d dVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.f13997b.c();
        }
        if ((i11 & 2) != 0) {
            f12 = h.f13997b.c();
        }
        if ((i11 & 4) != 0) {
            f13 = h.f13997b.c();
        }
        if ((i11 & 8) != 0) {
            f14 = h.f13997b.c();
        }
        return v(dVar, f11, f12, f13, f14);
    }

    public static final d x(d dVar, float f11) {
        p.j(dVar, "$this$width");
        return dVar.N(new SizeModifier(f11, 0.0f, f11, 0.0f, true, InspectableValueKt.c() ? new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f11) : InspectableValueKt.a(), 10, (i) null));
    }

    public static final d y(d dVar, float f11, float f12) {
        p.j(dVar, "$this$widthIn");
        return dVar.N(new SizeModifier(f11, 0.0f, f12, 0.0f, true, InspectableValueKt.c() ? new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f11, f12) : InspectableValueKt.a(), 10, (i) null));
    }

    public static /* synthetic */ d z(d dVar, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = h.f13997b.c();
        }
        if ((i11 & 2) != 0) {
            f12 = h.f13997b.c();
        }
        return y(dVar, f11, f12);
    }
}
