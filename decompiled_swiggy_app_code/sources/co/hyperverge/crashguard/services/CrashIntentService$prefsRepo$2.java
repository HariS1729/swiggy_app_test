package co.hyperverge.crashguard.services;

import co.hyperverge.crashguard.data.repo.PrefsRepo;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: CrashIntentService.kt */
final class CrashIntentService$prefsRepo$2 extends Lambda implements a<PrefsRepo> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CrashIntentService f13157a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CrashIntentService$prefsRepo$2(CrashIntentService crashIntentService) {
        super(0);
        this.f13157a = crashIntentService;
    }

    /* renamed from: a */
    public final PrefsRepo invoke() {
        return PrefsRepo.Companion.b(this.f13157a);
    }
}
