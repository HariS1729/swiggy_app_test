package se0;

import android.content.SharedPreferences;
import android.view.View;
import cg0.n;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.w;
import ef0.e;
import eo0.a;
import in.swiggy.android.reactnative.SwiggyRNModule;
import java.util.ArrayList;
import java.util.List;
import jz.c;
import kotlin.jvm.internal.p;
import se.m;
import us.f;

/* compiled from: SwiggyRNPackage.kt */
public final class g implements m {

    /* renamed from: a  reason: collision with root package name */
    private n f19871a;

    /* renamed from: b  reason: collision with root package name */
    private f f19872b;

    /* renamed from: c  reason: collision with root package name */
    private c f19873c;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences f19874d;

    /* renamed from: e  reason: collision with root package name */
    private e f19875e;

    /* renamed from: f  reason: collision with root package name */
    private a f19876f;

    /* renamed from: g  reason: collision with root package name */
    private Long f19877g;

    public g(n nVar, f fVar, c cVar, SharedPreferences sharedPreferences, e eVar, a aVar, Long l11) {
        this.f19871a = nVar;
        this.f19872b = fVar;
        this.f19873c = cVar;
        this.f19874d = sharedPreferences;
        this.f19875e = eVar;
        this.f19876f = aVar;
        this.f19877g = l11;
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        p.j(reactApplicationContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SwiggyRNModule(reactApplicationContext, this.f19871a, this.f19872b, this.f19873c, this.f19874d, this.f19875e, this.f19876f, this.f19877g));
        return arrayList;
    }

    public List<ViewManager<View, w<?>>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        p.j(reactApplicationContext, "reactContext");
        return new ArrayList();
    }
}
