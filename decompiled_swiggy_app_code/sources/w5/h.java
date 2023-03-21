package w5;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import u5.a;

/* compiled from: HVFeatureConfigHelper */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f17570a = true;

    public static Map<String, Boolean> a() {
        return b(Collections.singletonList(a.d().a("camera2").c(false).b(Arrays.asList(new a.b[]{a.b.d().c(true).a("huawei").d(), a.b.d().c(true).a("comio").b(Collections.singletonList("comio x1")).d(), a.b.d().c(true).a("lg").d(), a.b.d().c(true).a("google").b(Collections.singletonList("nexus")).d(), a.b.d().c(true).a("samsung").b(Arrays.asList(new String[]{"sm-a315f", "sm-505f"})).d()})).d()), new ArrayList());
    }

    @SuppressLint({"LogNotTimber"})
    public static Map<String, Boolean> b(List<a> list, List<a> list2) {
        Objects.toString(list);
        Objects.toString(list2);
        HashMap hashMap = new HashMap();
        c(hashMap, list);
        c(hashMap, list2);
        o.g(hashMap);
        hashMap.toString();
        return hashMap;
    }

    private static void c(HashMap<String, Boolean> hashMap, List<a> list) {
        for (a next : list) {
            if (f17570a || next != null) {
                hashMap.put(next.e(), next.h());
            } else {
                throw new AssertionError();
            }
        }
    }
}
