package t2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f16711i;
    private int j;
    private LayoutInflater k;

    @Deprecated
    public c(Context context, int i11, Cursor cursor, boolean z11) {
        super(context, cursor, z11);
        this.j = i11;
        this.f16711i = i11;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.j, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.k.inflate(this.f16711i, viewGroup, false);
    }
}
