.class public Lcom/camp/bit/todolist/MainActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "MainActivity.java"


# static fields
.field private static final REQUEST_CODE_ADD:I = 0x3ea


# instance fields
.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

.field private notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

.field private recyclerView:Landroid/support/v7/widget/RecyclerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/camp/bit/todolist/MainActivity;Lcom/camp/bit/todolist/beans/Note;)V
    .locals 0
    .param p0, "x0"    # Lcom/camp/bit/todolist/MainActivity;
    .param p1, "x1"    # Lcom/camp/bit/todolist/beans/Note;

    .line 32
    invoke-direct {p0, p1}, Lcom/camp/bit/todolist/MainActivity;->deleteNote(Lcom/camp/bit/todolist/beans/Note;)V

    return-void
.end method

.method static synthetic access$100(Lcom/camp/bit/todolist/MainActivity;Lcom/camp/bit/todolist/beans/Note;)V
    .locals 0
    .param p0, "x0"    # Lcom/camp/bit/todolist/MainActivity;
    .param p1, "x1"    # Lcom/camp/bit/todolist/beans/Note;

    .line 32
    invoke-direct {p0, p1}, Lcom/camp/bit/todolist/MainActivity;->updateNode(Lcom/camp/bit/todolist/beans/Note;)V

    return-void
.end method

.method private deleteNote(Lcom/camp/bit/todolist/beans/Note;)V
    .locals 7
    .param p1, "note"    # Lcom/camp/bit/todolist/beans/Note;

    .line 159
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    .line 160
    return-void

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "note"

    const-string v2, "_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    iget-wide v5, p1, Lcom/camp/bit/todolist/beans/Note;->id:J

    .line 164
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    .line 162
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    .line 165
    .local v0, "rows":I
    if-lez v0, :cond_1

    .line 166
    iget-object v1, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    invoke-direct {p0}, Lcom/camp/bit/todolist/MainActivity;->loadNotesFromDatabase()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->refresh(Ljava/util/List;)V

    .line 168
    :cond_1
    return-void
.end method

.method private loadNotesFromDatabase()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/camp/bit/todolist/beans/Note;",
            ">;"
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    .line 127
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 129
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 130
    .local v0, "result":Ljava/util/List;, "Ljava/util/List<Lcom/camp/bit/todolist/beans/Note;>;"
    const/4 v1, 0x0

    .line 132
    .local v1, "cursor":Landroid/database/Cursor;
    :try_start_0
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "note"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "date DESC"

    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    move-object v1, v2

    .line 137
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 138
    const-string v2, "_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 139
    .local v2, "id":J
    const-string v4, "content"

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 140
    .local v4, "content":Ljava/lang/String;
    const-string v5, "date"

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    .line 141
    .local v5, "dateMs":J
    const-string v7, "state"

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 143
    .local v7, "intState":I
    new-instance v8, Lcom/camp/bit/todolist/beans/Note;

    invoke-direct {v8, v2, v3}, Lcom/camp/bit/todolist/beans/Note;-><init>(J)V

    .line 144
    .local v8, "note":Lcom/camp/bit/todolist/beans/Note;
    invoke-virtual {v8, v4}, Lcom/camp/bit/todolist/beans/Note;->setContent(Ljava/lang/String;)V

    .line 145
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v8, v9}, Lcom/camp/bit/todolist/beans/Note;->setDate(Ljava/util/Date;)V

    .line 146
    invoke-static {v7}, Lcom/camp/bit/todolist/beans/State;->from(I)Lcom/camp/bit/todolist/beans/State;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/camp/bit/todolist/beans/Note;->setState(Lcom/camp/bit/todolist/beans/State;)V

    .line 148
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .end local v2    # "id":J
    .end local v4    # "content":Ljava/lang/String;
    .end local v5    # "dateMs":J
    .end local v7    # "intState":I
    .end local v8    # "note":Lcom/camp/bit/todolist/beans/Note;
    goto :goto_0

    .line 151
    :cond_1
    if-eqz v1, :cond_2

    .line 152
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 155
    :cond_2
    return-object v0

    .line 151
    :catchall_0
    move-exception v2

    if-eqz v1, :cond_3

    .line 152
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v2
.end method

.method private updateNode(Lcom/camp/bit/todolist/beans/Note;)V
    .locals 8
    .param p1, "note"    # Lcom/camp/bit/todolist/beans/Note;

    .line 171
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 175
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "state"

    invoke-virtual {p1}, Lcom/camp/bit/todolist/beans/Note;->getState()Lcom/camp/bit/todolist/beans/State;

    move-result-object v2

    iget v2, v2, Lcom/camp/bit/todolist/beans/State;->intValue:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 177
    iget-object v1, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "note"

    const-string v3, "_id=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    iget-wide v6, p1, Lcom/camp/bit/todolist/beans/Note;->id:J

    .line 179
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 177
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    .line 180
    .local v1, "rows":I
    if-lez v1, :cond_1

    .line 181
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    invoke-direct {p0}, Lcom/camp/bit/todolist/MainActivity;->loadNotesFromDatabase()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->refresh(Ljava/util/List;)V

    .line 183
    :cond_1
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 118
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 119
    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    invoke-direct {p0}, Lcom/camp/bit/todolist/MainActivity;->loadNotesFromDatabase()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->refresh(Ljava/util/List;)V

    .line 123
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 44
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    const v0, 0x7f0b001d

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/MainActivity;->setContentView(I)V

    .line 46
    const v0, 0x7f0800c4

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 47
    .local v0, "toolbar":Landroid/support/v7/widget/Toolbar;
    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/MainActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 49
    const v1, 0x7f08004c

    invoke-virtual {p0, v1}, Lcom/camp/bit/todolist/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/design/widget/FloatingActionButton;

    .line 50
    .local v1, "fab":Landroid/support/design/widget/FloatingActionButton;
    new-instance v2, Lcom/camp/bit/todolist/MainActivity$1;

    invoke-direct {v2, p0}, Lcom/camp/bit/todolist/MainActivity$1;-><init>(Lcom/camp/bit/todolist/MainActivity;)V

    invoke-virtual {v1, v2}, Landroid/support/design/widget/FloatingActionButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    new-instance v2, Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-direct {v2, p0}, Lcom/camp/bit/todolist/db/TodoDbHelper;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 62
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v2}, Lcom/camp/bit/todolist/db/TodoDbHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    iput-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 64
    const v2, 0x7f080068

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/widget/RecyclerView;

    iput-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 65
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v3, p0, v4, v5}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 67
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Landroid/support/v7/widget/DividerItemDecoration;

    invoke-direct {v3, p0, v4}, Landroid/support/v7/widget/DividerItemDecoration;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    .line 69
    new-instance v2, Lcom/camp/bit/todolist/ui/NoteListAdapter;

    new-instance v3, Lcom/camp/bit/todolist/MainActivity$2;

    invoke-direct {v3, p0}, Lcom/camp/bit/todolist/MainActivity$2;-><init>(Lcom/camp/bit/todolist/MainActivity;)V

    invoke-direct {v2, v3}, Lcom/camp/bit/todolist/ui/NoteListAdapter;-><init>(Lcom/camp/bit/todolist/NoteOperator;)V

    iput-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    .line 80
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    iget-object v3, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 82
    iget-object v2, p0, Lcom/camp/bit/todolist/MainActivity;->notesAdapter:Lcom/camp/bit/todolist/ui/NoteListAdapter;

    invoke-direct {p0}, Lcom/camp/bit/todolist/MainActivity;->loadNotesFromDatabase()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/camp/bit/todolist/ui/NoteListAdapter;->refresh(Ljava/util/List;)V

    .line 83
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .line 96
    invoke-virtual {p0}, Lcom/camp/bit/todolist/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0c0000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 97
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 87
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 88
    iget-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 90
    iget-object v1, p0, Lcom/camp/bit/todolist/MainActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    invoke-virtual {v1}, Lcom/camp/bit/todolist/db/TodoDbHelper;->close()V

    .line 91
    iput-object v0, p0, Lcom/camp/bit/todolist/MainActivity;->dbHelper:Lcom/camp/bit/todolist/db/TodoDbHelper;

    .line 92
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Landroid/view/MenuItem;

    .line 102
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    .line 103
    .local v0, "id":I
    const v1, 0x7f08000f

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    const v1, 0x7f080017

    if-eq v0, v1, :cond_0

    .line 113
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v1

    return v1

    .line 105
    :cond_0
    return v2

    .line 107
    :cond_1
    new-instance v1, Landroid/content/Intent;

    const-class v3, Lcom/camp/bit/todolist/debug/DebugActivity;

    invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/camp/bit/todolist/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 108
    return v2
.end method
