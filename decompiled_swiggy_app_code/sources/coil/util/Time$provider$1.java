package coil.util;

import kotlin.jvm.internal.FunctionReferenceImpl;
import lp0.a;

/* compiled from: Time.kt */
/* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements a<Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final Time$provider$1 f13693a = new Time$provider$1();

    Time$provider$1() {
        super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
    }

    /* renamed from: h */
    public final Long invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
