// Generated from C:/Users/zjj/Desktop/bianyi3\MIDL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MIDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MIDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definitiontotype}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitiontotype(MIDLParser.DefinitiontotypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definitiontomodle}
	 * labeled alternative in {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitiontomodle(MIDLParser.DefinitiontomodleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(MIDLParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_decltostruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decltostruct(MIDLParser.Type_decltostructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code type_decl1}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_decl1(MIDLParser.Type_decl1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code base_type_spectofloat}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spectofloat(MIDLParser.Base_type_spectofloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code base_type_spectoint}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spectoint(MIDLParser.Base_type_spectointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code base_type_spectochar1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spectochar1(MIDLParser.Base_type_spectochar1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code base_type_spectostring1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spectostring1(MIDLParser.Base_type_spectostring1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code base_type_spectoboolean1}
	 * labeled alternative in {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_type_spectoboolean1(MIDLParser.Base_type_spectoboolean1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code floating_pt_typetof1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_typetof1(MIDLParser.Floating_pt_typetof1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code floating_pt_typetod1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_typetod1(MIDLParser.Floating_pt_typetod1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code floating_pt_typetolong1}
	 * labeled alternative in {@link MIDLParser#floating_pt_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloating_pt_typetolong1(MIDLParser.Floating_pt_typetolong1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#sign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_int(MIDLParser.Sign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unsign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsign_int(MIDLParser.Unsign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(MIDLParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literal1}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral1(MIDLParser.Literal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal2}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral2(MIDLParser.Literal2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal3}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral3(MIDLParser.Literal3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal4}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral4(MIDLParser.Literal4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code literal5}
	 * labeled alternative in {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral5(MIDLParser.Literal5Context ctx);
}