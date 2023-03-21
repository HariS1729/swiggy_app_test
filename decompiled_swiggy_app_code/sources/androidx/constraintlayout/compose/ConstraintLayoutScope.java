package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.o0;
import bp0.k;
import d2.e;
import f2.b;
import i1.d0;
import java.util.ArrayList;
import kotlin.jvm.internal.p;
import lp0.l;
import p0.d;

/* compiled from: ConstraintLayout.kt */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {

    /* renamed from: e  reason: collision with root package name */
    private a f7950e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7951f;

    /* renamed from: g  reason: collision with root package name */
    private int f7952g = this.f7951f;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<b> f7953h = new ArrayList<>();

    /* compiled from: ConstraintLayout.kt */
    private static final class ConstrainAsModifier extends o0 implements d0 {

        /* renamed from: b  reason: collision with root package name */
        private final b f7956b;

        /* renamed from: c  reason: collision with root package name */
        private final l<ConstrainScope, k> f7957c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ConstrainAsModifier(b bVar, l<? super ConstrainScope, k> lVar) {
            super(InspectableValueKt.c() ? new ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(bVar, lVar) : InspectableValueKt.a());
            p.j(bVar, "ref");
            p.j(lVar, "constrainBlock");
            this.f7956b = bVar;
            this.f7957c = lVar;
        }

        public d N(d dVar) {
            return d0.a.d(this, dVar);
        }

        public <R> R W(R r11, lp0.p<? super d.b, ? super R, ? extends R> pVar) {
            return d0.a.c(this, r11, pVar);
        }

        /* renamed from: c */
        public c U(e eVar, Object obj) {
            p.j(eVar, "<this>");
            return new c(this.f7956b, this.f7957c);
        }

        public boolean equals(Object obj) {
            l<ConstrainScope, k> lVar = this.f7957c;
            l<ConstrainScope, k> lVar2 = null;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            if (constrainAsModifier != null) {
                lVar2 = constrainAsModifier.f7957c;
            }
            return p.e(lVar, lVar2);
        }

        public int hashCode() {
            return this.f7957c.hashCode();
        }

        public <R> R s(R r11, lp0.p<? super R, ? super d.b, ? extends R> pVar) {
            return d0.a.b(this, r11, pVar);
        }

        public boolean x(l<? super d.b, Boolean> lVar) {
            return d0.a.a(this, lVar);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConstraintLayoutScope f7958a;

        public a(ConstraintLayoutScope constraintLayoutScope) {
            p.j(constraintLayoutScope, "this$0");
            this.f7958a = constraintLayoutScope;
        }

        public final b a() {
            return this.f7958a.i();
        }

        public final b b() {
            return this.f7958a.i();
        }

        public final b c() {
            return this.f7958a.i();
        }

        public final b d() {
            return this.f7958a.i();
        }

        public final b e() {
            return this.f7958a.i();
        }
    }

    public void f() {
        super.f();
        this.f7952g = this.f7951f;
    }

    public final d h(d dVar, b bVar, l<? super ConstrainScope, k> lVar) {
        p.j(dVar, "<this>");
        p.j(bVar, "ref");
        p.j(lVar, "constrainBlock");
        return dVar.N(new ConstrainAsModifier(bVar, lVar));
    }

    public final b i() {
        ArrayList<b> arrayList = this.f7953h;
        int i11 = this.f7952g;
        this.f7952g = i11 + 1;
        b bVar = (b) s.Z(arrayList, i11);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(Integer.valueOf(this.f7952g));
        this.f7953h.add(bVar2);
        return bVar2;
    }

    public final a j() {
        a aVar = this.f7950e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.f7950e = aVar2;
        return aVar2;
    }
}
