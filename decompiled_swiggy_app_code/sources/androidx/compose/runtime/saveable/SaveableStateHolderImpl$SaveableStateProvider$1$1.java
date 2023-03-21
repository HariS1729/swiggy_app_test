package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import e0.r;
import e0.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p;
import lp0.l;

/* compiled from: SaveableStateHolder.kt */
final class SaveableStateHolderImpl$SaveableStateProvider$1$1 extends Lambda implements l<s, r> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SaveableStateHolderImpl f6202a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f6203b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f6204c;

    /* compiled from: Effects.kt */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SaveableStateHolderImpl.RegistryHolder f6205a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SaveableStateHolderImpl f6206b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f6207c;

        public a(SaveableStateHolderImpl.RegistryHolder registryHolder, SaveableStateHolderImpl saveableStateHolderImpl, Object obj) {
            this.f6205a = registryHolder;
            this.f6206b = saveableStateHolderImpl;
            this.f6207c = obj;
        }

        public void dispose() {
            this.f6205a.b(this.f6206b.f6192a);
            this.f6206b.f6193b.remove(this.f6207c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SaveableStateHolderImpl$SaveableStateProvider$1$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateHolderImpl.RegistryHolder registryHolder) {
        super(1);
        this.f6202a = saveableStateHolderImpl;
        this.f6203b = obj;
        this.f6204c = registryHolder;
    }

    /* renamed from: a */
    public final r invoke(s sVar) {
        p.j(sVar, "$this$DisposableEffect");
        boolean z11 = !this.f6202a.f6193b.containsKey(this.f6203b);
        Object obj = this.f6203b;
        if (z11) {
            this.f6202a.f6192a.remove(this.f6203b);
            this.f6202a.f6193b.put(this.f6203b, this.f6204c);
            return new a(this.f6204c, this.f6202a, this.f6203b);
        }
        throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
    }
}
