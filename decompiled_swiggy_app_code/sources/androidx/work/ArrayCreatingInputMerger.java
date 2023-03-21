package androidx.work;

import androidx.work.b;
import d4.f;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends f {
    private Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }

    private Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, newInstance, 0, length);
        System.arraycopy(obj2, 0, newInstance, length, length2);
        return newInstance;
    }

    private Object e(Object obj, Object obj2) {
        Object newInstance = Array.newInstance(obj.getClass(), 2);
        Array.set(newInstance, 0, obj);
        Array.set(newInstance, 1, obj2);
        return newInstance;
    }

    private Object f(Object obj) {
        Object newInstance = Array.newInstance(obj.getClass(), 1);
        Array.set(newInstance, 0, obj);
        return newInstance;
    }

    public b b(List<b> list) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        loop0:
        for (b j : list) {
            Iterator<Map.Entry<String, Object>> it2 = j.j().entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry next = it2.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                value = d(obj, value);
                            } else {
                                value = e(obj, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = c(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = c(value, obj);
                        }
                    } else if (!cls.isArray()) {
                        value = f(value);
                    }
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.d(hashMap);
        return aVar.a();
    }
}
