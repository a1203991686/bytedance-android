.class Lcom/camp/bit/todolist/ui/NoteViewHolder$1;
.super Ljava/lang/Object;
.source "NoteViewHolder.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/camp/bit/todolist/ui/NoteViewHolder;->bind(Lcom/camp/bit/todolist/beans/Note;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/camp/bit/todolist/ui/NoteViewHolder;

.field final synthetic val$note:Lcom/camp/bit/todolist/beans/Note;


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/ui/NoteViewHolder;Lcom/camp/bit/todolist/beans/Note;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/ui/NoteViewHolder;

    .line 53
    iput-object p1, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;->this$0:Lcom/camp/bit/todolist/ui/NoteViewHolder;

    iput-object p2, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;->val$note:Lcom/camp/bit/todolist/beans/Note;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2
    .param p1, "buttonView"    # Landroid/widget/CompoundButton;
    .param p2, "isChecked"    # Z

    .line 56
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;->val$note:Lcom/camp/bit/todolist/beans/Note;

    if-eqz p2, :cond_0

    sget-object v1, Lcom/camp/bit/todolist/beans/State;->DONE:Lcom/camp/bit/todolist/beans/State;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    :goto_0
    invoke-virtual {v0, v1}, Lcom/camp/bit/todolist/beans/Note;->setState(Lcom/camp/bit/todolist/beans/State;)V

    .line 57
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;->this$0:Lcom/camp/bit/todolist/ui/NoteViewHolder;

    invoke-static {v0}, Lcom/camp/bit/todolist/ui/NoteViewHolder;->access$000(Lcom/camp/bit/todolist/ui/NoteViewHolder;)Lcom/camp/bit/todolist/NoteOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;->val$note:Lcom/camp/bit/todolist/beans/Note;

    invoke-interface {v0, v1}, Lcom/camp/bit/todolist/NoteOperator;->updateNote(Lcom/camp/bit/todolist/beans/Note;)V

    .line 58
    return-void
.end method
