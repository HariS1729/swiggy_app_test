package androidx.compose.foundation.lazy;

import kotlin.jvm.internal.Lambda;
import lp0.l;

/* compiled from: LazyListScopeImpl.kt */
final class LazyListScopeImpl$item$2 extends Lambda implements l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f4036a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyListScopeImpl$item$2(Object obj) {
        super(1);
        this.f4036a = obj;
    }

    public final Object a(int i11) {
        return this.f4036a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a(((Number) obj).intValue());
    }
}
