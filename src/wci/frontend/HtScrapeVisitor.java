/* Generated By:JavaCC: Do not edit this line. HtScrapeVisitor.java Version 5.0 */
package wci.frontend;

public interface HtScrapeVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTStatement node, Object data);
  public Object visit(ASTvariable node, Object data);
  public Object visit(ASTnewVariable node, Object data);
  public Object visit(ASTIntDeclaration node, Object data);
  public Object visit(ASTNumberDeclaration node, Object data);
  public Object visit(ASTSimpleAssignment node, Object data);
  public Object visit(ASTStringDeclaration node, Object data);
  public Object visit(ASTFileDeclaration node, Object data);
  public Object visit(ASTLoadStatement node, Object data);
  public Object visit(ASTTableDeclaration node, Object data);
  public Object visit(ASTGetTableStatement node, Object data);
  public Object visit(ASTTableDataDeclaration node, Object data);
  public Object visit(ASTGetTableDataStatement node, Object data);
  public Object visit(ASTColorDeclaration node, Object data);
  public Object visit(ASTGetColorStatement node, Object data);
  public Object visit(ASTMultipleParams node, Object data);
  public Object visit(ASTPrintStatement node, Object data);
  public Object visit(ASTCloseStatement node, Object data);
  public Object visit(ASTIfStatement node, Object data);
  public Object visit(ASTExpression node, Object data);
  public Object visit(ASTOperator node, Object data);
  public Object visit(ASTOperand node, Object data);
  public Object visit(ASTexpr_operator node, Object data);
  public Object visit(ASTintegerConstant node, Object data);
  public Object visit(ASTnumberConstant node, Object data);
  public Object visit(ASTstringConstant node, Object data);
}
/* JavaCC - OriginalChecksum=59ba444bc5671b587f20804705a0d57b (do not edit this line) */
