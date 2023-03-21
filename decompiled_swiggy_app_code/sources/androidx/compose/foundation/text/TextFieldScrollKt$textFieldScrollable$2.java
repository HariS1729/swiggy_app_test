package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.y1;
import e0.g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.q;
import p0.d;
import u.k;

/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements q<d, g, Integer, d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextFieldScrollerPosition f4610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f4611b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f4612c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z11, k kVar) {
        super(3);
        this.f4610a = textFieldScrollerPosition;
        this.f4611b = z11;
        this.f4612c = kVar;
    }

    public final d a(d dVar, g gVar, int i11) {
        boolean z11;
        p.j(dVar, "$this$composed");
        gVar.E(805428266);
        boolean z12 = this.f4610a.f() == Orientation.Vertical || !(gVar.z(CompositionLocalsKt.j()) == LayoutDirection.Rtl);
        y1.r b11 = ScrollableStateKt.b(new TextFieldScrollKt$textFieldScrollable$2$controller$1(this.f4610a), gVar, 0);
        d.a aVar = d.f16037h0;
        Orientation f11 = this.f4610a.f();
        if (this.f4611b) {
            if (!(this.f4610a.c() == 0.0f)) {
                z11 = true;
                d j = ScrollableKt.j(aVar, b11, f11, z11, z12, (y1.k) null, this.f4612c, 16, (Object) null);
                gVar.P();
                return j;
            }
        }
        z11 = false;
        d j11 = ScrollableKt.j(aVar, b11, f11, z11, z12, (y1.k) null, this.f4612c, 16, (Object) null);
        gVar.P();
        return j11;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((d) obj, (g) obj2, ((Number) obj3).intValue());
    }
}
