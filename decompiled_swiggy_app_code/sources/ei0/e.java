package ei0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import pm0.f;
import pm0.l;
import wh0.d;

/* compiled from: LynxWebChromeClient.kt */
public final class e extends f {
    public static final a Companion = new a((i) null);

    /* renamed from: e  reason: collision with root package name */
    private final d f18306e;

    /* renamed from: f  reason: collision with root package name */
    private final l f18307f;

    /* renamed from: g  reason: collision with root package name */
    private ValueCallback<Uri[]> f18308g;

    /* compiled from: LynxWebChromeClient.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, l lVar, SharedPreferences sharedPreferences) {
        super(lVar, sharedPreferences);
        p.j(dVar, "lynxViewComponent");
        p.j(lVar, PaymentConstants.SERVICE);
        p.j(sharedPreferences, "sharedPreferences");
        this.f18306e = dVar;
        this.f18307f = lVar;
    }

    private final void f() {
        PackageManager packageManager;
        Context N0 = this.f18306e.N0();
        if (N0 != null && (packageManager = N0.getPackageManager()) != null) {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (intent.resolveActivity(packageManager) != null) {
                this.f18306e.startActivityForResult(intent, 100);
            } else {
                this.f18308g = null;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void g(PermissionRequest permissionRequest, Boolean bool) {
        if (permissionRequest != null) {
            permissionRequest.grant(permissionRequest.getResources());
        }
    }

    /* access modifiers changed from: private */
    public static final void h(e eVar, PermissionRequest permissionRequest, Throwable th2) {
        p.j(eVar, "this$0");
        super.onPermissionRequest(permissionRequest);
    }

    /* access modifiers changed from: private */
    public static final void i(e eVar, ValueCallback valueCallback, Boolean bool) {
        p.j(eVar, "this$0");
        p.i(bool, "it");
        if (bool.booleanValue()) {
            eVar.f18308g = valueCallback;
            eVar.f();
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void j(ValueCallback valueCallback, Throwable th2) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue((Object) null);
        }
    }

    public void a(int i11, int i12, Intent intent) {
        super.a(i11, i12, intent);
        if (i11 == 100) {
            if (i12 != -1 || intent == null) {
                ValueCallback<Uri[]> valueCallback = this.f18308g;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue((Object) null);
                }
            } else {
                ValueCallback<Uri[]> valueCallback2 = this.f18308g;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i12, intent));
                }
            }
            this.f18308g = null;
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        String[] resources;
        ArrayList arrayList = new ArrayList();
        if (!(permissionRequest == null || (resources = permissionRequest.getResources()) == null)) {
            for (String str : resources) {
                if (p.e(str, "android.webkit.resource.AUDIO_CAPTURE")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                } else if (p.e(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                    arrayList.add("android.permission.CAMERA");
                }
            }
        }
        if (!arrayList.isEmpty()) {
            eo0.a R0 = this.f18307f.R0();
            in.swiggy.android.commons.utils.rxpermissions.a g11 = in.swiggy.android.commons.utils.rxpermissions.a.g(this.f18306e.N0());
            Object[] array = arrayList.toArray(new String[0]);
            p.h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            R0.c(g11.v((String[]) Arrays.copyOf(strArr, strArr.length)).Q(do0.a.a()).h0(new a(permissionRequest), new c(this, permissionRequest)));
            return;
        }
        super.onPermissionRequest(permissionRequest);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = r7.getAcceptTypes();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onShowFileChooser(android.webkit.WebView r5, android.webkit.ValueCallback<android.net.Uri[]> r6, android.webkit.WebChromeClient.FileChooserParams r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0006
        L_0x0004:
            r2 = 0
            goto L_0x0011
        L_0x0006:
            java.lang.String[] r2 = r7.getAcceptTypes()
            if (r2 != 0) goto L_0x000d
            goto L_0x0004
        L_0x000d:
            int r2 = r2.length
            if (r2 != r0) goto L_0x0004
            r2 = 1
        L_0x0011:
            if (r2 == 0) goto L_0x005f
            java.lang.String[] r2 = r7.getAcceptTypes()
            if (r2 != 0) goto L_0x001a
            goto L_0x0023
        L_0x001a:
            java.lang.String r3 = "video/*"
            boolean r2 = kotlin.collections.ArraysKt___ArraysKt.G(r2, r3)
            if (r2 != r0) goto L_0x0023
            r1 = 1
        L_0x0023:
            if (r1 == 0) goto L_0x005f
            boolean r1 = r7.isCaptureEnabled()
            if (r1 == 0) goto L_0x005f
            pm0.l r5 = r4.f18307f
            eo0.a r5 = r5.R0()
            wh0.d r7 = r4.f18306e
            android.content.Context r7 = r7.N0()
            in.swiggy.android.commons.utils.rxpermissions.a r7 = in.swiggy.android.commons.utils.rxpermissions.a.g(r7)
            java.lang.String r1 = "android.permission.CAMERA"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            ao0.d r7 = r7.v(r1)
            ao0.r r1 = do0.a.a()
            ao0.d r7 = r7.Q(r1)
            ei0.d r1 = new ei0.d
            r1.<init>(r4, r6)
            ei0.b r2 = new ei0.b
            r2.<init>(r6)
            eo0.b r6 = r7.h0(r1, r2)
            r5.c(r6)
            return r0
        L_0x005f:
            boolean r5 = super.onShowFileChooser(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ei0.e.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
