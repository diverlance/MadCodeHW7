/* Generated By:JJTree: Do not edit this line. ASTerrorHandler.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=wci.intermediate.icodeimpl.ICodeNodeImpl,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package wci.frontend;

public
class ASTerrorHandler extends SimpleNode {
  public ASTerrorHandler(int id) {
    super(id);
  }

  public ASTerrorHandler(HtScrape p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HtScrapeVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e875074f1025a2b2db5467ab4d82cfb7 (do not edit this line) */
