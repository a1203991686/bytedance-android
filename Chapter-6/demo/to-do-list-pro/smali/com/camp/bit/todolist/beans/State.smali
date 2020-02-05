.class public final enum Lcom/camp/bit/todolist/beans/State;
.super Ljava/lang/Enum;
.source "State.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/camp/bit/todolist/beans/State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/camp/bit/todolist/beans/State;

.field public static final enum DONE:Lcom/camp/bit/todolist/beans/State;

.field public static final enum TODO:Lcom/camp/bit/todolist/beans/State;


# instance fields
.field public final intValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Lcom/camp/bit/todolist/beans/State;

    const-string v1, "TODO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/camp/bit/todolist/beans/State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    new-instance v0, Lcom/camp/bit/todolist/beans/State;

    const-string v1, "DONE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lcom/camp/bit/todolist/beans/State;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/camp/bit/todolist/beans/State;->DONE:Lcom/camp/bit/todolist/beans/State;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/camp/bit/todolist/beans/State;

    sget-object v1, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/camp/bit/todolist/beans/State;->DONE:Lcom/camp/bit/todolist/beans/State;

    aput-object v1, v0, v3

    sput-object v0, Lcom/camp/bit/todolist/beans/State;->$VALUES:[Lcom/camp/bit/todolist/beans/State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "intValue"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 14
    iput p3, p0, Lcom/camp/bit/todolist/beans/State;->intValue:I

    .line 15
    return-void
.end method

.method public static from(I)Lcom/camp/bit/todolist/beans/State;
    .locals 5
    .param p0, "intValue"    # I

    .line 18
    invoke-static {}, Lcom/camp/bit/todolist/beans/State;->values()[Lcom/camp/bit/todolist/beans/State;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 19
    .local v3, "state":Lcom/camp/bit/todolist/beans/State;
    iget v4, v3, Lcom/camp/bit/todolist/beans/State;->intValue:I

    if-ne v4, p0, :cond_0

    .line 20
    return-object v3

    .line 18
    .end local v3    # "state":Lcom/camp/bit/todolist/beans/State;
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, Lcom/camp/bit/todolist/beans/State;->TODO:Lcom/camp/bit/todolist/beans/State;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/camp/bit/todolist/beans/State;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 8
    const-class v0, Lcom/camp/bit/todolist/beans/State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/camp/bit/todolist/beans/State;

    return-object v0
.end method

.method public static values()[Lcom/camp/bit/todolist/beans/State;
    .locals 1

    .line 8
    sget-object v0, Lcom/camp/bit/todolist/beans/State;->$VALUES:[Lcom/camp/bit/todolist/beans/State;

    invoke-virtual {v0}, [Lcom/camp/bit/todolist/beans/State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/camp/bit/todolist/beans/State;

    return-object v0
.end method
