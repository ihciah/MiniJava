from antlr4 import FileStream, CommonTokenStream, tree
from MiniJavaLexer import MiniJavaLexer
from MiniJavaParser import MiniJavaParser
from MiniJavaVisitor import MiniJavaVisitor


def ScopeCheck(mytree, active_vars=list()):
    if "children" not in dir(mytree):
        return
    local_vars = list()
    for node in mytree.children:
        # print str(type(node))
        if isinstance(node, MiniJavaParser.VarDeclarationContext):
            name = node.children[1]
            local_vars.append(str(name))
        ExpressionCheck(node, active_vars + local_vars)
        ScopeCheck(node, active_vars + local_vars)


def ExpressionCheck(node, xvars):
    EXPCLS = [MiniJavaParser.AssignStatementContext,
              MiniJavaParser.MulExpressionContext,
              MiniJavaParser.SubExpressionContext,
              MiniJavaParser.AddExpressionContext,
              MiniJavaParser.LtExpressionContext,
              MiniJavaParser.AndExpressionContext]
    if isinstance(node, tree.Tree.TerminalNodeImpl):
        if any([isinstance(node.parentCtx, cls) for cls in EXPCLS]):
            if str(node) not in ['*', '+', '-', '<', '&&', ';', '='] + xvars:
                print "Error: %d:%d near %s not defined." % (node.symbol.line, node.symbol.column, node.symbol.text)
                return False
    return True


def visit():
    pass

def main():
    input = FileStream("factorial.java")
    lexer = MiniJavaLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MiniJavaParser(stream)
    tree = parser.goal()
    v = MiniJavaVisitor()
    v.visit(tree)
    ScopeCheck(tree)

if __name__ == "__main__":
    main()