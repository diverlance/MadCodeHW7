.class public Input
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

.field private static filename F
.field private static i I
.field private static j I
.field private static maxCol I
.field private static s2 F

.method public <init>()V

	aload_0
	invokenonvirtual	java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

.method public static main([Ljava/lang/String;)V

    ldc 3
    putstatic Input/i I
    ldc "newpage2.html"
    astore_1
    ldc 4
    putstatic Input/j I
    ldc "Yes!!"
    astore_3
    ldc 4
    putstatic Input/maxCol I
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    aload_1
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    aload_3
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    getstatic Input/i I
    ldc 0
    putstatic Input/i I
    getstatic Input/i I
    ldc 0
    putstatic Input/i I
    getstatic Input/i I
    ldc 0
    putstatic Input/i I


    return

.limit locals 5
.limit stack  16
.end method
