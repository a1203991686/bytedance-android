.class public Lcom/camp/bit/todolist/ui/NoteListAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "NoteListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/camp/bit/todolist/ui/NoteViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final notes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/camp/bit/todolist/beans/Note;",
            ">;"
        }
    .end annotation
.end field

.field private final operator:Lcom/camp/bit/todolist/NoteOperator;


# direct methods
.method public constructor <init>(Lcom/camp/bit/todolist/NoteOperator;)V
    .locals 1
    .param p1, "operator"    # Lcom/camp/bit/todolist/NoteOperator;

    .line 26
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notes:Ljava/util/List;

    .line 27
    iput-object p1, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->operator:Lcom/camp/bit/todolist/NoteOperator;

    .line 28
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroid/support/v7/widget/RecyclerView$ViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 21
    check-cast p1, Lcom/camp/bit/todolist/ui/NoteViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->onBindViewHolder(Lcom/camp/bit/todolist/ui/NoteViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/camp/bit/todolist/ui/NoteViewHolder;I)V
    .locals 1
    .param p1, "holder"    # Lcom/camp/bit/todolist/ui/NoteViewHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "pos"    # I

    .line 48
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notes:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/camp/bit/todolist/beans/Note;

    invoke-virtual {p1, v0}, Lcom/camp/bit/todolist/ui/NoteViewHolder;->bind(Lcom/camp/bit/todolist/beans/Note;)V

    .line 49
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 21
    invoke-virtual {p0, p1, p2}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/camp/bit/todolist/ui/NoteViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/camp/bit/todolist/ui/NoteViewHolder;
    .locals 3
    .param p1, "parent"    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "pos"    # I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 41
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 42
    const v1, 0x7f0b002e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 43
    .local v0, "itemView":Landroid/view/View;
    new-instance v1, Lcom/camp/bit/todolist/ui/NoteViewHolder;

    iget-object v2, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->operator:Lcom/camp/bit/todolist/NoteOperator;

    invoke-direct {v1, v0, v2}, Lcom/camp/bit/todolist/ui/NoteViewHolder;-><init>(Landroid/view/View;Lcom/camp/bit/todolist/NoteOperator;)V

    return-object v1
.end method

.method public refresh(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/camp/bit/todolist/beans/Note;",
            ">;)V"
        }
    .end annotation

    .line 31
    .local p1, "newNotes":Ljava/util/List;, "Ljava/util/List<Lcom/camp/bit/todolist/beans/Note;>;"
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 32
    if-eqz p1, :cond_0

    .line 33
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notes:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->notifyDataSetChanged()V

    .line 36
    return-void
.end method
