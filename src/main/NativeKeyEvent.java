package main;

public class NativeKeyEvent {

	/** Left mouse button */
	public static final int VK_LBUTTON = 0x01;

	/** Right mouse button */
	public static final int VK_RBUTTON = 0x02;

	/** Control-break processing */
	public static final int VK_CANCEL = 0x03;

	/** Middle mouse button (three-button mouse) */
	public static final int VK_MBUTTON = 0x04;

	/** X1 mouse button */
	public static final int VK_XBUTTON1 = 0x05;

	/** X2 mouse button */
	public static final int VK_XBUTTON2 = 0x06;

	/** BACKSPACE key */
	public static final int VK_BACK = 0x08;

	/** TAB key */
	public static final int VK_TAB = 0x09;

	/** CLEAR key */
	public static final int VK_CLEAR = 0x0C;

	/** ENTER key */
	public static final int VK_RETURN = 0x0D;
	
	/** ENTER key */
	public static final int VK_ENTER = 0x0D;

	/** SHIFT key */
	public static final int VK_SHIFT = 0x10;

	/** CTRL key */
	public static final int VK_CONTROL = 0x11;

	/** ALT key */
	public static final int VK_MENU = 0x12;

	/** PAUSE key */
	public static final int VK_PAUSE = 0x13;

	/** CAPS LOCK key */
	public static final int VK_CAPITAL = 0x14;

	/** IME Kana mode */
	public static final int VK_KANA = 0x15;

	/** IME Hanguel mode (maintained for compatibility; use VK_HANGUL) */
	public static final int VK_HANGUEL = 0x15;

	/** IME Hangul mode */
	public static final int VK_HANGUL = 0x15;

	/** IME On */
	public static final int VK_IME_ON = 0x16;

	/** IME Junja mode */
	public static final int VK_JUNJA = 0x17;

	/** IME final mode */
	public static final int VK_FINAL = 0x18;

	/** IME Hanja mode */
	public static final int VK_HANJA = 0x19;

	/** IME Kanji mode */
	public static final int VK_KANJI = 0x19;

	/** IME Off */
	public static final int VK_IME_OFF = 0x1A;

	/** ESC key */
	public static final int VK_ESCAPE = 0x1B;

	/** IME convert */
	public static final int VK_CONVERT = 0x1C;

	/** IME nonconvert */
	public static final int VK_NONCONVERT = 0x1D;

	/** IME accept */
	public static final int VK_ACCEPT = 0x1E;

	/** IME mode change request */
	public static final int VK_MODECHANGE = 0x1F;

	/** SPACEBAR */
	public static final int VK_SPACE = 0x20;

	/** PAGE UP key */
	public static final int VK_PRIOR = 0x21;

	/** PAGE DOWN key */
	public static final int VK_NEXT = 0x22;

	/** END key */
	public static final int VK_END = 0x23;

	/** HOME key */
	public static final int VK_HOME = 0x24;

	/** LEFT ARROW key */
	public static final int VK_LEFT = 0x25;

	/** UP ARROW key */
	public static final int VK_UP = 0x26;

	/** RIGHT ARROW key */
	public static final int VK_RIGHT = 0x27;

	/** DOWN ARROW key */
	public static final int VK_DOWN = 0x28;

	/** SELECT key */
	public static final int VK_SELECT = 0x29;

	/** PRINT key */
	public static final int VK_PRINT = 0x2A;

	/** EXECUTE key */
	public static final int VK_EXECUTE = 0x2B;

	/** PRINT SCREEN key */
	public static final int VK_SNAPSHOT = 0x2C;

	/** INS key */
	public static final int VK_INSERT = 0x2D;

	/** DEL key */
	public static final int VK_DELETE = 0x2E;

	/** HELP key */
	public static final int VK_HELP = 0x2F;

	/** 0 key */
	public static final int VK_0 = 0x30;

	/** 1 key */
	public static final int VK_1 = 0x31;

	/** 2 key */
	public static final int VK_2 = 0x32;

	/** 3 key */
	public static final int VK_3 = 0x33;

	/** 4 key */
	public static final int VK_4 = 0x34;

	/** 5 key */
	public static final int VK_5 = 0x35;

	/** 6 key */
	public static final int VK_6 = 0x36;

	/** 7 key */
	public static final int VK_7 = 0x37;

	/** 8 key */
	public static final int VK_8 = 0x38;

	/** 9 key */
	public static final int VK_9 = 0x39;

	/** Reserved */
	public static final int VK_0x3A = 0x3A;
	public static final int VK_0x3B = 0x3B;
	public static final int VK_0x3C = 0x3C;
	public static final int VK_0x3D = 0x3D;
	public static final int VK_0x3E = 0x3E;
	public static final int VK_0x3F = 0x3F;
	public static final int VK_0x40 = 0x40;

	/** A key */
	public static final int VK_A = 0x41;

	/** B key */
	public static final int VK_B = 0x42;

	/** C key */
	public static final int VK_C = 0x43;

	/** D key */
	public static final int VK_D = 0x44;

	/** E key */
	public static final int VK_E = 0x45;

	/** F key */
	public static final int VK_F = 0x46;

	/** G key */
	public static final int VK_G = 0x47;

	/** H key */
	public static final int VK_H = 0x48;

	/** I key */
	public static final int VK_I = 0x49;

	/** J key */
	public static final int VK_J = 0x4A;

	/** K key */
	public static final int VK_K = 0x4B;

	/** L key */
	public static final int VK_L = 0x4C;

	/** M key */
	public static final int VK_M = 0x4D;

	/** N key */
	public static final int VK_N = 0x4E;

	/** O key */
	public static final int VK_O = 0x4F;

	/** P key */
	public static final int VK_P = 0x50;

	/** Q key */
	public static final int VK_Q = 0x51;

	/** R key */
	public static final int VK_R = 0x52;

	/** S key */
	public static final int VK_S = 0x53;

	/** T key */
	public static final int VK_T = 0x54;

	/** U key */
	public static final int VK_U = 0x55;

	/** V key */
	public static final int VK_V = 0x56;

	/** W key */
	public static final int VK_W = 0x57;

	/** X key */
	public static final int VK_X = 0x58;

	/** Y key */
	public static final int VK_Y = 0x59;

	/** Z key */
	public static final int VK_Z = 0x5A;

	/** Left Windows key (Natural keyboard) */
	public static final int VK_LWIN = 0x5B;

	/** Right Windows key (Natural keyboard) */
	public static final int VK_RWIN = 0x5C;

	/** Applications key (Natural keyboard) */
	public static final int VK_APPS = 0x5D;

	/** Reserved */
	public static final int VK_0x5E = 0x5E;

	/** Computer Sleep key */
	public static final int VK_SLEEP = 0x5F;

	/** Numeric keypad 0 key */
	public static final int VK_NUMPAD0 = 0x60;

	/** Numeric keypad 1 key */
	public static final int VK_NUMPAD1 = 0x61;

	/** Numeric keypad 2 key */
	public static final int VK_NUMPAD2 = 0x62;

	/** Numeric keypad 3 key */
	public static final int VK_NUMPAD3 = 0x63;

	/** Numeric keypad 4 key */
	public static final int VK_NUMPAD4 = 0x64;

	/** Numeric keypad 5 key */
	public static final int VK_NUMPAD5 = 0x65;

	/** Numeric keypad 6 key */
	public static final int VK_NUMPAD6 = 0x66;

	/** Numeric keypad 7 key */
	public static final int VK_NUMPAD7 = 0x67;

	/** Numeric keypad 8 key */
	public static final int VK_NUMPAD8 = 0x68;

	/** Numeric keypad 9 key */
	public static final int VK_NUMPAD9 = 0x69;

	/** Multiply key */
	public static final int VK_MULTIPLY = 0x6A;

	/** Add key */
	public static final int VK_ADD = 0x6B;

	/** Separator key */
	public static final int VK_SEPARATOR = 0x6C;

	/** Subtract key */
	public static final int VK_SUBTRACT = 0x6D;

	/** Decimal key */
	public static final int VK_DECIMAL = 0x6E;

	/** Divide key */
	public static final int VK_DIVIDE = 0x6F;

	/** F1 key */
	public static final int VK_F1 = 0x70;

	/** F2 key */
	public static final int VK_F2 = 0x71;

	/** F3 key */
	public static final int VK_F3 = 0x72;

	/** F4 key */
	public static final int VK_F4 = 0x73;

	/** F5 key */
	public static final int VK_F5 = 0x74;

	/** F6 key */
	public static final int VK_F6 = 0x75;

	/** F7 key */
	public static final int VK_F7 = 0x76;

	/** F8 key */
	public static final int VK_F8 = 0x77;

	/** F9 key */
	public static final int VK_F9 = 0x78;

	/** F10 key */
	public static final int VK_F10 = 0x79;

	/** F11 key */
	public static final int VK_F11 = 0x7A;

	/** F12 key */
	public static final int VK_F12 = 0x7B;

	/** F13 key */
	public static final int VK_F13 = 0x7C;

	/** F14 key */
	public static final int VK_F14 = 0x7D;

	/** F15 key */
	public static final int VK_F15 = 0x7E;

	/** F16 key */
	public static final int VK_F16 = 0x7F;

	/** F17 key */
	public static final int VK_F17 = 0x80;

	/** F18 key */
	public static final int VK_F18 = 0x81;

	/** F19 key */
	public static final int VK_F19 = 0x82;

	/** F20 key */
	public static final int VK_F20 = 0x83;

	/** F21 key */
	public static final int VK_F21 = 0x84;

	/** F22 key */
	public static final int VK_F22 = 0x85;

	/** F23 key */
	public static final int VK_F23 = 0x86;

	/** F24 key */
	public static final int VK_F24 = 0x87;

	/** Unassigned */
	public static final int VK_0x88 = 0x88;
	public static final int VK_0x89 = 0x89;
	public static final int VK_0x8A = 0x8A;
	public static final int VK_0x8B = 0x8B;
	public static final int VK_0x8C = 0x8C;
	public static final int VK_0x8D = 0x8D;
	public static final int VK_0x8E = 0x8E;
	public static final int VK_0x8F = 0x8F;

	/** NUM LOCK key */
	public static final int VK_NUMLOCK = 0x90;

	/** SCROLL LOCK key */
	public static final int VK_SCROLL = 0x91;

	/** OEM specific */
	public static final int VK_0x92 = 0x92;
	public static final int VK_0x93 = 0x93;
	public static final int VK_0x94 = 0x94;
	public static final int VK_0x95 = 0x95;
	public static final int VK_0x96 = 0x96;

	/** Unassigned */
	public static final int VK_0x97 = 0x97;
	public static final int VK_0x98 = 0x98;
	public static final int VK_0x99 = 0x99;
	public static final int VK_0x9A = 0x9A;
	public static final int VK_0x9B = 0x9B;
	public static final int VK_0x9C = 0x9C;
	public static final int VK_0x9D = 0x9D;
	public static final int VK_0x9E = 0x9E;
	public static final int VK_0x9F = 0x9F;

	/** Left SHIFT key */
	public static final int VK_LSHIFT = 0xA0;

	/** Right SHIFT key */
	public static final int VK_RSHIFT = 0xA1;

	/** Left CONTROL key */
	public static final int VK_LCONTROL = 0xA2;

	/** Right CONTROL key */
	public static final int VK_RCONTROL = 0xA3;

	/** Left ALT key */
	public static final int VK_LMENU = 0xA4;

	/** Right ALT key */
	public static final int VK_RMENU = 0xA5;

	/** Browser Back key */
	public static final int VK_BROWSER_BACK = 0xA6;

	/** Browser Forward key */
	public static final int VK_BROWSER_FORWARD = 0xA7;

	/** Browser Refresh key */
	public static final int VK_BROWSER_REFRESH = 0xA8;

	/** Browser Stop key */
	public static final int VK_BROWSER_STOP = 0xA9;

	/** Browser Search key */
	public static final int VK_BROWSER_SEARCH = 0xAA;

	/** Browser Favorites key */
	public static final int VK_BROWSER_FAVORITES = 0xAB;

	/** Browser Start and Home key */
	public static final int VK_BROWSER_HOME = 0xAC;

	/** Volume Mute key */
	public static final int VK_VOLUME_MUTE = 0xAD;

	/** Volume Down key */
	public static final int VK_VOLUME_DOWN = 0xAE;

	/** Volume Up key */
	public static final int VK_VOLUME_UP = 0xAF;

	/** Next Track key */
	public static final int VK_MEDIA_NEXT_TRACK = 0xB0;

	/** Previous Track key */
	public static final int VK_MEDIA_PREV_TRACK = 0xB1;

	/** Stop Media key */
	public static final int VK_MEDIA_STOP = 0xB2;

	/** Play/Pause Media key */
	public static final int VK_MEDIA_PLAY_PAUSE = 0xB3;

	/** Start Mail key */
	public static final int VK_LAUNCH_MAIL = 0xB4;

	/** Select Media key */
	public static final int VK_LAUNCH_MEDIA_SELECT = 0xB5;

	/** Start Application 1 key */
	public static final int VK_LAUNCH_APP1 = 0xB6;

	/** Start Application 2 key */
	public static final int VK_LAUNCH_APP2 = 0xB7;

	/** Reserved */
	public static final int VK_0xB8 = 0xB8;
	public static final int VK_0xB9 = 0xB9;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the ';:' key
	 */
	public static final int VK_OEM_1 = 0xBA;
	/**
	 * ';:' key
	 */
	public static final int VK_SEMI_COLON = 0xBA;

	/** For any country/region, the '+' key */
	public static final int VK_OEM_PLUS = 0xBB;

	/** For any country/region, the ',' key */
	public static final int VK_OEM_COMMA = 0xBC;

	/** For any country/region, the '-' key */
	public static final int VK_OEM_MINUS = 0xBD;

	/** For any country/region, the '.' key */
	public static final int VK_OEM_PERIOD = 0xBE;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the '/?' key
	 */
	public static final int VK_OEM_2 = 0xBF;

	/**
	 * standard keyboard, the '/?' key
	 */
	public static final int VK_FORWARD_SLASH = 0xBF;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the '`~' key
	 */
	public static final int VK_OEM_3 = 0xC0;

	/**
	 * standard keyboard, the '`~' key
	 */
	public static final int VK_GRAVE_ACCENT = 0xC0;

	/** Reserved */
	public static final int VK_0xC1 = 0xC1;
	public static final int VK_0xC2 = 0xC2;
	public static final int VK_0xC3 = 0xC3;
	public static final int VK_0xC4 = 0xC4;
	public static final int VK_0xC5 = 0xC5;
	public static final int VK_0xC6 = 0xC6;
	public static final int VK_0xC7 = 0xC7;
	public static final int VK_0xC8 = 0xC8;
	public static final int VK_0xC9 = 0xC9;
	public static final int VK_0xCA = 0xCA;
	public static final int VK_0xCB = 0xCB;
	public static final int VK_0xCC = 0xCC;
	public static final int VK_0xCD = 0xCD;
	public static final int VK_0xCE = 0xCE;
	public static final int VK_0xCF = 0xCF;

	/** Reserved */
	public static final int VK_0xD0 = 0xD0;
	public static final int VK_0xD1 = 0xD1;
	public static final int VK_0xD2 = 0xD2;
	public static final int VK_0xD3 = 0xD3;
	public static final int VK_0xD4 = 0xD4;
	public static final int VK_0xD5 = 0xD5;
	public static final int VK_0xD6 = 0xD6;
	public static final int VK_0xD7 = 0xD7;

	/** Unassigned */
	public static final int VK_0xD8 = 0xD8;
	public static final int VK_0xD9 = 0xD9;
	public static final int VK_0xDA = 0xDA;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the '[{' key
	 */
	public static final int VK_OEM_4 = 0xDB;

	/**
	 * standard keyboard, the '[{' key
	 */
	public static final int VK_LEFT_BRACKET = 0xDB;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the '\|' key
	 */
	public static final int VK_OEM_5 = 0xDC;

	/**
	 * standard keyboard, the '\|' key
	 */
	public static final int VK_BACK_SLASH = 0xDC;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the ']}' key
	 */
	public static final int VK_OEM_6 = 0xDD;

	/**
	 * standard keyboard, the ']}' key
	 */
	public static final int VK_RIGHT_BRACKET = 0xDD;

	/**
	 * Used for miscellaneous characters; it can vary by keyboard. For the US
	 * standard keyboard, the 'single-quote/double-quote' key
	 */
	public static final int VK_OEM_7 = 0xDE;

	/**
	 * standard keyboard, the 'single-quote/double-quote' key
	 */
	public static final int VK_SINGLE_QUOTE = 0xDE;

	/** Used for miscellaneous characters; it can vary by keyboard. */
	public static final int VK_OEM_8 = 0xDF;

	/** Reserved */
	public static final int VK_0xE0 = 0xE0;

	/** OEM specific */
	public static final int VK_0xE1 = 0xE1;

	/**
	 * The <> keys on the US standard keyboard, or the \\| key on the non-US 102-key
	 * keyboard
	 */
	public static final int VK_OEM_102 = 0xE2;

	/** OEM specific */
	public static final int VK_0xE3 = 0xE3;

	/** OEM specific */
	public static final int VK_0xE4 = 0xE4;

	/** IME PROCESS key */
	public static final int VK_PROCESSKEY = 0xE5;

	/** OEM specific */
	public static final int VK_0xE6 = 0xE6;

	/**
	 * Used to pass Unicode characters as if they were keystrokes. The VK_PACKET key
	 * is the low word of a 32-bit Virtual Key value used for non-keyboard input
	 * methods. For more information, see Remark in KEYBDINPUT, SendInput,
	 * WM_KEYDOWN, and WM_KEYUP
	 */
	public static final int VK_PACKET = 0xE7;

	/** Unassigned */
	public static final int VK_0xE8 = 0xE8;

	/** OEM specific */
	public static final int VK_0xE9 = 0xE9;
	public static final int VK_0xEA = 0xEA;
	public static final int VK_0xEB = 0xEB;
	public static final int VK_0xEC = 0xEC;
	public static final int VK_0xED = 0xED;
	public static final int VK_0xEE = 0xEE;
	public static final int VK_0xEF = 0xEF;

	/** Attn key */
	public static final int VK_ATTN = 0xF6;

	/** CrSel key */
	public static final int VK_CRSEL = 0xF7;

	/** ExSel key */
	public static final int VK_EXSEL = 0xF8;

	/** Erase EOF key */
	public static final int VK_EREOF = 0xF9;

	/** Play key */
	public static final int VK_PLAY = 0xFA;

	/** Zoom key */
	public static final int VK_ZOOM = 0xFB;

	/** Reserved */
	public static final int VK_0xFC = 0xFC;

	/** PA1 key */
	public static final int VK_PA1 = 0xFD;

	/** Clear key */
	public static final int VK_OEM_CLEAR = 0xFE;

	/** Clear key */
	public static final int VK__NONE__ = 0xFF;
	public static final int VK_NO_MAPPING = 0xFF;
	public static final int VK_FN = 0xFF;

	public class Modifiers {

		/** The mask for Caps lock Active */
		public static final int CAPS_LOCK_MASK = 1 << 0;

		/** The mask for Insert Active */
		public static final int INSERT_MASK = 1 << 1;

		/** The mask for Scroll lock Active */
		public static final int SCROLL_LOCK_MASK = 1 << 2;

		/** The mask for Number lock Active */
		public static final int NUM_LOCK_MASK = 1 << 3;

		/** The mask for Shift being active */
		public static final int SHIFT_MASK = 1 << 4;

		/** The mask for Control being active */
		public static final int CONTROL_MASK = 1 << 5;

		/** The mask for ALT being active */
		public static final int ALT_MASK = 1 << 6;

		/** The mask for META (WINDOWS) being active */
		public static final int META_MASK = 1 << 7;
	}

	private final long timeStamp;
	private final int keyCode;
	private final int keyState;
	private final int modifiers;

	public long getWhen() {
		return this.timeStamp;
	}

	public int getKeyState() {
		return this.keyState;
	}

	public int getKeyCode() {
		return this.keyCode;
	}

	public static boolean isKeyToggled(int keyState) {
		return (keyState & 0x0001) != 0;
	}

	public boolean isKeyToggled() {
		return isKeyToggled(this.keyState);
	}

	public static boolean isUpperCase(int modifiers) {
		boolean capsOn = false;

		if ((modifiers & Modifiers.CAPS_LOCK_MASK) != 0)
			capsOn = !capsOn;
		if ((modifiers & Modifiers.SHIFT_MASK) != 0)
			capsOn = !capsOn;

		return capsOn;
	}

	public boolean isUpperCase() {
		return isUpperCase(this.modifiers);
	}

	public int getModifiers() {
		return this.modifiers;
	}

	public static String text(int keyCode) {
		switch (keyCode) {
		case VK_LBUTTON:
			return "LBUTTON";
		case VK_RBUTTON:
			return "RBUTTON";
		case VK_CANCEL:
			return "CANCEL";
		case VK_MBUTTON:
			return "MBUTTON";
		case VK_XBUTTON1:
			return "XBUTTON1";
		case VK_XBUTTON2:
			return "XBUTTON2";
		case VK_BACK:
			return "BACK";
		case VK_TAB:
			return "TAB";
		case VK_CLEAR:
			return "CLEAR";
		case VK_RETURN:
			return "RETURN";
		case VK_SHIFT:
			return "SHIFT";
		case VK_CONTROL:
			return "CONTROL";
		case VK_MENU:
			return "MENU";
		case VK_PAUSE:
			return "PAUSE";
		case VK_CAPITAL:
			return "CAPITAL";
		case VK_KANA:
			return "KANA/HANGUL";
		case VK_IME_ON:
			return "IME_ON";
		case VK_JUNJA:
			return "JUNJA";
		case VK_FINAL:
			return "FINAL";
		case VK_HANJA:
			return "HANJA/KANJI";
		case VK_IME_OFF:
			return "IME_OFF";
		case VK_ESCAPE:
			return "ESCAPE";
		case VK_CONVERT:
			return "CONVERT";
		case VK_NONCONVERT:
			return "NONCONVERT";
		case VK_ACCEPT:
			return "ACCEPT";
		case VK_MODECHANGE:
			return "MODECHANGE";
		case VK_SPACE:
			return "SPACE";
		case VK_PRIOR:
			return "PRIOR";
		case VK_NEXT:
			return "NEXT";
		case VK_END:
			return "END";
		case VK_HOME:
			return "HOME";
		case VK_LEFT:
			return "LEFT";
		case VK_UP:
			return "UP";
		case VK_RIGHT:
			return "RIGHT";
		case VK_DOWN:
			return "DOWN";
		case VK_SELECT:
			return "SELECT";
		case VK_PRINT:
			return "PRINT";
		case VK_EXECUTE:
			return "EXECUTE";
		case VK_SNAPSHOT:
			return "SNAPSHOT";
		case VK_INSERT:
			return "INSERT";
		case VK_DELETE:
			return "DELETE";
		case VK_HELP:
			return "HELP";
		case VK_0:
			return "0";
		case VK_1:
			return "1";
		case VK_2:
			return "2";
		case VK_3:
			return "3";
		case VK_4:
			return "4";
		case VK_5:
			return "5";
		case VK_6:
			return "6";
		case VK_7:
			return "7";
		case VK_8:
			return "8";
		case VK_9:
			return "9";
		case VK_A:
			return "A";
		case VK_B:
			return "B";
		case VK_C:
			return "C";
		case VK_D:
			return "D";
		case VK_E:
			return "E";
		case VK_F:
			return "F";
		case VK_G:
			return "G";
		case VK_H:
			return "H";
		case VK_I:
			return "I";
		case VK_J:
			return "J";
		case VK_K:
			return "K";
		case VK_L:
			return "L";
		case VK_M:
			return "M";
		case VK_N:
			return "N";
		case VK_O:
			return "O";
		case VK_P:
			return "P";
		case VK_Q:
			return "Q";
		case VK_R:
			return "R";
		case VK_S:
			return "S";
		case VK_T:
			return "T";
		case VK_U:
			return "U";
		case VK_V:
			return "V";
		case VK_W:
			return "W";
		case VK_X:
			return "X";
		case VK_Y:
			return "Y";
		case VK_Z:
			return "Z";
		case VK_LWIN:
			return "LWIN";
		case VK_RWIN:
			return "RWIN";
		case VK_APPS:
			return "APPS";
		case VK_SLEEP:
			return "SLEEP";
		case VK_NUMPAD0:
			return "NUMPAD0";
		case VK_NUMPAD1:
			return "NUMPAD1";
		case VK_NUMPAD2:
			return "NUMPAD2";
		case VK_NUMPAD3:
			return "NUMPAD3";
		case VK_NUMPAD4:
			return "NUMPAD4";
		case VK_NUMPAD5:
			return "NUMPAD5";
		case VK_NUMPAD6:
			return "NUMPAD6";
		case VK_NUMPAD7:
			return "NUMPAD7";
		case VK_NUMPAD8:
			return "NUMPAD8";
		case VK_NUMPAD9:
			return "NUMPAD9";
		case VK_MULTIPLY:
			return "MULTIPLY";
		case VK_ADD:
			return "ADD";
		case VK_SEPARATOR:
			return "SEPARATOR";
		case VK_SUBTRACT:
			return "SUBTRACT";
		case VK_DECIMAL:
			return "DECIMAL";
		case VK_DIVIDE:
			return "DIVIDE";
		case VK_F1:
			return "F1";
		case VK_F2:
			return "F2";
		case VK_F3:
			return "F3";
		case VK_F4:
			return "F4";
		case VK_F5:
			return "F5";
		case VK_F6:
			return "F6";
		case VK_F7:
			return "F7";
		case VK_F8:
			return "F8";
		case VK_F9:
			return "F9";
		case VK_F10:
			return "F10";
		case VK_F11:
			return "F11";
		case VK_F12:
			return "F12";
		case VK_F13:
			return "F13";
		case VK_F14:
			return "F14";
		case VK_F15:
			return "F15";
		case VK_F16:
			return "F16";
		case VK_F17:
			return "F17";
		case VK_F18:
			return "F18";
		case VK_F19:
			return "F19";
		case VK_F20:
			return "F20";
		case VK_F21:
			return "F21";
		case VK_F22:
			return "F22";
		case VK_F23:
			return "F23";
		case VK_F24:
			return "F24";
		case VK_NUMLOCK:
			return "NUMLOCK";
		case VK_SCROLL:
			return "SCROLL";
		case VK_OEM_1:
			return "OEM_1";
		case VK_OEM_PLUS:
			return "OEM_PLUS";
		case VK_OEM_COMMA:
			return "OEM_COMMA";
		case VK_OEM_MINUS:
			return "OEM_MINUS";
		case VK_OEM_PERIOD:
			return "OEM_PERIOD";
		case VK_OEM_2:
			return "OEM_2";
		case VK_OEM_3:
			return "OEM_3";
		case VK_OEM_4:
			return "OEM_4";
		case VK_OEM_5:
			return "OEM_5";
		case VK_OEM_6:
			return "OEM_6";
		case VK_OEM_7:
			return "OEM_7";
		case VK_OEM_8:
			return "OEM_8";
		case VK_PACKET:
			return "PACKET";
		case VK_ATTN:
			return "ATTN";
		case VK_CRSEL:
			return "CRSEL";
		case VK_EXSEL:
			return "EXSEL";
		case VK_EREOF:
			return "EREOF";
		case VK_PLAY:
			return "PLAY";
		case VK_ZOOM:
			return "ZOOM";
		case VK_PA1:
			return "PA1";
		case VK_OEM_CLEAR:
			return "OEM_CLEAR";
		case VK_LSHIFT:
			return "LSHIFT";
		case VK_RSHIFT:
			return "RSHIFT";
		case VK_LCONTROL:
			return "LCONTROL";
		case VK_RCONTROL:
			return "RCONTROL";
		case VK_LMENU:
			return "LMENU";
		case VK_RMENU:
			return "RMENU";
		case VK__NONE__:
			return "NO STANDARD MAPPING. FN key?";
		default:
			return "UNKNOWN";
		}

	}

	public String getText() {
		return text(this.keyCode);
	}

	public static String sanitizedText(int keyCode, int modifiers) {

		// Upper case alpha letters
		if (isUpperCase(modifiers)) {
			switch (keyCode) {
				case VK_A:
					return "A";
				case VK_B:
					return "B";
				case VK_C:
					return "C";
				case VK_D:
					return "D";
				case VK_E:
					return "E";
				case VK_F:
					return "F";
				case VK_G:
					return "G";
				case VK_H:
					return "H";
				case VK_I:
					return "I";
				case VK_J:
					return "J";
				case VK_K:
					return "K";
				case VK_L:
					return "L";
				case VK_M:
					return "M";
				case VK_N:
					return "N";
				case VK_O:
					return "O";
				case VK_P:
					return "P";
				case VK_Q:
					return "Q";
				case VK_R:
					return "R";
				case VK_S:
					return "S";
				case VK_T:
					return "T";
				case VK_U:
					return "U";
				case VK_V:
					return "V";
				case VK_W:
					return "W";
				case VK_X:
					return "X";
				case VK_Y:
					return "Y";
				case VK_Z:
					return "Z";
			}
		} else {
			// Lower case alpha letters
			switch (keyCode) {
				case VK_A:
					return "a";
				case VK_B:
					return "b";
				case VK_C:
					return "c";
				case VK_D:
					return "d";
				case VK_E:
					return "e";
				case VK_F:
					return "f";
				case VK_G:
					return "g";
				case VK_H:
					return "h";
				case VK_I:
					return "i";
				case VK_J:
					return "j";
				case VK_K:
					return "k";
				case VK_L:
					return "l";
				case VK_M:
					return "m";
				case VK_N:
					return "n";
				case VK_O:
					return "o";
				case VK_P:
					return "p";
				case VK_Q:
					return "q";
				case VK_R:
					return "r";
				case VK_S:
					return "s";
				case VK_T:
					return "t";
				case VK_U:
					return "u";
				case VK_V:
					return "v";
				case VK_W:
					return "w";
				case VK_X:
					return "x";
				case VK_Y:
					return "y";
				case VK_Z:
					return "z";
			}
		}

		// Check if shifting
		// Upper OEM keys
		if ((modifiers & Modifiers.SHIFT_MASK) != 0) {
			switch (keyCode) {
				case VK_GRAVE_ACCENT:
					return "~";
				case VK_1:
					return "!";
				case VK_2:
					return "@";
				case VK_3:
					return "#";
				case VK_4:
					return "$";
				case VK_5:
					return "%";
				case VK_6:
					return "^";
				case VK_7:
					return "&";
				case VK_8:
					return "*";
				case VK_9:
					return "(";
				case VK_0:
					return ")";
				case VK_OEM_MINUS:
					return "_";
				case VK_OEM_PLUS:
					return "+";
				case VK_LEFT_BRACKET:
					return "{";
				case VK_RIGHT_BRACKET:
					return "}";
				case VK_BACK_SLASH:
					return "|";
				case VK_SEMI_COLON:
					return ":";
				case VK_SINGLE_QUOTE:
					return "\"";
				case VK_OEM_COMMA:
					return "<";
				case VK_OEM_PERIOD:
					return ">";
				case VK_FORWARD_SLASH:
					return "?";
			}
		} else {
			switch (keyCode) {
				case VK_GRAVE_ACCENT:
					return "`";
				case VK_1:
					return "1";
				case VK_2:
					return "2";
				case VK_3:
					return "3";
				case VK_4:
					return "4";
				case VK_5:
					return "5";
				case VK_6:
					return "6";
				case VK_7:
					return "7";
				case VK_8:
					return "8";
				case VK_9:
					return "9";
				case VK_0:
					return "0";
				case VK_OEM_MINUS:
					return "-";
				case VK_OEM_PLUS:
					return "=";
				case VK_LEFT_BRACKET:
					return "[";
				case VK_RIGHT_BRACKET:
					return "]";
				case VK_BACK_SLASH:
					return "\\";
				case VK_SEMI_COLON:
					return ";";
				case VK_SINGLE_QUOTE:
					return "\'";
				case VK_OEM_COMMA:
					return ",";
				case VK_OEM_PERIOD:
					return ".";
				case VK_FORWARD_SLASH:
					return "/";
			}
		}
		
		switch(keyCode) {
//			case VK_BACK:
//				return "\b";
			case VK_TAB:
				return "\t";
			case VK_RETURN:
				return "\n";
		}
		
		return "";
	}

	public String getSanitizedText() {
		return sanitizedText(this.keyCode, this.modifiers);
	}

	public NativeKeyEvent(int keyCode, int keyState, long timeStamp, int modifiers) {
		this.keyCode = keyCode;
		this.keyState = keyState;
		this.timeStamp = timeStamp;
		this.modifiers = modifiers;
	}

	public NativeKeyEvent(int keyCode, int keyState, long timeStamp) {
		this(keyCode, keyState, timeStamp, 0);
	}

	public NativeKeyEvent(int keyCode, int keyState) {
		this(keyCode, keyState, System.currentTimeMillis(), 0);
	}
}
