/* Generated By:JJTree&JavaCC: Do not edit this line. HtScrape.java */
package wci.frontend;

import java.util.ArrayList;
import java.io.*;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.backend.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;
import static wci.intermediate.symtabimpl.RoutineCodeImpl.*;
import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;

public class HtScrape/*@bgen(jjtree)*/implements HtScrapeTreeConstants, HtScrapeConstants {/*@bgen(jjtree)*/
  protected static JJTHtScrapeState jjtree = new JJTHtScrapeState();public static void main(String args [])
  {
    Reader sr = new StringReader("input.txt");
    HtScrape ht = new HtScrape(sr);
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("input.txt"));
        StringBuilder sb = new StringBuilder();
                String line = "";
                while((line = br.readLine()) != null)
                        sb.append(line+"\u005cr\u005cn");

        java.io.StringReader sr = new java.io.StringReader(sb.toString());
        HtScrape parser = new HtScrape(sr);

       SimpleNode n = HtScrape.Program();
        n.dump(">");
      System.out.println("Thank you.");
        }
        catch (ParseException ex) {
            ex.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
  }

        //production rules
  static final public SimpleNode Program() throws ParseException {
                               /*@bgen(jjtree) Program */
  ASTProgram jjtn000 = new ASTProgram(JJTPROGRAM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        Statement();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case INT:
        case STRING:
        case TABLE:
        case TABLE_DATA:
        case COLOR:
        case PRINT:
        case CLOSE:
        case FILE:
        case LOAD:
        case GET_TABLE:
        case GET_DATA:
        case GET_COLOR:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
      jj_consume_token(0);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("\u005cn** Successfully parsed an entire Program!\u005cn");
          {if (true) return jjtn000;}
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void Statement() throws ParseException {
                            /*@bgen(jjtree) Statement */
  ASTStatement jjtn000 = new ASTStatement(JJTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        IntDeclaration();
        break;
      case STRING:
        StringDeclaration();
        break;
      case IDENTIFIER:
        SimpleAssignment();
        break;
      case FILE:
        FileDeclaration();
        break;
      case LOAD:
        LoadStatement();
        break;
      case TABLE:
        TableDeclaration();
        break;
      case GET_TABLE:
        GetTableStatement();
        break;
      case TABLE_DATA:
        TableDataDeclaration();
        break;
      case GET_DATA:
        GetTableDataStatement();
        break;
      case COLOR:
        ColorDeclaration();
        break;
      case GET_COLOR:
        GetColorStatement();
        break;
      case PRINT:
        PrintStatement();
        break;
      case CLOSE:
        CloseStatement();
        break;
      case IF:
        IfStatement();
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void IntDeclaration() throws ParseException {
                                /*@bgen(jjtree) IntDeclaration */
  ASTIntDeclaration jjtn000 = new ASTIntDeclaration(JJTINTDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(INT);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      jj_consume_token(DIGIT);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed an Int Declaration!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void SimpleAssignment() throws ParseException {
                                   /*@bgen(jjtree) SimpleAssignment */
  ASTSimpleAssignment jjtn000 = new ASTSimpleAssignment(JJTSIMPLEASSIGNMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DIGIT:
        jj_consume_token(DIGIT);
        break;
      case STRING_LITERAL:
        jj_consume_token(STRING_LITERAL);
        break;
      default:
        jj_la1[2] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Simple Assignment!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void StringDeclaration() throws ParseException {
                                    /*@bgen(jjtree) StringDeclaration */
  ASTStringDeclaration jjtn000 = new ASTStringDeclaration(JJTSTRINGDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(STRING);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      jj_consume_token(STRING_LITERAL);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a String Declaration!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void FileDeclaration() throws ParseException {
                                  /*@bgen(jjtree) FileDeclaration */
  ASTFileDeclaration jjtn000 = new ASTFileDeclaration(JJTFILEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(FILE);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      LoadStatement();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a File Declaration!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void LoadStatement() throws ParseException {
                                /*@bgen(jjtree) LoadStatement */
  ASTLoadStatement jjtn000 = new ASTLoadStatement(JJTLOADSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(LOAD);
      jj_consume_token(LEFT_PAREN);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Load Statement!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void TableDeclaration() throws ParseException {
                                  /*@bgen(jjtree) TableDeclaration */
  ASTTableDeclaration jjtn000 = new ASTTableDeclaration(JJTTABLEDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(TABLE);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      GetTableStatement();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Table Declaration!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void GetTableStatement() throws ParseException {
                                   /*@bgen(jjtree) GetTableStatement */
  ASTGetTableStatement jjtn000 = new ASTGetTableStatement(JJTGETTABLESTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(GET_TABLE);
      jj_consume_token(LEFT_PAREN);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a GetTable Statement!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void TableDataDeclaration() throws ParseException {
                                      /*@bgen(jjtree) TableDataDeclaration */
  ASTTableDataDeclaration jjtn000 = new ASTTableDataDeclaration(JJTTABLEDATADECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(TABLE_DATA);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      GetTableDataStatement();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a TableData Declaration!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void GetTableDataStatement() throws ParseException {
                                       /*@bgen(jjtree) GetTableDataStatement */
  ASTGetTableDataStatement jjtn000 = new ASTGetTableDataStatement(JJTGETTABLEDATASTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(GET_DATA);
      jj_consume_token(LEFT_PAREN);
      MultipleParams();
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a GetTableData Statement!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void ColorDeclaration() throws ParseException {
                                  /*@bgen(jjtree) ColorDeclaration */
  ASTColorDeclaration jjtn000 = new ASTColorDeclaration(JJTCOLORDECLARATION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(COLOR);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(EQUALS);
      GetColorStatement();
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Color Declaration!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void GetColorStatement() throws ParseException {
                                   /*@bgen(jjtree) GetColorStatement */
  ASTGetColorStatement jjtn000 = new ASTGetColorStatement(JJTGETCOLORSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(GET_COLOR);
      jj_consume_token(LEFT_PAREN);
      MultipleParams();
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a GetColor Statement!\u005cn");
    } catch (Throwable jjte000) {
            if (jjtc000) {
              jjtree.clearNodeScope(jjtn000);
              jjtc000 = false;
            } else {
              jjtree.popNode();
            }
            if (jjte000 instanceof RuntimeException) {
              {if (true) throw (RuntimeException)jjte000;}
            }
            if (jjte000 instanceof ParseException) {
              {if (true) throw (ParseException)jjte000;}
            }
            {if (true) throw (Error)jjte000;}
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void MultipleParams() throws ParseException {
                                 /*@bgen(jjtree) MultipleParams */
  ASTMultipleParams jjtn000 = new ASTMultipleParams(JJTMULTIPLEPARAMS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        jj_consume_token(IDENTIFIER);
        break;
      case DIGIT:
        label_2:
        while (true) {
          jj_consume_token(DIGIT);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case DIGIT:
            ;
            break;
          default:
            jj_la1[3] = jj_gen;
            break label_2;
          }
        }
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_3;
        }
        jj_consume_token(COMMA);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IDENTIFIER:
          jj_consume_token(IDENTIFIER);
          break;
        case DIGIT:
          label_4:
          while (true) {
            jj_consume_token(DIGIT);
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case DIGIT:
              ;
              break;
            default:
              jj_la1[6] = jj_gen;
              break label_4;
            }
          }
          break;
        default:
          jj_la1[7] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed multiple parameters!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void PrintStatement() throws ParseException {
                                 /*@bgen(jjtree) PrintStatement */
  ASTPrintStatement jjtn000 = new ASTPrintStatement(JJTPRINTSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(PRINT);
      jj_consume_token(LEFT_PAREN);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Print Statement!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void CloseStatement() throws ParseException {
                                 /*@bgen(jjtree) CloseStatement */
  ASTCloseStatement jjtn000 = new ASTCloseStatement(JJTCLOSESTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(CLOSE);
      jj_consume_token(LEFT_PAREN);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(SEMICOLON);
            jjtree.closeNodeScope(jjtn000, true);
            jjtc000 = false;
            System.out.println("Successfully parsed a Close Statement!\u005cn");
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static final public void IfStatement() throws ParseException {
                          /*@bgen(jjtree) IfStatement */
  ASTIfStatement jjtn000 = new ASTIfStatement(JJTIFSTATEMENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IF);
      jj_consume_token(LEFT_PAREN);
      Expression();
      jj_consume_token(RIGHT_PAREN);
      jj_consume_token(LEFT_CURLY);
      Statement();
      jj_consume_token(RIGHT_CURLY);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          System.out.println("Successfully parsed an if statement!\u005cn");
    } catch (Throwable jjte000) {
                  if (jjtc000) {
                    jjtree.clearNodeScope(jjtn000);
                    jjtc000 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte000 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte000;}
                  }
                  if (jjte000 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte000;}
                  }
                  {if (true) throw (Error)jjte000;}
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
  }

  static final public void Expression() throws ParseException {
                             /*@bgen(jjtree) Expression */
  ASTExpression jjtn000 = new ASTExpression(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
                 System.out.println("\u005cnEXPRESSION STARTS");
      Operator();
                  jjtree.closeNodeScope(jjtn000, true);
                  jjtc000 = false;
                 System.out.println("EXPRESSION ENDS\u005cn");
    } catch (Throwable jjte000) {
                  if (jjtc000) {
                    jjtree.clearNodeScope(jjtn000);
                    jjtc000 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte000 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte000;}
                  }
                  if (jjte000 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte000;}
                  }
                  {if (true) throw (Error)jjte000;}
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
  }

  static final public void Operator() throws ParseException {
                           /*@bgen(jjtree) Operator */
  ASTOperator jjtn000 = new ASTOperator(JJTOPERATOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      jj_consume_token(IDENTIFIER);
      expr_operator();
      Operand();
    } catch (Throwable jjte000) {
                  if (jjtc000) {
                    jjtree.clearNodeScope(jjtn000);
                    jjtc000 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte000 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte000;}
                  }
                  if (jjte000 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte000;}
                  }
                  {if (true) throw (Error)jjte000;}
    } finally {
                  if (jjtc000) {
                    jjtree.closeNodeScope(jjtn000, true);
                  }
    }
  }

  static final public void Operand() throws ParseException {
                          /*@bgen(jjtree) Operand */
                          ASTOperand jjtn000 = new ASTOperand(JJTOPERAND);
                          boolean jjtc000 = true;
                          jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(DIGIT);
                             jjtree.closeNodeScope(jjtn000, true);
                             jjtc000 = false;
                            System.out.println("Operand: " + t.image);
    } finally {
                   if (jjtc000) {
                     jjtree.closeNodeScope(jjtn000, true);
                   }
    }
  }

  static final public void expr_operator() throws ParseException {
                               /*@bgen(jjtree) expr_operator */
                               ASTexpr_operator jjtn000 = new ASTexpr_operator(JJTEXPR_OPERATOR);
                               boolean jjtc000 = true;
                               jjtree.openNodeScope(jjtn000);Token t;
    try {
           System.out.println("Operator:");
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      case EQUALS:
        jj_consume_token(EQUALS);
        break;
      case GREATER_THAN:
        jj_consume_token(GREATER_THAN);
        break;
      case LESS_THAN:
        jj_consume_token(LESS_THAN);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
            if (jjtc000) {
              jjtree.closeNodeScope(jjtn000, true);
            }
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public HtScrapeTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[9];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x81404000,0x81404000,0x2800,0x2000,0x2000,0x0,0x2000,0x2000,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x7fb,0x7fb,0x0,0x0,0x400,0x200000,0x0,0x400,0xf8000,};
   }

  /** Constructor with InputStream. */
  public HtScrape(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public HtScrape(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new HtScrapeTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public HtScrape(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new HtScrapeTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public HtScrape(HtScrapeTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(HtScrapeTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 9; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[58];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 9; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 58; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
