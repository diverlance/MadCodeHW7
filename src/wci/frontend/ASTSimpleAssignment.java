/* Generated By:JJTree: Do not edit this line. ASTSimpleAssignment.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTSimpleAssignment extends SimpleNode {
  public ASTSimpleAssignment(int id) {
    super(id);
  }

  public ASTSimpleAssignment(HtScrape p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HtScrapeVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=57cb1bef2fffb5dc1681644b05459ee1 (do not edit this line) */
