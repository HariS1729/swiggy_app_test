package coil.util;

import lp0.a;

/* compiled from: Time.kt */
public final class Time {

    /* renamed from: a  reason: collision with root package name */
    public static final Time f13691a = new Time();

    /* renamed from: b  reason: collision with root package name */
    private static a<Long> f13692b = Time$provider$1.f13693a;

    private Time() {
    }

    public final long a() {
        return f13692b.invoke().longValue();
    }
}
