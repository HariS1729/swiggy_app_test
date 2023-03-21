package androidx.compose.ui.node;

import bp0.k;
import com.google.android.gms.common.internal.ImagesContract;
import j1.d;
import j1.e;
import k1.j;
import k1.m;
import k1.q;
import k1.r;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: ModifierLocalConsumerEntity.kt */
public final class ModifierLocalConsumerEntity implements lp0.a<k>, r, e {

    /* renamed from: e  reason: collision with root package name */
    public static final b f6911e = new b((i) null);

    /* renamed from: f  reason: collision with root package name */
    private static final l<ModifierLocalConsumerEntity, k> f6912f = ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1.f6918a;

    /* renamed from: g  reason: collision with root package name */
    private static final e f6913g = new a();

    /* renamed from: a  reason: collision with root package name */
    private m f6914a;

    /* renamed from: b  reason: collision with root package name */
    private final j1.b f6915b;

    /* renamed from: c  reason: collision with root package name */
    private final f0.e<j1.a<?>> f6916c = new f0.e<>(new j1.a[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private boolean f6917d;

    /* compiled from: ModifierLocalConsumerEntity.kt */
    public static final class a implements e {
        a() {
        }

        public <T> T a(j1.a<T> aVar) {
            p.j(aVar, "<this>");
            return aVar.a().invoke();
        }
    }

    /* compiled from: ModifierLocalConsumerEntity.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(i iVar) {
            this();
        }
    }

    public ModifierLocalConsumerEntity(m mVar, j1.b bVar) {
        p.j(mVar, "provider");
        p.j(bVar, "modifier");
        this.f6914a = mVar;
        this.f6915b = bVar;
    }

    public <T> T a(j1.a<T> aVar) {
        p.j(aVar, "<this>");
        this.f6916c.b(aVar);
        d<?> d11 = this.f6914a.d(aVar);
        if (d11 == null) {
            return aVar.a().invoke();
        }
        return d11.getValue();
    }

    public final void b() {
        this.f6917d = true;
        i();
    }

    public final void c() {
        this.f6917d = true;
        f();
    }

    public final void d() {
        this.f6915b.D(f6913g);
        this.f6917d = false;
    }

    public final j1.b e() {
        return this.f6915b;
    }

    public final void f() {
        q t02 = this.f6914a.f().t0();
        if (t02 != null) {
            t02.r(this);
        }
    }

    public final void g(j1.a<?> aVar) {
        q t02;
        p.j(aVar, ImagesContract.LOCAL);
        if (this.f6916c.h(aVar) && (t02 = this.f6914a.f().t0()) != null) {
            t02.r(this);
        }
    }

    public void h() {
        i();
    }

    public final void i() {
        if (this.f6917d) {
            this.f6916c.g();
            j.a(this.f6914a.f()).getSnapshotObserver().e(this, f6912f, new ModifierLocalConsumerEntity$notifyConsumerOfChanges$1(this));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        h();
        return k.f22762a;
    }

    public final void j(m mVar) {
        p.j(mVar, "<set-?>");
        this.f6914a = mVar;
    }

    public boolean o0() {
        return this.f6917d;
    }
}
