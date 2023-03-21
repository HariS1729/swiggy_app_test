package in.swiggy.android.tejas.feature.home;

import bp0.h;
import in.swiggy.android.tejas.NetworkExceptionTransformer;
import in.swiggy.android.tejas.error.Error;
import in.swiggy.android.tejas.transformer.ITransformer;
import java.util.Map;
import kotlin.jvm.internal.p;

/* compiled from: HomeModule.kt */
public final class HomeModule {
    public static final HomeModule INSTANCE = new HomeModule();

    private HomeModule() {
    }

    public final ITransformer<Throwable, Error> providesExceptionTransformer(NetworkExceptionTransformer networkExceptionTransformer) {
        p.j(networkExceptionTransformer, "homeExceptionTransformer");
        return networkExceptionTransformer;
    }

    @HomeTransformers
    public final Map<String, ITransformer<?, ?>> providesHomeTransformers(ITransformer<Throwable, Error> iTransformer) {
        p.j(iTransformer, "homeExceptionTransformer");
        return w.c(h.a(NetworkExceptionTransformer.TAG, iTransformer));
    }
}
