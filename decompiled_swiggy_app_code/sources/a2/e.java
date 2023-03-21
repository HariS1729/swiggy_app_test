package a2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;
import org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import p1.w;

/* compiled from: TextDecoration.kt */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f915b = new a((i) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final e f916c = new e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final e f917d = new e(1);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final e f918e = new e(2);

    /* renamed from: a  reason: collision with root package name */
    private final int f919a;

    /* compiled from: TextDecoration.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final e a(List<e> list) {
            p.j(list, "decorations");
            Integer num = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                num = Integer.valueOf(num.intValue() | list.get(i11).e());
            }
            return new e(num.intValue());
        }

        public final e b() {
            return e.f918e;
        }

        public final e c() {
            return e.f916c;
        }

        public final e d() {
            return e.f917d;
        }
    }

    public e(int i11) {
        this.f919a = i11;
    }

    public final boolean d(e eVar) {
        p.j(eVar, "other");
        int i11 = this.f919a;
        return (eVar.f919a | i11) == i11;
    }

    public final int e() {
        return this.f919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f919a == ((e) obj).f919a;
    }

    public int hashCode() {
        return this.f919a;
    }

    public String toString() {
        if (this.f919a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f919a & f917d.f919a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f919a & f918e.f919a) != 0) {
            arrayList.add(PDLayoutAttributeObject.TEXT_DECORATION_TYPE_LINE_THROUGH);
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + w.d(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ']';
    }
}
