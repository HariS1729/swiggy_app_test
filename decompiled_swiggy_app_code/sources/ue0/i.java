package ue0;

import android.content.SharedPreferences;
import cg0.n;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import fr.e;
import in.swiggy.android.reactnative.dinersone.DinersOneModule;
import ir.b;
import java.util.ArrayList;
import java.util.List;
import jz.c;
import kotlin.jvm.internal.p;
import og0.a;
import se.m;
import us.f;

/* compiled from: DinersOnePackage.kt */
public final class i implements m {

    /* renamed from: a  reason: collision with root package name */
    private n f19893a;

    /* renamed from: b  reason: collision with root package name */
    private f f19894b;

    /* renamed from: c  reason: collision with root package name */
    private c f19895c;

    /* renamed from: d  reason: collision with root package name */
    private a f19896d;

    /* renamed from: e  reason: collision with root package name */
    private b f19897e;

    /* renamed from: f  reason: collision with root package name */
    private e f19898f;

    /* renamed from: g  reason: collision with root package name */
    private SharedPreferences f19899g;

    /* renamed from: h  reason: collision with root package name */
    private k f19900h;

    /* renamed from: i  reason: collision with root package name */
    private l f19901i;

    public i(n nVar, f fVar, c cVar, a aVar, b bVar, e eVar, SharedPreferences sharedPreferences, k kVar, l lVar) {
        this.f19893a = nVar;
        this.f19894b = fVar;
        this.f19895c = cVar;
        this.f19896d = aVar;
        this.f19897e = bVar;
        this.f19898f = eVar;
        this.f19899g = sharedPreferences;
        this.f19900h = kVar;
        this.f19901i = lVar;
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        p.j(reactApplicationContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DinersOneModule(reactApplicationContext, this.f19893a, this.f19894b, this.f19895c, this.f19896d, this.f19897e, this.f19898f, this.f19899g, this.f19900h, this.f19901i));
        return arrayList;
    }

    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        p.j(reactApplicationContext, "reactContext");
        return new ArrayList();
    }
}
