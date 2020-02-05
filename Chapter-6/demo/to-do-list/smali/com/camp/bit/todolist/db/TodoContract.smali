.class public final Lcom/camp/bit/todolist/db/TodoContract;
.super Ljava/lang/Object;
.source "TodoContract.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/camp/bit/todolist/db/TodoContract$TodoNote;
    }
.end annotation


# static fields
.field public static final SQL_CREATE_NOTES:Ljava/lang/String; = "CREATE TABLE note(_id INTEGER PRIMARY KEY AUTOINCREMENT, date INTEGER, state INTEGER, content TEXT)"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method
