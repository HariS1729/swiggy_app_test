package fh0;

import com.swiggy.lynx.webinterface.ILynxViewUpdateHandler;
import kotlin.jvm.internal.p;
import kotlinx.serialization.KSerializer;
import zp.b;

/* compiled from: JuspayCommunicationHelper.kt */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ILynxViewUpdateHandler f18324a;

    /* renamed from: b  reason: collision with root package name */
    private final b f18325b;

    public a(ILynxViewUpdateHandler iLynxViewUpdateHandler, b bVar) {
        p.j(iLynxViewUpdateHandler, "viewUpdateHandler");
        p.j(bVar, "responseHandler");
        this.f18324a = iLynxViewUpdateHandler;
        this.f18325b = bVar;
    }

    public <T> void a(String str, int i11, String str2, T t, KSerializer<T> kSerializer) {
        p.j(str, "requestId");
        p.j(kSerializer, "payloadStrategy");
        this.f18325b.a(str, i11, str2, t, kSerializer);
    }

    public <T> void c(String str, int i11, String str2, T t, KSerializer<T> kSerializer) {
        p.j(str, "requestId");
        p.j(kSerializer, "payloadStrategy");
        this.f18325b.c(str, i11, str2, t, kSerializer);
    }
}
