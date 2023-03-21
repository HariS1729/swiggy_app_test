package e0;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.p;
import o0.a;
import o0.b;

/* compiled from: SlotTable.kt */
public final class v0 implements a, Iterable<b>, mp0.a {

    /* renamed from: a  reason: collision with root package name */
    private int[] f14237a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    private int f14238b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f14239c = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    private int f14240d;

    /* renamed from: e  reason: collision with root package name */
    private int f14241e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14242f;

    /* renamed from: g  reason: collision with root package name */
    private int f14243g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<c> f14244h = new ArrayList<>();

    public final int a(c cVar) {
        p.j(cVar, "anchor");
        if (!(!this.f14242f)) {
            ComposerKt.x("Use active SlotWriter to determine anchor location instead".toString());
            throw new KotlinNothingValueException();
        } else if (cVar.b()) {
            return cVar.a();
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    public final void b(u0 u0Var) {
        p.j(u0Var, "reader");
        if (u0Var.v() == this && this.f14241e > 0) {
            this.f14241e--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    public final void c(x0 x0Var, int[] iArr, int i11, Object[] objArr, int i12, ArrayList<c> arrayList) {
        p.j(x0Var, "writer");
        p.j(iArr, "groups");
        p.j(objArr, "slots");
        p.j(arrayList, "anchors");
        if (x0Var.X() == this && this.f14242f) {
            this.f14242f = false;
            r(iArr, i11, objArr, i12, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final ArrayList<c> f() {
        return this.f14244h;
    }

    public final int[] g() {
        return this.f14237a;
    }

    public final int h() {
        return this.f14238b;
    }

    public final Object[] i() {
        return this.f14239c;
    }

    public boolean isEmpty() {
        return this.f14238b == 0;
    }

    public Iterator<b> iterator() {
        return new v(this, 0, this.f14238b);
    }

    public final int k() {
        return this.f14240d;
    }

    public final int l() {
        return this.f14243g;
    }

    public final boolean m() {
        return this.f14242f;
    }

    public final boolean n(int i11, c cVar) {
        p.j(cVar, "anchor");
        if (!this.f14242f) {
            if (i11 >= 0 && i11 < this.f14238b) {
                if (q(cVar)) {
                    int g11 = w0.G(this.f14237a, i11) + i11;
                    int a11 = cVar.a();
                    if (i11 <= a11 && a11 < g11) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.x("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.x("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    public final u0 o() {
        if (!this.f14242f) {
            this.f14241e++;
            return new u0(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final x0 p() {
        if (!this.f14242f) {
            if (this.f14241e <= 0) {
                this.f14242f = true;
                this.f14243g++;
                return new x0(this);
            }
            ComposerKt.x("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.x("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean q(c cVar) {
        p.j(cVar, "anchor");
        if (cVar.b()) {
            int s11 = w0.S(this.f14244h, cVar.a(), this.f14238b);
            if (s11 >= 0 && p.e(this.f14244h.get(s11), cVar)) {
                return true;
            }
        }
        return false;
    }

    public final void r(int[] iArr, int i11, Object[] objArr, int i12, ArrayList<c> arrayList) {
        p.j(iArr, "groups");
        p.j(objArr, "slots");
        p.j(arrayList, "anchors");
        this.f14237a = iArr;
        this.f14238b = i11;
        this.f14239c = objArr;
        this.f14240d = i12;
        this.f14244h = arrayList;
    }
}
