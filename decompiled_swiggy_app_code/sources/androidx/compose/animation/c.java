package androidx.compose.animation;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p.d;
import p.f;
import p.j;
import p.m;
import p.q;

/* compiled from: EnterExitTransition.kt */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2605a = new a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final c f2606b = new d(new q((f) null, (m) null, (d) null, (j) null, 15, (i) null));

    /* compiled from: EnterExitTransition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    private c() {
    }

    public /* synthetic */ c(i iVar) {
        this();
    }

    public abstract q a();

    public final c b(c cVar) {
        p.j(cVar, "exit");
        f b11 = a().b();
        if (b11 == null) {
            b11 = cVar.a().b();
        }
        m d11 = a().d();
        if (d11 == null) {
            d11 = cVar.a().d();
        }
        d a11 = a().a();
        if (a11 == null) {
            a11 = cVar.a().a();
        }
        j c11 = a().c();
        if (c11 == null) {
            c11 = cVar.a().c();
        }
        return new d(new q(b11, d11, a11, c11));
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && p.e(((c) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
