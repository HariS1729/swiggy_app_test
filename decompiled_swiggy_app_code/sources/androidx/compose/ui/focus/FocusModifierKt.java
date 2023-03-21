package androidx.compose.ui.focus;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import j1.f;
import lp0.l;
import lp0.p;
import p0.d;
import p0.e;
import s0.n;
import s0.q;

/* compiled from: FocusModifier.kt */
public final class FocusModifierKt {

    /* renamed from: a  reason: collision with root package name */
    private static final f<FocusModifier> f6387a = j1.c.a(FocusModifierKt$ModifierLocalParentFocusModifier$1.f6389a);

    /* renamed from: b  reason: collision with root package name */
    private static final d f6388b = d.f16037h0.N(new a()).N(new b()).N(new c());

    /* compiled from: FocusModifier.kt */
    public static final class a implements j1.d<n> {
        a() {
        }

        public /* synthetic */ d N(d dVar) {
            return p0.c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, p pVar) {
            return e.c(this, obj, pVar);
        }

        /* renamed from: a */
        public n getValue() {
            return null;
        }

        public f<n> getKey() {
            return FocusPropertiesKt.c();
        }

        public /* synthetic */ Object s(Object obj, p pVar) {
            return e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(l lVar) {
            return e.a(this, lVar);
        }
    }

    /* compiled from: FocusModifier.kt */
    public static final class b implements j1.d<s0.d> {
        b() {
        }

        public /* synthetic */ d N(d dVar) {
            return p0.c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, p pVar) {
            return e.c(this, obj, pVar);
        }

        /* renamed from: a */
        public s0.d getValue() {
            return null;
        }

        public f<s0.d> getKey() {
            return FocusEventModifierKt.a();
        }

        public /* synthetic */ Object s(Object obj, p pVar) {
            return e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(l lVar) {
            return e.a(this, lVar);
        }
    }

    /* compiled from: FocusModifier.kt */
    public static final class c implements j1.d<q> {
        c() {
        }

        public /* synthetic */ d N(d dVar) {
            return p0.c.a(this, dVar);
        }

        public /* synthetic */ Object W(Object obj, p pVar) {
            return e.c(this, obj, pVar);
        }

        /* renamed from: a */
        public q getValue() {
            return null;
        }

        public f<q> getKey() {
            return FocusRequesterModifierKt.b();
        }

        public /* synthetic */ Object s(Object obj, p pVar) {
            return e.b(this, obj, pVar);
        }

        public /* synthetic */ boolean x(l lVar) {
            return e.a(this, lVar);
        }
    }

    public static final d a(d dVar) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        return ComposedModifierKt.c(dVar, InspectableValueKt.c() ? new FocusModifierKt$focusTarget$$inlined$debugInspectorInfo$1() : InspectableValueKt.a(), FocusModifierKt$focusTarget$2.f6390a);
    }

    public static final d b(d dVar, FocusModifier focusModifier) {
        kotlin.jvm.internal.p.j(dVar, "<this>");
        kotlin.jvm.internal.p.j(focusModifier, "focusModifier");
        return dVar.N(focusModifier).N(f6388b);
    }

    public static final f<FocusModifier> c() {
        return f6387a;
    }
}
