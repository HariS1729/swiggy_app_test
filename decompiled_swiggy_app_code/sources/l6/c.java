package l6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import co.hyperverge.hypersnapsdk.R;
import java.util.ArrayList;

/* compiled from: FaceBoxView */
public class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Paint f15563a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    int f15564b;

    /* renamed from: c  reason: collision with root package name */
    int f15565c;

    /* renamed from: d  reason: collision with root package name */
    int f15566d;

    /* renamed from: e  reason: collision with root package name */
    int f15567e;

    /* renamed from: f  reason: collision with root package name */
    boolean f15568f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f15569g = false;

    /* renamed from: h  reason: collision with root package name */
    private TextView f15570h;

    public c(Context context) {
        super(context);
        a();
    }

    private void a() {
        FrameLayout.inflate(getContext(), R.layout.frame_layout_facebox, this);
        setWillNotDraw(false);
        this.f15570h = (TextView) findViewById(R.id.tv_message);
    }

    public ArrayList<Integer> getPoints() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(this.f15564b));
        arrayList.add(Integer.valueOf(this.f15566d));
        arrayList.add(Integer.valueOf(this.f15565c));
        arrayList.add(Integer.valueOf(this.f15567e));
        return arrayList;
    }

    public void onDraw(Canvas canvas) {
        if (!this.f15568f) {
            this.f15570h.setVisibility(8);
            return;
        }
        this.f15563a.setColor(Color.parseColor("#99ca3e"));
        this.f15563a.setStyle(Paint.Style.STROKE);
        this.f15563a.setStrokeWidth(10.0f);
        canvas.drawRect((float) this.f15564b, (float) this.f15566d, (float) this.f15565c, (float) this.f15567e, this.f15563a);
    }
}
