package in.swiggy.android.swiggylynx.utils;

import kotlin.jvm.internal.p;

/* compiled from: IllegalHostException.kt */
public final class IllegalHostException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f19625a;

    public IllegalHostException(String str) {
        p.j(str, "url");
        this.f19625a = p.s("Cannot find host for ", str);
    }

    public String getMessage() {
        return this.f19625a;
    }
}
