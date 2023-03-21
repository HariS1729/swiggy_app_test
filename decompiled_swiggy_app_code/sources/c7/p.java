package c7;

import kotlin.jvm.internal.i;
import y6.c;
import y6.g;

/* compiled from: HardwareBitmaps.kt */
final class p extends m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f12873b = new a((i) null);

    /* renamed from: a  reason: collision with root package name */
    private final q f12874a;

    /* compiled from: HardwareBitmaps.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public p(q qVar) {
        super((i) null);
        this.f12874a = qVar;
    }

    public boolean a(g gVar) {
        c b11 = gVar.b();
        int i11 = Integer.MAX_VALUE;
        if ((b11 instanceof c.a ? ((c.a) b11).f18024a : Integer.MAX_VALUE) > 100) {
            c a11 = gVar.a();
            if (a11 instanceof c.a) {
                i11 = ((c.a) a11).f18024a;
            }
            if (i11 > 100) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return l.f12863a.b(this.f12874a);
    }
}
