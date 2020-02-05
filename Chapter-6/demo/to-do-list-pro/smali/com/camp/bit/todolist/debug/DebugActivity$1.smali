.class Lcom/camp/bit/todolist/debug/DebugActivity$1;
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

.field final synthetic val$pathText:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/debug/DebugActivity;Landroid/widget/TextView;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 34
    iput-object p1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    iput-object p2, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->val$pathText:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .local v0, "sb":Ljava/lang/StringBuilder;
    const-string v1, "===== Internal Private =====\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    invoke-static {v1}, Lcom/camp/bit/todolist/debug/DebugActivity;->access$200(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "===== External Private =====\n"

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    invoke-static {v1}, Lcom/camp/bit/todolist/debug/DebugActivity;->access$100(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "===== External Public =====\n"

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    invoke-static {v1}, Lcom/camp/bit/todolist/debug/DebugActivity;->access$000(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$1;->val$pathText:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    return-void
.end method
