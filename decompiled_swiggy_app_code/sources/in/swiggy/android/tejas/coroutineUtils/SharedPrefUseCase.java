package in.swiggy.android.tejas.coroutineUtils;

import android.content.SharedPreferences;
import bp0.g;
import bp0.k;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import fp0.c;
import in.swiggy.android.commons.utils.DispatchProviderKt;
import in.swiggy.android.tejas.utils.GsonUtil;
import js.a;
import kotlin.Result;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.CoroutineDispatcher;
import wp0.h;

@Instrumented
/* compiled from: SharedPrefUseCase.kt */
public class SharedPrefUseCase<T> extends UseCase<SharedPrefParams<T>, T> {
    /* access modifiers changed from: private */
    public final Class<T> clazz;
    /* access modifiers changed from: private */
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedPrefUseCase(SharedPreferences sharedPreferences2, Class cls, int i11, i iVar) {
        this(sharedPreferences2, (i11 & 2) != 0 ? null : cls);
    }

    static /* synthetic */ Object execute$suspendImpl(SharedPrefUseCase sharedPrefUseCase, SharedPrefParams sharedPrefParams, c cVar) {
        Object obj;
        T t;
        String key = sharedPrefParams.getKey();
        Object defaultValue = sharedPrefParams.getDefaultValue();
        try {
            Result.a aVar = Result.f25582b;
            SharedPreferences sharedPreferences2 = sharedPrefUseCase.sharedPreferences;
            Class<T> cls = sharedPrefUseCase.clazz;
            if (cls == null) {
                t = null;
            } else {
                Gson gson = GsonUtil.getGson();
                String string = sharedPreferences2.getString(key, "");
                T fromJson = !(gson instanceof Gson) ? gson.fromJson(string, cls) : GsonInstrumentation.fromJson(gson, string, cls);
                if (fromJson != null) {
                    t = fromJson;
                } else {
                    throw new IllegalArgumentException(p.s("invalid data type ", sharedPrefUseCase.clazz));
                }
            }
            if (t == null) {
                t = a.a(sharedPreferences2, key, defaultValue);
            }
            obj = Result.b(t);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f25582b;
            obj = Result.b(g.a(th2));
        }
        g.b(obj);
        return obj;
    }

    public final Object clearData(String str, c<? super k> cVar) {
        Object g11 = h.g(DispatchProviderKt.b().plus(DispatchProviderKt.a().D()), new SharedPrefUseCase$clearData$$inlined$ioWith$1((c) null, this, str), cVar);
        return g11 == b.d() ? g11 : k.f22762a;
    }

    /* access modifiers changed from: protected */
    public Object execute(SharedPrefParams<T> sharedPrefParams, c<? super T> cVar) {
        return execute$suspendImpl(this, sharedPrefParams, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setData(java.lang.String r6, T r7, fp0.c<? super bp0.k> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$1 r0 = (in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$1 r0 = new in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            bp0.g.b(r8)     // Catch:{ all -> 0x005c }
            goto L_0x0055
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            bp0.g.b(r8)
            kotlin.Result$a r8 = kotlin.Result.f25582b     // Catch:{ all -> 0x005c }
            wp0.g0 r8 = in.swiggy.android.commons.utils.DispatchProviderKt.b()     // Catch:{ all -> 0x005c }
            in.swiggy.android.commons.utils.IDispatchProvider r2 = in.swiggy.android.commons.utils.DispatchProviderKt.a()     // Catch:{ all -> 0x005c }
            kotlinx.coroutines.CoroutineDispatcher r2 = r2.D()     // Catch:{ all -> 0x005c }
            kotlin.coroutines.CoroutineContext r8 = r8.plus(r2)     // Catch:{ all -> 0x005c }
            in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$lambda-6$$inlined$ioWith$1 r2 = new in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase$setData$lambda-6$$inlined$ioWith$1     // Catch:{ all -> 0x005c }
            r4 = 0
            r2.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x005c }
            r0.label = r3     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = wp0.h.g(r8, r2, r0)     // Catch:{ all -> 0x005c }
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            bp0.k r6 = bp0.k.f22762a     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch:{ all -> 0x005c }
            goto L_0x0067
        L_0x005c:
            r6 = move-exception
            kotlin.Result$a r7 = kotlin.Result.f25582b
            java.lang.Object r6 = bp0.g.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L_0x0067:
            bp0.g.b(r6)
            bp0.k r6 = bp0.k.f22762a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: in.swiggy.android.tejas.coroutineUtils.SharedPrefUseCase.setData(java.lang.String, java.lang.Object, fp0.c):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPrefUseCase(SharedPreferences sharedPreferences2, Class<T> cls) {
        super((CoroutineDispatcher) null, 1, (i) null);
        p.j(sharedPreferences2, "sharedPreferences");
        this.sharedPreferences = sharedPreferences2;
        this.clazz = cls;
    }
}
