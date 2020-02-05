.class public Landroid/support/design/shape/TriangleEdgeTreatment;
.super Landroid/support/design/shape/EdgeTreatment;
.source "TriangleEdgeTreatment.java"


# annotations
.annotation build Landroid/support/design/internal/Experimental;
    value = "The shapes API is currently experimental and subject to change"
.end annotation


# instance fields
.field private final inside:Z

.field private final size:F


# direct methods
.method public constructor <init>(FZ)V
    .locals 0
    .param p1, "size"    # F
    .param p2, "inside"    # Z

    .line 40
    invoke-direct {p0}, Landroid/support/design/shape/EdgeTreatment;-><init>()V

    .line 41
    iput p1, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->size:F

    .line 42
    iput-boolean p2, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->inside:Z

    .line 43
    return-void
.end method


# virtual methods
.method public getEdgePath(FFLandroid/support/design/shape/ShapePath;)V
    .locals 4
    .param p1, "length"    # F
    .param p2, "interpolation"    # F
    .param p3, "shapePath"    # Landroid/support/design/shape/ShapePath;

    .line 47
    const/high16 v0, 0x40000000    # 2.0f

    div-float v1, p1, v0

    iget v2, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->size:F

    mul-float v2, v2, p2

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-virtual {p3, v1, v2}, Landroid/support/design/shape/ShapePath;->lineTo(FF)V

    .line 48
    div-float v1, p1, v0

    iget-boolean v3, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->inside:Z

    if-eqz v3, :cond_0

    iget v3, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->size:F

    :goto_0
    mul-float v3, v3, p2

    goto :goto_1

    :cond_0
    iget v3, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->size:F

    neg-float v3, v3

    goto :goto_0

    :goto_1
    invoke-virtual {p3, v1, v3}, Landroid/support/design/shape/ShapePath;->lineTo(FF)V

    .line 49
    div-float v0, p1, v0

    iget v1, p0, Landroid/support/design/shape/TriangleEdgeTreatment;->size:F

    mul-float v1, v1, p2

    add-float/2addr v0, v1

    invoke-virtual {p3, v0, v2}, Landroid/support/design/shape/ShapePath;->lineTo(FF)V

    .line 50
    invoke-virtual {p3, p1, v2}, Landroid/support/design/shape/ShapePath;->lineTo(FF)V

    .line 51
    return-void
.end method
