package wci.intermediate;
import wci.frontend.*;

public class HtScrapeVisitorAdapter implements HtScrapeVisitor{

	public Object visit(SimpleNode node, Object data)
    {
        return node.childrenAccept(this, data);
    }
    
    public Object visit(ASTIntDeclaration node, Object data)
    {
        return node.childrenAccept(this, data);
    }

	@Override
	public Object visit(ASTProgram node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTSimpleAssignment node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTStringDeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTFileDeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTLoadStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTTableDeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTGetTableStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTTableDataDeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTGetTableDataStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTColorDeclaration node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTGetColorStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTMultipleParams node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTPrintStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTCloseStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTIfStatement node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTExpression node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTOperator node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTOperand node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTexpr_operator node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTvariable node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTnewVariable node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTintegerConstant node, Object data) {
		return node.childrenAccept(this, data);
	}

	@Override
	public Object visit(ASTstringConstant node, Object data) {
		return node.childrenAccept(this, data);
	}
    
}
