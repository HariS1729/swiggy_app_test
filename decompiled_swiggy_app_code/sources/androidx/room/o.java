package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import l3.a;
import t3.h;

/* compiled from: DatabaseConfiguration */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final h.c f11591a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f11592b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11593c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase.c f11594d;

    /* renamed from: e  reason: collision with root package name */
    public final List<RoomDatabase.b> f11595e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f11596f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f11597g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11598h;

    /* renamed from: i  reason: collision with root package name */
    public final RoomDatabase.JournalMode f11599i;
    public final Executor j;
    public final Executor k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11600l;

    /* renamed from: m  reason: collision with root package name */
    public final Intent f11601m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f11602o;

    /* renamed from: p  reason: collision with root package name */
    private final Set<Integer> f11603p;
    public final String q;

    /* renamed from: r  reason: collision with root package name */
    public final File f11604r;

    /* renamed from: s  reason: collision with root package name */
    public final Callable<InputStream> f11605s;

    @SuppressLint({"LambdaLast"})
    public o(Context context, String str, h.c cVar, RoomDatabase.c cVar2, List<RoomDatabase.b> list, boolean z11, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z12, boolean z13, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.d dVar, List<Object> list2, List<a> list3) {
        Intent intent2 = intent;
        this.f11591a = cVar;
        this.f11592b = context;
        this.f11593c = str;
        this.f11594d = cVar2;
        this.f11595e = list;
        this.f11598h = z11;
        this.f11599i = journalMode;
        this.j = executor;
        this.k = executor2;
        this.f11601m = intent2;
        this.f11600l = intent2 != null;
        this.n = z12;
        this.f11602o = z13;
        this.f11603p = set;
        this.q = str2;
        this.f11604r = file;
        this.f11605s = callable;
        this.f11596f = list2 == null ? Collections.emptyList() : list2;
        this.f11597g = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i11, int i12) {
        Set<Integer> set;
        if ((!(i11 > i12) || !this.f11602o) && this.n && ((set = this.f11603p) == null || !set.contains(Integer.valueOf(i11)))) {
            return true;
        }
        return false;
    }
}
