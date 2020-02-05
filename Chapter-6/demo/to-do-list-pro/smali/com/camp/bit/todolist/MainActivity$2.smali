.class Lcom/camp/bit/todolist/MainActivity$2;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/camp/bit/todolist/NoteOperator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/camp/bit/todolist/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/camp/bit/todolist/MainActivity;


# direct methods
.method constructor <init>(Lcom/camp/bit/todolist/MainActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/camp/bit/todolist/MainActivity;

    .line 70
    iput-object p1, p0, Lcom/camp/bit/todolist/MainActivity$2;->this$0:Lcom/camp/bit/todolist/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deleteNote(Lcom/camp/bit/todolist/beans/Note;)V
    .locals 1
    .param p1, "note"    # Lcom/camp/bit/todolist/beans/Note;

    .line 73
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity$2;->this$0:Lcom/camp/bit/todolist/MainActivity;

    invoke-static {v0, p1}, Lcom/camp/bit/todolist/MainActivity;->access$000(Lcom/camp/bit/todolist/MainActivity;Lcom/camp/bit/todolist/beans/Note;)V

    .line 74
    return-void
.end method

.method public updateNote(Lcom/camp/bit/todolist/beans/Note;)V
    .locals 1
    .param p1, "note"    # Lcom/camp/bit/todolist/beans/Note;

    .line 78
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity$2;->this$0:Lcom/camp/bit/todolist/MainActivity;

    invoke-static {v0, p1}, Lcom/camp/bit/todolist/MainActivity;->access$100(Lcom/camp/bit/todolist/MainActivity;Lcom/camp/bit/todolist/beans/Note;)V

    .line 79
    return-void
.end method
