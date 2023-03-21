package androidx.compose.runtime.saveable;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;
import m0.b;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends Lambda implements l<Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SaveableStateHolderImpl f6201a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.f6201a = saveableStateHolderImpl;
    }

    /* renamed from: a */
    public final Boolean invoke(Object obj) {
        p.j(obj, "it");
        b f11 = this.f6201a.f();
        return Boolean.valueOf(f11 != null ? f11.a(obj) : true);
    }
}
