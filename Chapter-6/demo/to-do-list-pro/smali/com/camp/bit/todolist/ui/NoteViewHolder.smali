.class public Lcom/camp/bit/todolist/ui/NoteViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "NoteViewHolder.java"


# static fields
.field private static final SIMPLE_DATE_FORMAT:Ljava/text/SimpleDateFormat;


# instance fields
.field private checkBox:Landroid/widget/CheckBox;

.field private contentText:Landroid/widget/TextView;

.field private dateText:Landroid/widget/TextView;

.field private deleteBtn:Landroid/view/View;

.field private final operator:Lcom/camp/bit/todolist/NoteOperator;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 27
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "EEE, d MMM yyyy HH:mm:ss"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->SIMPLE_DATE_FORMAT:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lcom/camp/bit/todolist/NoteOperator;)V
    .locals 1
    .param p1, "itemView"    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "operator"    # Lcom/camp/bit/todolist/NoteOperator;

    .line 38
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 39
    iput-object p2, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->operator:Lcom/camp/bit/todolist/NoteOperator;

    .line 41
    const v0, 0x7f080031

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->checkBox:Landroid/widget/CheckBox;

    .line 42
    const v0, 0x7f0800bb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    .line 43
    const v0, 0x7f0800bc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->dateText:Landroid/widget/TextView;

    .line 44
    const v0, 0x7f080026

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->deleteBtn:Landroid/view/View;

    .line 45
    return-void
.end method

.method static synthetic access$000(Lcom/camp/bit/todolist/ui/NoteViewHolder;)Lcom/camp/bit/todolist/NoteOperator;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/ui/NoteViewHolder;

    .line 25
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->operator:Lcom/camp/bit/todolist/NoteOperator;

    return-object v0
.end method


# virtual methods
.method public bind(Lcom/camp/bit/todolist/beans/Note;)V
    .locals 3
    .param p1, "note"    # Lcom/camp/bit/todolist/beans/Note;

    .line 48
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->dateText:Landroid/widget/TextView;

    sget-object v1, Lcom/camp/bit/todolist/ui/NoteViewHolder;->SIMPLE_DATE_FORMAT:Ljava/text/SimpleDateFormat;

    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getDate()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->checkBox:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 52
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->checkBox:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getState()Lcom/camp/bit/todolist/beans/State;

    move-result-object v1

    sget-object v2, Lcom/camp/bit/todolist/beans/State;->DONE:Lcom/camp/bit/todolist/beans/State;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 53
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->checkBox:Landroid/widget/CheckBox;

    new-instance v1, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;

    invoke-direct {v1, p0, p1}, Lcom/camp/bit/todolist/ui/NoteViewHolder$1;-><init>(Lcom/camp/bit/todolist/ui/NoteViewHolder;Lcom/camp/bit/todolist/beans/Note;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 60
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->deleteBtn:Landroid/view/View;

    new-instance v1, Lcom/camp/bit/todolist/ui/NoteViewHolder$2;

    invoke-direct {v1, p0, p1}, Lcom/camp/bit/todolist/ui/NoteViewHolder$2;-><init>(Lcom/camp/bit/todolist/ui/NoteViewHolder;Lcom/camp/bit/todolist/beans/Note;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getState()Lcom/camp/bit/todolist/beans/State;

    move-result-object v0

    sget-object v1, Lcom/camp/bit/todolist/beans/State;->DONE:Lcom/camp/bit/todolist/beans/State;

    if-ne v0, v1, :cond_1

    .line 68
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    const v1, -0x777778

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    or-int/lit8 v1, v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    goto :goto_1

    .line 71
    :cond_1
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 72
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->contentText:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    and-int/lit8 v1, v1, -0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 75
    :goto_1
    iget-object v0, p0, Lcom/camp/bit/todolist/ui/NoteViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getPriority()Lcom/camp/bit/todolist/beans/Priority;

    move-result-object v1

    iget v1, v1, Lcom/camp/bit/todolist/beans/Priority;->color:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 76
    return-void
.end method
