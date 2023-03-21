package ph0;

import android.content.Intent;
import kotlin.jvm.internal.p;

/* compiled from: CustomIntentBottomSheetService.kt */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f19819a;

    public d(c cVar) {
        p.j(cVar, "fragment");
        this.f19819a = cVar;
    }

    public final void a(Intent intent) {
        p.j(intent, "intent");
        this.f19819a.dismiss();
        this.f19819a.startActivity(intent);
    }
}
