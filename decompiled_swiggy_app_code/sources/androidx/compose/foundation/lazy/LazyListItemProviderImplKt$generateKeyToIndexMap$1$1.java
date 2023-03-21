package androidx.compose.foundation.lazy;

import bp0.k;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import w.h;
import x.b;

/* compiled from: LazyListItemProviderImpl.kt */
final class LazyListItemProviderImplKt$generateKeyToIndexMap$1$1 extends Lambda implements l<b.a<h>, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f3973a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f3974b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ HashMap<Object, Integer> f3975c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(int i11, int i12, HashMap<Object, Integer> hashMap) {
        super(1);
        this.f3973a = i11;
        this.f3974b = i12;
        this.f3975c = hashMap;
    }

    public final void a(b.a<h> aVar) {
        p.j(aVar, "it");
        if (aVar.c().b() != null) {
            l<Integer, Object> b11 = aVar.c().b();
            if (b11 != null) {
                int max = Math.max(this.f3973a, aVar.b());
                int min = Math.min(this.f3974b, (aVar.b() + aVar.a()) - 1);
                if (max <= min) {
                    while (true) {
                        this.f3975c.put(b11.invoke(Integer.valueOf(max - aVar.b())), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((b.a) obj);
        return k.f22762a;
    }
}
