package main;

public class NativeKeyBoard extends Thread {
	
	NativeKeyBoardListener nativeKeyListener;
	
	/** Loaded from nativekeyboardlib.dll; Returns the value of <Window.h> GetKeyState(keyCode); */
	native int getKeyState(int keyID); // These should be made private and be shorts and static
	
	/** Loaded from nativekeyboardlib.dll; Returns the value of <Window.h> GetASyncKeyState(keyCode); */
	native int getASyncKeyState(int keyID); // These should be made private and be shorts and static
	
	/** Checks that the key state is pressed.*/
	private static boolean isStatePressed(int keyState) {
		return (keyState & 0x8000) != 0;
	}
	
	/** Checks that the key state is toggled down, for example CAPS_LOCK.*/
	private static boolean isStateToggled(int keyState) {
		return (keyState & 0x0001) != 0;
	}
	
	/** Adds a Native KeyListener */
	public void addNativeKeyListener(NativeKeyBoardListener nativeKeyListener) {
		this.nativeKeyListener = nativeKeyListener;
	}
	
	private int getLockModifiers_helper() {
		int modifiers = 0;
		{  // check 20 Caps
			int keyCode = 20;
			int keyState = getKeyState(keyCode);
			if (isStateToggled(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.CAPS_LOCK_MASK;
			}
		}
		{  // check 45 insert
			int keyCode = 45;
			int keyState = getKeyState(keyCode);
			if (isStateToggled(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.INSERT_MASK;
			}
		}
		{  // check 144 number lock
			int keyCode = 144;
			int keyState = getKeyState(keyCode);
			if (isStateToggled(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.NUM_LOCK_MASK;
			}
		}
		{  // check scroll lock
			int keyCode = 145;
			int keyState = getKeyState(keyCode);
			if (isStateToggled(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.SCROLL_LOCK_MASK;
			}
		}
		
		return modifiers;
	}
	
	private int getPressedModifiers_helper() {
		int modifiers = 0;
		{  // check 16 SHIFT
			int keyCode = 16;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.SHIFT_MASK;
			}
		}
		{  // check 17 CTRL
			int keyCode = 17;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.CONTROL_MASK;
			}
		}
		{  // check 18 ALT
			int keyCode = 18;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.ALT_MASK;
			}
		}
		{  // check 91 LWIN - META
			int keyCode = 91;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.META_MASK;
			}
		}
		{  // check 92 RWIN - META
			int keyCode = 92;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				modifiers |= NativeKeyEvent.Modifiers.META_MASK;
			}
		}
		return modifiers;
	}
	
	/**
	 *  These include SHIFT, CTRL, ALT, LMETA, RMETA, CAPSLOCK, INSERT, SCROLLLOCK, NUMLOCK. 
	 *  @return int modifiers 
	 */
	private int getModifiers() {
		return getLockModifiers_helper() | getPressedModifiers_helper();
	}
	
	private void loopModifier(int modifiers) {
		// All the locks
		{  // check 20 Caps
			int keyCode = 20;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 45 insert
			int keyCode = 45;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 144 number lock
			int keyCode = 144;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check scroll lock
			int keyCode = 145;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		
		// All the presses
		{  // check 16 SHIFT
			int keyCode = 16;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 17 CTRL
			int keyCode = 17;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 18 ALT
			int keyCode = 18;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 91 LWIN - META
			int keyCode = 91;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
		{  // check 92 RWIN - META
			int keyCode = 92;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, System.currentTimeMillis(), modifiers));
		}
	}
	
	/**
	 *  Loops from 0 - 256 excluding mouse buttons as well as SHIFT, CTRL, ALT, CAPSLOCK, INSERT, NUMLOCK, SCROLLLOCK keys.
	 *  Please note that LCTRL, RCTRL, LSHIFT, RSHIFT, RALT, LAFT will still be looped here.
	 *  
	 *  @see getModifiers();
	 *  @see sendModifiersNativeKeyEvents(int modifiers);
	 */
	private void loopNonModifiers(int modifiers) {
		{  // check 3
			int keyCode = 3;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
		}
		for (int keyCode = 8; keyCode < 16; keyCode++) {
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
			
		}
		{  // check 19
			int keyCode = 19;
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
		}
		for (int keyCode = 21; keyCode < 45; keyCode++) {
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
			
		}
		for (int keyCode = 46; keyCode < 91; keyCode++) {
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
			
		}
		for (int keyCode = 93; keyCode < 144; keyCode++) {
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
			
		}
		for (int keyCode = 146; keyCode < 256; keyCode++) {
			int keyState = getKeyState(keyCode);
			if (isStatePressed(keyState)) {
				long time = System.currentTimeMillis();

				this.nativeKeyListener.keyPressed(new NativeKeyEvent(keyCode, keyState, time, modifiers));
			}
			
		}
	}
	
	@Override
	public void run(){
		
		final int SLEEP_TIME_MILSEC = 2;
		
		while (!Thread.interrupted()) {
			try {
				Thread.sleep(SLEEP_TIME_MILSEC);
			} catch (InterruptedException interruptExcept) {}

			if (this.nativeKeyListener != null) {
				int modifiers = getModifiers();
				
				loopModifier(modifiers);
				loopNonModifiers(modifiers);
			}
			
		}
		
		
	}
	
	
	public NativeKeyBoard() {
		//super();
		System.loadLibrary("nativekeyboardlib");
		start();
		
	}

	
}
