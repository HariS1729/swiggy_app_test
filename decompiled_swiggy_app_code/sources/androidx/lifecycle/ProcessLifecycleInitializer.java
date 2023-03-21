package androidx.lifecycle;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import v3.a;

public final class ProcessLifecycleInitializer implements a<r> {
    public List<Class<? extends a<?>>> b() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public r a(Context context) {
        if (androidx.startup.a.c(context).e(ProcessLifecycleInitializer.class)) {
            n.a(context);
            ProcessLifecycleOwner.i(context);
            return ProcessLifecycleOwner.h();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
