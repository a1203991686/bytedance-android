.class public Lcom/camp/bit/todolist/NoteActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "NoteActivity.java"


# instance fields
.field private addBtn:Landroid/widget/Button;

.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

.field private editText:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/camp/bit/todolist/NoteActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/NoteActivity;

    .line 20
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$100(Lcom/camp/bit/todolist/NoteActivity;Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/NoteActivity;
    .param p1, "x1"    # Ljava/lang/String;

    .line 20
    invoke-direct {p0, p1}, Lcom/camp/bit/todolist/NoteActivity;->saveNote2Database(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private saveNote2Database(Ljava/lang/String;)Z
    .locals 6
    .param p1, "content"    # Ljava/lang/String;

    .line 81
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 84
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 85
    .local v0, "values":Landroid/content/ContentValues;
    const-string v2, "content"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const-string v2, "state"

    sget-object v3, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    iget v3, v3, Lcom/camp/bit/todolist/beans/State;->intValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 87
    const-string v2, "date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 88
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "note"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 89
    .local v2, "rowId":J
    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    const/4 v1, 0x1

    nop

    :cond_1
    return v1

    .line 82
    .end local v0    # "values":Landroid/content/ContentValues;
    .end local v2    # "rowId":J
    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 30
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    const v0, 0x7f0b001e

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->setContentView(I)V

    .line 32
    const v0, 0x7f0e003c

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->setTitle(I)V

    .line 34
    new-instance v0, Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-direct {v0, p0}, Lcom/camp/bit/todolist/db/TodoDbHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 35
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v0}, Lcom/camp/bit/todolist/db/TodoDbHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 37
    const v0, 0x7f080045

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    .line 38
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 39
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 40
    const-string v0, "input_method"

    .line 41
    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 42
    .local v0, "inputManager":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 43
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 46
    :cond_0
    const v1, 0x7f080025

    invoke-virtual {p0, v1}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->addBtn:Landroid/widget/Button;

    .line 48
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->addBtn:Landroid/widget/Button;

    new-instance v2, Lcom/camp/bit/todolist/NoteActivity$1;

    invoke-direct {v2, p0}, Lcom/camp/bit/todolist/NoteActivity$1;-><init>(Lcom/camp/bit/todolist/NoteActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 73
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 74
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 76
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v1}, Lcom/camp/bit/todolist/db/TodoDbHelper;->close()V

    .line 77
    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 78
    return-void
.end method
