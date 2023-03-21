package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher */
class k {

    /* renamed from: a  reason: collision with root package name */
    private static Field f1595a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1596b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f1597c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f1598d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f1599e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f1600f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f1601g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f1602h;

    static void a(Resources resources) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28) {
            if (i11 >= 24) {
                d(resources);
            } else if (i11 >= 23) {
                c(resources);
            } else {
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        if (!f1596b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1595a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e11);
            }
            f1596b = true;
        }
        Field field = f1595a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e12);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f1596b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1595a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e11);
            }
            f1596b = true;
        }
        Object obj = null;
        Field field = f1595a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e12);
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f1602h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1601g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e11);
            }
            f1602h = true;
        }
        Field field = f1601g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e12);
                obj = null;
            }
            if (obj != null) {
                if (!f1596b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f1595a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e13) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e13);
                    }
                    f1596b = true;
                }
                Field field2 = f1595a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e14) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e14);
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    private static void e(Object obj) {
        if (!f1598d) {
            try {
                f1597c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e11) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e11);
            }
            f1598d = true;
        }
        Class<?> cls = f1597c;
        if (cls != null) {
            if (!f1600f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1599e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e12) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e12);
                }
                f1600f = true;
            }
            Field field = f1599e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e13) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e13);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
