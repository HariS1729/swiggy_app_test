package coil.compose;

import bp0.g;
import bp0.k;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import lp0.p;
import wp0.j0;
import x6.h;

@d(c = "coil.compose.AsyncImagePainter$onRemembered$1", f = "AsyncImagePainter.kt", l = {246}, m = "invokeSuspend")
/* compiled from: AsyncImagePainter.kt */
final class AsyncImagePainter$onRemembered$1 extends SuspendLambda implements p<j0, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f13452a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AsyncImagePainter f13453b;

    @d(c = "coil.compose.AsyncImagePainter$onRemembered$1$2", f = "AsyncImagePainter.kt", l = {245}, m = "invokeSuspend")
    /* renamed from: coil.compose.AsyncImagePainter$onRemembered$1$2  reason: invalid class name */
    /* compiled from: AsyncImagePainter.kt */
    static final class AnonymousClass2 extends SuspendLambda implements p<x6.g, c<? super AsyncImagePainter.b>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f13455a;

        /* renamed from: b  reason: collision with root package name */
        int f13456b;

        /* renamed from: a */
        public final Object invoke(x6.g gVar, c<? super AsyncImagePainter.b> cVar) {
            return ((AnonymousClass2) create(gVar, cVar)).invokeSuspend(k.f22762a);
        }

        public final c<k> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(asyncImagePainter2, cVar);
        }

        public final Object invokeSuspend(Object obj) {
            AsyncImagePainter asyncImagePainter;
            Object d11 = b.d();
            int i11 = this.f13456b;
            if (i11 == 0) {
                g.b(obj);
                AsyncImagePainter asyncImagePainter2 = asyncImagePainter2;
                ImageLoader y11 = asyncImagePainter2.y();
                AsyncImagePainter asyncImagePainter3 = asyncImagePainter2;
                x6.g r11 = asyncImagePainter3.R(asyncImagePainter3.A());
                this.f13455a = asyncImagePainter2;
                this.f13456b = 1;
                Object b11 = y11.b(r11, this);
                if (b11 == d11) {
                    return d11;
                }
                asyncImagePainter = asyncImagePainter2;
                obj = b11;
            } else if (i11 == 1) {
                asyncImagePainter = (AsyncImagePainter) this.f13455a;
                g.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return asyncImagePainter.Q((h) obj);
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    /* synthetic */ class a implements e, l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AsyncImagePainter f13458a;

        a(AsyncImagePainter asyncImagePainter) {
            this.f13458a = asyncImagePainter;
        }

        public final bp0.c<?> a() {
            return new AdaptedFunctionReference(2, this.f13458a, AsyncImagePainter.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        /* renamed from: b */
        public final Object emit(AsyncImagePainter.b bVar, c<? super k> cVar) {
            Object a11 = this.f13458a.S(bVar);
            return a11 == b.d() ? a11 : k.f22762a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e) || !(obj instanceof l)) {
                return false;
            }
            return kotlin.jvm.internal.p.e(a(), ((l) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncImagePainter$onRemembered$1(AsyncImagePainter asyncImagePainter, c<? super AsyncImagePainter$onRemembered$1> cVar) {
        super(2, cVar);
        this.f13453b = asyncImagePainter;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new AsyncImagePainter$onRemembered$1(this.f13453b, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super k> cVar) {
        return ((AsyncImagePainter$onRemembered$1) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d11 = b.d();
        int i11 = this.f13452a;
        if (i11 == 0) {
            g.b(obj);
            final AsyncImagePainter asyncImagePainter = this.f13453b;
            kotlinx.coroutines.flow.d n = androidx.compose.runtime.g.n(new lp0.a<x6.g>() {
                /* renamed from: a */
                public final x6.g invoke() {
                    return asyncImagePainter.A();
                }
            });
            final AsyncImagePainter asyncImagePainter2 = this.f13453b;
            kotlinx.coroutines.flow.d C = f.C(n, new AnonymousClass2((c<? super AnonymousClass2>) null));
            a aVar = new a(this.f13453b);
            this.f13452a = 1;
            if (C.collect(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 == 1) {
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return k.f22762a;
    }
}
