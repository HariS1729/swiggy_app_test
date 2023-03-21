package androidx.compose.ui.focus;

import i1.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: TwoDimensionalFocusSearch.kt */
final class TwoDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements l<b.a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6407a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6408b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6409c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<FocusModifier, Boolean> f6410d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        super(1);
        this.f6407a = focusModifier;
        this.f6408b = focusModifier2;
        this.f6409c = i11;
        this.f6410d = lVar;
    }

    /* renamed from: a */
    public final Boolean invoke(b.a aVar) {
        p.j(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.p(this.f6407a, this.f6408b, this.f6409c, this.f6410d));
        if (valueOf.booleanValue() || !aVar.a()) {
            return valueOf;
        }
        return null;
    }
}
