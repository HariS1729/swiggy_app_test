package androidx.compose.animation;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import p.d;
import p.f;
import p.j;
import p.m;
import p.q;

/* compiled from: EnterExitTransition.kt */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0016a f2602a = new C0016a((i) null);

    /* renamed from: b  reason: collision with root package name */
    private static final a f2603b = new b(new q((f) null, (m) null, (d) null, (j) null, 15, (i) null));

    /* renamed from: androidx.compose.animation.a$a  reason: collision with other inner class name */
    /* compiled from: EnterExitTransition.kt */
    public static final class C0016a {
        private C0016a() {
        }

        public /* synthetic */ C0016a(i iVar) {
            this();
        }
    }

    private a() {
    }

    public /* synthetic */ a(i iVar) {
        this();
    }

    public abstract q a();

    public final a b(a aVar) {
        p.j(aVar, "enter");
        f b11 = a().b();
        if (b11 == null) {
            b11 = aVar.a().b();
        }
        m d11 = a().d();
        if (d11 == null) {
            d11 = aVar.a().d();
        }
        d a11 = a().a();
        if (a11 == null) {
            a11 = aVar.a().a();
        }
        j c11 = a().c();
        if (c11 == null) {
            c11 = aVar.a().c();
        }
        return new b(new q(b11, d11, a11, c11));
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && p.e(((a) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
