/* Generated By:JJTree: Do not edit this line. ASTPrintStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTPrintStatement extends SimpleNode {
  public ASTPrintStatement(int id) {
    super(id);
  }

  public ASTPrintStatement(HtScrape p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HtScrapeVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b07d8c28b61f328fe623fc19c2e74bd2 (do not edit this line) */
