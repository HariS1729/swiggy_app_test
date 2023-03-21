package as0;

import as0.k;
import com.phonepe.intent.sdk.contracts.DeviceIdListener;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j implements DeviceIdListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f12520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f12521b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k.a f12522c;

    public /* synthetic */ j(k kVar, Map map, k.a aVar) {
        this.f12520a = kVar;
        this.f12521b = map;
        this.f12522c = aVar;
    }

    public final void onDeviceIdAvailable(String str) {
        this.f12520a.m(this.f12521b, this.f12522c, str);
    }
}
