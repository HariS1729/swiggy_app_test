package androidx.compose.runtime.saveable;

import bp0.k;
import e0.g;
import kotlin.jvm.internal.Lambda;
import lp0.p;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$SaveableStateProvider$2 extends Lambda implements p<g, Integer, k> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SaveableStateHolderImpl f6208a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6209b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<g, Integer, k> f6210c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f6211d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveableStateHolderImpl$SaveableStateProvider$2(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, p<? super g, ? super Integer, k> pVar, int i11) {
        super(2);
        this.f6208a = saveableStateHolderImpl;
        this.f6209b = obj;
        this.f6210c = pVar;
        this.f6211d = i11;
    }

    public final void a(g gVar, int i11) {
        this.f6208a.a(this.f6209b, this.f6210c, gVar, this.f6211d | 1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((g) obj, ((Number) obj2).intValue());
        return k.f22762a;
    }
}
