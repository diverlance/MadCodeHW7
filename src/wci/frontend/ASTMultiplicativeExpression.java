/* Generated By:JJTree: Do not edit this line. ASTMultiplicativeExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTMultiplicativeExpression extends SimpleNode {
  public ASTMultiplicativeExpression(int id) {
    super(id);
  }

  public ASTMultiplicativeExpression(HtScrape p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HtScrapeVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=79bcb36d3ea9cf233f2ee7839b1ffa2a (do not edit this line) */
