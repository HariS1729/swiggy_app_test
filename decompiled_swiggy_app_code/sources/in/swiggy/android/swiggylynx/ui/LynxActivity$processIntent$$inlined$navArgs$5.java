package in.swiggy.android.swiggylynx.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ActivityNavArgsLazy.kt */
public final class LynxActivity$processIntent$$inlined$navArgs$5 extends Lambda implements a<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f19544a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxActivity$processIntent$$inlined$navArgs$5(Activity activity) {
        super(0);
        this.f19544a = activity;
    }

    /* renamed from: a */
    public final Bundle invoke() {
        Intent intent = this.f19544a.getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + this.f19544a + " has null extras in " + intent);
        }
        throw new IllegalStateException("Activity " + this.f19544a + " has a null Intent");
    }
}
