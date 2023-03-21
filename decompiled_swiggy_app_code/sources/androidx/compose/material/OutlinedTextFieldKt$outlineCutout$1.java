package androidx.compose.material;

import androidx.compose.ui.unit.LayoutDirection;
import bp0.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import u0.c0;
import w0.c;
import w0.d;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements l<c, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f5185a;

    /* compiled from: OutlinedTextField.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5186a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f5186a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$outlineCutout$1(long j) {
        super(1);
        this.f5185a = j;
    }

    public final void a(c cVar) {
        float f11;
        p.j(cVar, "$this$drawWithContent");
        float i11 = t0.l.i(this.f5185a);
        if (i11 > 0.0f) {
            float v02 = cVar.v0(OutlinedTextFieldKt.f5101a);
            float v03 = cVar.v0(TextFieldImplKt.h()) - v02;
            float f12 = (float) 2;
            float f13 = i11 + v03 + (v02 * f12);
            LayoutDirection layoutDirection = cVar.getLayoutDirection();
            int[] iArr = a.f5186a;
            int i12 = iArr[layoutDirection.ordinal()];
            if (i12 == 1) {
                f11 = v03;
            } else if (i12 == 2) {
                f11 = t0.l.i(cVar.d()) - f13;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i13 = iArr[cVar.getLayoutDirection().ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    f13 = t0.l.i(cVar.d()) - v03;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            float f14 = f13;
            float g11 = t0.l.g(this.f5185a);
            int a11 = c0.f16752a.a();
            d O = cVar.O();
            long d11 = O.d();
            O.a().a();
            O.c().b(f11, (-g11) / f12, f14, g11 / f12, a11);
            cVar.V();
            O.a().o();
            O.b(d11);
            return;
        }
        cVar.V();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((c) obj);
        return k.f22762a;
    }
}
