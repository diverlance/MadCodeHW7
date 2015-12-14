.class public In
.super java/lang/Object

.field private static i I
.field private static test Ljava/lang/String;
.field private static f F
.field private static filename Ljava/lang/String;
.field private static i1 I
.field private static i2 I
.field private static iHope Ljava/lang/String;
.field private static t I
.field private static col I

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
    ldc "test"
    astore 2
    ldc 2.33
    putstatic In/f F
    ldc "https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings"
    astore 4
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    getstatic In/f F
    invokestatic     java/lang/String.valueOf(F)Ljava/lang/String;
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    getstatic In/i I
    ldc 0
    if_icmpeq    L1
    iconst_0
    goto  L2
L1:
    iconst_1
L2:
    ifeq   L3
    ldc "true"
    astore 2
    goto  L4
L3:
    ldc "false"
    astore 2
L4:
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    aload 2
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    ldc 2
    putstatic In/i1 I
    ldc 2
    putstatic In/i2 I
    ldc 2
    ldc 3
    iadd
    ldc 3
    imul
    putstatic In/i1 I
    ldc 2
    ldc 3
    imul
    ldc 3
    iadd
    putstatic In/i2 I
    ldc "I hope this works!"
    astore 7
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    getstatic In/i1 I
    invokestatic     java/lang/String.valueOf(I)Ljava/lang/String;
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    getstatic In/i2 I
    invokestatic     java/lang/String.valueOf(I)Ljava/lang/String;
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    ldc 1
    putstatic In/i I
    aload 4
    getstatic In/i I
    invokestatic wci/backend/JSOUP/printFullTable(Ljava/lang/String;I)V
    ldc 1
    putstatic In/t I
    ldc 1
    putstatic In/col I
L5:
    getstatic In/i I
    ldc 10
    if_icmplt    L6
    goto  L7
L6:
    getstatic     java/lang/System/out Ljava/io/PrintStream;
    aload 7
    invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V
    aload 4
    getstatic In/t I
    getstatic In/i I
    getstatic In/col I
    invokestatic wci/backend/JSOUP/printData(Ljava/lang/String;III)V
    getstatic In/i I
    ldc 1
    iadd
    putstatic In/i I
    goto  L5
L7:


    return

.limit locals 9
.limit stack  16
.end method
