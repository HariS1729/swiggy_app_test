package in.swiggy.android.swiggylynx.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import lp0.a;

/* compiled from: ActivityNavArgsLazy.kt */
public final class LynxActivity$loadPlugins$$inlined$navArgs$1 extends Lambda implements a<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f19539a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxActivity$loadPlugins$$inlined$navArgs$1(Activity activity) {
        super(0);
        this.f19539a = activity;
    }

    /* renamed from: a */
    public final Bundle invoke() {
        Intent intent = this.f19539a.getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras;
            }
            throw new IllegalStateException("Activity " + this.f19539a + " has null extras in " + intent);
        }
        throw new IllegalStateException("Activity " + this.f19539a + " has a null Intent");
    }
}
