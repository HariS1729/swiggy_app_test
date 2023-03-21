package s4;

import java.util.List;
import kotlin.jvm.internal.p;
import p4.c;
import q4.d;

/* compiled from: ListKFoldable.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final d f16653a = new a();

    /* compiled from: ListKFoldable.kt */
    public static final class a implements d {
        a() {
        }

        public <A> boolean a(o4.a<Object, ? extends A> aVar) {
            p.k(aVar, "$this$nonEmpty");
            return d.a.b(this, aVar);
        }

        public <A> boolean b(o4.a<Object, ? extends A> aVar) {
            p.k(aVar, "$this$isEmpty");
            return d.a.a(this, aVar);
        }
    }

    public static final d a() {
        return f16653a;
    }

    public static final <A> boolean b(List<? extends A> list) {
        p.k(list, "$this$nonEmpty");
        a aVar = a.f16652a;
        return a().a(new c(list));
    }
}
