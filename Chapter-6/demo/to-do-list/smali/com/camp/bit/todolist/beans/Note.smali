.class public Lcom/camp/bit/todolist/beans/Note;
.super Ljava/lang/Object;
.source "Note.java"


# instance fields
.field private content:Ljava/lang/String;

.field private date:Ljava/util/Date;

.field public final id:J

.field private state:Lcom/camp/bit/todolist/beans/State;


# direct methods
.method public constructor <init>(J)V
    .locals 0
    .param p1, "id"    # J

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lcom/camp/bit/todolist/beans/Note;->id:J

    .line 19
    return-void
.end method


# virtual methods
.method public getContent()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/camp/bit/todolist/beans/Note;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/camp/bit/todolist/beans/Note;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getState()Lcom/camp/bit/todolist/beans/State;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/camp/bit/todolist/beans/Note;->state:Lcom/camp/bit/todolist/beans/State;

    return-object v0
.end method

.method public setContent(Ljava/lang/String;)V
    .locals 0
    .param p1, "content"    # Ljava/lang/String;

    .line 42
    iput-object p1, p0, Lcom/camp/bit/todolist/beans/Note;->content:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 0
    .param p1, "date"    # Ljava/util/Date;

    .line 26
    iput-object p1, p0, Lcom/camp/bit/todolist/beans/Note;->date:Ljava/util/Date;

    .line 27
    return-void
.end method

.method public setState(Lcom/camp/bit/todolist/beans/State;)V
    .locals 0
    .param p1, "state"    # Lcom/camp/bit/todolist/beans/State;

    .line 34
    iput-object p1, p0, Lcom/camp/bit/todolist/beans/Note;->state:Lcom/camp/bit/todolist/beans/State;

    .line 35
    return-void
.end method
