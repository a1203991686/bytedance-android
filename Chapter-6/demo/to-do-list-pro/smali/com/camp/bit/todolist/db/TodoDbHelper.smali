.class public Lcom/camp/bit/todolist/db/TodoDbHelper;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "TodoDbHelper.java"


# static fields
.field private static final DB_NAME:Ljava/lang/String; = "todo.db"

.field private static final DB_VERSION:I = 0x2


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .line 18
    const-string v0, "todo.db"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 19
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;

    .line 23
    const-string v0, "CREATE TABLE note(_id INTEGER PRIMARY KEY AUTOINCREMENT, date INTEGER, state INTEGER, content TEXT, priority INTEGER)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 24
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 2
    .param p1, "db"    # Landroid/database/sqlite/SQLiteDatabase;
    .param p2, "oldVersion"    # I
    .param p3, "newVersion"    # I

    .line 28
    move v0, p2

    .line 28
    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_1

    .line 29
    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    const-string v1, "ALTER TABLE note ADD priority INTEGER"

    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 28
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 35
    .end local v0    # "i":I
    :cond_1
    return-void
.end method
