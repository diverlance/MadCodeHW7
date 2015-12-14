.class public In
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

.field private static f F
.field private static filename F
.field private static i I

.method public <init>()V

	aload_0
	invokenonvirtual	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

    ldc 3
    putstatic In/i I
    getstatic In/i I
    ldc 0
    if_icmpeq    L1
    iconst_0
    goto  L2
L1:
    iconst_1
L2:
    ifeq   L3
    ldc 10
    putstatic In/i I
L3:
    ldc 2
    ldc 2
    imul
    ldc 2
    iadd
    putstatic In/i I
    ldc 2.33
    putstatic In/f F
    ldc "newpage.html"
    astore_2
L4:
    getstatic In/i I
    ldc 10
    if_icmplt    L5
    goto  L6
L5:
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    aload_2
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    getstatic In/i I
    ldc 1
    iadd
    putstatic In/i I
    goto  L4
L6:


    return

.limit locals 3
.limit stack  16
.end method
