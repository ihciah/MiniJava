// Generated from MiniJava.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaParser}.
 */
public interface MiniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainClassDeclaration(MiniJavaParser.MainClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void enterMainClassBody(MiniJavaParser.MainClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainClassBody}.
	 * @param ctx the parse tree
	 */
	void exitMainClassBody(MiniJavaParser.MainClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(MiniJavaParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(MiniJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mainMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(MiniJavaParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MiniJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MiniJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(MiniJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(MiniJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(MiniJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MiniJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MiniJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MiniJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MiniJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MiniJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#mytype}.
	 * @param ctx the parse tree
	 */
	void enterMytype(MiniJavaParser.MytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#mytype}.
	 * @param ctx the parse tree
	 */
	void exitMytype(MiniJavaParser.MytypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(MiniJavaParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(MiniJavaParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(MiniJavaParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(MiniJavaParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(MiniJavaParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStatement(MiniJavaParser.ArrayAssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MiniJavaParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecurStatement(MiniJavaParser.RecurStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recurStatement}
	 * labeled alternative in {@link MiniJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecurStatement(MiniJavaParser.RecurStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(MiniJavaParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(MiniJavaParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectInstantiationExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationExpression(MiniJavaParser.ObjectInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInstantiationExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstantiationExpression(MiniJavaParser.ArrayInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(MiniJavaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(MiniJavaParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MiniJavaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLitExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLitExpression(MiniJavaParser.BooleanLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(MiniJavaParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(MiniJavaParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLitExpression(MiniJavaParser.IntLitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(MiniJavaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(MiniJavaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(MiniJavaParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(MiniJavaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(MiniJavaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(MiniJavaParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(MiniJavaParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(MiniJavaParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpression(MiniJavaParser.NegExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpression(MiniJavaParser.NegExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(MiniJavaParser.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(MiniJavaParser.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpression(MiniJavaParser.MulExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpression}
	 * labeled alternative in {@link MiniJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpression(MiniJavaParser.MulExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterMethodArgumentList(MiniJavaParser.MethodArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#methodArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitMethodArgumentList(MiniJavaParser.MethodArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intArrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntArrayType(MiniJavaParser.IntArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(MiniJavaParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MiniJavaParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaParser#intType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MiniJavaParser.IntTypeContext ctx);
}