/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.fife.rsta.ac.java.rjc.lexer;

public interface TokenTypes {
    public static final int KEYWORD = 65536;
    public static final int DATA_TYPE = 131072;
    public static final int IDENTIFIER = 262144;
    public static final int COMMENT = 524288;
    public static final int DOC_COMMENT = 0x100000;
    public static final int WHITESPACE = 0x200000;
    public static final int LITERAL = 0x400000;
    public static final int SEPARATOR = 0x800000;
    public static final int OPERATOR = 0x1000000;
    public static final int ASSIGNMENT_OPERATOR = 0x2000000;
    public static final int ANNOTATION_START = 0x4000000;
    public static final int ELIPSIS = 0x8000000;
    public static final int KEYWORD_ABSTRACT = 65537;
    public static final int KEYWORD_ASSERT = 65538;
    public static final int KEYWORD_BOOLEAN = 131075;
    public static final int KEYWORD_BREAK = 65540;
    public static final int KEYWORD_BYTE = 131077;
    public static final int KEYWORD_CASE = 65542;
    public static final int KEYWORD_CATCH = 65543;
    public static final int KEYWORD_CHAR = 131080;
    public static final int KEYWORD_CLASS = 65545;
    public static final int KEYWORD_CONST = 65546;
    public static final int KEYWORD_CONTINUE = 65547;
    public static final int KEYWORD_DEFAULT = 65548;
    public static final int KEYWORD_DO = 65549;
    public static final int KEYWORD_DOUBLE = 131086;
    public static final int KEYWORD_ELSE = 65551;
    public static final int KEYWORD_ENUM = 65552;
    public static final int KEYWORD_EXTENDS = 65553;
    public static final int KEYWORD_FINAL = 65554;
    public static final int KEYWORD_FINALLY = 65555;
    public static final int KEYWORD_FLOAT = 131092;
    public static final int KEYWORD_FOR = 65557;
    public static final int KEYWORD_GOTO = 65558;
    public static final int KEYWORD_IF = 65559;
    public static final int KEYWORD_IMPLEMENTS = 65560;
    public static final int KEYWORD_IMPORT = 65561;
    public static final int KEYWORD_INSTANCEOF = 65562;
    public static final int KEYWORD_INT = 131099;
    public static final int KEYWORD_INTERFACE = 65564;
    public static final int KEYWORD_LONG = 131101;
    public static final int KEYWORD_NATIVE = 65566;
    public static final int KEYWORD_NEW = 65567;
    public static final int KEYWORD_PACKAGE = 65568;
    public static final int KEYWORD_PRIVATE = 65569;
    public static final int KEYWORD_PROTECTED = 65570;
    public static final int KEYWORD_PUBLIC = 65571;
    public static final int KEYWORD_RETURN = 65572;
    public static final int KEYWORD_SHORT = 131109;
    public static final int KEYWORD_STATIC = 65574;
    public static final int KEYWORD_STRICTFP = 65575;
    public static final int KEYWORD_SUPER = 65576;
    public static final int KEYWORD_SWITCH = 65577;
    public static final int KEYWORD_SYNCHRONIZED = 65578;
    public static final int KEYWORD_THIS = 65579;
    public static final int KEYWORD_THROW = 65580;
    public static final int KEYWORD_THROWS = 65581;
    public static final int KEYWORD_TRANSIENT = 65582;
    public static final int KEYWORD_TRY = 65583;
    public static final int KEYWORD_VOID = 65584;
    public static final int KEYWORD_VOLATILE = 65585;
    public static final int KEYWORD_WHILE = 65586;
    public static final int LITERAL_INT = 0x400001;
    public static final int LITERAL_FP = 0x400002;
    public static final int LITERAL_BOOLEAN = 0x400003;
    public static final int LITERAL_CHAR = 0x400004;
    public static final int LITERAL_STRING = 0x400005;
    public static final int LITERAL_NULL = 0x400006;
    public static final int SEPARATOR_LPAREN = 0x800001;
    public static final int SEPARATOR_RPAREN = 0x800002;
    public static final int SEPARATOR_LBRACE = 0x800003;
    public static final int SEPARATOR_RBRACE = 0x800004;
    public static final int SEPARATOR_LBRACKET = 0x800005;
    public static final int SEPARATOR_RBRACKET = 0x800006;
    public static final int SEPARATOR_SEMICOLON = 0x800007;
    public static final int SEPARATOR_COMMA = 0x800008;
    public static final int SEPARATOR_DOT = 0x800009;
    public static final int OPERATOR_EQUALS = 0x2000001;
    public static final int OPERATOR_GT = 0x1000002;
    public static final int OPERATOR_LT = 0x1000003;
    public static final int OPERATOR_LOGICAL_NOT = 0x1000004;
    public static final int OPERATOR_BITWISE_NOT = 0x1000005;
    public static final int OPERATOR_QUESTION = 0x1000006;
    public static final int OPERATOR_COLON = 0x1000007;
    public static final int OPERATOR_EQUALS_EQUALS = 0x1000008;
    public static final int OPERATOR_LTE = 0x1000009;
    public static final int OPERATOR_GTE = 0x100000A;
    public static final int OPERATOR_NE = 0x100000B;
    public static final int OPERATOR_LOGICAL_AND = 0x100000C;
    public static final int OPERATOR_LOGICAL_OR = 0x100000D;
    public static final int OPERATOR_INCREMENT = 0x100000E;
    public static final int OPERATOR_DECREMENT = 0x100000F;
    public static final int OPERATOR_PLUS = 0x1000010;
    public static final int OPERATOR_MINUS = 0x1000011;
    public static final int OPERATOR_TIMES = 0x1000012;
    public static final int OPERATOR_DIVIDE = 0x1000013;
    public static final int OPERATOR_BITWISE_AND = 0x1000014;
    public static final int OPERATOR_BITWISE_OR = 0x1000015;
    public static final int OPERATOR_BITWISE_XOR = 0x1000016;
    public static final int OPERATOR_MOD = 0x1000017;
    public static final int OPERATOR_LSHIFT = 0x1000018;
    public static final int OPERATOR_RSHIFT = 0x1000019;
    public static final int OPERATOR_RSHIFT2 = 0x100001A;
    public static final int OPERATOR_PLUS_EQUALS = 33554459;
    public static final int OPERATOR_MINUS_EQUALS = 33554460;
    public static final int OPERATOR_TIMES_EQUALS = 33554461;
    public static final int OPERATOR_DIVIDE_EQUALS = 33554462;
    public static final int OPERATOR_BITWISE_AND_EQUALS = 33554463;
    public static final int OPERATOR_BITWISE_OR_EQUALS = 0x2000020;
    public static final int OPERATOR_BITWISE_XOR_EQUALS = 0x2000021;
    public static final int OPERATOR_MOD_EQUALS = 0x2000022;
    public static final int OPERATOR_LSHIFT_EQUALS = 0x2000023;
    public static final int OPERATOR_RSHIFT_EQUALS = 0x2000024;
    public static final int OPERATOR_RSHIFT2_EQUALS = 0x2000025;
}
