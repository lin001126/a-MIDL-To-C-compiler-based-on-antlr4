
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class MIDL {
    //    MIDLLexer midlL = null;
//    MIDLParser parser = null;
    public static void main(String[] args) throws IOException {
        FileInputStream is=new FileInputStream(("C:\\Users\\zjj\\Desktop\\bianyi3\\test.txt"));
        int length= is.available();
        byte bytes[]=new byte[length];
        is.read(bytes);
        is.close();
        String str= new String(bytes, StandardCharsets.UTF_8);

        CharStream input  = CharStreams.fromString(str);
        MIDLLexer midlL = new MIDLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(midlL);
        MIDLParser parser = new MIDLParser(tokens);
        ParseTree tree =  parser.specification();
//        System.out.println(tree.toStringTree(parser)); //打印规则数
        TestVisitor tv = new TestVisitor();
        tv.visit(tree);
//        if (parser.getNumberOfSyntaxErrors()>0)
//            throw new SyntaxException(String.format("有 %s 处语法错误，请根据报错信息进行修改后再次尝试 !",parser.getNumberOfSyntaxErrors()));
        /* 渲染所有的stg模板并生成 */
//        context = buildIDLTree(tree,parser);
//        for (STGroup stg:
//                stgs) {
//            targetCodes.add(_generateTargetCode(context,stg,semanticStg));
//        }
//        return targetCodes;
//    }
//    public static IDLTreeNode buildIDLTree(ParseTree t,Parser parser) throws NullPointerException{
//        /* 错误节点 */
//        if ( t instanceof ErrorNode) {
//            return null;
//        }
//        /* 终结符节点 */
//        else if ( t instanceof TerminalNode) {
//            String tokenType = tokensTypeCode.get(((TerminalNode) t).getSymbol().getType());
//            IDLTreeNode tNode = new IDLTreeNode(tokenType,"T",Trees.getNodeText(t,parser),null,null);
//            /* 加入到上下文环境中去 */
//            tNode.setHashCode(tNode.hashCode());
//            contextMap.put(tNode.hashCode(),tNode);
//            return tNode;
//        }
//        /* 非终结符节点 */
//        IDLTreeNode root = new IDLTreeNode(Trees.getNodeText(t,parser),"NONT",null,null,null);
//        root.setHashCode(root.hashCode());
//        /* 加入到上下文环境中去 */
//        contextMap.put(root.hashCode(),root);
//        ArrayList<IDLTreeNode> childs = new ArrayList<IDLTreeNode>();
//        /* 对分析树递归 */
//        RuleNode r = (RuleNode)t;
//        int n = r.getChildCount();
//        for (int i = 0; i<n; i++) {
//            ParseTree rc = r.getChild(i);
//            IDLTreeNode child = buildIDLTree(rc,parser);
//            childs.add(child);
//            /* 为孩子节点设置父亲节点 */
//            child.setPnode(root);
//        }
//        /* 为当前节点设置孩子节点列表 */
//        root.setNodes(childs);
//        return root;
    }
    static class TestVisitor extends MIDLBaseVisitor<Void> {
        @Override
        public Void visitSpecification(MIDLParser.SpecificationContext ctx) {


            return super.visitSpecification(ctx);
        }

    }





}