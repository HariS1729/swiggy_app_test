package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.common.R;
import androidx.navigation.g;
import androidx.navigation.j;
import androidx.navigation.t;
import in.juspay.hyper.constants.LogCategory;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: NavInflater */
public final class s {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f10962c = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private Context f10963a;

    /* renamed from: b  reason: collision with root package name */
    private x f10964b;

    public s(Context context, x xVar) {
        this.f10963a = context;
        this.f10964b = xVar;
    }

    private static u a(TypedValue typedValue, u uVar, u uVar2, String str, String str2) throws XmlPullParserException {
        if (uVar == null || uVar == uVar2) {
            return uVar != null ? uVar : uVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    private m b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i11) throws XmlPullParserException, IOException {
        int depth;
        m a11 = this.f10964b.d(xmlResourceParser.getName()).a();
        a11.q(this.f10963a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                return a11;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, a11, attributeSet, i11);
                } else if ("deepLink".equals(name)) {
                    h(resources, a11, attributeSet);
                } else if (LogCategory.ACTION.equals(name)) {
                    d(resources, a11, attributeSet, xmlResourceParser, i11);
                } else if ("include".equals(name) && (a11 instanceof o)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                    ((o) a11).B(c(obtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    obtainAttributes.recycle();
                } else if (a11 instanceof o) {
                    ((o) a11).B(b(resources, xmlResourceParser, attributeSet, i11));
                }
            }
        }
        return a11;
    }

    private void d(Resources resources, m mVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i11) throws IOException, XmlPullParserException {
        int depth;
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavAction);
        int resourceId = obtainAttributes.getResourceId(R.styleable.NavAction_android_id, 0);
        c cVar = new c(obtainAttributes.getResourceId(R.styleable.NavAction_destination, 0));
        t.a aVar = new t.a();
        aVar.d(obtainAttributes.getBoolean(R.styleable.NavAction_launchSingleTop, false));
        aVar.g(obtainAttributes.getResourceId(R.styleable.NavAction_popUpTo, -1), obtainAttributes.getBoolean(R.styleable.NavAction_popUpToInclusive, false));
        aVar.b(obtainAttributes.getResourceId(R.styleable.NavAction_enterAnim, -1));
        aVar.c(obtainAttributes.getResourceId(R.styleable.NavAction_exitAnim, -1));
        aVar.e(obtainAttributes.getResourceId(R.styleable.NavAction_popEnterAnim, -1));
        aVar.f(obtainAttributes.getResourceId(R.styleable.NavAction_popExitAnim, -1));
        cVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1 && ((depth = xmlResourceParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                    f(resources, bundle, attributeSet, i11);
                }
            }
        }
        if (!bundle.isEmpty()) {
            cVar.d(bundle);
        }
        mVar.r(resourceId, cVar);
        obtainAttributes.recycle();
    }

    private g e(TypedArray typedArray, Resources resources, int i11) throws XmlPullParserException {
        g.a aVar = new g.a();
        boolean z11 = false;
        aVar.c(typedArray.getBoolean(R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = f10962c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(R.styleable.NavArgument_argType);
        int i12 = null;
        u<Integer> a11 = string != null ? u.a(string, resources.getResourcePackageName(i11)) : null;
        int i13 = R.styleable.NavArgument_android_defaultValue;
        if (typedArray.getValue(i13, typedValue)) {
            u<Integer> uVar = u.f10980c;
            if (a11 == uVar) {
                int i14 = typedValue.resourceId;
                if (i14 != 0) {
                    i12 = Integer.valueOf(i14);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i12 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + typedValue.string + "' for " + a11.c() + ". Must be a reference to a resource.");
                }
            } else {
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    if (a11 == null) {
                        a11 = uVar;
                        i12 = Integer.valueOf(i15);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + typedValue.string + "' for " + a11.c() + ". You must use a \"" + uVar.c() + "\" type to reference other resources.");
                    }
                } else if (a11 == u.k) {
                    i12 = typedArray.getString(i13);
                } else {
                    int i16 = typedValue.type;
                    if (i16 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (a11 == null) {
                            a11 = u.d(charSequence);
                        }
                        i12 = a11.h(charSequence);
                    } else if (i16 == 4) {
                        a11 = a(typedValue, a11, u.f10984g, string, "float");
                        i12 = Float.valueOf(typedValue.getFloat());
                    } else if (i16 == 5) {
                        a11 = a(typedValue, a11, u.f10979b, string, "dimension");
                        i12 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i16 == 18) {
                        a11 = a(typedValue, a11, u.f10986i, string, "boolean");
                        if (typedValue.data != 0) {
                            z11 = true;
                        }
                        i12 = Boolean.valueOf(z11);
                    } else if (i16 < 16 || i16 > 31) {
                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                    } else {
                        a11 = a(typedValue, a11, u.f10979b, string, "integer");
                        i12 = Integer.valueOf(typedValue.data);
                    }
                }
            }
        }
        if (i12 != null) {
            aVar.b(i12);
        }
        if (a11 != null) {
            aVar.d(a11);
        }
        return aVar.a();
    }

    private void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i11) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavArgument);
        String string = obtainAttributes.getString(R.styleable.NavArgument_android_name);
        if (string != null) {
            g e11 = e(obtainAttributes, resources, i11);
            if (e11.c()) {
                e11.e(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void g(Resources resources, m mVar, AttributeSet attributeSet, int i11) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavArgument);
        String string = obtainAttributes.getString(R.styleable.NavArgument_android_name);
        if (string != null) {
            mVar.a(string, e(obtainAttributes, resources, i11));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private void h(Resources resources, m mVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, R.styleable.NavDeepLink);
        String string = obtainAttributes.getString(R.styleable.NavDeepLink_uri);
        String string2 = obtainAttributes.getString(R.styleable.NavDeepLink_action);
        String string3 = obtainAttributes.getString(R.styleable.NavDeepLink_mimeType);
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(string3)) {
            j.a aVar = new j.a();
            if (string != null) {
                aVar.d(string.replace("${applicationId}", this.f10963a.getPackageName()));
            }
            if (!TextUtils.isEmpty(string2)) {
                aVar.b(string2.replace("${applicationId}", this.f10963a.getPackageName()));
            }
            if (string3 != null) {
                aVar.c(string3.replace("${applicationId}", this.f10963a.getPackageName()));
            }
            mVar.b(aVar.a());
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.o c(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f10963a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.m r2 = r6.b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.o     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.o r2 = (androidx.navigation.o) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.s.c(int):androidx.navigation.o");
    }
}
