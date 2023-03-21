package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: KeyFrames */
public class g {

    /* renamed from: b  reason: collision with root package name */
    static HashMap<String, Constructor<? extends d>> f8488b;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<Integer, ArrayList<d>> f8489a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> hashMap = new HashMap<>();
        f8488b = hashMap;
        try {
            hashMap.put("KeyAttribute", e.class.getConstructor(new Class[0]));
            f8488b.put("KeyPosition", h.class.getConstructor(new Class[0]));
            f8488b.put("KeyCycle", f.class.getConstructor(new Class[0]));
            f8488b.put("KeyTimeCycle", j.class.getConstructor(new Class[0]));
            f8488b.put("KeyTrigger", k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e11) {
            Log.e("KeyFrames", "unable to load", e11);
        }
    }

    public g() {
    }

    public void a(m mVar) {
        ArrayList arrayList = this.f8489a.get(-1);
        if (arrayList != null) {
            mVar.b(arrayList);
        }
    }

    public void b(m mVar) {
        ArrayList arrayList = this.f8489a.get(Integer.valueOf(mVar.f8550c));
        if (arrayList != null) {
            mVar.b(arrayList);
        }
        ArrayList arrayList2 = this.f8489a.get(-1);
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (dVar.f(((ConstraintLayout.b) mVar.f8549b.getLayoutParams()).f8717c0)) {
                    mVar.a(dVar);
                }
            }
        }
    }

    public void c(d dVar) {
        if (!this.f8489a.containsKey(Integer.valueOf(dVar.f8457b))) {
            this.f8489a.put(Integer.valueOf(dVar.f8457b), new ArrayList());
        }
        ArrayList arrayList = this.f8489a.get(Integer.valueOf(dVar.f8457b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public ArrayList<d> d(int i11) {
        return this.f8489a.get(Integer.valueOf(i11));
    }

    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        d dVar;
        Exception e11;
        d dVar2 = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f8488b.containsKey(name)) {
                        try {
                            Constructor constructor = f8488b.get(name);
                            if (constructor != null) {
                                dVar = (d) constructor.newInstance(new Object[0]);
                                try {
                                    dVar.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(dVar);
                                } catch (Exception e12) {
                                    e11 = e12;
                                }
                                dVar2 = dVar;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception e13) {
                            Exception exc = e13;
                            dVar = dVar2;
                            e11 = exc;
                            Log.e("KeyFrames", "unable to create ", e11);
                            dVar2 = dVar;
                            eventType = xmlPullParser.next();
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(dVar2 == null || (hashMap2 = dVar2.f8460e) == null)) {
                            ConstraintAttribute.i(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || dVar2 == null || (hashMap = dVar2.f8460e) == null)) {
                        ConstraintAttribute.i(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        } catch (IOException e15) {
            e15.printStackTrace();
        }
    }
}
