.class public Lcom/camp/bit/todolist/NoteActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "NoteActivity.java"


# instance fields
.field private addBtn:Landroid/widget/Button;

.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

.field private editText:Landroid/widget/EditText;

.field private lowRadio:Landroid/support/v7/widget/AppCompatRadioButton;

.field private radioGroup:Landroid/widget/RadioGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/camp/bit/todolist/NoteActivity;)Landroid/widget/EditText;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/NoteActivity;

    .line 23
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$100(Lcom/camp/bit/todolist/NoteActivity;)Lcom/camp/bit/todolist/beans/Priority;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/NoteActivity;

    .line 23
    invoke-direct {p0}, Lcom/camp/bit/todolist/NoteActivity;->getSelectedPriority()Lcom/camp/bit/todolist/beans/Priority;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/camp/bit/todolist/NoteActivity;Ljava/lang/String;Lcom/camp/bit/todolist/beans/Priority;)Z
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/NoteActivity;
    .param p1, "x1"    # Ljava/lang/String;
    .param p2, "x2"    # Lcom/camp/bit/todolist/beans/Priority;

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/camp/bit/todolist/NoteActivity;->saveNote2Database(Ljava/lang/String;Lcom/camp/bit/todolist/beans/Priority;)Z

    move-result v0

    return v0
.end method

.method private getSelectedPriority()Lcom/camp/bit/todolist/beans/Priority;
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->radioGroup:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    const v1, 0x7f080027

    if-eq v0, v1, :cond_1

    const v1, 0x7f080029

    if-eq v0, v1, :cond_0

    .line 109
    sget-object v0, Lcom/camp/bit/todolist/beans/Priority;->Low:Lcom/camp/bit/todolist/beans/Priority;

    return-object v0

    .line 107
    :cond_0
    sget-object v0, Lcom/camp/bit/todolist/beans/Priority;->Medium:Lcom/camp/bit/todolist/beans/Priority;

    return-object v0

    .line 105
    :cond_1
    sget-object v0, Lcom/camp/bit/todolist/beans/Priority;->High:Lcom/camp/bit/todolist/beans/Priority;

    return-object v0
.end method

.method private saveNote2Database(Ljava/lang/String;Lcom/camp/bit/todolist/beans/Priority;)Z
    .locals 6
    .param p1, "content"    # Ljava/lang/String;
    .param p2, "priority"    # Lcom/camp/bit/todolist/beans/Priority;

    .line 90
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 94
    .local v0, "values":Landroid/content/ContentValues;
    const-string v2, "content"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v2, "state"

    sget-object v3, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    iget v3, v3, Lcom/camp/bit/todolist/beans/State;->intValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 96
    const-string v2, "date"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 97
    const-string v2, "priority"

    iget v3, p2, Lcom/camp/bit/todolist/beans/Priority;->intValue:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 98
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "note"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 99
    .local v2, "rowId":J
    const-wide/16 v4, -0x1

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    const/4 v1, 0x1

    nop

    :cond_1
    return v1

    .line 91
    .end local v0    # "values":Landroid/content/ContentValues;
    .end local v2    # "rowId":J
    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 35
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    const v0, 0x7f0b001e

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->setContentView(I)V

    .line 37
    const v0, 0x7f0e003f

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->setTitle(I)V

    .line 39
    new-instance v0, Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-direct {v0, p0}, Lcom/camp/bit/todolist/db/TodoDbHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 40
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v0}, Lcom/camp/bit/todolist/db/TodoDbHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 42
    const v0, 0x7f080047

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    .line 43
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 44
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 45
    const-string v0, "input_method"

    .line 46
    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/NoteActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 47
    .local v0, "inputManager":Landroid/view/inputmethod/InputMethodManager;
    if-eqz v0, :cond_0

    .line 48
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->editText:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 50
    :cond_0
    const v2, 0x7f080084

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioGroup;

    iput-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->radioGroup:Landroid/widget/RadioGroup;

    .line 51
    const v2, 0x7f080028

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/AppCompatRadioButton;

    iput-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->lowRadio:Landroid/support/v7/widget/AppCompatRadioButton;

    .line 52
    iget-object v2, p0, Lcom/camp/bit/todolist/NoteActivity;->lowRadio:Landroid/support/v7/widget/AppCompatRadioButton;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/AppCompatRadioButton;->setChecked(Z)V

    .line 54
    const v1, 0x7f080025

    invoke-virtual {p0, v1}, Lcom/camp/bit/todolist/NoteActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->addBtn:Landroid/widget/Button;

    .line 56
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->addBtn:Landroid/widget/Button;

    new-instance v2, Lcom/camp/bit/todolist/NoteActivity$1;

    invoke-direct {v2, p0}, Lcom/camp/bit/todolist/NoteActivity$1;-><init>(Lcom/camp/bit/todolist/NoteActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 82
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 83
    iget-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 85
    iget-object v1, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v1}, Lcom/camp/bit/todolist/db/TodoDbHelper;->close()V

    .line 86
    iput-object v0, p0, Lcom/camp/bit/todolist/NoteActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 87
    return-void
.end method
