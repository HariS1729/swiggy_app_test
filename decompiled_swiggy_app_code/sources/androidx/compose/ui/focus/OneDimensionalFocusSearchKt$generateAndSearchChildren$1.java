package androidx.compose.ui.focus;

import i1.b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: OneDimensionalFocusSearch.kt */
final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements l<b.a, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FocusModifier f6403b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6404c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<FocusModifier, Boolean> f6405d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i11, l<? super FocusModifier, Boolean> lVar) {
        super(1);
        this.f6402a = focusModifier;
        this.f6403b = focusModifier2;
        this.f6404c = i11;
        this.f6405d = lVar;
    }

    /* renamed from: a */
    public final Boolean invoke(b.a aVar) {
        p.j(aVar, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.i(this.f6402a, this.f6403b, this.f6404c, this.f6405d));
        if (valueOf.booleanValue() || !aVar.a()) {
            return valueOf;
        }
        return null;
    }
}
