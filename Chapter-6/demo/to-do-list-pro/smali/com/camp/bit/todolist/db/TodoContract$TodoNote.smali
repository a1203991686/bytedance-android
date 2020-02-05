.class public Lcom/camp/bit/todolist/db/TodoContract$TodoNote;
.super Ljava/lang/Object;
.source "TodoContract.java"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/camp/bit/todolist/db/TodoContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TodoNote"
.end annotation


# static fields
.field public static final COLUMN_CONTENT:Ljava/lang/String; = "content"

.field public static final COLUMN_DATE:Ljava/lang/String; = "date"

.field public static final COLUMN_PRIORITY:Ljava/lang/String; = "priority"

.field public static final COLUMN_STATE:Ljava/lang/String; = "state"

.field public static final TABLE_NAME:Ljava/lang/String; = "note"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
