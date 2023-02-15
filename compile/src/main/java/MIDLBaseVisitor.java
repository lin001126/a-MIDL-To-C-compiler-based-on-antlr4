// Generated from C:/Users/zjj/Desktop/bianyi\MIDL.g4 by ANTLR 4.10.1
// Generated from C:/Users/zjj/Desktop/bianyi\MIDL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link MIDLVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MIDLBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MIDLVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	int count=0;
	//用一个list struct_name来实现同一个struct空间下，不能有同名变量
	LinkedList<String> struct_name = new LinkedList<String>();
	LinkedList<String> name_check = new LinkedList<String>();
	Map<String, String> key_name = new HashMap<String,String>();
    String modulename;
    Node node;
    Node curHead;
    Node lastHead;
	@Override public T visitSpecification(MIDLParser.SpecificationContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Specification"+"\n";
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefinitiontotype(MIDLParser.DefinitiontotypeContext ctx) {
		String str="";
//		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Definition"+"\n";
		name_check.clear();
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
//		count--;
		return null; }
//		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDefinitiontomodle(MIDLParser.DefinitiontomodleContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Definition"+"\n";
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
//		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitModule(MIDLParser.ModuleContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Module"+":"+ctx.ID().toString()+"\n";
		modulename=ctx.ID().getText();
		node =new Node();
		node.setType("module");
		node.setName(ctx.ID().getText());
		lastHead=node;
		curHead=new Node();

//		node.setName(ctx.ID().toString());
//		System.out.println(node.getName());
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitType_decltostruct(MIDLParser.Type_decltostructContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitType_decl1(MIDLParser.Type_decl1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}

		str+="Struct_type"+":"+"struct ID"+" "+ctx.ID().getText()+"\n";
		if (struct_name.contains(ctx.ID().getText())){
			System.out.println("error\n" +
					"\t\t\tstruct name 重复\t");
			return null;

		}else{
			struct_name.add(ctx.ID().getText());
		}
		Node newnode =new Node();
		newnode.setType("struct");
		newnode.setName(ctx.ID().getText());
		newnode.setFather(node);
		node.setChild(newnode);
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
		node=newnode;
//		System.out.println(lastHead.getFather().getName());
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStruct_type(MIDLParser.Struct_typeContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Struct_type"+":"+"struct ID"+" "+ctx.ID().getText()+"\n";
		if (struct_name.contains(ctx.ID().toString())){
			System.out.println("error\n" +
					"\t\t\tstruct name 重复\t");
			return null;

		}else{
			struct_name.add(ctx.ID().toString());

		}
		Node newnode =new Node();
		newnode.setType("struct");
		newnode.setName(ctx.ID().getText());
		newnode.setFather(node);
		node.setChild(newnode);
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
		node=newnode;
//		curHead =newnode;
//
//		curHead.setChild(lastHead);
//		lastHead.setFather(curHead);
//		System.out.println(curHead.getType());
//		System.out.println(curHead.getName());
//		System.out.println(curHead.getFather().getType());
//		System.out.println(curHead.getFather().getName());
//		lastHead =newnode;



//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMember_list(MIDLParser.Member_listContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitType_spec(MIDLParser.Type_specContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitScoped_name(MIDLParser.Scoped_nameContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
//		System.out.println(ctx.ID().get(0).getText());

		str+="Scoped_name"+":"+ctx.ID(0).toString()+"\n";
		if (ctx.children.size()==1&&!struct_name.contains(ctx.ID(0).toString())){
			System.out.println("error 结构应该先定义才能引用类型");
			return null;
		}else if (ctx.children.size()==3&&!struct_name.contains(ctx.children.get(2).getText())){
			System.out.println("error 命名空间的引用不对");
			return null;
		}
		Node newnode =new Node();
		newnode.setType("scopename");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		node=newnode;
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBase_type_spectofloat(MIDLParser.Base_type_spectofloatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBase_type_spectoint(MIDLParser.Base_type_spectointContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBase_type_spectochar1(MIDLParser.Base_type_spectochar1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}

		str+="Base_type_spec"+" "+"char"+":"+ctx.getText()+"\n";
		Node newnode =new Node();
		newnode.setType("scopename");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		node=newnode;
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
//		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBase_type_spectostring1(MIDLParser.Base_type_spectostring1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Base_type_spec"+" "+"string"+":"+ctx.getText()+"\n";
		Node newnode =new Node();
		newnode.setType("type");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		node=newnode;
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBase_type_spectoboolean1(MIDLParser.Base_type_spectoboolean1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Base_type_spec"+" "+"boolean"+":"+ctx.getText()+"\n";
		Node newnode =new Node();
		newnode.setType("boolean");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);

//		System.out.println(newnode.getFather().getFather().getType());
//		System.out.println(newnode.getFather().getFather().getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
//
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloating_pt_typetof1(MIDLParser.Floating_pt_typetof1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Base_type_spec"+"float"+":"+ctx.getText()+"\n";
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloating_pt_typetod1(MIDLParser.Floating_pt_typetod1Context ctx)  {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Base_type_spec"+" "+"double"+":"+" "+ctx.getText()+"\n";
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}

		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFloating_pt_typetolong1(MIDLParser.Floating_pt_typetolong1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Base_type_spec"+" "+"long"+":"+" "+ctx.getText()+"\n";
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}


		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_type(MIDLParser.Integer_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSign_int(MIDLParser.Sign_intContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Sign_int"+":"+" "+ctx.getText()+"\n";
		Node newnode =new Node();
		newnode.setType("type");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
//		System.out.println(newnode.getFather().getFather().getType());
//		System.out.println(newnode.getFather().getFather().getName());
		node =newnode;
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnsign_int(MIDLParser.Unsign_intContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="UnSign_int"+":"+" "+ctx.getText()+"\n";
		Node newnode =new Node();
		newnode.setType("type");
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
//		System.out.println(newnode.getFather().getFather().getType());
//		System.out.println(newnode.getFather().getFather().getName());
		node =newnode;
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclarators(MIDLParser.DeclaratorsContext ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="Declarators"+"\n";
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDeclarator(MIDLParser.DeclaratorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSimple_declarator(MIDLParser.Simple_declaratorContext ctx)  {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+=ctx.ID().getText()+" "+"="+"\n";
		if (name_check.contains(ctx.ID().getText())){
			System.out.println("error\n" +
					"\t\t\tstruct里的name 重复\t");
			return null;
//			str+="error";

		}else{
			name_check.add(ctx.ID().getText());

		}
		Node newnode =new Node();
		newnode.setType("token");
		newnode.setName(ctx.ID().getText());
		newnode.setFather(node);
		node.setChild(newnode);

		node =newnode;
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitArray_declarator(MIDLParser.Array_declaratorContext ctx){
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+=ctx.ID().getText()+" "+"="+"\n";
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		if (struct_name.contains(ctx.ID().getText())){
			System.out.println("error\n" +
					"\t\t\tstruct name 重复\t");
			return null;

		}else{
			struct_name.add(ctx.ID().getText());
		}
		System.out.println(str);
		visitChildren(ctx);
		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExp_list(MIDLParser.Exp_listContext ctx) {
		String str="";
//		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+="exp_list"+"\n";
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
//		count--;
		return null; }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOr_expr(MIDLParser.Or_exprContext ctx) {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"Or"+"\n";
//		System.out.println(str);
////		FileWriter fw=null;
////		try {
////			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
////			fw.write(str);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}finally {
////			if (fw!=null){
////				try {
////					fw.close();
////				}catch (IOException e) {
////				}
////			}
////		}
//		visitChildren(ctx);
//		count--;
//		return null; }
			return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitXor_expr(MIDLParser.Xor_exprContext ctx) { //
//		 String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"Xor"+"\n";
//		System.out.println(str);
////		FileWriter fw=null;
////		try {
////			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
////			fw.write(str);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}finally {
////			if (fw!=null){
////				try {
////					fw.close();
////				}catch (IOException e) {
////				}
////			}
////		}
//		visitChildren(ctx);
//		count--;
//		return null; }
	 return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAnd_expr(MIDLParser.And_exprContext ctx)  {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"and"+"\n";
//		System.out.println(str);
////		FileWriter fw=null;
////		try {
////			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
////			fw.write(str);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}finally {
////			if (fw!=null){
////				try {
////					fw.close();
////				}catch (IOException e) {
////				}
////			}
////		}
//		visitChildren(ctx);
//		count--;
//		return null; }
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitShift_expr(MIDLParser.Shift_exprContext ctx) {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"Shift"+"\n";
//		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
//		visitChildren(ctx);
//		count--;
//		return null; }
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAdd_expr(MIDLParser.Add_exprContext ctx)  {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"Add"+"\n";
//		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
//		visitChildren(ctx);
//		count--;
//		return null; }
		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMult_expr(MIDLParser.Mult_exprContext ctx) {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+="op"+":"+" "+"Mult"+"\n";
//		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
//		visitChildren(ctx);
//		count--;
//		return null; }
	    return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnary_expr(MIDLParser.Unary_exprContext ctx) {
//		String str="";
//		count++;
//		for (int i=count;i>0;i--){
//			str+="\t";
//		}
//		str+= "input"+""+":"+ctx.getText()+"\n";
//		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
//		visitChildren(ctx);
//		count--;
//
//
//
//		return null;
//	}
	  return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral1(MIDLParser.Literal1Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+= "INTEGEAR"+""+":"+ctx.getParent().getText()+"\n";
		Node newnode =new Node();
		newnode.setType(node.getName());
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		try{
			Integer i1 = Integer.valueOf(newnode.name);
			System.out.println(i1);
		}catch (Exception e){
			System.out.println("not integer");
		}



//		System.out.println(newnode.getFather().getFather().getFather().getType());
//		System.out.println(newnode.getFather().getFather().getFather().getName());
//		System.out.println(newnode.getFather().getFather().getType());
//		System.out.println(newnode.getFather().getFather().getName());
//		System.out.println(newnode.getFather().getType());
//		System.out.println(newnode.getFather().getName());
//
//		System.out.println(newnode.getType());
//		System.out.println(newnode.getName());


		node =newnode.getFather().getFather().getFather();


		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;



		return null;
	}
//	 return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral2(MIDLParser.Literal2Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+= "FLOATING_PT"+":"+ctx.getParent().getText()+"\n";
		Node newnode =new Node();
		newnode.setType(node.getName());
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		System.out.println(newnode.getFather().getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getFather().getName());
		System.out.println(newnode.getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getName());
		System.out.println(newnode.getFather().getType());
		System.out.println(newnode.getFather().getName());

		System.out.println(newnode.getType());
		System.out.println(newnode.getName());


//		node =newnode;
		node =newnode.getFather().getFather().getFather();
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
//		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral3(MIDLParser.Literal3Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+= "CHAR"+":"+ctx.getParent().getText()+"\n";
		Node newnode =new Node();
		newnode.setType(node.getName());
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		System.out.println(newnode.getFather().getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getFather().getName());
		System.out.println(newnode.getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getName());
		System.out.println(newnode.getFather().getType());
		System.out.println(newnode.getFather().getName());

		System.out.println(newnode.getType());
		System.out.println(newnode.getName());
		try{
			Integer i1 = Integer.valueOf(newnode.name);
			System.out.println(i1);
		}catch (Exception e){
			System.out.println("not integer");
		}

//		node =newnode;
		node =newnode.getFather().getFather().getFather();
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
//	return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral4(MIDLParser.Literal4Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+= "STRING"+":"+ctx.getParent().getText()+"\n";
		Node newnode =new Node();
		newnode.setType(node.getName());
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		System.out.println(newnode.getFather().getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getFather().getName());
		System.out.println(newnode.getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getName());
		System.out.println(newnode.getFather().getType());
		System.out.println(newnode.getFather().getName());

		System.out.println(newnode.getType());
		System.out.println(newnode.getName());


//		node =newnode;
		node =newnode.getFather().getFather().getFather();
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
//		return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitLiteral5(MIDLParser.Literal5Context ctx) {
		String str="";
		count++;
		for (int i=count;i>0;i--){
			str+="\t";
		}
		str+= "BOOLEAN"+":"+ctx.getParent().getText()+"\n";
		Node newnode =new Node();
		newnode.setType(node.getName());
		newnode.setName(ctx.getText());
		newnode.setFather(node);
		node.setChild(newnode);
		System.out.println(newnode.getFather().getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getFather().getName());
		System.out.println(newnode.getFather().getFather().getType());
		System.out.println(newnode.getFather().getFather().getName());
		System.out.println(newnode.getFather().getType());
		System.out.println(newnode.getFather().getName());

		System.out.println(newnode.getType());
		System.out.println(newnode.getName());


		node =newnode.getFather().getFather().getFather();
		System.out.println(str);
//		FileWriter fw=null;
//		try {
//			fw=new FileWriter("C:\\Users\\zjj\\Desktop\\bianyi2\\src\\main\\java\\SyntaxOut.txt",true);
//			fw.write(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			if (fw!=null){
//				try {
//					fw.close();
//				}catch (IOException e) {
//				}
//			}
//		}
		visitChildren(ctx);
		count--;
		return null; }
//		return visitChildren(ctx); }

}