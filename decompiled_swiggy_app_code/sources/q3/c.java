package q3;

import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p3.a;
import p3.d;
import s3.b;

/* compiled from: ListBuilderImpl */
public class c extends d implements a {

    /* renamed from: d  reason: collision with root package name */
    private List<Slice> f16360d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f16361e;

    /* renamed from: f  reason: collision with root package name */
    private Slice f16362f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16363g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16364h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16365i;
    private boolean j;

    /* compiled from: ListBuilderImpl */
    public static class a extends d {

        /* renamed from: d  reason: collision with root package name */
        private d f16366d;

        /* renamed from: e  reason: collision with root package name */
        private SliceItem f16367e;

        /* renamed from: f  reason: collision with root package name */
        private SliceItem f16368f;

        /* renamed from: g  reason: collision with root package name */
        private Slice f16369g;

        /* renamed from: h  reason: collision with root package name */
        private ArrayList<Slice> f16370h = new ArrayList<>();

        /* renamed from: i  reason: collision with root package name */
        private CharSequence f16371i;

        a(Slice.a aVar) {
            super(aVar, (SliceSpec) null);
        }

        private void j(IconCompat iconCompat, int i11, boolean z11) {
            ArrayList arrayList = new ArrayList();
            if (i11 != 0) {
                arrayList.add("no_tint");
            }
            if (i11 == 2) {
                arrayList.add("large");
            }
            if (z11) {
                arrayList.add("partial");
            }
            Slice.a d11 = new Slice.a(f()).d(iconCompat, (String) null, arrayList);
            if (z11) {
                d11.c("partial");
            }
            this.f16370h.add(d11.m());
        }

        private void k(d dVar, boolean z11) {
            Slice.a aVar = new Slice.a(f());
            if (z11) {
                aVar.c("partial");
            }
            this.f16370h.add(dVar.a(aVar));
        }

        private void n(CharSequence charSequence) {
            this.f16371i = charSequence;
        }

        private void o(int i11) {
            f().f(i11, "layout_direction", new String[0]);
        }

        private void p(d dVar) {
            this.f16366d = dVar;
        }

        private void q(CharSequence charSequence, boolean z11) {
            SliceItem sliceItem = new SliceItem(charSequence, "text", (String) null, new String[0]);
            this.f16368f = sliceItem;
            if (z11) {
                sliceItem.a("partial");
            }
        }

        private void r(CharSequence charSequence, boolean z11) {
            SliceItem sliceItem = new SliceItem(charSequence, "text", (String) null, new String[]{"title"});
            this.f16367e = sliceItem;
            if (z11) {
                sliceItem.a("partial");
            }
        }

        private void s(long j) {
            this.f16369g = new Slice.a(f()).l(j, (String) null, new String[0]).c("title").m();
        }

        private void t(IconCompat iconCompat, int i11, boolean z11) {
            ArrayList arrayList = new ArrayList();
            if (i11 != 0) {
                arrayList.add("no_tint");
            }
            if (i11 == 2) {
                arrayList.add("large");
            }
            if (z11) {
                arrayList.add("partial");
            }
            Slice.a d11 = new Slice.a(f()).d(iconCompat, (String) null, arrayList);
            if (z11) {
                d11.c("partial");
            }
            this.f16369g = d11.c("title").m();
        }

        private void u(d dVar, boolean z11) {
            Slice.a c11 = new Slice.a(f()).c("title");
            if (z11) {
                c11.c("partial");
            }
            this.f16369g = dVar.a(c11);
        }

        public void c(Slice.a aVar) {
            Slice slice = this.f16369g;
            if (slice != null) {
                aVar.i(slice);
            }
            SliceItem sliceItem = this.f16367e;
            if (sliceItem != null) {
                aVar.g(sliceItem);
            }
            SliceItem sliceItem2 = this.f16368f;
            if (sliceItem2 != null) {
                aVar.g(sliceItem2);
            }
            for (int i11 = 0; i11 < this.f16370h.size(); i11++) {
                aVar.i(this.f16370h.get(i11));
            }
            CharSequence charSequence = this.f16371i;
            if (charSequence != null) {
                aVar.k(charSequence, "content_description", new String[0]);
            }
            d dVar = this.f16366d;
            if (dVar != null) {
                dVar.e(aVar);
            }
        }

        /* access modifiers changed from: protected */
        public void i(long j) {
            this.f16370h.add(new Slice.a(f()).l(j, (String) null, new String[0]).m());
        }

        /* access modifiers changed from: package-private */
        public void l(a.C0164a aVar) {
            if (aVar.n() != null) {
                h(new Slice.a(aVar.n()));
            }
            p(aVar.g());
            if (aVar.f() != -1) {
                o(aVar.f());
            }
            if (aVar.k() != null || aVar.p()) {
                u(aVar.k(), aVar.p());
            } else if (aVar.l() != null || aVar.q()) {
                t(aVar.l(), aVar.m(), aVar.q());
            } else if (aVar.i() != -1) {
                s(aVar.i());
            }
            if (aVar.j() != null || aVar.r()) {
                r(aVar.j(), aVar.r());
            }
            if (aVar.h() != null || aVar.o()) {
                q(aVar.h(), aVar.o());
            }
            if (aVar.b() != null) {
                n(aVar.b());
            }
            List<Object> c11 = aVar.c();
            List<Integer> e11 = aVar.e();
            List<Boolean> d11 = aVar.d();
            for (int i11 = 0; i11 < c11.size(); i11++) {
                int intValue = e11.get(i11).intValue();
                if (intValue == 0) {
                    i(((Long) c11.get(i11)).longValue());
                } else if (intValue == 1) {
                    androidx.core.util.d dVar = (androidx.core.util.d) c11.get(i11);
                    j((IconCompat) dVar.f9416a, ((Integer) dVar.f9417b).intValue(), d11.get(i11).booleanValue());
                } else if (intValue == 2) {
                    k((d) c11.get(i11), d11.get(i11).booleanValue());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean m() {
            return (this.f16367e == null && this.f16368f == null) ? false : true;
        }
    }

    public c(Slice.a aVar, SliceSpec sliceSpec, o3.a aVar2) {
        super(aVar, sliceSpec, aVar2);
    }

    private void j(boolean z11, boolean z12) {
        if (!this.f16364h) {
            this.f16364h = true;
            this.f16365i = z11;
            this.j = z12;
        }
    }

    public void a(long j11) {
        long j12 = -1;
        if (j11 != -1) {
            j12 = g().currentTimeMillis() + j11;
        }
        f().l(j12, "millis", "ttl");
    }

    public void b(a.C0164a aVar) {
        a aVar2 = new a(e());
        aVar2.l(aVar);
        j(true, aVar2.m());
        i(aVar2);
    }

    public void c(Slice.a aVar) {
        aVar.h(g().currentTimeMillis(), "millis", "last_updated");
        Slice slice = this.f16362f;
        if (slice != null) {
            aVar.i(slice);
        }
        if (this.f16360d != null) {
            Slice.a aVar2 = new Slice.a(aVar);
            for (int i11 = 0; i11 < this.f16360d.size(); i11++) {
                aVar2.i(this.f16360d.get(i11));
            }
            aVar.i(aVar2.c("actions").m());
        }
        if (this.f16363g) {
            aVar.c("error");
        }
        if (this.f16361e != null) {
            Slice.a aVar3 = new Slice.a(f());
            for (String k : this.f16361e) {
                aVar3.k(k, (String) null, new String[0]);
            }
            f().i(aVar3.c("keywords").m());
        }
    }

    public Slice d() {
        Slice d11 = super.d();
        boolean z11 = true;
        boolean z12 = b.b(d11, (String) null, "partial", (String) null) != null;
        if (b.b(d11, "slice", "list_item", (String) null) != null) {
            z11 = false;
        }
        String[] strArr = {"shortcut", "title"};
        SliceItem c11 = b.c(d11, LogCategory.ACTION, strArr, (String[]) null);
        List<SliceItem> d12 = b.d(d11, "slice", strArr, (String[]) null);
        if (z12 || z11 || c11 != null || (d12 != null && !d12.isEmpty())) {
            boolean z13 = this.f16364h;
            if (z13 && !this.f16365i) {
                throw new IllegalStateException("A slice cannot have the first row be constructed from a GridRowBuilder, consider using #setHeader.");
            } else if (!z13 || this.j) {
                return d11;
            } else {
                throw new IllegalStateException("A slice requires the first row to have some text.");
            }
        } else {
            throw new IllegalStateException("A slice requires a primary action; ensure one of your builders has called #setPrimaryAction with a valid SliceAction.");
        }
    }

    public void i(a aVar) {
        j(true, aVar.m());
        aVar.f().c("list_item");
        f().i(aVar.d());
    }
}
