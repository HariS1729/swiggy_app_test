package androidx.profileinstaller;

import android.content.Context;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f11077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f11078b;

    public /* synthetic */ j(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f11077a = profileInstallerInitializer;
        this.f11078b = context;
    }

    public final void run() {
        this.f11077a.i(this.f11078b);
    }
}
