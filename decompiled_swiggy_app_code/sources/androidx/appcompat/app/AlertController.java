package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.a0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import org.apache.pdfbox.pdmodel.interactive.form.PDChoice;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Context f1442a;

    /* renamed from: b  reason: collision with root package name */
    final g f1443b;

    /* renamed from: c  reason: collision with root package name */
    private final Window f1444c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1445d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f1446e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f1447f;

    /* renamed from: g  reason: collision with root package name */
    ListView f1448g;

    /* renamed from: h  reason: collision with root package name */
    private View f1449h;

    /* renamed from: i  reason: collision with root package name */
    private int f1450i;
    private int j;
    private int k;

    /* renamed from: l  reason: collision with root package name */
    private int f1451l;

    /* renamed from: m  reason: collision with root package name */
    private int f1452m;
    private boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    Button f1453o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f1454p;
    Message q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f1455r;

    /* renamed from: s  reason: collision with root package name */
    Button f1456s;
    private CharSequence t;

    /* renamed from: u  reason: collision with root package name */
    Message f1457u;
    private Drawable v;

    /* renamed from: w  reason: collision with root package name */
    Button f1458w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f1459x;

    /* renamed from: y  reason: collision with root package name */
    Message f1460y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f1461z;

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        private final int f1462a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1463b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecycleListView);
            this.f1463b = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f1462a = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean z11, boolean z12) {
            if (!z12 || !z11) {
                setPadding(getPaddingLeft(), z11 ? getPaddingTop() : this.f1462a, getPaddingRight(), z12 ? getPaddingBottom() : this.f1463b);
            }
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f1460y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f1453o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f1456s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f1457u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f1458w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f1460y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.g r3 = r3.f1443b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1466b;

        b(View view, View view2) {
            this.f1465a = view;
            this.f1466b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
            AlertController.g(nestedScrollView, this.f1465a, this.f1466b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1469b;

        c(View view, View view2) {
            this.f1468a = view;
            this.f1469b = view2;
        }

        public void run() {
            AlertController.g(AlertController.this.A, this.f1468a, this.f1469b);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1472b;

        d(View view, View view2) {
            this.f1471a = view;
            this.f1472b = view2;
        }

        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AlertController.g(absListView, this.f1471a, this.f1472b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i11) {
        }
    }

    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1475b;

        e(View view, View view2) {
            this.f1474a = view;
            this.f1475b = view2;
        }

        public void run() {
            AlertController.g(AlertController.this.f1448g, this.f1474a, this.f1475b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;
        public boolean P = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f1477a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1478b;

        /* renamed from: c  reason: collision with root package name */
        public int f1479c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f1480d;

        /* renamed from: e  reason: collision with root package name */
        public int f1481e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f1482f;

        /* renamed from: g  reason: collision with root package name */
        public View f1483g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f1484h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f1485i;
        public Drawable j;
        public DialogInterface.OnClickListener k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1486l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f1487m;
        public DialogInterface.OnClickListener n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f1488o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f1489p;
        public DialogInterface.OnClickListener q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f1490r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f1491s;
        public DialogInterface.OnDismissListener t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f1492u;
        public CharSequence[] v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f1493w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f1494x;

        /* renamed from: y  reason: collision with root package name */
        public int f1495y;

        /* renamed from: z  reason: collision with root package name */
        public View f1496z;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f1497a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Context context, int i11, int i12, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i11, i12, charSequenceArr);
                this.f1497a = recycleListView;
            }

            public View getView(int i11, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i11, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i11]) {
                    this.f1497a.setItemChecked(i11, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: a  reason: collision with root package name */
            private final int f1499a;

            /* renamed from: b  reason: collision with root package name */
            private final int f1500b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ RecycleListView f1501c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ AlertController f1502d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z11, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z11);
                this.f1501c = recycleListView;
                this.f1502d = alertController;
                Cursor cursor2 = getCursor();
                this.f1499a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f1500b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1499a));
                RecycleListView recycleListView = this.f1501c;
                int position = cursor.getPosition();
                boolean z11 = true;
                if (cursor.getInt(this.f1500b) != 1) {
                    z11 = false;
                }
                recycleListView.setItemChecked(position, z11);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f1478b.inflate(this.f1502d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AlertController f1504a;

            c(AlertController alertController) {
                this.f1504a = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j) {
                f.this.f1494x.onClick(this.f1504a.f1443b, i11);
                if (!f.this.H) {
                    this.f1504a.f1443b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ RecycleListView f1506a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AlertController f1507b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f1506a = recycleListView;
                this.f1507b = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i11] = this.f1506a.isItemChecked(i11);
                }
                f.this.J.onClick(this.f1507b.f1443b, i11, this.f1506a.isItemChecked(i11));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f1477a = context;
            this.f1490r = true;
            this.f1478b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f1478b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f1477a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f1477a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f1477a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f1493w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f1477a
                java.lang.CharSequence[] r3 = r10.v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f1494x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f1448g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f1483g;
            if (view != null) {
                alertController.m(view);
            } else {
                CharSequence charSequence = this.f1482f;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.f1480d;
                if (drawable != null) {
                    alertController.o(drawable);
                }
                int i11 = this.f1479c;
                if (i11 != 0) {
                    alertController.n(i11);
                }
                int i12 = this.f1481e;
                if (i12 != 0) {
                    alertController.n(alertController.d(i12));
                }
            }
            CharSequence charSequence2 = this.f1484h;
            if (charSequence2 != null) {
                alertController.p(charSequence2);
            }
            CharSequence charSequence3 = this.f1485i;
            if (!(charSequence3 == null && this.j == null)) {
                alertController.l(-1, charSequence3, this.k, (Message) null, this.j);
            }
            CharSequence charSequence4 = this.f1486l;
            if (!(charSequence4 == null && this.f1487m == null)) {
                alertController.l(-2, charSequence4, this.n, (Message) null, this.f1487m);
            }
            CharSequence charSequence5 = this.f1488o;
            if (!(charSequence5 == null && this.f1489p == null)) {
                alertController.l(-3, charSequence5, this.q, (Message) null, this.f1489p);
            }
            if (!(this.v == null && this.K == null && this.f1493w == null)) {
                b(alertController);
            }
            View view2 = this.f1496z;
            if (view2 == null) {
                int i13 = this.f1495y;
                if (i13 != 0) {
                    alertController.s(i13);
                }
            } else if (this.E) {
                alertController.u(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.t(view2);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f1509a;

        public g(DialogInterface dialogInterface) {
            this.f1509a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == -3 || i11 == -2 || i11 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1509a.get(), message.what);
            } else if (i11 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i11, int i12, CharSequence[] charSequenceArr) {
            super(context, i11, i12, charSequenceArr);
        }

        public long getItemId(int i11) {
            return (long) i11;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, g gVar, Window window) {
        this.f1442a = context;
        this.f1443b = gVar;
        this.f1444c = window;
        this.R = new g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.AlertDialog, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(R.styleable.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(R.styleable.AlertDialog_showTitle, true);
        this.f1445d = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        gVar.d(1);
    }

    private static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        int i11 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i11 = 4;
            }
            view3.setVisibility(i11);
        }
    }

    private ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i11 = this.K;
        if (i11 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return i11;
        }
        return this.J;
    }

    private void q(ViewGroup viewGroup, View view, int i11, int i12) {
        View findViewById = this.f1444c.findViewById(R.id.scrollIndicatorUp);
        View findViewById2 = this.f1444c.findViewById(R.id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            a0.N0(view, i11, i12);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i11 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i11 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f1447f != null) {
                this.A.setOnScrollChangeListener(new b(findViewById, findViewById2));
                this.A.post(new c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f1448g;
            if (listView != null) {
                listView.setOnScrollListener(new d(findViewById, findViewById2));
                this.f1448g.post(new e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    private void v(ViewGroup viewGroup) {
        boolean z11;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f1453o = button;
        button.setOnClickListener(this.S);
        boolean z12 = true;
        if (!TextUtils.isEmpty(this.f1454p) || this.f1455r != null) {
            this.f1453o.setText(this.f1454p);
            Drawable drawable = this.f1455r;
            if (drawable != null) {
                int i11 = this.f1445d;
                drawable.setBounds(0, 0, i11, i11);
                this.f1453o.setCompoundDrawables(this.f1455r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1453o.setVisibility(0);
            z11 = true;
        } else {
            this.f1453o.setVisibility(8);
            z11 = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f1456s = button2;
        button2.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.t) || this.v != null) {
            this.f1456s.setText(this.t);
            Drawable drawable2 = this.v;
            if (drawable2 != null) {
                int i12 = this.f1445d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f1456s.setCompoundDrawables(this.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1456s.setVisibility(0);
            z11 |= true;
        } else {
            this.f1456s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f1458w = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f1459x) || this.f1461z != null) {
            this.f1458w.setText(this.f1459x);
            Drawable drawable3 = this.f1461z;
            if (drawable3 != null) {
                int i13 = this.f1445d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f1458w.setCompoundDrawables(this.f1461z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f1458w.setVisibility(0);
            z11 |= true;
        } else {
            this.f1458w.setVisibility(8);
        }
        if (A(this.f1442a)) {
            if (z11) {
                b(this.f1453o);
            } else if (z11) {
                b(this.f1456s);
            } else if (z11) {
                b(this.f1458w);
            }
        }
        if (!z11) {
            z12 = false;
        }
        if (!z12) {
            viewGroup.setVisibility(8);
        }
    }

    private void w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1444c.findViewById(R.id.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f1447f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f1448g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1448g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    private void x(ViewGroup viewGroup) {
        View view = this.f1449h;
        boolean z11 = false;
        if (view == null) {
            view = this.f1450i != 0 ? LayoutInflater.from(this.f1442a).inflate(this.f1450i, viewGroup, false) : null;
        }
        if (view != null) {
            z11 = true;
        }
        if (!z11 || !a(view)) {
            this.f1444c.setFlags(PDChoice.FLAG_COMBO, PDChoice.FLAG_COMBO);
        }
        if (z11) {
            FrameLayout frameLayout = (FrameLayout) this.f1444c.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.f1451l, this.f1452m);
            }
            if (this.f1448g != null) {
                ((LinearLayoutCompat.a) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void y(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1444c.findViewById(R.id.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f1444c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f1446e)) || !this.P) {
            this.f1444c.findViewById(R.id.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1444c.findViewById(R.id.alertTitle);
        this.E = textView;
        textView.setText(this.f1446e);
        int i11 = this.B;
        if (i11 != 0) {
            this.D.setImageResource(i11);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
            return;
        }
        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
        this.D.setVisibility(8);
    }

    private void z() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f1444c.findViewById(R.id.parentPanel);
        int i11 = R.id.topPanel;
        View findViewById4 = findViewById3.findViewById(i11);
        int i12 = R.id.contentPanel;
        View findViewById5 = findViewById3.findViewById(i12);
        int i13 = R.id.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i13);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i11);
        View findViewById8 = viewGroup.findViewById(i12);
        View findViewById9 = viewGroup.findViewById(i13);
        ViewGroup j11 = j(findViewById7, findViewById4);
        ViewGroup j12 = j(findViewById8, findViewById5);
        ViewGroup j13 = j(findViewById9, findViewById6);
        w(j12);
        v(j13);
        y(j11);
        char c11 = 0;
        boolean z11 = viewGroup.getVisibility() != 8;
        boolean z12 = (j11 == null || j11.getVisibility() == 8) ? false : true;
        boolean z13 = (j13 == null || j13.getVisibility() == 8) ? false : true;
        if (!(z13 || j12 == null || (findViewById2 = j12.findViewById(R.id.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z12) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f1447f == null && this.f1448g == null)) {
                view = j11.findViewById(R.id.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j12 == null || (findViewById = j12.findViewById(R.id.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f1448g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z12, z13);
        }
        if (!z11) {
            View view2 = this.f1448g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z13) {
                    c11 = 2;
                }
                q(j12, view2, z12 | c11 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f1448g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i14 = this.I;
            if (i14 > -1) {
                listView2.setItemChecked(i14, true);
                listView2.setSelection(i14);
            }
        }
    }

    public Button c(int i11) {
        if (i11 == -3) {
            return this.f1458w;
        }
        if (i11 == -2) {
            return this.f1456s;
        }
        if (i11 != -1) {
            return null;
        }
        return this.f1453o;
    }

    public int d(int i11) {
        TypedValue typedValue = new TypedValue();
        this.f1442a.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f1448g;
    }

    public void f() {
        this.f1443b.setContentView(k());
        z();
    }

    public boolean h(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public boolean i(int i11, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.r(keyEvent);
    }

    public void l(int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i11, onClickListener);
        }
        if (i11 == -3) {
            this.f1459x = charSequence;
            this.f1460y = message;
            this.f1461z = drawable;
        } else if (i11 == -2) {
            this.t = charSequence;
            this.f1457u = message;
            this.v = drawable;
        } else if (i11 == -1) {
            this.f1454p = charSequence;
            this.q = message;
            this.f1455r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m(View view) {
        this.G = view;
    }

    public void n(int i11) {
        this.C = null;
        this.B = i11;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i11 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void o(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void p(CharSequence charSequence) {
        this.f1447f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(CharSequence charSequence) {
        this.f1446e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int i11) {
        this.f1449h = null;
        this.f1450i = i11;
        this.n = false;
    }

    public void t(View view) {
        this.f1449h = view;
        this.f1450i = 0;
        this.n = false;
    }

    public void u(View view, int i11, int i12, int i13, int i14) {
        this.f1449h = view;
        this.f1450i = 0;
        this.n = true;
        this.j = i11;
        this.k = i12;
        this.f1451l = i13;
        this.f1452m = i14;
    }
}
