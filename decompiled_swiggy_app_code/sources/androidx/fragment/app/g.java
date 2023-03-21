package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* compiled from: FragmentFactory */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.collection.g<ClassLoader, androidx.collection.g<String, Class<?>>> f10479a = new androidx.collection.g<>();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.g<ClassLoader, androidx.collection.g<String, Class<?>>> gVar = f10479a;
        androidx.collection.g gVar2 = gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new androidx.collection.g();
            gVar.put(classLoader, gVar2);
        }
        Class<?> cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        } catch (ClassCastException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e12);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
