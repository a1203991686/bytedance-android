.class Lcom/camp/bit/todolist/MainActivity$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 50
    iput-object p1, p0, Lcom/camp/bit/todolist/MainActivity$1;->this$0:Lcom/camp/bit/todolist/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "view"    # Landroid/view/View;

    .line 55
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity$1;->this$0:Lcom/camp/bit/todolist/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity$1;->this$0:Lcom/camp/bit/todolist/MainActivity;

    const-class v3, Lcom/camp/bit/todolist/NoteActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v2, 0x3ea

    invoke-virtual {v0, v1, v2}, Lcom/camp/bit/todolist/MainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 58
    return-void
.end method
