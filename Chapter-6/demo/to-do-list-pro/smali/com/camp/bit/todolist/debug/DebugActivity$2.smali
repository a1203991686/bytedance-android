.class Lcom/camp/bit/todolist/debug/DebugActivity$2;
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


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/debug/DebugActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 46
    iput-object p1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$2;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .line 49
    iget-object v0, p0, Lcom/camp/bit/todolist/debug/DebugActivity$2;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 51
    .local v0, "state":I
    if-nez v0, :cond_0

    .line 52
    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$2;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    const-string v2, "already granted"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 53
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 54
    return-void

    .line 56
    :cond_0
    iget-object v1, p0, Lcom/camp/bit/todolist/debug/DebugActivity$2;->this$0:Lcom/camp/bit/todolist/debug/DebugActivity;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-static {}, Lcom/camp/bit/todolist/debug/DebugActivity;->access$300()I

    move-result v3

    .line 56
    invoke-static {v1, v2, v3}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 59
    return-void
.end method
