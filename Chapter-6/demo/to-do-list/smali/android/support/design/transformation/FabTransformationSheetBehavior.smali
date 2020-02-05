.class public Landroid/support/design/transformation/FabTransformationSheetBehavior;
.super Landroid/support/design/transformation/FabTransformationBehavior;
.source "FabTransformationSheetBehavior.java"


# instance fields
.field private importantForAccessibilityMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Landroid/support/design/transformation/FabTransformationBehavior;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .line 50
    invoke-direct {p0, p1, p2}, Landroid/support/design/transformation/FabTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 51
    return-void
.end method

.method private updateImportantForAccessibility(Landroid/view/View;Z)V
    .locals 10
    .param p1, "sheet"    # Landroid/view/View;
    .param p2, "expanded"    # Z

    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 78
    .local v0, "viewParent":Landroid/view/ViewParent;
    instance-of v1, v0, Landroid/support/design/widget/CoordinatorLayout;

    if-nez v1, :cond_0

    .line 79
    return-void

    .line 82
    :cond_0
    move-object v1, v0

    check-cast v1, Landroid/support/design/widget/CoordinatorLayout;

    .line 83
    .local v1, "parent":Landroid/support/design/widget/CoordinatorLayout;
    invoke-virtual {v1}, Landroid/support/design/widget/CoordinatorLayout;->getChildCount()I

    move-result v2

    .line 84
    .local v2, "childCount":I
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x10

    if-lt v3, v4, :cond_1

    if-eqz p2, :cond_1

    .line 85
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v3, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    .line 88
    :cond_1
    const/4 v3, 0x0

    const/4 v5, 0x0

    .line 88
    .local v5, "i":I
    :goto_0
    if-ge v5, v2, :cond_7

    .line 89
    invoke-virtual {v1, v5}, Landroid/support/design/widget/CoordinatorLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 92
    .local v6, "child":Landroid/view/View;
    nop

    .line 93
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    instance-of v7, v7, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;

    if-eqz v7, :cond_2

    .line 94
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v7}, Landroid/support/design/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroid/support/design/widget/CoordinatorLayout$Behavior;

    move-result-object v7

    instance-of v7, v7, Landroid/support/design/transformation/FabTransformationScrimBehavior;

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    .line 96
    .local v7, "hasScrimBehavior":Z
    :goto_1
    if-eq v6, p1, :cond_6

    if-eqz v7, :cond_3

    .line 97
    goto :goto_2

    .line 100
    :cond_3
    if-nez p2, :cond_4

    .line 101
    iget-object v8, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    if-eqz v8, :cond_6

    iget-object v8, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    .line 102
    invoke-interface {v8, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 104
    iget-object v8, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v6, v8}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    goto :goto_2

    .line 108
    :cond_4
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v8, v4, :cond_5

    .line 109
    iget-object v8, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    invoke-virtual {v6}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    :cond_5
    const/4 v8, 0x4

    invoke-static {v6, v8}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 88
    .end local v6    # "child":Landroid/view/View;
    .end local v7    # "hasScrimBehavior":Z
    :cond_6
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 117
    .end local v5    # "i":I
    :cond_7
    if-nez p2, :cond_8

    .line 118
    const/4 v3, 0x0

    iput-object v3, p0, Landroid/support/design/transformation/FabTransformationSheetBehavior;->importantForAccessibilityMap:Ljava/util/Map;

    .line 120
    :cond_8
    return-void
.end method


# virtual methods
.method protected onCreateMotionSpec(Landroid/content/Context;Z)Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "expanded"    # Z

    .line 56
    if-eqz p2, :cond_0

    .line 57
    sget v0, Landroid/support/design/R$animator;->mtrl_fab_transformation_sheet_expand_spec:I

    .line 57
    .local v0, "specRes":I
    goto :goto_0

    .line 59
    .end local v0    # "specRes":I
    :cond_0
    sget v0, Landroid/support/design/R$animator;->mtrl_fab_transformation_sheet_collapse_spec:I

    .line 62
    .restart local v0    # "specRes":I
    :goto_0
    new-instance v1, Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;

    invoke-direct {v1}, Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;-><init>()V

    .line 63
    .local v1, "spec":Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;
    invoke-static {p1, v0}, Landroid/support/design/animation/MotionSpec;->createFromResource(Landroid/content/Context;I)Landroid/support/design/animation/MotionSpec;

    move-result-object v2

    iput-object v2, v1, Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;->timings:Landroid/support/design/animation/MotionSpec;

    .line 64
    new-instance v2, Landroid/support/design/animation/Positioning;

    const/16 v3, 0x11

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4}, Landroid/support/design/animation/Positioning;-><init>(IFF)V

    iput-object v2, v1, Landroid/support/design/transformation/FabTransformationBehavior$FabTransformationSpec;->positioning:Landroid/support/design/animation/Positioning;

    .line 65
    return-object v1
.end method

.method protected onExpandedStateChange(Landroid/view/View;Landroid/view/View;ZZ)Z
    .locals 1
    .param p1, "dependency"    # Landroid/view/View;
    .param p2, "child"    # Landroid/view/View;
    .param p3, "expanded"    # Z
    .param p4, "animated"    # Z
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 72
    invoke-direct {p0, p2, p3}, Landroid/support/design/transformation/FabTransformationSheetBehavior;->updateImportantForAccessibility(Landroid/view/View;Z)V

    .line 73
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/design/transformation/FabTransformationBehavior;->onExpandedStateChange(Landroid/view/View;Landroid/view/View;ZZ)Z

    move-result v0

    return v0
.end method