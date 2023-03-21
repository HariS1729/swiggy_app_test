package t2;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import t2.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f16700a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f16701b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f16702c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f16703d;

    /* renamed from: e  reason: collision with root package name */
    protected int f16704e;

    /* renamed from: f  reason: collision with root package name */
    protected C0188a f16705f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f16706g;

    /* renamed from: h  reason: collision with root package name */
    protected b f16707h;

    /* renamed from: t2.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    private class C0188a extends ContentObserver {
        C0188a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z11) {
            a.this.i();
        }
    }

    /* compiled from: CursorAdapter */
    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f16700a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f16700a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z11) {
        f(context, cursor, z11 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    public Cursor b() {
        return this.f16702c;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i11) {
        boolean z11 = false;
        if ((i11 & 1) == 1) {
            i11 |= 2;
            this.f16701b = true;
        } else {
            this.f16701b = false;
        }
        if (cursor != null) {
            z11 = true;
        }
        this.f16702c = cursor;
        this.f16700a = z11;
        this.f16703d = context;
        this.f16704e = z11 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i11 & 2) == 2) {
            this.f16705f = new C0188a();
            this.f16706g = new b();
        } else {
            this.f16705f = null;
            this.f16706g = null;
        }
        if (z11) {
            C0188a aVar = this.f16705f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f16706g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f16700a || (cursor = this.f16702c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f16700a) {
            return null;
        }
        this.f16702c.moveToPosition(i11);
        if (view == null) {
            view = g(this.f16703d, this.f16702c, viewGroup);
        }
        e(view, this.f16703d, this.f16702c);
        return view;
    }

    public Filter getFilter() {
        if (this.f16707h == null) {
            this.f16707h = new b(this);
        }
        return this.f16707h;
    }

    public Object getItem(int i11) {
        Cursor cursor;
        if (!this.f16700a || (cursor = this.f16702c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f16702c;
    }

    public long getItemId(int i11) {
        Cursor cursor;
        if (!this.f16700a || (cursor = this.f16702c) == null || !cursor.moveToPosition(i11)) {
            return 0;
        }
        return this.f16702c.getLong(this.f16704e);
    }

    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f16700a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f16702c.moveToPosition(i11)) {
            if (view == null) {
                view = h(this.f16703d, this.f16702c, viewGroup);
            }
            e(view, this.f16703d, this.f16702c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i11);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f16701b && (cursor = this.f16702c) != null && !cursor.isClosed()) {
            this.f16700a = this.f16702c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f16702c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0188a aVar = this.f16705f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f16706g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f16702c = cursor;
        if (cursor != null) {
            C0188a aVar2 = this.f16705f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f16706g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f16704e = cursor.getColumnIndexOrThrow("_id");
            this.f16700a = true;
            notifyDataSetChanged();
        } else {
            this.f16704e = -1;
            this.f16700a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
