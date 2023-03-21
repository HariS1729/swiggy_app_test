package androidx.compose.foundation.gestures;

import bp0.g;
import bp0.k;
import defpackage.y1;
import fp0.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$LongRef;
import lp0.l;
import lp0.p;
import t0.f;

@d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {412}, m = "invokeSuspend")
/* compiled from: Scrollable.kt */
final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements p<y1.p, c<? super k>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f3526a;

    /* renamed from: b  reason: collision with root package name */
    Object f3527b;

    /* renamed from: c  reason: collision with root package name */
    long f3528c;

    /* renamed from: d  reason: collision with root package name */
    int f3529d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f3530e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ScrollingLogic f3531f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Ref$LongRef f3532g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f3533h;

    /* compiled from: Scrollable.kt */
    public static final class a implements y1.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScrollingLogic f3534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<f, f> f3535b;

        a(ScrollingLogic scrollingLogic, l<? super f, f> lVar) {
            this.f3534a = scrollingLogic;
            this.f3535b = lVar;
        }

        public float a(float f11) {
            ScrollingLogic scrollingLogic = this.f3534a;
            return scrollingLogic.k(this.f3535b.invoke(f.d(scrollingLogic.l(f11))).u());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j, c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.f3531f = scrollingLogic;
        this.f3532g = ref$LongRef;
        this.f3533h = j;
    }

    /* renamed from: a */
    public final Object invoke(y1.p pVar, c<? super k> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(pVar, cVar)).invokeSuspend(k.f22762a);
    }

    public final c<k> create(Object obj, c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f3531f, this.f3532g, this.f3533h, cVar);
        scrollingLogic$doFlingAnimation$2.f3530e = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        ScrollingLogic scrollingLogic2;
        Ref$LongRef ref$LongRef;
        long j;
        Object d11 = b.d();
        int i11 = this.f3529d;
        if (i11 == 0) {
            g.b(obj);
            a aVar = new a(this.f3531f, new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.f3531f, (y1.p) this.f3530e));
            scrollingLogic2 = this.f3531f;
            Ref$LongRef ref$LongRef2 = this.f3532g;
            long j11 = this.f3533h;
            y1.k c11 = scrollingLogic2.c();
            long j12 = ref$LongRef2.f25665a;
            float g11 = scrollingLogic2.g(scrollingLogic2.j(j11));
            this.f3530e = scrollingLogic2;
            this.f3526a = scrollingLogic2;
            this.f3527b = ref$LongRef2;
            this.f3528c = j12;
            this.f3529d = 1;
            obj = c11.a(aVar, g11, this);
            if (obj == d11) {
                return d11;
            }
            ref$LongRef = ref$LongRef2;
            scrollingLogic = scrollingLogic2;
            j = j12;
        } else if (i11 == 1) {
            j = this.f3528c;
            ref$LongRef = (Ref$LongRef) this.f3527b;
            scrollingLogic2 = (ScrollingLogic) this.f3526a;
            scrollingLogic = (ScrollingLogic) this.f3530e;
            g.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$LongRef.f25665a = scrollingLogic2.n(j, scrollingLogic.g(((Number) obj).floatValue()));
        return k.f22762a;
    }
}
