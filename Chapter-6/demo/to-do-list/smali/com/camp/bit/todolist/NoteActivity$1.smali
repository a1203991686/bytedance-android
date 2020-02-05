.class Lcom/camp/bit/todolist/NoteActivity$1;
.super Ljava/lang/Object;
.source "NoteActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/camp/bit/todolist/NoteActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/camp/bit/todolist/NoteActivity;


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/NoteActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/NoteActivity;

    .line 48
    iput-object p1, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .line 51
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    invoke-static {v0}, Lcom/camp/bit/todolist/NoteActivity;->access$000(Lcom/camp/bit/todolist/NoteActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 52
    .local v0, "content":Ljava/lang/CharSequence;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 53
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    const-string v3, "No content to add"

    invoke-static {v1, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 55
    return-void

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/camp/bit/todolist/NoteActivity;->access$100(Lcom/camp/bit/todolist/NoteActivity;Ljava/lang/String;)Z

    move-result v1

    .line 58
    .local v1, "succeed":Z
    if-eqz v1, :cond_1

    .line 59
    iget-object v3, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    const-string v4, "Note added"

    invoke-static {v3, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 60
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 61
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Lcom/camp/bit/todolist/NoteActivity;->setResult(I)V

    goto :goto_0

    .line 63
    :cond_1
    iget-object v3, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    const-string v4, "Error"

    invoke-static {v3, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    .line 64
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 66
    :goto_0
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity$1;->this$0:Lcom/camp/bit/todolist/NoteActivity;

    invoke-virtual {v2}, Lcom/camp/bit/todolist/NoteActivity;->finish()V

    .line 67
    return-void
.end method
