/* Generated By:JJTree: Do not edit this line. ASTPrintFullTableStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTPrintFullTableStatement extends SimpleNode {
  public ASTPrintFullTableStatement(int id) {
    super(id);
  }

  public ASTPrintFullTableStatement(HtScrape p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HtScrapeVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2818a290020d3bd03b0b3f703b4bb434 (do not edit this line) */
