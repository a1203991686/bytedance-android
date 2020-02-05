.class public final enum Lcom/camp/bit/todolist/beans/Priority;
.super Ljava/lang/Enum;
.source "Priority.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/camp/bit/todolist/beans/Priority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/camp/bit/todolist/beans/Priority;

.field public static final enum High:Lcom/camp/bit/todolist/beans/Priority;

.field public static final enum Low:Lcom/camp/bit/todolist/beans/Priority;

.field public static final enum Medium:Lcom/camp/bit/todolist/beans/Priority;


# instance fields
.field public final color:I

.field public final intValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 11
    new-instance v0, Lcom/camp/bit/todolist/beans/Priority;

    const-string v1, "High"

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/high16 v4, -0x10000

    invoke-direct {v0, v1, v3, v2, v4}, Lcom/camp/bit/todolist/beans/Priority;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/camp/bit/todolist/beans/Priority;->High:Lcom/camp/bit/todolist/beans/Priority;

    .line 12
    new-instance v0, Lcom/camp/bit/todolist/beans/Priority;

    const-string v1, "Medium"

    const/4 v4, 0x1

    const v5, -0xff0100

    invoke-direct {v0, v1, v4, v4, v5}, Lcom/camp/bit/todolist/beans/Priority;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/camp/bit/todolist/beans/Priority;->Medium:Lcom/camp/bit/todolist/beans/Priority;

    .line 13
    new-instance v0, Lcom/camp/bit/todolist/beans/Priority;

    const-string v1, "Low"

    const/4 v5, -0x1

    invoke-direct {v0, v1, v2, v3, v5}, Lcom/camp/bit/todolist/beans/Priority;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/camp/bit/todolist/beans/Priority;->Low:Lcom/camp/bit/todolist/beans/Priority;

    .line 10
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/camp/bit/todolist/beans/Priority;

    sget-object v1, Lcom/camp/bit/todolist/beans/Priority;->High:Lcom/camp/bit/todolist/beans/Priority;

    aput-object v1, v0, v3

    sget-object v1, Lcom/camp/bit/todolist/beans/Priority;->Medium:Lcom/camp/bit/todolist/beans/Priority;

    aput-object v1, v0, v4

    sget-object v1, Lcom/camp/bit/todolist/beans/Priority;->Low:Lcom/camp/bit/todolist/beans/Priority;

    aput-object v1, v0, v2

    sput-object v0, Lcom/camp/bit/todolist/beans/Priority;->$VALUES:[Lcom/camp/bit/todolist/beans/Priority;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .param p3, "intValue"    # I
    .param p4, "color"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 19
    iput p3, p0, Lcom/camp/bit/todolist/beans/Priority;->intValue:I

    .line 20
    iput p4, p0, Lcom/camp/bit/todolist/beans/Priority;->color:I

    .line 21
    return-void
.end method

.method public static from(I)Lcom/camp/bit/todolist/beans/Priority;
    .locals 5
    .param p0, "intValue"    # I

    .line 24
    invoke-static {}, Lcom/camp/bit/todolist/beans/Priority;->values()[Lcom/camp/bit/todolist/beans/Priority;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 25
    .local v3, "priority":Lcom/camp/bit/todolist/beans/Priority;
    iget v4, v3, Lcom/camp/bit/todolist/beans/Priority;->intValue:I

    if-ne v4, p0, :cond_0

    .line 26
    return-object v3

    .line 24
    .end local v3    # "priority":Lcom/camp/bit/todolist/beans/Priority;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 29
    :cond_1
    sget-object v0, Lcom/camp/bit/todolist/beans/Priority;->Low:Lcom/camp/bit/todolist/beans/Priority;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/camp/bit/todolist/beans/Priority;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 10
    const-class v0, Lcom/camp/bit/todolist/beans/Priority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/camp/bit/todolist/beans/Priority;

    return-object v0
.end method

.method public static values()[Lcom/camp/bit/todolist/beans/Priority;
    .locals 1

    .line 10
    sget-object v0, Lcom/camp/bit/todolist/beans/Priority;->$VALUES:[Lcom/camp/bit/todolist/beans/Priority;

    invoke-virtual {v0}, [Lcom/camp/bit/todolist/beans/Priority;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/camp/bit/todolist/beans/Priority;

    return-object v0
.end method
