package androidx.compose.ui.focus;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;
import s0.b;
import s0.f;
import s0.g;
import s0.j;
import s0.o;
import s0.s;
import s0.t;

/* compiled from: FocusManager.kt */
public final class FocusManagerImpl implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FocusModifier f6367a;

    /* renamed from: b  reason: collision with root package name */
    private final d f6368b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutDirection f6369c;

    /* compiled from: FocusManager.kt */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6370a;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            f6370a = iArr;
        }
    }

    public FocusManagerImpl(FocusModifier focusModifier) {
        p.j(focusModifier, "focusModifier");
        this.f6367a = focusModifier;
        this.f6368b = FocusModifierKt.b(d.f16037h0, focusModifier);
    }

    private final boolean j(int i11) {
        if (this.f6367a.i().getHasFocus() && !this.f6367a.i().isFocused()) {
            b.a aVar = b.f16557b;
            if (b.l(i11, aVar.d()) ? true : b.l(i11, aVar.f())) {
                b(false);
                if (!this.f6367a.i().isFocused()) {
                    return false;
                }
                return a(i11);
            }
        }
        return false;
    }

    public boolean a(int i11) {
        FocusModifier b11 = t.b(this.f6367a);
        if (b11 == null) {
            return false;
        }
        o a11 = j.a(b11, i11, e());
        if (!p.e(a11, o.f16587b.a())) {
            a11.c();
            return true;
        } else if (t.f(this.f6367a, i11, e(), new FocusManagerImpl$moveFocus$1(b11)) || j(i11)) {
            return true;
        } else {
            return false;
        }
    }

    public void b(boolean z11) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl i11 = this.f6367a.i();
        if (s.c(this.f6367a, z11)) {
            FocusModifier focusModifier = this.f6367a;
            switch (a.f6370a[i11.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.v(focusStateImpl);
        }
    }

    public final void c() {
        g.d(this.f6367a);
    }

    public final FocusModifier d() {
        return g.c(this.f6367a);
    }

    public final LayoutDirection e() {
        LayoutDirection layoutDirection = this.f6369c;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        p.B("layoutDirection");
        return null;
    }

    public final d f() {
        return this.f6368b;
    }

    public final void g() {
        s.c(this.f6367a, true);
    }

    public final void h(LayoutDirection layoutDirection) {
        p.j(layoutDirection, "<set-?>");
        this.f6369c = layoutDirection;
    }

    public final void i() {
        if (this.f6367a.i() == FocusStateImpl.Inactive) {
            this.f6367a.v(FocusStateImpl.Active);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusManagerImpl(FocusModifier focusModifier, int i11, i iVar) {
        this((i11 & 1) != 0 ? new FocusModifier(FocusStateImpl.Inactive, (l) null, 2, (i) null) : focusModifier);
    }
}
