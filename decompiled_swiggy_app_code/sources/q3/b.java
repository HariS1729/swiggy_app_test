package q3;

import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;
import java.util.Set;
import p3.a;
import p3.d;

/* compiled from: ListBuilderBasicImpl */
public class b extends d implements a {

    /* renamed from: d  reason: collision with root package name */
    boolean f16354d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f16355e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f16356f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f16357g;

    /* renamed from: h  reason: collision with root package name */
    private d f16358h;

    /* renamed from: i  reason: collision with root package name */
    private IconCompat f16359i;

    public b(Slice.a aVar, SliceSpec sliceSpec) {
        super(aVar, sliceSpec);
    }

    public void a(long j) {
        long j11 = -1;
        if (j != -1) {
            j11 = g().currentTimeMillis() + j;
        }
        f().l(j11, "millis", "ttl");
    }

    public void b(a.C0164a aVar) {
        if (this.f16356f == null && aVar.j() != null) {
            this.f16356f = aVar.j();
        }
        if (this.f16357g == null && aVar.h() != null) {
            this.f16357g = aVar.h();
        }
        if (this.f16358h == null && aVar.g() != null) {
            this.f16358h = aVar.g();
        }
        if (this.f16358h == null && aVar.k() != null) {
            this.f16358h = aVar.k();
        }
        if (this.f16359i == null && aVar.l() != null) {
            this.f16359i = aVar.l();
        }
    }

    public void c(Slice.a aVar) {
        if (this.f16354d) {
            aVar.c("error");
        }
        if (this.f16355e != null) {
            Slice.a aVar2 = new Slice.a(f());
            for (String k : this.f16355e) {
                aVar2.k(k, (String) null, new String[0]);
            }
            aVar.i(aVar2.c("keywords").m());
        }
        Slice.a aVar3 = new Slice.a(f());
        d dVar = this.f16358h;
        if (dVar != null) {
            if (this.f16356f == null && dVar.d() != null) {
                this.f16356f = this.f16358h.d();
            }
            if (this.f16359i == null && this.f16358h.c() != null) {
                this.f16359i = this.f16358h.c();
            }
            this.f16358h.e(aVar3);
        }
        CharSequence charSequence = this.f16356f;
        if (charSequence != null) {
            aVar3.g(new SliceItem(charSequence, "text", (String) null, new String[]{"title"}));
        }
        CharSequence charSequence2 = this.f16357g;
        if (charSequence2 != null) {
            aVar3.g(new SliceItem(charSequence2, "text", (String) null, new String[0]));
        }
        IconCompat iconCompat = this.f16359i;
        if (iconCompat != null) {
            aVar.e(iconCompat, (String) null, "title");
        }
        aVar.i(aVar3.m());
    }
}
