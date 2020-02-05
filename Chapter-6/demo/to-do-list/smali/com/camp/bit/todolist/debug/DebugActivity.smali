.class public Lcom/camp/bit/todolist/debug/DebugActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "DebugActivity.java"


# static fields
.field private static REQUEST_CODE_STORAGE_PERMISSION:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const/16 v0, 0x3e9

    sput v0, Lcom/camp/bit/todolist/debug/DebugActivity;->REQUEST_CODE_STORAGE_PERMISSION:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 22
    invoke-direct {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getExternalPublicPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 22
    invoke-direct {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getExternalPrivatePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/camp/bit/todolist/debug/DebugActivity;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lcom/camp/bit/todolist/debug/DebugActivity;

    .line 22
    invoke-direct {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getInternalPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300()I
    .locals 1

    .line 22
    sget v0, Lcom/camp/bit/todolist/debug/DebugActivity;->REQUEST_CODE_STORAGE_PERMISSION:I

    return v0
.end method

.method private static getCanonicalPath(Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 117
    .local p0, "dirMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .local v0, "sb":Ljava/lang/StringBuilder;
    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 120
    .local v2, "name":Ljava/lang/String;
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    .line 123
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .end local v2    # "name":Ljava/lang/String;
    goto :goto_0

    .line 127
    :cond_0
    goto :goto_1

    .line 125
    :catch_0
    move-exception v1

    .line 126
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 128
    .end local v1    # "e":Ljava/io/IOException;
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getExternalPrivatePath()Ljava/lang/String;
    .locals 3

    .line 101
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 102
    .local v0, "dirMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
    const-string v1, "cacheDir"

    invoke-virtual {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const-string v1, "filesDir"

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/debug/DebugActivity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    const-string v1, "picturesDir"

    sget-object v2, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/debug/DebugActivity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    invoke-static {v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getCanonicalPath(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getExternalPublicPath()Ljava/lang/String;
    .locals 3

    .line 109
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 110
    .local v0, "dirMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
    const-string v1, "rootDir"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    const-string v1, "picturesDir"

    sget-object v2, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 112
    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 111
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    invoke-static {v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getCanonicalPath(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getInternalPath()Ljava/lang/String;
    .locals 4

    .line 93
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 94
    .local v0, "dirMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/io/File;>;"
    const-string v1, "cacheDir"

    invoke-virtual {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getCacheDir()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    const-string v1, "filesDir"

    invoke-virtual {p0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const-string v1, "customDir"

    const-string v2, "custom"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Lcom/camp/bit/todolist/debug/DebugActivity;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-static {v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->getCanonicalPath(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 28
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 29
    const v0, 0x7f0b001c

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->setContentView(I)V

    .line 30
    const v0, 0x7f0e0027

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->setTitle(I)V

    .line 32
    const v0, 0x7f080027

    invoke-virtual {p0, v0}, Lcom/camp/bit/todolist/debug/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 33
    .local v0, "printBtn":Landroid/widget/Button;
    const v1, 0x7f0800bc

    invoke-virtual {p0, v1}, Lcom/camp/bit/todolist/debug/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 34
    .local v1, "pathText":Landroid/widget/TextView;
    new-instance v2, Lcom/camp/bit/todolist/debug/DebugActivity$1;

    invoke-direct {v2, p0, v1}, Lcom/camp/bit/todolist/debug/DebugActivity$1;-><init>(Lcom/camp/bit/todolist/debug/DebugActivity;Landroid/widget/TextView;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    const v2, 0x7f080028

    invoke-virtual {p0, v2}, Lcom/camp/bit/todolist/debug/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    .line 46
    .local v2, "permissionBtn":Landroid/widget/Button;
    new-instance v3, Lcom/camp/bit/todolist/debug/DebugActivity$2;

    invoke-direct {v3, p0}, Lcom/camp/bit/todolist/debug/DebugActivity$2;-><init>(Lcom/camp/bit/todolist/debug/DebugActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    const v3, 0x7f080029

    invoke-virtual {p0, v3}, Lcom/camp/bit/todolist/debug/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 63
    .local v3, "fileWriteBtn":Landroid/widget/Button;
    const v4, 0x7f0800ba

    invoke-virtual {p0, v4}, Lcom/camp/bit/todolist/debug/DebugActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 64
    .local v4, "fileText":Landroid/widget/TextView;
    new-instance v5, Lcom/camp/bit/todolist/debug/DebugActivity$3;

    invoke-direct {v5, p0, v4}, Lcom/camp/bit/todolist/debug/DebugActivity$3;-><init>(Lcom/camp/bit/todolist/debug/DebugActivity;Landroid/widget/TextView;)V

    invoke-virtual {v3, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3
    .param p1, "requestCode"    # I
    .param p2, "permissions"    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3, "grantResults"    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 76
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/AppCompatActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 77
    array-length v0, p2

    if-eqz v0, :cond_3

    array-length v0, p3

    if-nez v0, :cond_0

    goto :goto_1

    .line 80
    :cond_0
    sget v0, Lcom/camp/bit/todolist/debug/DebugActivity;->REQUEST_CODE_STORAGE_PERMISSION:I

    if-ne p1, v0, :cond_2

    .line 81
    const/4 v0, 0x0

    aget v1, p3, v0

    .line 82
    .local v1, "state":I
    if-nez v1, :cond_1

    .line 83
    const-string v2, "permission granted"

    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 85
    :cond_1
    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    .line 86
    const-string v2, "permission denied"

    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 90
    .end local v1    # "state":I
    :cond_2
    :goto_0
    return-void

    .line 78
    :cond_3
    :goto_1
    return-void
.end method