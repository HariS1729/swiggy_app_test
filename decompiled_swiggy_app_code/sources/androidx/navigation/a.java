package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.app.c;
import androidx.navigation.w;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@w.b("activity")
/* compiled from: ActivityNavigator */
public class a extends w<C0073a> {

    /* renamed from: a  reason: collision with root package name */
    private Context f10873a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f10874b;

    /* renamed from: androidx.navigation.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityNavigator */
    public static class C0073a extends m {
        private Intent j;
        private String k;

        public C0073a(w<? extends C0073a> wVar) {
            super((w<? extends m>) wVar);
        }

        public final String B() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getAction();
        }

        public final ComponentName D() {
            Intent intent = this.j;
            if (intent == null) {
                return null;
            }
            return intent.getComponent();
        }

        public final String E() {
            return this.k;
        }

        public final Intent F() {
            return this.j;
        }

        public final C0073a G(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setAction(str);
            return this;
        }

        public final C0073a H(ComponentName componentName) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setComponent(componentName);
            return this;
        }

        public final C0073a I(Uri uri) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setData(uri);
            return this;
        }

        public final C0073a J(String str) {
            this.k = str;
            return this;
        }

        public final C0073a K(String str) {
            if (this.j == null) {
                this.j = new Intent();
            }
            this.j.setPackage(str);
            return this;
        }

        public void q(Context context, AttributeSet attributeSet) {
            super.q(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.ActivityNavigator);
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            K(string);
            String string2 = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                H(new ComponentName(context, string2));
            }
            G(obtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String string3 = obtainAttributes.getString(R.styleable.ActivityNavigator_data);
            if (string3 != null) {
                I(Uri.parse(string3));
            }
            J(obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern));
            obtainAttributes.recycle();
        }

        public String toString() {
            ComponentName D = D();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (D != null) {
                sb2.append(" class=");
                sb2.append(D.getClassName());
            } else {
                String B = B();
                if (B != null) {
                    sb2.append(" action=");
                    sb2.append(B);
                }
            }
            return sb2.toString();
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            return false;
        }
    }

    /* compiled from: ActivityNavigator */
    public static final class b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f10875a;

        public c a() {
            return null;
        }

        public int b() {
            return this.f10875a;
        }
    }

    public a(Context context) {
        this.f10873a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f10874b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public boolean e() {
        Activity activity = this.f10874b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    /* renamed from: f */
    public C0073a a() {
        return new C0073a(this);
    }

    /* renamed from: g */
    public m b(C0073a aVar, Bundle bundle, t tVar, w.a aVar2) {
        Intent intent;
        int intExtra;
        if (aVar.F() != null) {
            Intent intent2 = new Intent(aVar.F());
            if (bundle != null) {
                intent2.putExtras(bundle);
                String E = aVar.E();
                if (!TextUtils.isEmpty(E)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(E);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + E);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z11 = aVar2 instanceof b;
            if (z11) {
                intent2.addFlags(((b) aVar2).b());
            }
            if (!(this.f10873a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (tVar != null && tVar.g()) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f10874b;
            int i11 = 0;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.l());
            if (tVar != null) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", tVar.c());
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", tVar.d());
            }
            if (z11) {
                ((b) aVar2).a();
                this.f10873a.startActivity(intent2);
            } else {
                this.f10873a.startActivity(intent2);
            }
            if (tVar == null || this.f10874b == null) {
                return null;
            }
            int a11 = tVar.a();
            int b11 = tVar.b();
            if (a11 == -1 && b11 == -1) {
                return null;
            }
            if (a11 == -1) {
                a11 = 0;
            }
            if (b11 != -1) {
                i11 = b11;
            }
            this.f10874b.overridePendingTransition(a11, i11);
            return null;
        }
        throw new IllegalStateException("Destination " + aVar.l() + " does not have an Intent set.");
    }
}
