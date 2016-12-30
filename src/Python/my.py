from antlr4 import *
from MiniJavaLexer import MiniJavaLexer
from MiniJavaParser import MiniJavaParser
from MiniJavaVisitor import MiniJavaVisitor
from MiniJavaListener import MiniJavaListener


def main():
    input = FileStream("factorial.java")
    lexer = MiniJavaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MiniJavaParser(stream)
    tree = parser.goal()
    v = MiniJavaVisitor()
    v.visit(tree)

if __name__ == "__main__":
    main()