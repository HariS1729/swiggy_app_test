package in.swiggy.android.services;

import androidx.work.ListenableWorker;
import androidx.work.b;
import bp0.g;
import bp0.k;
import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import fp0.c;
import in.swiggy.android.tejas.Response;
import in.swiggy.android.tejas.api.models.SwiggyApiResponse;
import in.swiggy.android.tejas.feature.user.RefreshProfileParams;
import in.swiggy.android.tejas.feature.user.RefreshProfileUseCase;
import in.swiggy.android.tejas.oldapi.network.responses.UserResponseData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import lp0.p;
import os.u;
import wp0.j0;

@d(c = "in.swiggy.android.services.FetchUserProfileWorker$doWork$2", f = "FetchUserProfileWorker.kt", l = {100}, m = "invokeSuspend")
/* compiled from: FetchUserProfileWorker.kt */
final class FetchUserProfileWorker$doWork$2 extends SuspendLambda implements p<j0, c<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f18625a;

    /* renamed from: b  reason: collision with root package name */
    int f18626b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FetchUserProfileWorker f18627c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FetchUserProfileWorker$doWork$2(FetchUserProfileWorker fetchUserProfileWorker, c<? super FetchUserProfileWorker$doWork$2> cVar) {
        super(2, cVar);
        this.f18627c = fetchUserProfileWorker;
    }

    public final c<k> create(Object obj, c<?> cVar) {
        return new FetchUserProfileWorker$doWork$2(this.f18627c, cVar);
    }

    public final Object invoke(j0 j0Var, c<? super ListenableWorker.a> cVar) {
        return ((FetchUserProfileWorker$doWork$2) create(j0Var, cVar)).invokeSuspend(k.f22762a);
    }

    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Object d11 = b.d();
        int i11 = this.f18626b;
        if (i11 == 0) {
            g.b(obj);
            u.b("FetchUserProfileWorker", "user.isLoggedIn " + this.f18627c.f18624i.o0() + " user.customerId " + this.f18627c.f18624i.getCustomerId());
            if (this.f18627c.f18624i.o0()) {
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                T c11 = ListenableWorker.a.c();
                kotlin.jvm.internal.p.i(c11, "success()");
                ref$ObjectRef2.f25666a = c11;
                b g11 = this.f18627c.g();
                kotlin.jvm.internal.p.i(g11, "inputData");
                boolean z11 = false;
                boolean h11 = g11.h("FetchUserProfileWorker.isSilentSession", false);
                String k = g11.k(AnalyticsAttribute.DEVICE_MANUFACTURER_ATTRIBUTE);
                String str = "";
                if (k == null) {
                    k = str;
                }
                String k11 = g11.k("deviceModelName");
                if (k11 != null) {
                    str = k11;
                }
                RefreshProfileUseCase F = this.f18627c.j;
                if (h11) {
                    z11 = true;
                }
                kotlinx.coroutines.flow.d invoke = F.invoke(new RefreshProfileParams(k, str, z11, "IS_SUPER,SUPER_DETAILS,SWIGGY_PAY"));
                final FetchUserProfileWorker fetchUserProfileWorker = this.f18627c;
                AnonymousClass1 r42 = new e<Response<? extends SwiggyApiResponse<UserResponseData>>>() {

                    /* renamed from: in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$a */
                    /* compiled from: FetchUserProfileWorker.kt */
                    static final class a implements e<?> {

                        /* renamed from: a  reason: collision with root package name */
                        public static final a f18630a = new a();

                        a() {
                        }

                        /* renamed from: a */
                        public final Object emit(Void voidR, c<? super k> cVar) {
                            return k.f22762a;
                        }
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(in.swiggy.android.tejas.Response<in.swiggy.android.tejas.api.models.SwiggyApiResponse<in.swiggy.android.tejas.oldapi.network.responses.UserResponseData>> r5, fp0.c<? super bp0.k> r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$emit$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r6
                            in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$emit$1 r0 = (in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$emit$1) r0
                            int r1 = r0.f18634d
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.f18634d = r1
                            goto L_0x0018
                        L_0x0013:
                            in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$emit$1 r0 = new in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$emit$1
                            r0.<init>(r4, r6)
                        L_0x0018:
                            java.lang.Object r6 = r0.f18632b
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
                            int r2 = r0.f18634d
                            r3 = 1
                            if (r2 == 0) goto L_0x0035
                            if (r2 != r3) goto L_0x002d
                            java.lang.Object r5 = r0.f18631a
                            in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1 r5 = (in.swiggy.android.services.FetchUserProfileWorker$doWork$2.AnonymousClass1) r5
                            bp0.g.b(r6)
                            goto L_0x008a
                        L_0x002d:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L_0x0035:
                            bp0.g.b(r6)
                            boolean r6 = r5 instanceof in.swiggy.android.tejas.Response.Success
                            java.lang.String r2 = "applicationContext"
                            if (r6 == 0) goto L_0x005b
                            in.swiggy.android.services.FetchUserProfileWorker$a r6 = in.swiggy.android.services.FetchUserProfileWorker.f18622l
                            in.swiggy.android.services.FetchUserProfileWorker r0 = r5
                            android.content.Context r0 = r0.b()
                            kotlin.jvm.internal.p.i(r0, r2)
                            in.swiggy.android.services.FetchUserProfileWorker r1 = r5
                            ef0.e r1 = r1.f18624i
                            in.swiggy.android.tejas.Response$Success r5 = (in.swiggy.android.tejas.Response.Success) r5
                            java.lang.Object r5 = r5.getResponse()
                            in.swiggy.android.tejas.api.models.SwiggyApiResponse r5 = (in.swiggy.android.tejas.api.models.SwiggyApiResponse) r5
                            r6.a(r0, r1, r5)
                            goto L_0x00aa
                        L_0x005b:
                            boolean r6 = r5 instanceof in.swiggy.android.tejas.Response.Failure
                            if (r6 == 0) goto L_0x00aa
                            in.swiggy.android.tejas.Response$Failure r5 = (in.swiggy.android.tejas.Response.Failure) r5
                            in.swiggy.android.tejas.error.Error r6 = r5.getError()
                            boolean r6 = r6 instanceof in.swiggy.android.tejas.error.Error.ExpiredTokenError
                            if (r6 == 0) goto L_0x0098
                            in.swiggy.android.services.FetchUserProfileWorker r5 = r5
                            in.swiggy.android.feature.logout.LogoutUseCase r5 = r5.k
                            in.swiggy.android.services.FetchUserProfileWorker r6 = r5
                            android.content.Context r6 = r6.b()
                            kotlin.jvm.internal.p.i(r6, r2)
                            kotlinx.coroutines.flow.d r5 = r5.c(r6)
                            in.swiggy.android.services.FetchUserProfileWorker$doWork$2$1$a r6 = in.swiggy.android.services.FetchUserProfileWorker$doWork$2.AnonymousClass1.a.f18630a
                            r0.f18631a = r4
                            r0.f18634d = r3
                            java.lang.Object r5 = r5.collect(r6, r0)
                            if (r5 != r1) goto L_0x0089
                            return r1
                        L_0x0089:
                            r5 = r4
                        L_0x008a:
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.work.ListenableWorker$a> r5 = r10
                            androidx.work.ListenableWorker$a r6 = androidx.work.ListenableWorker.a.a()
                            java.lang.String r0 = "failure()"
                            kotlin.jvm.internal.p.i(r6, r0)
                            r5.f25666a = r6
                            goto L_0x00aa
                        L_0x0098:
                            java.lang.Throwable r6 = new java.lang.Throwable
                            in.swiggy.android.tejas.error.Error r5 = r5.getError()
                            java.lang.String r5 = r5.toString()
                            r6.<init>(r5)
                            java.lang.String r5 = "FetchUserProfileWorker"
                            os.u.h(r5, r6)
                        L_0x00aa:
                            bp0.k r5 = bp0.k.f22762a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.services.FetchUserProfileWorker$doWork$2.AnonymousClass1.emit(in.swiggy.android.tejas.Response, fp0.c):java.lang.Object");
                    }
                };
                this.f18625a = ref$ObjectRef2;
                this.f18626b = 1;
                if (invoke.collect(r42, this) == d11) {
                    return d11;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                u.b("FetchUserProfileWorker", "Skipping fetch, because user is not logged in");
                ListenableWorker.a a11 = ListenableWorker.a.a();
                kotlin.jvm.internal.p.i(a11, "{\n                Logger…t.failure()\n            }");
                return a11;
            }
        } else if (i11 == 1) {
            ref$ObjectRef = (Ref$ObjectRef) this.f18625a;
            try {
                g.b(obj);
            } catch (Throwable th2) {
                u.h("FetchUserProfileWorker", th2);
                ListenableWorker.a a12 = ListenableWorker.a.a();
                kotlin.jvm.internal.p.i(a12, "{\n            Logger.log…esult.failure()\n        }");
                return a12;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (ListenableWorker.a) ref$ObjectRef.f25666a;
    }
}
