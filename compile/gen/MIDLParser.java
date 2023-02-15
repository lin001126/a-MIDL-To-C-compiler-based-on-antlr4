// Generated from C:/Users/zjj/Desktop/bianyi3\MIDL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MIDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LETTER=1, DIGIT=2, UNDERLINE=3, INTEGER_TYPE_SUFFIX=4, INTEGER=5, EXPONENT=6, 
		FLOATING_PT=7, ESCAPE_SEQUENCE=8, CHAR=9, STRING=10, BOOLEAN=11, WS=12, 
		SEMICOLON=13, COLON=14, COMMA=15, LEFT_BRACE=16, RIGHT_BRACE=17, LEFT_BRACKET=18, 
		RIGHT_BRACKET=19, LEFT_SQUARE_BRACKET=20, RIGHT_SQUARE_BRACKET=21, TILDE=22, 
		SLASH=23, LEFT_ANG_BRACKET=24, RIGHT_ANG_BRACKET=25, STAR=26, PLUS=27, 
		MINUS=28, CARET=29, AMPERSAND=30, PIPE=31, EQUAL=32, PERCENT=33, DOUBLE_COLON=34, 
		RIGHT_SHIFT=35, LEFT_SHIFT=36, AT=37, KW_SETRAISES=38, KW_OUT=39, KW_EMITS=40, 
		KW_STRING=41, KW_SWITCH=42, KW_PUBLISHES=43, KW_TYPEDEF=44, KW_USES=45, 
		KW_PRIMARYKEY=46, KW_CUSTOM=47, KW_OCTET=48, KW_SEQUENCE=49, KW_IMPORT=50, 
		KW_STRUCT=51, KW_NATIVE=52, KW_READONLY=53, KW_FINDER=54, KW_RAISES=55, 
		KW_VOID=56, KW_PRIVATE=57, KW_EVENTTYPE=58, KW_WCHAR=59, KW_IN=60, KW_DEFAULT=61, 
		KW_PUBLIC=62, KW_SHORT=63, KW_LONG=64, KW_ENUM=65, KW_WSTRING=66, KW_CONTEXT=67, 
		KW_HOME=68, KW_FACTORY=69, KW_EXCEPTION=70, KW_GETRAISES=71, KW_CONST=72, 
		KW_VALUEBASE=73, KW_VALUETYPE=74, KW_SUPPORTS=75, KW_MODULE=76, KW_OBJECT=77, 
		KW_TRUNCATABLE=78, KW_UNSIGNED=79, KW_FIXED=80, KW_UNION=81, KW_ONEWAY=82, 
		KW_ANY=83, KW_CHAR=84, KW_CASE=85, KW_FLOAT=86, KW_LONG_DOUBLE=87, KW_BOOLEAN=88, 
		KW_MULTIPLE=89, KW_ABSTRACT=90, KW_INOUT=91, KW_PROVIDES=92, KW_CONSUMES=93, 
		KW_DOUBLE=94, KW_TYPEPREFIX=95, KW_TYPEID=96, KW_ATTRIBUTE=97, KW_LOCAL=98, 
		KW_MANAGES=99, KW_INTERFACE=100, KW_COMPONENT=101, KW_SET=102, KW_MAP=103, 
		KW_BITFIELD=104, KW_BITSET=105, KW_BITMASK=106, KW_INT8=107, KW_UINT8=108, 
		KW_INT16=109, KW_UINT16=110, KW_INT32=111, KW_UINT32=112, KW_INT64=113, 
		KW_UINT64=114, KW_AT_ANNOTATION=115, ID=116;
	public static final int
		RULE_specification = 0, RULE_definition = 1, RULE_module = 2, RULE_type_decl = 3, 
		RULE_struct_type = 4, RULE_member_list = 5, RULE_type_spec = 6, RULE_scoped_name = 7, 
		RULE_base_type_spec = 8, RULE_floating_pt_type = 9, RULE_integer_type = 10, 
		RULE_signed_int = 11, RULE_unsigned_int = 12, RULE_declarators = 13, RULE_declarator = 14, 
		RULE_simple_declarator = 15, RULE_array_declarator = 16, RULE_exp_list = 17, 
		RULE_or_expr = 18, RULE_xor_expr = 19, RULE_and_expr = 20, RULE_shift_expr = 21, 
		RULE_add_expr = 22, RULE_mult_expr = 23, RULE_unary_expr = 24, RULE_literal = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"specification", "definition", "module", "type_decl", "struct_type", 
			"member_list", "type_spec", "scoped_name", "base_type_spec", "floating_pt_type", 
			"integer_type", "signed_int", "unsigned_int", "declarators", "declarator", 
			"simple_declarator", "array_declarator", "exp_list", "or_expr", "xor_expr", 
			"and_expr", "shift_expr", "add_expr", "mult_expr", "unary_expr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'_'", null, null, null, null, null, null, null, null, 
			null, "';'", "':'", "','", "'{'", "'}'", "'('", "')'", "'['", "']'", 
			"'~'", "'/'", "'<'", "'>'", "'*'", "'+'", "'-'", "'^'", "'&'", "'|'", 
			"'='", "'%'", "'::'", "'>>'", "'<<'", "'@'", "'setraises'", "'out'", 
			"'emits'", "'string'", "'switch'", "'publishes'", "'typedef'", "'uses'", 
			"'primarykey'", "'custom'", "'octet'", "'sequence'", "'import'", "'struct'", 
			"'native'", "'readonly'", "'finder'", "'raises'", "'void'", "'private'", 
			"'eventtype'", "'wchar'", "'in'", "'default'", "'public'", "'short'", 
			"'long'", "'enum'", "'wstring'", "'context'", "'home'", "'factory'", 
			"'exception'", "'getraises'", "'const'", "'ValueBase'", "'valuetype'", 
			"'supports'", "'module'", "'Object'", "'truncatable'", "'unsigned'", 
			"'fixed'", "'union'", "'oneway'", "'any'", "'char'", "'case'", "'float'", 
			"'long double'", "'boolean'", "'multiple'", "'abstract'", "'inout'", 
			"'provides'", "'consumes'", "'double'", "'typeprefix'", "'typeid'", "'attribute'", 
			"'local'", "'manages'", "'interface'", "'component'", "'set'", "'map'", 
			"'bitfield'", "'bitset'", "'bitmask'", "'int8'", "'uint8'", "'int16'", 
			"'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'@annotation'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LETTER", "DIGIT", "UNDERLINE", "INTEGER_TYPE_SUFFIX", "INTEGER", 
			"EXPONENT", "FLOATING_PT", "ESCAPE_SEQUENCE", "CHAR", "STRING", "BOOLEAN", 
			"WS", "SEMICOLON", "COLON", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "TILDE", 
			"SLASH", "LEFT_ANG_BRACKET", "RIGHT_ANG_BRACKET", "STAR", "PLUS", "MINUS", 
			"CARET", "AMPERSAND", "PIPE", "EQUAL", "PERCENT", "DOUBLE_COLON", "RIGHT_SHIFT", 
			"LEFT_SHIFT", "AT", "KW_SETRAISES", "KW_OUT", "KW_EMITS", "KW_STRING", 
			"KW_SWITCH", "KW_PUBLISHES", "KW_TYPEDEF", "KW_USES", "KW_PRIMARYKEY", 
			"KW_CUSTOM", "KW_OCTET", "KW_SEQUENCE", "KW_IMPORT", "KW_STRUCT", "KW_NATIVE", 
			"KW_READONLY", "KW_FINDER", "KW_RAISES", "KW_VOID", "KW_PRIVATE", "KW_EVENTTYPE", 
			"KW_WCHAR", "KW_IN", "KW_DEFAULT", "KW_PUBLIC", "KW_SHORT", "KW_LONG", 
			"KW_ENUM", "KW_WSTRING", "KW_CONTEXT", "KW_HOME", "KW_FACTORY", "KW_EXCEPTION", 
			"KW_GETRAISES", "KW_CONST", "KW_VALUEBASE", "KW_VALUETYPE", "KW_SUPPORTS", 
			"KW_MODULE", "KW_OBJECT", "KW_TRUNCATABLE", "KW_UNSIGNED", "KW_FIXED", 
			"KW_UNION", "KW_ONEWAY", "KW_ANY", "KW_CHAR", "KW_CASE", "KW_FLOAT", 
			"KW_LONG_DOUBLE", "KW_BOOLEAN", "KW_MULTIPLE", "KW_ABSTRACT", "KW_INOUT", 
			"KW_PROVIDES", "KW_CONSUMES", "KW_DOUBLE", "KW_TYPEPREFIX", "KW_TYPEID", 
			"KW_ATTRIBUTE", "KW_LOCAL", "KW_MANAGES", "KW_INTERFACE", "KW_COMPONENT", 
			"KW_SET", "KW_MAP", "KW_BITFIELD", "KW_BITSET", "KW_BITMASK", "KW_INT8", 
			"KW_UINT8", "KW_INT16", "KW_UINT16", "KW_INT32", "KW_UINT32", "KW_INT64", 
			"KW_UINT64", "KW_AT_ANNOTATION", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MIDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MIDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SpecificationContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				definition();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_STRUCT || _la==KW_MODULE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	 
		public DefinitionContext() { }
		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinitiontomodleContext extends DefinitionContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MIDLParser.SEMICOLON, 0); }
		public DefinitiontomodleContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDefinitiontomodle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDefinitiontomodle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDefinitiontomodle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinitiontotypeContext extends DefinitionContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MIDLParser.SEMICOLON, 0); }
		public DefinitiontotypeContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDefinitiontotype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDefinitiontotype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDefinitiontotype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_STRUCT:
				_localctx = new DefinitiontotypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				type_decl();
				setState(58);
				match(SEMICOLON);
				}
				break;
			case KW_MODULE:
				_localctx = new DefinitiontomodleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				module();
				setState(61);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode KW_MODULE() { return getToken(MIDLParser.KW_MODULE, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MIDLParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MIDLParser.RIGHT_BRACE, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(KW_MODULE);
			setState(66);
			match(ID);
			setState(67);
			match(LEFT_BRACE);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				definition();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KW_STRUCT || _la==KW_MODULE );
			setState(73);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declContext extends ParserRuleContext {
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
	 
		public Type_declContext() { }
		public void copyFrom(Type_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_decltostructContext extends Type_declContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Type_decltostructContext(Type_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_decltostruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_decltostruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_decltostruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Type_decl1Context extends Type_declContext {
		public TerminalNode KW_STRUCT() { return getToken(MIDLParser.KW_STRUCT, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public Type_decl1Context(Type_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_decl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_decl1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_decl1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_decl);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Type_decltostructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				struct_type();
				}
				break;
			case 2:
				_localctx = new Type_decl1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(KW_STRUCT);
				setState(77);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_typeContext extends ParserRuleContext {
		public TerminalNode KW_STRUCT() { return getToken(MIDLParser.KW_STRUCT, 0); }
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MIDLParser.LEFT_BRACE, 0); }
		public Member_listContext member_list() {
			return getRuleContext(Member_listContext.class,0);
		}
		public TerminalNode RIGHT_BRACE() { return getToken(MIDLParser.RIGHT_BRACE, 0); }
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterStruct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitStruct_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitStruct_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(KW_STRUCT);
			setState(81);
			match(ID);
			setState(82);
			match(LEFT_BRACE);
			setState(83);
			member_list();
			setState(84);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_listContext extends ParserRuleContext {
		public List<Type_specContext> type_spec() {
			return getRuleContexts(Type_specContext.class);
		}
		public Type_specContext type_spec(int i) {
			return getRuleContext(Type_specContext.class,i);
		}
		public List<DeclaratorsContext> declarators() {
			return getRuleContexts(DeclaratorsContext.class);
		}
		public DeclaratorsContext declarators(int i) {
			return getRuleContext(DeclaratorsContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MIDLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MIDLParser.SEMICOLON, i);
		}
		public Member_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMember_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMember_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMember_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_listContext member_list() throws RecognitionException {
		Member_listContext _localctx = new Member_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_COLON) | (1L << KW_STRING) | (1L << KW_STRUCT) | (1L << KW_SHORT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (KW_LONG - 64)) | (1L << (KW_UNSIGNED - 64)) | (1L << (KW_CHAR - 64)) | (1L << (KW_FLOAT - 64)) | (1L << (KW_LONG_DOUBLE - 64)) | (1L << (KW_BOOLEAN - 64)) | (1L << (KW_DOUBLE - 64)) | (1L << (KW_INT8 - 64)) | (1L << (KW_UINT8 - 64)) | (1L << (KW_INT16 - 64)) | (1L << (KW_UINT16 - 64)) | (1L << (KW_INT32 - 64)) | (1L << (KW_UINT32 - 64)) | (1L << (KW_INT64 - 64)) | (1L << (KW_UINT64 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(86);
				type_spec();
				setState(87);
				declarators();
				setState(88);
				match(SEMICOLON);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specContext extends ParserRuleContext {
		public Scoped_nameContext scoped_name() {
			return getRuleContext(Scoped_nameContext.class,0);
		}
		public Base_type_specContext base_type_spec() {
			return getRuleContext(Base_type_specContext.class,0);
		}
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitType_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitType_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type_spec);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_COLON:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				scoped_name();
				}
				break;
			case KW_STRING:
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_CHAR:
			case KW_FLOAT:
			case KW_LONG_DOUBLE:
			case KW_BOOLEAN:
			case KW_DOUBLE:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				base_type_spec();
				}
				break;
			case KW_STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				struct_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scoped_nameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MIDLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MIDLParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(MIDLParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(MIDLParser.DOUBLE_COLON, i);
		}
		public Scoped_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterScoped_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitScoped_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitScoped_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scoped_nameContext scoped_name() throws RecognitionException {
		Scoped_nameContext _localctx = new Scoped_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scoped_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE_COLON) {
				{
				setState(100);
				match(DOUBLE_COLON);
				}
			}

			setState(103);
			match(ID);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_COLON) {
				{
				{
				setState(104);
				match(DOUBLE_COLON);
				setState(105);
				match(ID);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_type_specContext extends ParserRuleContext {
		public Base_type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type_spec; }
	 
		public Base_type_specContext() { }
		public void copyFrom(Base_type_specContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Base_type_spectointContext extends Base_type_specContext {
		public Integer_typeContext integer_type() {
			return getRuleContext(Integer_typeContext.class,0);
		}
		public Base_type_spectointContext(Base_type_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spectoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spectoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spectoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Base_type_spectostring1Context extends Base_type_specContext {
		public TerminalNode KW_STRING() { return getToken(MIDLParser.KW_STRING, 0); }
		public Base_type_spectostring1Context(Base_type_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spectostring1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spectostring1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spectostring1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Base_type_spectochar1Context extends Base_type_specContext {
		public TerminalNode KW_CHAR() { return getToken(MIDLParser.KW_CHAR, 0); }
		public Base_type_spectochar1Context(Base_type_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spectochar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spectochar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spectochar1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Base_type_spectoboolean1Context extends Base_type_specContext {
		public TerminalNode KW_BOOLEAN() { return getToken(MIDLParser.KW_BOOLEAN, 0); }
		public Base_type_spectoboolean1Context(Base_type_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spectoboolean1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spectoboolean1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spectoboolean1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Base_type_spectofloatContext extends Base_type_specContext {
		public Floating_pt_typeContext floating_pt_type() {
			return getRuleContext(Floating_pt_typeContext.class,0);
		}
		public Base_type_spectofloatContext(Base_type_specContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterBase_type_spectofloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitBase_type_spectofloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitBase_type_spectofloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_type_specContext base_type_spec() throws RecognitionException {
		Base_type_specContext _localctx = new Base_type_specContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_base_type_spec);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FLOAT:
			case KW_LONG_DOUBLE:
			case KW_DOUBLE:
				_localctx = new Base_type_spectofloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				floating_pt_type();
				}
				break;
			case KW_SHORT:
			case KW_LONG:
			case KW_UNSIGNED:
			case KW_INT8:
			case KW_UINT8:
			case KW_INT16:
			case KW_UINT16:
			case KW_INT32:
			case KW_UINT32:
			case KW_INT64:
			case KW_UINT64:
				_localctx = new Base_type_spectointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				integer_type();
				}
				break;
			case KW_CHAR:
				_localctx = new Base_type_spectochar1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(KW_CHAR);
				}
				break;
			case KW_STRING:
				_localctx = new Base_type_spectostring1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(KW_STRING);
				}
				break;
			case KW_BOOLEAN:
				_localctx = new Base_type_spectoboolean1Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				match(KW_BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_pt_typeContext extends ParserRuleContext {
		public Floating_pt_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_pt_type; }
	 
		public Floating_pt_typeContext() { }
		public void copyFrom(Floating_pt_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Floating_pt_typetolong1Context extends Floating_pt_typeContext {
		public TerminalNode KW_LONG_DOUBLE() { return getToken(MIDLParser.KW_LONG_DOUBLE, 0); }
		public Floating_pt_typetolong1Context(Floating_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloating_pt_typetolong1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloating_pt_typetolong1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloating_pt_typetolong1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Floating_pt_typetof1Context extends Floating_pt_typeContext {
		public TerminalNode KW_FLOAT() { return getToken(MIDLParser.KW_FLOAT, 0); }
		public Floating_pt_typetof1Context(Floating_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloating_pt_typetof1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloating_pt_typetof1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloating_pt_typetof1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Floating_pt_typetod1Context extends Floating_pt_typeContext {
		public TerminalNode KW_DOUBLE() { return getToken(MIDLParser.KW_DOUBLE, 0); }
		public Floating_pt_typetod1Context(Floating_pt_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterFloating_pt_typetod1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitFloating_pt_typetod1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitFloating_pt_typetod1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_pt_typeContext floating_pt_type() throws RecognitionException {
		Floating_pt_typeContext _localctx = new Floating_pt_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floating_pt_type);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FLOAT:
				_localctx = new Floating_pt_typetof1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(KW_FLOAT);
				}
				break;
			case KW_DOUBLE:
				_localctx = new Floating_pt_typetod1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(KW_DOUBLE);
				}
				break;
			case KW_LONG_DOUBLE:
				_localctx = new Floating_pt_typetolong1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(KW_LONG_DOUBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_typeContext extends ParserRuleContext {
		public Signed_intContext signed_int() {
			return getRuleContext(Signed_intContext.class,0);
		}
		public Unsigned_intContext unsigned_int() {
			return getRuleContext(Unsigned_intContext.class,0);
		}
		public Integer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterInteger_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitInteger_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitInteger_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_typeContext integer_type() throws RecognitionException {
		Integer_typeContext _localctx = new Integer_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integer_type);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_SHORT:
			case KW_LONG:
			case KW_INT8:
			case KW_INT16:
			case KW_INT32:
			case KW_INT64:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				signed_int();
				}
				break;
			case KW_UNSIGNED:
			case KW_UINT8:
			case KW_UINT16:
			case KW_UINT32:
			case KW_UINT64:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				unsigned_int();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_intContext extends ParserRuleContext {
		public TerminalNode KW_SHORT() { return getToken(MIDLParser.KW_SHORT, 0); }
		public TerminalNode KW_INT16() { return getToken(MIDLParser.KW_INT16, 0); }
		public List<TerminalNode> KW_LONG() { return getTokens(MIDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(MIDLParser.KW_LONG, i);
		}
		public TerminalNode KW_INT32() { return getToken(MIDLParser.KW_INT32, 0); }
		public TerminalNode KW_INT64() { return getToken(MIDLParser.KW_INT64, 0); }
		public TerminalNode KW_INT8() { return getToken(MIDLParser.KW_INT8, 0); }
		public Signed_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSigned_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSigned_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_intContext signed_int() throws RecognitionException {
		Signed_intContext _localctx = new Signed_intContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signed_int);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==KW_SHORT || _la==KW_INT16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==KW_LONG || _la==KW_INT32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_LONG:
					{
					setState(129);
					match(KW_LONG);
					setState(130);
					match(KW_LONG);
					}
					break;
				case KW_INT64:
					{
					setState(131);
					match(KW_INT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(KW_INT8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unsigned_intContext extends ParserRuleContext {
		public TerminalNode KW_UNSIGNED() { return getToken(MIDLParser.KW_UNSIGNED, 0); }
		public TerminalNode KW_SHORT() { return getToken(MIDLParser.KW_SHORT, 0); }
		public TerminalNode KW_UINT16() { return getToken(MIDLParser.KW_UINT16, 0); }
		public List<TerminalNode> KW_LONG() { return getTokens(MIDLParser.KW_LONG); }
		public TerminalNode KW_LONG(int i) {
			return getToken(MIDLParser.KW_LONG, i);
		}
		public TerminalNode KW_UINT32() { return getToken(MIDLParser.KW_UINT32, 0); }
		public TerminalNode KW_UINT64() { return getToken(MIDLParser.KW_UINT64, 0); }
		public TerminalNode KW_UINT8() { return getToken(MIDLParser.KW_UINT8, 0); }
		public Unsigned_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnsigned_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnsigned_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnsigned_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unsigned_intContext unsigned_int() throws RecognitionException {
		Unsigned_intContext _localctx = new Unsigned_intContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsigned_int);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_UNSIGNED:
					{
					setState(137);
					match(KW_UNSIGNED);
					setState(138);
					match(KW_SHORT);
					}
					break;
				case KW_UINT16:
					{
					setState(139);
					match(KW_UINT16);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_UNSIGNED:
					{
					setState(142);
					match(KW_UNSIGNED);
					setState(143);
					match(KW_LONG);
					}
					break;
				case KW_UINT32:
					{
					setState(144);
					match(KW_UINT32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_UNSIGNED:
					{
					setState(147);
					match(KW_UNSIGNED);
					setState(148);
					match(KW_LONG);
					setState(149);
					match(KW_LONG);
					}
					break;
				case KW_UINT64:
					{
					setState(150);
					match(KW_UINT64);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(KW_UINT8);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorsContext extends ParserRuleContext {
		public List<DeclaratorContext> declarator() {
			return getRuleContexts(DeclaratorContext.class);
		}
		public DeclaratorContext declarator(int i) {
			return getRuleContext(DeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MIDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MIDLParser.COMMA, i);
		}
		public DeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorsContext declarators() throws RecognitionException {
		DeclaratorsContext _localctx = new DeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			declarator();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				declarator();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public Simple_declaratorContext simple_declarator() {
			return getRuleContext(Simple_declaratorContext.class,0);
		}
		public Array_declaratorContext array_declarator() {
			return getRuleContext(Array_declaratorContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declarator);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				simple_declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				array_declarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MIDLParser.EQUAL, 0); }
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public Simple_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterSimple_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitSimple_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitSimple_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declaratorContext simple_declarator() throws RecognitionException {
		Simple_declaratorContext _localctx = new Simple_declaratorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(169);
				match(EQUAL);
				setState(170);
				or_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declaratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MIDLParser.ID, 0); }
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0); }
		public Or_exprContext or_expr() {
			return getRuleContext(Or_exprContext.class,0);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(MIDLParser.EQUAL, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public Array_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterArray_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitArray_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitArray_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declaratorContext array_declarator() throws RecognitionException {
		Array_declaratorContext _localctx = new Array_declaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_array_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			match(LEFT_SQUARE_BRACKET);
			setState(175);
			or_expr();
			setState(176);
			match(RIGHT_SQUARE_BRACKET);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(177);
				match(EQUAL);
				setState(178);
				exp_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_listContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MIDLParser.LEFT_SQUARE_BRACKET, 0); }
		public List<Or_exprContext> or_expr() {
			return getRuleContexts(Or_exprContext.class);
		}
		public Or_exprContext or_expr(int i) {
			return getRuleContext(Or_exprContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MIDLParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MIDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MIDLParser.COMMA, i);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitExp_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitExp_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LEFT_SQUARE_BRACKET);
			setState(182);
			or_expr();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				or_expr();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RIGHT_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_exprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(MIDLParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(MIDLParser.PIPE, i);
		}
		public Or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterOr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitOr_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitOr_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_exprContext or_expr() throws RecognitionException {
		Or_exprContext _localctx = new Or_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_or_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			xor_expr();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(193);
				match(PIPE);
				setState(194);
				xor_expr();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(MIDLParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(MIDLParser.CARET, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			and_expr();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(201);
				match(CARET);
				setState(202);
				and_expr();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(MIDLParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(MIDLParser.AMPERSAND, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			shift_expr();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(209);
				match(AMPERSAND);
				setState(210);
				shift_expr();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Add_exprContext> add_expr() {
			return getRuleContexts(Add_exprContext.class);
		}
		public Add_exprContext add_expr(int i) {
			return getRuleContext(Add_exprContext.class,i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(MIDLParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(MIDLParser.RIGHT_SHIFT, i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(MIDLParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(MIDLParser.LEFT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			add_expr();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RIGHT_SHIFT || _la==LEFT_SHIFT) {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==RIGHT_SHIFT || _la==LEFT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				add_expr();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_exprContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(MIDLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MIDLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MIDLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MIDLParser.MINUS, i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitAdd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			mult_expr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				mult_expr();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_exprContext extends ParserRuleContext {
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(MIDLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MIDLParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MIDLParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MIDLParser.SLASH, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(MIDLParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(MIDLParser.PERCENT, i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitMult_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			unary_expr();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(233);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SLASH) | (1L << STAR) | (1L << PERCENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				unary_expr();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_exprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(MIDLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(MIDLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(MIDLParser.TILDE, 0); }
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TILDE) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(243);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Literal2Context extends LiteralContext {
		public TerminalNode FLOATING_PT() { return getToken(MIDLParser.FLOATING_PT, 0); }
		public Literal2Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal1Context extends LiteralContext {
		public TerminalNode INTEGER() { return getToken(MIDLParser.INTEGER, 0); }
		public Literal1Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal5Context extends LiteralContext {
		public TerminalNode BOOLEAN() { return getToken(MIDLParser.BOOLEAN, 0); }
		public Literal5Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal4Context extends LiteralContext {
		public TerminalNode STRING() { return getToken(MIDLParser.STRING, 0); }
		public Literal4Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literal3Context extends LiteralContext {
		public TerminalNode CHAR() { return getToken(MIDLParser.CHAR, 0); }
		public Literal3Context(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).enterLiteral3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MIDLListener ) ((MIDLListener)listener).exitLiteral3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MIDLVisitor ) return ((MIDLVisitor<? extends T>)visitor).visitLiteral3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new Literal1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(INTEGER);
				}
				break;
			case FLOATING_PT:
				_localctx = new Literal2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FLOATING_PT);
				}
				break;
			case CHAR:
				_localctx = new Literal3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(CHAR);
				}
				break;
			case STRING:
				_localctx = new Literal4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new Literal5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(249);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001t\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0004\u00006\b\u0000\u000b\u0000"+
		"\f\u00007\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005"+
		"\f\u0005^\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006"+
		"\u0001\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007k\b\u0007\n\u0007\f\u0007n\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bu\b\b\u0001\t\u0001\t\u0001\t\u0003\tz\b\t\u0001"+
		"\n\u0001\n\u0003\n~\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0085\b\u000b\u0001\u000b\u0003\u000b\u0088\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u008d\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0092\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0098\b\f"+
		"\u0001\f\u0003\f\u009b\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a0\b\r\n"+
		"\r\f\r\u00a3\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ac\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b4"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00ba"+
		"\b\u0011\n\u0011\f\u0011\u00bd\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00c4\b\u0012\n\u0012\f\u0012\u00c7"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00cc\b\u0013"+
		"\n\u0013\f\u0013\u00cf\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u00d4\b\u0014\n\u0014\f\u0014\u00d7\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00dc\b\u0015\n\u0015\f\u0015\u00df\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00e4\b\u0016\n\u0016\f\u0016"+
		"\u00e7\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00ec\b"+
		"\u0017\n\u0017\f\u0017\u00ef\t\u0017\u0001\u0018\u0003\u0018\u00f2\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u00fb\b\u0019\u0001\u0019\u0000\u0000\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0006\u0002\u0000??mm\u0002\u0000@@oo\u0001\u0000"+
		"#$\u0001\u0000\u001b\u001c\u0003\u0000\u0017\u0017\u001a\u001a!!\u0002"+
		"\u0000\u0016\u0016\u001b\u001c\u010c\u00005\u0001\u0000\u0000\u0000\u0002"+
		"?\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006N\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000"+
		"\fb\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010t\u0001"+
		"\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000"+
		"\u0000\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000"+
		"\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000"+
		"\u0000\u001e\u00a8\u0001\u0000\u0000\u0000 \u00ad\u0001\u0000\u0000\u0000"+
		"\"\u00b5\u0001\u0000\u0000\u0000$\u00c0\u0001\u0000\u0000\u0000&\u00c8"+
		"\u0001\u0000\u0000\u0000(\u00d0\u0001\u0000\u0000\u0000*\u00d8\u0001\u0000"+
		"\u0000\u0000,\u00e0\u0001\u0000\u0000\u0000.\u00e8\u0001\u0000\u0000\u0000"+
		"0\u00f1\u0001\u0000\u0000\u00002\u00fa\u0001\u0000\u0000\u000046\u0003"+
		"\u0002\u0001\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0001\u0001\u0000"+
		"\u0000\u00009:\u0003\u0006\u0003\u0000:;\u0005\r\u0000\u0000;@\u0001\u0000"+
		"\u0000\u0000<=\u0003\u0004\u0002\u0000=>\u0005\r\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?9\u0001\u0000\u0000\u0000?<\u0001\u0000\u0000\u0000@\u0003"+
		"\u0001\u0000\u0000\u0000AB\u0005L\u0000\u0000BC\u0005t\u0000\u0000CE\u0005"+
		"\u0010\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\u0011\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KO\u0003\b\u0004\u0000LM\u00053\u0000\u0000MO\u0005"+
		"t\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0007"+
		"\u0001\u0000\u0000\u0000PQ\u00053\u0000\u0000QR\u0005t\u0000\u0000RS\u0005"+
		"\u0010\u0000\u0000ST\u0003\n\u0005\u0000TU\u0005\u0011\u0000\u0000U\t"+
		"\u0001\u0000\u0000\u0000VW\u0003\f\u0006\u0000WX\u0003\u001a\r\u0000X"+
		"Y\u0005\r\u0000\u0000Y[\u0001\u0000\u0000\u0000ZV\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]\u000b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_c\u0003"+
		"\u000e\u0007\u0000`c\u0003\u0010\b\u0000ac\u0003\b\u0004\u0000b_\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"c\r\u0001\u0000\u0000\u0000df\u0005\"\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gl\u0005t\u0000"+
		"\u0000hi\u0005\"\u0000\u0000ik\u0005t\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u000f\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"ou\u0003\u0012\t\u0000pu\u0003\u0014\n\u0000qu\u0005T\u0000\u0000ru\u0005"+
		")\u0000\u0000su\u0005X\u0000\u0000to\u0001\u0000\u0000\u0000tp\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000u\u0011\u0001\u0000\u0000\u0000vz\u0005V\u0000\u0000"+
		"wz\u0005^\u0000\u0000xz\u0005W\u0000\u0000yv\u0001\u0000\u0000\u0000y"+
		"w\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0013\u0001\u0000"+
		"\u0000\u0000{~\u0003\u0016\u000b\u0000|~\u0003\u0018\f\u0000}{\u0001\u0000"+
		"\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0015\u0001\u0000\u0000\u0000"+
		"\u007f\u0088\u0007\u0000\u0000\u0000\u0080\u0088\u0007\u0001\u0000\u0000"+
		"\u0081\u0082\u0005@\u0000\u0000\u0082\u0085\u0005@\u0000\u0000\u0083\u0085"+
		"\u0005q\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0088\u0005"+
		"k\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000"+
		"\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008a\u0005O\u0000"+
		"\u0000\u008a\u008d\u0005?\u0000\u0000\u008b\u008d\u0005n\u0000\u0000\u008c"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u009b\u0001\u0000\u0000\u0000\u008e\u008f\u0005O\u0000\u0000\u008f\u0092"+
		"\u0005@\u0000\u0000\u0090\u0092\u0005p\u0000\u0000\u0091\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u009b\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005O\u0000\u0000\u0094\u0095\u0005@\u0000\u0000"+
		"\u0095\u0098\u0005@\u0000\u0000\u0096\u0098\u0005r\u0000\u0000\u0097\u0093"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0005l\u0000\u0000\u009a\u008c\u0001"+
		"\u0000\u0000\u0000\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0097\u0001"+
		"\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0019\u0001"+
		"\u0000\u0000\u0000\u009c\u00a1\u0003\u001c\u000e\u0000\u009d\u009e\u0005"+
		"\u000f\u0000\u0000\u009e\u00a0\u0003\u001c\u000e\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u001b\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a7\u0003"+
		"\u001e\u000f\u0000\u00a5\u00a7\u0003 \u0010\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001d\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0005t\u0000\u0000\u00a9\u00aa\u0005 \u0000\u0000"+
		"\u00aa\u00ac\u0003$\u0012\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u001f\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005t\u0000\u0000\u00ae\u00af\u0005\u0014\u0000\u0000\u00af\u00b0"+
		"\u0003$\u0012\u0000\u00b0\u00b3\u0005\u0015\u0000\u0000\u00b1\u00b2\u0005"+
		" \u0000\u0000\u00b2\u00b4\u0003\"\u0011\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4!\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u00bb\u0003$\u0012\u0000"+
		"\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00ba\u0003$\u0012\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0015\u0000\u0000\u00bf#\u0001\u0000\u0000\u0000\u00c0\u00c5"+
		"\u0003&\u0013\u0000\u00c1\u00c2\u0005\u001f\u0000\u0000\u00c2\u00c4\u0003"+
		"&\u0013\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cd\u0003(\u0014\u0000\u00c9\u00ca\u0005\u001d\u0000\u0000"+
		"\u00ca\u00cc\u0003(\u0014\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\'\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d5\u0003*\u0015\u0000\u00d1\u00d2\u0005"+
		"\u001e\u0000\u0000\u00d2\u00d4\u0003*\u0015\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6)\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00dd\u0003,\u0016\u0000"+
		"\u00d9\u00da\u0007\u0002\u0000\u0000\u00da\u00dc\u0003,\u0016\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"+\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5"+
		"\u0003.\u0017\u0000\u00e1\u00e2\u0007\u0003\u0000\u0000\u00e2\u00e4\u0003"+
		".\u0017\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6-\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ed\u00030\u0018\u0000\u00e9\u00ea\u0007\u0004\u0000\u0000"+
		"\u00ea\u00ec\u00030\u0018\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee/\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0007\u0005\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u00032\u0019\u0000\u00f41\u0001\u0000"+
		"\u0000\u0000\u00f5\u00fb\u0005\u0005\u0000\u0000\u00f6\u00fb\u0005\u0007"+
		"\u0000\u0000\u00f7\u00fb\u0005\t\u0000\u0000\u00f8\u00fb\u0005\n\u0000"+
		"\u0000\u00f9\u00fb\u0005\u000b\u0000\u0000\u00fa\u00f5\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb3\u0001\u0000\u0000\u0000\u001e7?GN\\belty}\u0084\u0087\u008c"+
		"\u0091\u0097\u009a\u00a1\u00a6\u00ab\u00b3\u00bb\u00c5\u00cd\u00d5\u00dd"+
		"\u00e5\u00ed\u00f1\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}