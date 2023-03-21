package co.hyperverge.crashguard;

import co.hyperverge.crashguard.data.repo.PrefsRepo;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: CrashGuard.kt */
final class CrashGuard$prefsRepo$2 extends Lambda implements a<PrefsRepo> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CrashGuard f13060a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrashGuard$prefsRepo$2(CrashGuard crashGuard) {
        super(0);
        this.f13060a = crashGuard;
    }

    /* renamed from: a */
    public final PrefsRepo invoke() {
        return PrefsRepo.Companion.b(this.f13060a.g());
    }
}
