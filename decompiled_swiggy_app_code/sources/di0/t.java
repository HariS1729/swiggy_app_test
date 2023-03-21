package di0;

import ao0.d;
import ef0.e;
import eo0.a;
import in.juspay.hyper.constants.LogSubCategory;
import io.reactivex.processors.BehaviorProcessor;
import kotlin.jvm.internal.p;

/* compiled from: UserLoggedInChangeUseCase.kt */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final e f18282a;

    /* renamed from: b  reason: collision with root package name */
    private final a f18283b;

    /* renamed from: c  reason: collision with root package name */
    private final th0.a f18284c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18285d;

    /* renamed from: e  reason: collision with root package name */
    private final BehaviorProcessor<Boolean> f18286e;

    public t(e eVar, a aVar, th0.a aVar2) {
        p.j(eVar, LogSubCategory.Action.USER);
        p.j(aVar, "subscription");
        p.j(aVar2, "scheduler");
        this.f18282a = eVar;
        this.f18283b = aVar;
        this.f18284c = aVar2;
        this.f18285d = eVar.o0();
        BehaviorProcessor<Boolean> z02 = BehaviorProcessor.z0();
        p.i(z02, "create<Boolean>()");
        this.f18286e = z02;
    }

    /* access modifiers changed from: private */
    public static final void e(t tVar, Boolean bool) {
        p.j(tVar, "this$0");
        if (!p.e(Boolean.valueOf(tVar.f18285d), bool)) {
            p.i(bool, "loggedIn");
            boolean booleanValue = bool.booleanValue();
            tVar.f18285d = booleanValue;
            tVar.f18286e.D0(Boolean.valueOf(booleanValue));
        }
    }

    /* access modifiers changed from: private */
    public static final void f(Throwable th2) {
    }

    public final d<Boolean> c() {
        return this.f18286e;
    }

    public final void d() {
        this.f18283b.d(this.f18282a.g1().m0(this.f18284c.b()).Q(this.f18284c.a()).h0(new r(this), s.f55628a));
    }
}
