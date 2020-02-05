.class Lcom/camp/bit/todolist/debug/DebugActivity$3;
.super Ljava/lang/Object;
.source "DebugActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/camp/bit/todolist/debug/DebugActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

.field final synthetic val$fileText:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/debug/DebugActivity;Landroid/widget/TextView;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 64
    iput-object p1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$3;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    iput-object p2, p0, Lcom/camp/bit/todolist/debug/DebugActivity$3;->val$fileText:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .line 68
    iget-object v0, p0, Lcom/camp/bit/todolist/debug/DebugActivity$3;->val$fileText:Landroid/widget/TextView;

    const-string v1, "TODO"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    return-void
.end method
