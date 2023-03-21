package arrow.typeclasses;

import bp0.f;
import bp0.h;
import fp0.c;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import sp0.j;

/* compiled from: ContinuationUtils.kt */
public final class ContinuationUtilsKt {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ j[] f12487a;

    /* renamed from: b  reason: collision with root package name */
    private static final f f12488b = b.b(ContinuationUtilsKt$coroutineImplClass$2.f12491a);

    /* renamed from: c  reason: collision with root package name */
    private static final f f12489c = b.b(ContinuationUtilsKt$completionField$2.f12490a);

    static {
        Class<ContinuationUtilsKt> cls = ContinuationUtilsKt.class;
        f12487a = new j[]{s.g(new PropertyReference0Impl(s.d(cls, "arrow-core-data"), "coroutineImplClass", "getCoroutineImplClass()Ljava/lang/Class;")), s.g(new PropertyReference0Impl(s.d(cls, "arrow-core-data"), "completionField", "getCompletionField()Ljava/lang/reflect/Field;"))};
    }

    private static final <T> c<?> b(c<? super T> cVar) {
        Object obj = c().get(cVar);
        if (obj != null) {
            return (c) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
    }

    private static final Field c() {
        f fVar = f12489c;
        j jVar = f12487a[1];
        return (Field) fVar.getValue();
    }

    /* access modifiers changed from: private */
    public static final Class<?> d() {
        f fVar = f12488b;
        j jVar = f12487a[0];
        return (Class) fVar.getValue();
    }

    public static final <T> List<Map<String, ?>> e(c<? super T> cVar) {
        List<Map<String, ?>> m02;
        p.k(cVar, "$this$stateStack");
        if (!d().isInstance(cVar)) {
            return k.j();
        }
        Field[] declaredFields = cVar.getClass().getDeclaredFields();
        p.f(declaredFields, "(this.javaClass.declaredFields)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(l.d(w.b(declaredFields.length), 16));
        for (Field field : declaredFields) {
            p.f(field, "it");
            field.setAccessible(true);
            Pair a11 = h.a(field.getName(), field.get(cVar));
            linkedHashMap.put(a11.c(), a11.d());
        }
        List<Map<String, ?>> d11 = j.d(linkedHashMap);
        c<?> b11 = b(cVar);
        List<Map<String, ?>> e11 = b11 != null ? e(b11) : null;
        return (e11 == null || (m02 = s.m0(d11, e11)) == null) ? d11 : m02;
    }

    public static final <T> void f(c<? super T> cVar, List<? extends Map<String, ?>> list) {
        p.k(cVar, "$this$stateStack");
        p.k(list, "value");
        if (d().isInstance(cVar)) {
            Map map = (Map) s.W(list);
            Field[] declaredFields = cVar.getClass().getDeclaredFields();
            p.f(declaredFields, "(this.javaClass.declaredFields)");
            for (Field field : declaredFields) {
                p.f(field, "it");
                if (map.containsKey(field.getName())) {
                    field.setAccessible(true);
                    field.set(cVar, map.get(field.getName()));
                }
            }
            c<?> b11 = b(cVar);
            if (b11 != null) {
                f(b11, list.subList(1, list.size()));
            }
        }
    }
}
